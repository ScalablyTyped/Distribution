package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcVerticalAnchor extends js.Object

@JSGlobal("Access.AcVerticalAnchor")
@js.native
object AcVerticalAnchor extends js.Object {
  @js.native
  sealed trait acVerticalAnchorBoth
    extends activexDashAccessLib.AccessNs.AcVerticalAnchor
  
  @js.native
  sealed trait acVerticalAnchorBottom
    extends activexDashAccessLib.AccessNs.AcVerticalAnchor
  
  @js.native
  sealed trait acVerticalAnchorTop
    extends activexDashAccessLib.AccessNs.AcVerticalAnchor
  
  /* 2 */ val acVerticalAnchorBoth: acVerticalAnchorBoth with scala.Double = js.native
  /* 1 */ val acVerticalAnchorBottom: acVerticalAnchorBottom with scala.Double = js.native
  /* 0 */ val acVerticalAnchorTop: acVerticalAnchorTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcVerticalAnchor with scala.Double] = js.native
}

