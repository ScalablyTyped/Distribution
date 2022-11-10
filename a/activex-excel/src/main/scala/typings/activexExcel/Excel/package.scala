package typings.activexExcel.Excel

import typings.activexExcel.activexExcelInts.`1480803660`
import typings.activexExcel.activexExcelInts.`1`
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AddIns2 = AddIns

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends -4116 ? activex-excel.Excel.DialogSheet : T extends -4109 ? activex-excel.Excel.Chart : T extends activex-excel.Excel.XlSheetType ? activex-excel.Excel.Worksheet : T extends undefined ? activex-excel.Excel.Sheet : never
  }}}
  */
type AddSheetResult[T] = DialogSheet

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends activex-excel.Excel.XlApplicationInternationalStrings ? string : T extends activex-excel.Excel.XlApplicationInternationalNumbers ? number : T extends activex-excel.Excel.XlApplicationInternationalBooleans ? boolean : any
  }}}
  */
type InternationalResult[T] = String

type PivotFieldsResult = PivotFields & (js.Function1[/* Index */ Double | String, PivotField]) & (js.Function1[/* Indexes */ SafeArray[Double | String], PivotFields])

type PivotItemsResult = PivotItems & (js.Function1[/* Index */ Double | String, PivotItem]) & (js.Function1[/* Indexes */ SafeArray[Double | String], PivotItems])

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  TSourceType extends 3 ? boolean : undefined
  }}}
  */
type PivotTableWizardAutoPage[TSourceType] = Boolean

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  TSourceType extends 2 ? std.SafeArray<string> : TSourceType extends activex-excel.Excel.XlPivotTableSourceType ? activex-excel.Excel.Range | std.SafeArray<activex-excel.Excel.Range> | string : TSourceType extends undefined ? undefined : never
  }}}
  */
type PivotTableWizardSourceData[TSourceType] = SafeArray[String]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends true ? string : undefined
  }}}
  */
type PrintToFileName[T] = String

type XlCreator = `1480803660`

type XlDataLabelSeparator = `1`
