package typings
package agDashGridLib.distLibInterfacesIExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelAlignment extends js.Object {
  var horizontal: java.lang.String
  var indent: scala.Double
  var readingOrder: java.lang.String
  var rotate: scala.Double
  var shrinkToFit: scala.Boolean
  var vertical: java.lang.String
  var verticalText: scala.Boolean
  var wrapText: scala.Boolean
}

object ExcelAlignment {
  @scala.inline
  def apply(
    horizontal: java.lang.String,
    indent: scala.Double,
    readingOrder: java.lang.String,
    rotate: scala.Double,
    shrinkToFit: scala.Boolean,
    vertical: java.lang.String,
    verticalText: scala.Boolean,
    wrapText: scala.Boolean
  ): ExcelAlignment = {
    val __obj = js.Dynamic.literal(horizontal = horizontal, indent = indent, readingOrder = readingOrder, rotate = rotate, shrinkToFit = shrinkToFit, vertical = vertical, verticalText = verticalText, wrapText = wrapText)
  
    __obj.asInstanceOf[ExcelAlignment]
  }
}

