package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  TSourceType extends 2 ? std.SafeArray<string> : TSourceType extends activex-excel.Excel.XlPivotTableSourceType ? activex-excel.Excel.Range | std.SafeArray<activex-excel.Excel.Range> | string : TSourceType extends undefined ? undefined : never
  }}}
  */
@js.native
trait PivotTableWizardSourceData[TSourceType] extends StObject
