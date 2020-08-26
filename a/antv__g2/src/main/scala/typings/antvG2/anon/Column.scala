package typings.antvG2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Column extends js.Object {
  /**
    * 一般的柱状图占比 1/2
    */
  var column: Double = js.native
  /**
    * 多层的饼图、环图
    */
  var multiplePie: Double = js.native
  /**
    * 玫瑰图柱状占比 1
    */
  var rose: Double = js.native
}

object Column {
  @scala.inline
  def apply(column: Double, multiplePie: Double, rose: Double): Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], multiplePie = multiplePie.asInstanceOf[js.Any], rose = rose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  @scala.inline
  implicit class ColumnOps[Self <: Column] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiplePie(value: Double): Self = this.set("multiplePie", value.asInstanceOf[js.Any])
    @scala.inline
    def setRose(value: Double): Self = this.set("rose", value.asInstanceOf[js.Any])
  }
  
}

