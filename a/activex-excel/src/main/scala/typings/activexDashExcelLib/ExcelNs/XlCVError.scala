package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlCVError extends js.Object

@JSGlobal("Excel.XlCVError")
@js.native
object XlCVError extends js.Object {
  @js.native
  sealed trait xlErrDiv0
    extends activexDashExcelLib.ExcelNs.XlCVError
  
  @js.native
  sealed trait xlErrNA
    extends activexDashExcelLib.ExcelNs.XlCVError
  
  @js.native
  sealed trait xlErrName
    extends activexDashExcelLib.ExcelNs.XlCVError
  
  @js.native
  sealed trait xlErrNull
    extends activexDashExcelLib.ExcelNs.XlCVError
  
  @js.native
  sealed trait xlErrNum
    extends activexDashExcelLib.ExcelNs.XlCVError
  
  @js.native
  sealed trait xlErrRef
    extends activexDashExcelLib.ExcelNs.XlCVError
  
  @js.native
  sealed trait xlErrValue
    extends activexDashExcelLib.ExcelNs.XlCVError
  
  /* 2007 */ val xlErrDiv0: xlErrDiv0 with scala.Double = js.native
  /* 2042 */ val xlErrNA: xlErrNA with scala.Double = js.native
  /* 2029 */ val xlErrName: xlErrName with scala.Double = js.native
  /* 2000 */ val xlErrNull: xlErrNull with scala.Double = js.native
  /* 2036 */ val xlErrNum: xlErrNum with scala.Double = js.native
  /* 2023 */ val xlErrRef: xlErrRef with scala.Double = js.native
  /* 2015 */ val xlErrValue: xlErrValue with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlCVError with scala.Double] = js.native
}

