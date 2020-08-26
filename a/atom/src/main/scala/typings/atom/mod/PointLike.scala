package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointLike extends js.Object {
  /** A zero-indexed number representing the column of the Point. */
  var column: Double = js.native
  /** A zero-indexed number representing the row of the Point. */
  var row: Double = js.native
}

object PointLike {
  @scala.inline
  def apply(column: Double, row: Double): PointLike = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointLike]
  }
  @scala.inline
  implicit class PointLikeOps[Self <: PointLike] (val x: Self) extends AnyVal {
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
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
  }
  
}

