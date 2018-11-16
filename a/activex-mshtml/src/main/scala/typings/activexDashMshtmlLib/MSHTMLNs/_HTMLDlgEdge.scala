package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _HTMLDlgEdge extends js.Object

@JSGlobal("MSHTML._HTMLDlgEdge")
@js.native
object _HTMLDlgEdge extends js.Object {
  @js.native
  sealed trait HTMLDlgEdgeRaised
    extends activexDashMshtmlLib.MSHTMLNs._HTMLDlgEdge
  
  @js.native
  sealed trait HTMLDlgEdgeSunken
    extends activexDashMshtmlLib.MSHTMLNs._HTMLDlgEdge
  
  @js.native
  sealed trait HTMLDlgEdge_Max
    extends activexDashMshtmlLib.MSHTMLNs._HTMLDlgEdge
  
  /* 16 */ val HTMLDlgEdgeRaised: HTMLDlgEdgeRaised with scala.Double = js.native
  /* 0 */ val HTMLDlgEdgeSunken: HTMLDlgEdgeSunken with scala.Double = js.native
  /* 2147483647 */ val HTMLDlgEdge_Max: HTMLDlgEdge_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._HTMLDlgEdge with scala.Double] = js.native
}

