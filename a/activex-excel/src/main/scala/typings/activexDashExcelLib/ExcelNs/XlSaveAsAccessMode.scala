package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSaveAsAccessMode extends js.Object

@JSGlobal("Excel.XlSaveAsAccessMode")
@js.native
object XlSaveAsAccessMode extends js.Object {
  @js.native
  sealed trait xlExclusive
    extends activexDashExcelLib.ExcelNs.XlSaveAsAccessMode
  
  @js.native
  sealed trait xlNoChange
    extends activexDashExcelLib.ExcelNs.XlSaveAsAccessMode
  
  @js.native
  sealed trait xlShared
    extends activexDashExcelLib.ExcelNs.XlSaveAsAccessMode
  
  /* 3 */ val xlExclusive: xlExclusive with scala.Double = js.native
  /* 1 */ val xlNoChange: xlNoChange with scala.Double = js.native
  /* 2 */ val xlShared: xlShared with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSaveAsAccessMode with scala.Double] = js.native
}

