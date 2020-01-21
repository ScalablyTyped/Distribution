package typings.agGrid.iExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelCell extends js.Object {
  var data: ExcelData
  var mergeAcross: js.UndefOr[Double] = js.undefined
  var styleId: String
}

object ExcelCell {
  @scala.inline
  def apply(data: ExcelData, styleId: String, mergeAcross: Int | Double = null): ExcelCell = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any])
    if (mergeAcross != null) __obj.updateDynamic("mergeAcross")(mergeAcross.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelCell]
  }
}

