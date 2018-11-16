package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleMsAnimationPlayState extends js.Object

@JSGlobal("MSHTML._styleMsAnimationPlayState")
@js.native
object _styleMsAnimationPlayState extends js.Object {
  @js.native
  sealed trait styleMsAnimationPlayStateNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleMsAnimationPlayState
  
  @js.native
  sealed trait styleMsAnimationPlayStatePaused
    extends activexDashMshtmlLib.MSHTMLNs._styleMsAnimationPlayState
  
  @js.native
  sealed trait styleMsAnimationPlayStateRunning
    extends activexDashMshtmlLib.MSHTMLNs._styleMsAnimationPlayState
  
  @js.native
  sealed trait styleMsAnimationPlayState_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleMsAnimationPlayState
  
  /* 2 */ val styleMsAnimationPlayStateNotSet: styleMsAnimationPlayStateNotSet with scala.Double = js.native
  /* 1 */ val styleMsAnimationPlayStatePaused: styleMsAnimationPlayStatePaused with scala.Double = js.native
  /* 0 */ val styleMsAnimationPlayStateRunning: styleMsAnimationPlayStateRunning with scala.Double = js.native
  /* 2147483647 */ val styleMsAnimationPlayState_Max: styleMsAnimationPlayState_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleMsAnimationPlayState with scala.Double] = js.native
}

