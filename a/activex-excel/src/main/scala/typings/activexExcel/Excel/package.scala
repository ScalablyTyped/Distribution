package typings.activexExcel.Excel

import typings.activexExcel.activexExcelInts.`1480803660`
import typings.activexExcel.activexExcelInts.`1`
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AddIns2 = AddIns

type InternationalResult[T] = Boolean | Double | String

type PivotFieldsResult = PivotFields & (js.Function1[/* Index */ Double | String, PivotField]) & (js.Function1[/* Indexes */ SafeArray[Double | String], PivotFields])

type PivotItemsResult = PivotItems & (js.Function1[/* Index */ Double | String, PivotItem]) & (js.Function1[/* Indexes */ SafeArray[Double | String], PivotItems])

type PivotTableWizardAutoPage[TSourceType] = js.UndefOr[Boolean]

type PivotTableWizardSourceData[TSourceType] = Unit | Range | (SafeArray[Range | String]) | String

type PrintToFileName[T] = js.UndefOr[String]

type XlCreator = `1480803660`

type XlDataLabelSeparator = `1`
