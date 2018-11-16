package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcNavigationSpan extends js.Object

@JSGlobal("Access.AcNavigationSpan")
@js.native
object AcNavigationSpan extends js.Object {
  @js.native
  sealed trait acHorizontal
    extends activexDashAccessLib.AccessNs.AcNavigationSpan
  
  @js.native
  sealed trait acVertical
    extends activexDashAccessLib.AccessNs.AcNavigationSpan
  
  /* 0 */ val acHorizontal: acHorizontal with scala.Double = js.native
  /* 1 */ val acVertical: acVertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcNavigationSpan with scala.Double] = js.native
}

