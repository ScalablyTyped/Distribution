package typings
package agDashGridLib.distLibInterfacesIExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelFont extends js.Object {
  var bold: scala.Boolean
  var charSet: scala.Double
  var color: java.lang.String
  var family: java.lang.String
  var fontName: java.lang.String
  var italic: scala.Boolean
  var outline: scala.Boolean
  var shadow: scala.Boolean
  var size: scala.Double
  var strikeThrough: scala.Boolean
  var underline: java.lang.String
  var verticalAlign: java.lang.String
}

object ExcelFont {
  @scala.inline
  def apply(
    bold: scala.Boolean,
    charSet: scala.Double,
    color: java.lang.String,
    family: java.lang.String,
    fontName: java.lang.String,
    italic: scala.Boolean,
    outline: scala.Boolean,
    shadow: scala.Boolean,
    size: scala.Double,
    strikeThrough: scala.Boolean,
    underline: java.lang.String,
    verticalAlign: java.lang.String
  ): ExcelFont = {
    val __obj = js.Dynamic.literal(bold = bold, charSet = charSet, color = color, family = family, fontName = fontName, italic = italic, outline = outline, shadow = shadow, size = size, strikeThrough = strikeThrough, underline = underline, verticalAlign = verticalAlign)
  
    __obj.asInstanceOf[ExcelFont]
  }
}

