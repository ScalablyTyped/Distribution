package typings
package activexDashShdocvwLib.SHDocVwNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RefreshConstants extends js.Object

// tslint:disable-next-line no-const-enum
@JSGlobal("SHDocVw.RefreshConstants")
@js.native
object RefreshConstants extends js.Object {
  @js.native
  sealed trait Completely
    extends activexDashShdocvwLib.SHDocVwNs.RefreshConstants
  
  @js.native
  sealed trait IfExpired
    extends activexDashShdocvwLib.SHDocVwNs.RefreshConstants
  
  @js.native
  sealed trait Normal
    extends activexDashShdocvwLib.SHDocVwNs.RefreshConstants
  
  /* 3 */ val Completely: Completely with scala.Double = js.native
  /* 1 */ val IfExpired: IfExpired with scala.Double = js.native
  /* 0 */ val Normal: Normal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashShdocvwLib.SHDocVwNs.RefreshConstants with scala.Double] = js.native
}

