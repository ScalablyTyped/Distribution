package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSubscribeToFormat extends js.Object

@JSGlobal("Excel.XlSubscribeToFormat")
@js.native
object XlSubscribeToFormat extends js.Object {
  @js.native
  sealed trait xlSubscribeToPicture
    extends activexDashExcelLib.ExcelNs.XlSubscribeToFormat
  
  @js.native
  sealed trait xlSubscribeToText
    extends activexDashExcelLib.ExcelNs.XlSubscribeToFormat
  
  /* -4147 */ val xlSubscribeToPicture: xlSubscribeToPicture with scala.Double = js.native
  /* -4158 */ val xlSubscribeToText: xlSubscribeToText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSubscribeToFormat with scala.Double] = js.native
}

