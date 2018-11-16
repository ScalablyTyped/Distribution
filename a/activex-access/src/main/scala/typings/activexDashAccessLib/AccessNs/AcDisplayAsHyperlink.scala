package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcDisplayAsHyperlink extends js.Object

@JSGlobal("Access.AcDisplayAsHyperlink")
@js.native
object AcDisplayAsHyperlink extends js.Object {
  @js.native
  sealed trait acDisplayAsHyperlinkAlways
    extends activexDashAccessLib.AccessNs.AcDisplayAsHyperlink
  
  @js.native
  sealed trait acDisplayAsHyperlinkIfHyperlink
    extends activexDashAccessLib.AccessNs.AcDisplayAsHyperlink
  
  @js.native
  sealed trait acDisplayAsHyperlinkOnScreenOnly
    extends activexDashAccessLib.AccessNs.AcDisplayAsHyperlink
  
  /* 1 */ val acDisplayAsHyperlinkAlways: acDisplayAsHyperlinkAlways with scala.Double = js.native
  /* 0 */ val acDisplayAsHyperlinkIfHyperlink: acDisplayAsHyperlinkIfHyperlink with scala.Double = js.native
  /* 2 */ val acDisplayAsHyperlinkOnScreenOnly: acDisplayAsHyperlinkOnScreenOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcDisplayAsHyperlink with scala.Double] = js.native
}

