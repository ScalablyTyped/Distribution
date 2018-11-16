package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlMediaNetworkState extends js.Object

@JSGlobal("MSHTML._htmlMediaNetworkState")
@js.native
object _htmlMediaNetworkState extends js.Object {
  @js.native
  sealed trait htmlMediaNetworkStateEmpty
    extends activexDashMshtmlLib.MSHTMLNs._htmlMediaNetworkState
  
  @js.native
  sealed trait htmlMediaNetworkStateIdle
    extends activexDashMshtmlLib.MSHTMLNs._htmlMediaNetworkState
  
  @js.native
  sealed trait htmlMediaNetworkStateLoading
    extends activexDashMshtmlLib.MSHTMLNs._htmlMediaNetworkState
  
  @js.native
  sealed trait htmlMediaNetworkStateNoSource
    extends activexDashMshtmlLib.MSHTMLNs._htmlMediaNetworkState
  
  @js.native
  sealed trait htmlMediaNetworkState_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlMediaNetworkState
  
  /* 0 */ val htmlMediaNetworkStateEmpty: htmlMediaNetworkStateEmpty with scala.Double = js.native
  /* 1 */ val htmlMediaNetworkStateIdle: htmlMediaNetworkStateIdle with scala.Double = js.native
  /* 2 */ val htmlMediaNetworkStateLoading: htmlMediaNetworkStateLoading with scala.Double = js.native
  /* 3 */ val htmlMediaNetworkStateNoSource: htmlMediaNetworkStateNoSource with scala.Double = js.native
  /* 2147483647 */ val htmlMediaNetworkState_Max: htmlMediaNetworkState_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlMediaNetworkState with scala.Double] = js.native
}

