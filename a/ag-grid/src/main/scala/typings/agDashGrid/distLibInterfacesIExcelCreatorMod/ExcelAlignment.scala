package typings.agDashGrid.distLibInterfacesIExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelAlignment extends js.Object {
  var horizontal: String
  var indent: Double
  var readingOrder: String
  var rotate: Double
  var shrinkToFit: Boolean
  var vertical: String
  var verticalText: Boolean
  var wrapText: Boolean
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
    val __obj = js.Dynamic.literal(horizontal = horizontal, indent = indent, readingOrder = readingOrder, rotate = rotate, shrinkToFit = shrinkToFit, vertical = vertical, verticalText = verticalText, wrapText = wrapText)
  
    __obj.asInstanceOf[ExcelAlignment]
  }
}

