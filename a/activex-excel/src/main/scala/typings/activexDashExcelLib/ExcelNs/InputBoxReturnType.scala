package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InputBoxReturnType extends js.Object

@JSGlobal("Excel.InputBoxReturnType")
@js.native
object InputBoxReturnType extends js.Object {
  @js.native
  sealed trait Boolean
    extends activexDashExcelLib.ExcelNs.InputBoxReturnType
  
  @js.native
  sealed trait ErrorValue
    extends activexDashExcelLib.ExcelNs.InputBoxReturnType
  
  @js.native
  sealed trait Formula
    extends activexDashExcelLib.ExcelNs.InputBoxReturnType
  
  @js.native
  sealed trait Number
    extends activexDashExcelLib.ExcelNs.InputBoxReturnType
  
  @js.native
  sealed trait Range
    extends activexDashExcelLib.ExcelNs.InputBoxReturnType
  
  @js.native
  sealed trait SafeArray
    extends activexDashExcelLib.ExcelNs.InputBoxReturnType
  
  @js.native
  sealed trait String
    extends activexDashExcelLib.ExcelNs.InputBoxReturnType
  
  /* 4 */ val Boolean: Boolean with scala.Double = js.native
  /* 16 */ val ErrorValue: ErrorValue with scala.Double = js.native
  /* 0 */ val Formula: Formula with scala.Double = js.native
  /* 1 */ val Number: Number with scala.Double = js.native
  /* 8 */ val Range: Range with scala.Double = js.native
  /* 64 */ val SafeArray: SafeArray with scala.Double = js.native
  /* 2 */ val String: String with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.InputBoxReturnType with scala.Double] = js.native
}

