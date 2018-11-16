package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlReadingOrder extends js.Object

@JSGlobal("Word.XlReadingOrder")
@js.native
object XlReadingOrder extends js.Object {
  @js.native
  sealed trait xlContext
    extends activexDashWordLib.WordNs.XlReadingOrder
  
  @js.native
  sealed trait xlLTR
    extends activexDashWordLib.WordNs.XlReadingOrder
  
  @js.native
  sealed trait xlRTL
    extends activexDashWordLib.WordNs.XlReadingOrder
  
  /* -5002 */ val xlContext: xlContext with scala.Double = js.native
  /* -5003 */ val xlLTR: xlLTR with scala.Double = js.native
  /* -5004 */ val xlRTL: xlRTL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlReadingOrder with scala.Double] = js.native
}

