package typings.activexLibreoffice.com_.sun.star.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** defines a single text column. */
@js.native
trait TextColumn extends js.Object {
  /**
    * contains the left margin of the column.
    *
    * This is a metric value.
    */
  var LeftMargin: Double = js.native
  /**
    * contains the right margin of the column.
    *
    * This is a metric value.
    */
  var RightMargin: Double = js.native
  /**
    * contains the relative width of the column, including both margins.
    *
    * Width isn't a metric value, it's a relative value to the sum of the width of all columns.
    */
  var Width: Double = js.native
}

object TextColumn {
  @scala.inline
  def apply(LeftMargin: Double, RightMargin: Double, Width: Double): TextColumn = {
    val __obj = js.Dynamic.literal(LeftMargin = LeftMargin.asInstanceOf[js.Any], RightMargin = RightMargin.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextColumn]
  }
  @scala.inline
  implicit class TextColumnOps[Self <: TextColumn] (val x: Self) extends AnyVal {
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
    def setLeftMargin(value: Double): Self = this.set("LeftMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightMargin(value: Double): Self = this.set("RightMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
  }
  
}

