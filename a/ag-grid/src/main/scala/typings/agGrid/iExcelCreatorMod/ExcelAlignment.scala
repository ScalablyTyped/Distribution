package typings.agGrid.iExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcelAlignment extends js.Object {
  var horizontal: String = js.native
  var indent: Double = js.native
  var readingOrder: String = js.native
  var rotate: Double = js.native
  var shrinkToFit: Boolean = js.native
  var vertical: String = js.native
  var verticalText: Boolean = js.native
  var wrapText: Boolean = js.native
}

object ExcelAlignment {
  @scala.inline
  def apply(
    horizontal: String,
    indent: Double,
    readingOrder: String,
    rotate: Double,
    shrinkToFit: Boolean,
    vertical: String,
    verticalText: Boolean,
    wrapText: Boolean
  ): ExcelAlignment = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], readingOrder = readingOrder.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], shrinkToFit = shrinkToFit.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any], verticalText = verticalText.asInstanceOf[js.Any], wrapText = wrapText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelAlignment]
  }
  @scala.inline
  implicit class ExcelAlignmentOps[Self <: ExcelAlignment] (val x: Self) extends AnyVal {
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
    def setHorizontal(value: String): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndent(value: Double): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadingOrder(value: String): Self = this.set("readingOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def setShrinkToFit(value: Boolean): Self = this.set("shrinkToFit", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertical(value: String): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticalText(value: Boolean): Self = this.set("verticalText", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapText(value: Boolean): Self = this.set("wrapText", value.asInstanceOf[js.Any])
  }
  
}

