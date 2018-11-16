package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlDataBarAxisPosition extends js.Object

@JSGlobal("Excel.XlDataBarAxisPosition")
@js.native
object XlDataBarAxisPosition extends js.Object {
  @js.native
  sealed trait xlDataBarAxisAutomatic
    extends activexDashExcelLib.ExcelNs.XlDataBarAxisPosition
  
  @js.native
  sealed trait xlDataBarAxisMidpoint
    extends activexDashExcelLib.ExcelNs.XlDataBarAxisPosition
  
  @js.native
  sealed trait xlDataBarAxisNone
    extends activexDashExcelLib.ExcelNs.XlDataBarAxisPosition
  
  /* 0 */ val xlDataBarAxisAutomatic: xlDataBarAxisAutomatic with scala.Double = js.native
  /* 1 */ val xlDataBarAxisMidpoint: xlDataBarAxisMidpoint with scala.Double = js.native
  /* 2 */ val xlDataBarAxisNone: xlDataBarAxisNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlDataBarAxisPosition with scala.Double] = js.native
}

