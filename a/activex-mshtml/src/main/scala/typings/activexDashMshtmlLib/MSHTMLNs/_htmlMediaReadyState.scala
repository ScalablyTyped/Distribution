package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlMediaReadyState extends js.Object

@JSGlobal("MSHTML._htmlMediaReadyState")
@js.native
object _htmlMediaReadyState extends js.Object {
  @js.native
  sealed trait htmlMediaReadyStateHaveCurrentData
    extends activexDashMshtmlLib.MSHTMLNs._htmlMediaReadyState
  
  @js.native
  sealed trait htmlMediaReadyStateHaveEnoughData
    extends activexDashMshtmlLib.MSHTMLNs._htmlMediaReadyState
  
  @js.native
  sealed trait htmlMediaReadyStateHaveFutureData
    extends activexDashMshtmlLib.MSHTMLNs._htmlMediaReadyState
  
  @js.native
  sealed trait htmlMediaReadyStateHaveMetadata
    extends activexDashMshtmlLib.MSHTMLNs._htmlMediaReadyState
  
  @js.native
  sealed trait htmlMediaReadyStateHaveNothing
    extends activexDashMshtmlLib.MSHTMLNs._htmlMediaReadyState
  
  @js.native
  sealed trait htmlMediaReadyState_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlMediaReadyState
  
  /* 2 */ val htmlMediaReadyStateHaveCurrentData: htmlMediaReadyStateHaveCurrentData with scala.Double = js.native
  /* 4 */ val htmlMediaReadyStateHaveEnoughData: htmlMediaReadyStateHaveEnoughData with scala.Double = js.native
  /* 3 */ val htmlMediaReadyStateHaveFutureData: htmlMediaReadyStateHaveFutureData with scala.Double = js.native
  /* 1 */ val htmlMediaReadyStateHaveMetadata: htmlMediaReadyStateHaveMetadata with scala.Double = js.native
  /* 0 */ val htmlMediaReadyStateHaveNothing: htmlMediaReadyStateHaveNothing with scala.Double = js.native
  /* 2147483647 */ val htmlMediaReadyState_Max: htmlMediaReadyState_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlMediaReadyState with scala.Double] = js.native
}

