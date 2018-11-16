package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcHorizontalAnchor extends js.Object

@JSGlobal("Access.AcHorizontalAnchor")
@js.native
object AcHorizontalAnchor extends js.Object {
  @js.native
  sealed trait acHorizontalAnchorBoth
    extends activexDashAccessLib.AccessNs.AcHorizontalAnchor
  
  @js.native
  sealed trait acHorizontalAnchorLeft
    extends activexDashAccessLib.AccessNs.AcHorizontalAnchor
  
  @js.native
  sealed trait acHorizontalAnchorRight
    extends activexDashAccessLib.AccessNs.AcHorizontalAnchor
  
  /* 2 */ val acHorizontalAnchorBoth: acHorizontalAnchorBoth with scala.Double = js.native
  /* 0 */ val acHorizontalAnchorLeft: acHorizontalAnchorLeft with scala.Double = js.native
  /* 1 */ val acHorizontalAnchorRight: acHorizontalAnchorRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcHorizontalAnchor with scala.Double] = js.native
}

