package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _SAVE_SEGMENTS_FLAGS extends js.Object

@JSGlobal("MSHTML._SAVE_SEGMENTS_FLAGS")
@js.native
object _SAVE_SEGMENTS_FLAGS extends js.Object {
  @js.native
  sealed trait SAVE_SEGMENTS_FLAGS_Max
    extends activexDashMshtmlLib.MSHTMLNs._SAVE_SEGMENTS_FLAGS
  
  @js.native
  sealed trait SAVE_SEGMENTS_NoIE4SelectionCompat
    extends activexDashMshtmlLib.MSHTMLNs._SAVE_SEGMENTS_FLAGS
  
  /* 2147483647 */ val SAVE_SEGMENTS_FLAGS_Max: SAVE_SEGMENTS_FLAGS_Max with scala.Double = js.native
  /* 1 */ val SAVE_SEGMENTS_NoIE4SelectionCompat: SAVE_SEGMENTS_NoIE4SelectionCompat with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._SAVE_SEGMENTS_FLAGS with scala.Double] = js.native
}

