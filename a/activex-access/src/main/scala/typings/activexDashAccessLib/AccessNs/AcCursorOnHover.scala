package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcCursorOnHover extends js.Object

@JSGlobal("Access.AcCursorOnHover")
@js.native
object AcCursorOnHover extends js.Object {
  @js.native
  sealed trait acCursorOnHoverDefault
    extends activexDashAccessLib.AccessNs.AcCursorOnHover
  
  @js.native
  sealed trait acCursorOnHoverHyperlinkHand
    extends activexDashAccessLib.AccessNs.AcCursorOnHover
  
  /* 0 */ val acCursorOnHoverDefault: acCursorOnHoverDefault with scala.Double = js.native
  /* 1 */ val acCursorOnHoverHyperlinkHand: acCursorOnHoverHyperlinkHand with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcCursorOnHover with scala.Double] = js.native
}

