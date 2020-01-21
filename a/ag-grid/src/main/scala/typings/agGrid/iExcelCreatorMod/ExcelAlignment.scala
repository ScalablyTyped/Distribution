package typings.agGrid.iExcelCreatorMod

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
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], readingOrder = readingOrder.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], shrinkToFit = shrinkToFit.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any], verticalText = verticalText.asInstanceOf[js.Any], wrapText = wrapText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExcelAlignment]
  }
}

