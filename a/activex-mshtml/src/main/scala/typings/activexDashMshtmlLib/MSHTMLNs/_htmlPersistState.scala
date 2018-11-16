package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlPersistState extends js.Object

@JSGlobal("MSHTML._htmlPersistState")
@js.native
object _htmlPersistState extends js.Object {
  @js.native
  sealed trait htmlPersistStateFavorite
    extends activexDashMshtmlLib.MSHTMLNs._htmlPersistState
  
  @js.native
  sealed trait htmlPersistStateHistory
    extends activexDashMshtmlLib.MSHTMLNs._htmlPersistState
  
  @js.native
  sealed trait htmlPersistStateNormal
    extends activexDashMshtmlLib.MSHTMLNs._htmlPersistState
  
  @js.native
  sealed trait htmlPersistStateSnapshot
    extends activexDashMshtmlLib.MSHTMLNs._htmlPersistState
  
  @js.native
  sealed trait htmlPersistStateUserData
    extends activexDashMshtmlLib.MSHTMLNs._htmlPersistState
  
  @js.native
  sealed trait htmlPersistState_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlPersistState
  
  /* 1 */ val htmlPersistStateFavorite: htmlPersistStateFavorite with scala.Double = js.native
  /* 2 */ val htmlPersistStateHistory: htmlPersistStateHistory with scala.Double = js.native
  /* 0 */ val htmlPersistStateNormal: htmlPersistStateNormal with scala.Double = js.native
  /* 3 */ val htmlPersistStateSnapshot: htmlPersistStateSnapshot with scala.Double = js.native
  /* 4 */ val htmlPersistStateUserData: htmlPersistStateUserData with scala.Double = js.native
  /* 2147483647 */ val htmlPersistState_Max: htmlPersistState_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlPersistState with scala.Double] = js.native
}

