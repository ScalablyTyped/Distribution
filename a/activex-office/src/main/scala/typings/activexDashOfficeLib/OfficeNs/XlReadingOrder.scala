package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlReadingOrder extends js.Object

@JSGlobal("Office.XlReadingOrder")
@js.native
object XlReadingOrder extends js.Object {
  @js.native
  sealed trait xlContext
    extends activexDashOfficeLib.OfficeNs.XlReadingOrder
  
  @js.native
  sealed trait xlLTR
    extends activexDashOfficeLib.OfficeNs.XlReadingOrder
  
  @js.native
  sealed trait xlRTL
    extends activexDashOfficeLib.OfficeNs.XlReadingOrder
  
  /* -5002 */ val xlContext: xlContext with scala.Double = js.native
  /* -5003 */ val xlLTR: xlLTR with scala.Double = js.native
  /* -5004 */ val xlRTL: xlRTL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlReadingOrder with scala.Double] = js.native
}

