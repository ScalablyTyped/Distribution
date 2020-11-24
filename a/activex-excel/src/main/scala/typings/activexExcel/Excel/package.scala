package typings.activexExcel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Excel {
  
  type AddIns2 = typings.activexExcel.Excel.AddIns
  
  type InternationalResult[T] = scala.Boolean | scala.Double | java.lang.String
  
  type PivotFieldsResult = typings.activexExcel.Excel.PivotFields with (js.Function1[/* Index */ scala.Double | java.lang.String, typings.activexExcel.Excel.PivotField]) with (js.Function1[
    /* Indexes */ typings.std.SafeArray[scala.Double | java.lang.String], 
    typings.activexExcel.Excel.PivotFields
  ])
  
  type PivotItemsResult = typings.activexExcel.Excel.PivotItems with (js.Function1[/* Index */ scala.Double | java.lang.String, typings.activexExcel.Excel.PivotItem]) with (js.Function1[
    /* Indexes */ typings.std.SafeArray[scala.Double | java.lang.String], 
    typings.activexExcel.Excel.PivotItems
  ])
  
  type PivotTableWizardAutoPage[TSourceType] = js.UndefOr[scala.Boolean]
  
  type PivotTableWizardSourceData[TSourceType] = js.UndefOr[
    typings.activexExcel.Excel.Range | (typings.std.SafeArray[typings.activexExcel.Excel.Range | java.lang.String]) | java.lang.String
  ]
  
  type PrintToFileName[T] = js.UndefOr[java.lang.String]
  
  type XlCreator = typings.activexExcel.activexExcelNumbers.`1480803660`
  
  type XlDataLabelSeparator = typings.activexExcel.activexExcelNumbers.`1`
}
