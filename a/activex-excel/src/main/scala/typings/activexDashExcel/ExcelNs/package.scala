package typings.activexDashExcel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ExcelNs {
  import typings.activexDashExcel.activexDashExcelNumbers.`1480803660`
  import typings.activexDashExcel.activexDashExcelNumbers.`1`
  import typings.std.SafeArray

  type AddIns2 = AddIns
  type InternationalResult[T] = Boolean | Double | String
  type PivotFieldsResult = PivotFields with (js.Function1[/* Index */ Double | String, PivotField]) with (js.Function1[/* Indexes */ SafeArray[Double | String], PivotFields])
  type PivotItemsResult = PivotItems with (js.Function1[/* Index */ Double | String, PivotItem]) with (js.Function1[/* Indexes */ SafeArray[Double | String], PivotItems])
  type PivotTableWizardAutoPage[TSourceType] = js.UndefOr[Boolean]
  type PivotTableWizardSourceData[TSourceType] = js.UndefOr[Range | (SafeArray[Range | String]) | String]
  type PrintToFileName[T] = js.UndefOr[String]
  type XlCreator = `1480803660`
  type XlDataLabelSeparator = `1`
}
