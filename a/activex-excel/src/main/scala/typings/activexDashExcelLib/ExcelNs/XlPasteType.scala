package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPasteType extends js.Object

@JSGlobal("Excel.XlPasteType")
@js.native
object XlPasteType extends js.Object {
  @js.native
  sealed trait xlPasteAll
    extends activexDashExcelLib.ExcelNs.XlPasteType
  
  @js.native
  sealed trait xlPasteAllExceptBorders
    extends activexDashExcelLib.ExcelNs.XlPasteType
  
  @js.native
  sealed trait xlPasteAllMergingConditionalFormats
    extends activexDashExcelLib.ExcelNs.XlPasteType
  
  @js.native
  sealed trait xlPasteAllUsingSourceTheme
    extends activexDashExcelLib.ExcelNs.XlPasteType
  
  @js.native
  sealed trait xlPasteColumnWidths
    extends activexDashExcelLib.ExcelNs.XlPasteType
  
  @js.native
  sealed trait xlPasteComments
    extends activexDashExcelLib.ExcelNs.XlPasteType
  
  @js.native
  sealed trait xlPasteFormats
    extends activexDashExcelLib.ExcelNs.XlPasteType
  
  @js.native
  sealed trait xlPasteFormulas
    extends activexDashExcelLib.ExcelNs.XlPasteType
  
  @js.native
  sealed trait xlPasteFormulasAndNumberFormats
    extends activexDashExcelLib.ExcelNs.XlPasteType
  
  @js.native
  sealed trait xlPasteValidation
    extends activexDashExcelLib.ExcelNs.XlPasteType
  
  @js.native
  sealed trait xlPasteValues
    extends activexDashExcelLib.ExcelNs.XlPasteType
  
  @js.native
  sealed trait xlPasteValuesAndNumberFormats
    extends activexDashExcelLib.ExcelNs.XlPasteType
  
  /* -4104 */ val xlPasteAll: xlPasteAll with scala.Double = js.native
  /* 7 */ val xlPasteAllExceptBorders: xlPasteAllExceptBorders with scala.Double = js.native
  /* 14 */ val xlPasteAllMergingConditionalFormats: xlPasteAllMergingConditionalFormats with scala.Double = js.native
  /* 13 */ val xlPasteAllUsingSourceTheme: xlPasteAllUsingSourceTheme with scala.Double = js.native
  /* 8 */ val xlPasteColumnWidths: xlPasteColumnWidths with scala.Double = js.native
  /* -4144 */ val xlPasteComments: xlPasteComments with scala.Double = js.native
  /* -4122 */ val xlPasteFormats: xlPasteFormats with scala.Double = js.native
  /* -4123 */ val xlPasteFormulas: xlPasteFormulas with scala.Double = js.native
  /* 11 */ val xlPasteFormulasAndNumberFormats: xlPasteFormulasAndNumberFormats with scala.Double = js.native
  /* 6 */ val xlPasteValidation: xlPasteValidation with scala.Double = js.native
  /* -4163 */ val xlPasteValues: xlPasteValues with scala.Double = js.native
  /* 12 */ val xlPasteValuesAndNumberFormats: xlPasteValuesAndNumberFormats with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPasteType with scala.Double] = js.native
}

