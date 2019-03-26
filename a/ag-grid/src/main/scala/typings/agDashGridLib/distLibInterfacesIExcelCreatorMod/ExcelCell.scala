package typings
package agDashGridLib.distLibInterfacesIExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelCell extends js.Object {
  var data: ExcelData
  var mergeAcross: js.UndefOr[scala.Double] = js.undefined
  var styleId: java.lang.String
}

object ExcelCell {
  @scala.inline
  def apply(data: ExcelData, styleId: java.lang.String, mergeAcross: scala.Int | scala.Double = null): ExcelCell = {
    val __obj = js.Dynamic.literal(data = data, styleId = styleId)
    if (mergeAcross != null) __obj.updateDynamic("mergeAcross")(mergeAcross.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelCell]
  }
}

