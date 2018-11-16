package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlReadyState extends js.Object

@JSGlobal("MSHTML._htmlReadyState")
@js.native
object _htmlReadyState extends js.Object {
  @js.native
  sealed trait htmlReadyState_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlReadyState
  
  @js.native
  sealed trait htmlReadyStatecomplete
    extends activexDashMshtmlLib.MSHTMLNs._htmlReadyState
  
  @js.native
  sealed trait htmlReadyStateinteractive
    extends activexDashMshtmlLib.MSHTMLNs._htmlReadyState
  
  @js.native
  sealed trait htmlReadyStateloaded
    extends activexDashMshtmlLib.MSHTMLNs._htmlReadyState
  
  @js.native
  sealed trait htmlReadyStateloading
    extends activexDashMshtmlLib.MSHTMLNs._htmlReadyState
  
  @js.native
  sealed trait htmlReadyStateuninitialized
    extends activexDashMshtmlLib.MSHTMLNs._htmlReadyState
  
  /* 2147483647 */ val htmlReadyState_Max: htmlReadyState_Max with scala.Double = js.native
  /* 4 */ val htmlReadyStatecomplete: htmlReadyStatecomplete with scala.Double = js.native
  /* 3 */ val htmlReadyStateinteractive: htmlReadyStateinteractive with scala.Double = js.native
  /* 2 */ val htmlReadyStateloaded: htmlReadyStateloaded with scala.Double = js.native
  /* 1 */ val htmlReadyStateloading: htmlReadyStateloading with scala.Double = js.native
  /* 0 */ val htmlReadyStateuninitialized: htmlReadyStateuninitialized with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlReadyState with scala.Double] = js.native
}

