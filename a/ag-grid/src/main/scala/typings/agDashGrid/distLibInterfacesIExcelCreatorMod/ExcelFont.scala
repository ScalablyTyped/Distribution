package typings.agDashGrid.distLibInterfacesIExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelFont extends js.Object {
  var bold: Boolean
  var charSet: Double
  var color: String
  var family: String
  var fontName: String
  var italic: Boolean
  var outline: Boolean
  var shadow: Boolean
  var size: Double
  var strikeThrough: Boolean
  var underline: String
  var verticalAlign: String
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
    val __obj = js.Dynamic.literal(bold = bold, charSet = charSet, color = color, family = family, fontName = fontName, italic = italic, outline = outline, shadow = shadow, size = size, strikeThrough = strikeThrough, underline = underline, verticalAlign = verticalAlign)
  
    __obj.asInstanceOf[ExcelFont]
  }
}

