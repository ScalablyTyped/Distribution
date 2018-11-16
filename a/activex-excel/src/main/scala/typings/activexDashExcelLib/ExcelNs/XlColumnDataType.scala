package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlColumnDataType extends js.Object

@JSGlobal("Excel.XlColumnDataType")
@js.native
object XlColumnDataType extends js.Object {
  @js.native
  sealed trait xlDMYFormat
    extends activexDashExcelLib.ExcelNs.XlColumnDataType
  
  @js.native
  sealed trait xlDYMFormat
    extends activexDashExcelLib.ExcelNs.XlColumnDataType
  
  @js.native
  sealed trait xlEMDFormat
    extends activexDashExcelLib.ExcelNs.XlColumnDataType
  
  @js.native
  sealed trait xlGeneralFormat
    extends activexDashExcelLib.ExcelNs.XlColumnDataType
  
  @js.native
  sealed trait xlMDYFormat
    extends activexDashExcelLib.ExcelNs.XlColumnDataType
  
  @js.native
  sealed trait xlMYDFormat
    extends activexDashExcelLib.ExcelNs.XlColumnDataType
  
  @js.native
  sealed trait xlSkipColumn
    extends activexDashExcelLib.ExcelNs.XlColumnDataType
  
  @js.native
  sealed trait xlTextFormat
    extends activexDashExcelLib.ExcelNs.XlColumnDataType
  
  @js.native
  sealed trait xlYDMFormat
    extends activexDashExcelLib.ExcelNs.XlColumnDataType
  
  @js.native
  sealed trait xlYMDFormat
    extends activexDashExcelLib.ExcelNs.XlColumnDataType
  
  /* 4 */ val xlDMYFormat: xlDMYFormat with scala.Double = js.native
  /* 7 */ val xlDYMFormat: xlDYMFormat with scala.Double = js.native
  /* 10 */ val xlEMDFormat: xlEMDFormat with scala.Double = js.native
  /* 1 */ val xlGeneralFormat: xlGeneralFormat with scala.Double = js.native
  /* 3 */ val xlMDYFormat: xlMDYFormat with scala.Double = js.native
  /* 6 */ val xlMYDFormat: xlMYDFormat with scala.Double = js.native
  /* 9 */ val xlSkipColumn: xlSkipColumn with scala.Double = js.native
  /* 2 */ val xlTextFormat: xlTextFormat with scala.Double = js.native
  /* 8 */ val xlYDMFormat: xlYDMFormat with scala.Double = js.native
  /* 5 */ val xlYMDFormat: xlYMDFormat with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlColumnDataType with scala.Double] = js.native
}

