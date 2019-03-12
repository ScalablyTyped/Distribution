package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ExcelNs {
  type AddIns2 = AddIns
  type HorizontalAlignments = Constants
  type InternationalResult[T] = scala.Boolean | scala.Double | java.lang.String
  type PivotFieldsResult = PivotFields with (js.Function1[/* Index */ scala.Double | java.lang.String, PivotField]) with (js.Function1[/* Indexes */ stdLib.SafeArray[scala.Double | java.lang.String], PivotFields])
  type PivotItemsResult = PivotItems with (js.Function1[/* Index */ scala.Double | java.lang.String, PivotItem]) with (js.Function1[/* Indexes */ stdLib.SafeArray[scala.Double | java.lang.String], PivotItems])
  type PivotTableWizardAutoPage[TSourceType] = js.UndefOr[scala.Boolean]
  type PivotTableWizardSourceData[TSourceType] = js.UndefOr[
    Range | stdLib.SafeArray[Range] | java.lang.String | stdLib.SafeArray[java.lang.String]
  ]
  type PrintToFileName[T] = js.UndefOr[java.lang.String]
  type VerticalAlignments = Constants
}
