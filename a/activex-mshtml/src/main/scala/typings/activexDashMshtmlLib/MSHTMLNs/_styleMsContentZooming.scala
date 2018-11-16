package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleMsContentZooming extends js.Object

@JSGlobal("MSHTML._styleMsContentZooming")
@js.native
object _styleMsContentZooming extends js.Object {
  @js.native
  sealed trait styleMsContentZoomingNone
    extends activexDashMshtmlLib.MSHTMLNs._styleMsContentZooming
  
  @js.native
  sealed trait styleMsContentZoomingNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleMsContentZooming
  
  @js.native
  sealed trait styleMsContentZoomingZoom
    extends activexDashMshtmlLib.MSHTMLNs._styleMsContentZooming
  
  @js.native
  sealed trait styleMsContentZooming_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleMsContentZooming
  
  /* 1 */ val styleMsContentZoomingNone: styleMsContentZoomingNone with scala.Double = js.native
  /* 0 */ val styleMsContentZoomingNotSet: styleMsContentZoomingNotSet with scala.Double = js.native
  /* 2 */ val styleMsContentZoomingZoom: styleMsContentZoomingZoom with scala.Double = js.native
  /* 2147483647 */ val styleMsContentZooming_Max: styleMsContentZooming_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleMsContentZooming with scala.Double] = js.native
}

