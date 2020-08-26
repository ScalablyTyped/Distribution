package typings.agGrid.iExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcelFont extends js.Object {
  var bold: Boolean = js.native
  var charSet: Double = js.native
  var color: String = js.native
  var family: String = js.native
  var fontName: String = js.native
  var italic: Boolean = js.native
  var outline: Boolean = js.native
  var shadow: Boolean = js.native
  var size: Double = js.native
  var strikeThrough: Boolean = js.native
  var underline: String = js.native
  var verticalAlign: String = js.native
}

object ExcelFont {
  @scala.inline
  def apply(
    bold: Boolean,
    charSet: Double,
    color: String,
    family: String,
    fontName: String,
    italic: Boolean,
    outline: Boolean,
    shadow: Boolean,
    size: Double,
    strikeThrough: Boolean,
    underline: String,
    verticalAlign: String
  ): ExcelFont = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], charSet = charSet.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], fontName = fontName.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], shadow = shadow.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strikeThrough = strikeThrough.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any], verticalAlign = verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelFont]
  }
  @scala.inline
  implicit class ExcelFontOps[Self <: ExcelFont] (val x: Self) extends AnyVal {
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
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharSet(value: Double): Self = this.set("charSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setFamily(value: String): Self = this.set("family", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontName(value: String): Self = this.set("fontName", value.asInstanceOf[js.Any])
    @scala.inline
    def setItalic(value: Boolean): Self = this.set("italic", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutline(value: Boolean): Self = this.set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def setShadow(value: Boolean): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrikeThrough(value: Boolean): Self = this.set("strikeThrough", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnderline(value: String): Self = this.set("underline", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticalAlign(value: String): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
  }
  
}

