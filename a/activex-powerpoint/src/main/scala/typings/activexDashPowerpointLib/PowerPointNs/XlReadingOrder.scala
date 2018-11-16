package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlReadingOrder extends js.Object

@JSGlobal("PowerPoint.XlReadingOrder")
@js.native
object XlReadingOrder extends js.Object {
  @js.native
  sealed trait xlContext
    extends activexDashPowerpointLib.PowerPointNs.XlReadingOrder
  
  @js.native
  sealed trait xlLTR
    extends activexDashPowerpointLib.PowerPointNs.XlReadingOrder
  
  @js.native
  sealed trait xlRTL
    extends activexDashPowerpointLib.PowerPointNs.XlReadingOrder
  
  /* -5002 */ val xlContext: xlContext with scala.Double = js.native
  /* -5003 */ val xlLTR: xlLTR with scala.Double = js.native
  /* -5004 */ val xlRTL: xlRTL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.XlReadingOrder with scala.Double] = js.native
}

