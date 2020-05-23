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
  def apply(data: ExcelData, styleId: String, mergeAcross: js.UndefOr[Double] = js.undefined): ExcelCell = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeAcross)) __obj.updateDynamic("mergeAcross")(mergeAcross.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelCell]
  }
}

