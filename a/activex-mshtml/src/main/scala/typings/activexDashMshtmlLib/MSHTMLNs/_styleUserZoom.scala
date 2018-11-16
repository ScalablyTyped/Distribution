package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleUserZoom extends js.Object

@JSGlobal("MSHTML._styleUserZoom")
@js.native
object _styleUserZoom extends js.Object {
  @js.native
  sealed trait styleUserZoomFixed
    extends activexDashMshtmlLib.MSHTMLNs._styleUserZoom
  
  @js.native
  sealed trait styleUserZoomNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleUserZoom
  
  @js.native
  sealed trait styleUserZoomZoom
    extends activexDashMshtmlLib.MSHTMLNs._styleUserZoom
  
  @js.native
  sealed trait styleUserZoom_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleUserZoom
  
  /* 2 */ val styleUserZoomFixed: styleUserZoomFixed with scala.Double = js.native
  /* 0 */ val styleUserZoomNotSet: styleUserZoomNotSet with scala.Double = js.native
  /* 1 */ val styleUserZoomZoom: styleUserZoomZoom with scala.Double = js.native
  /* 2147483647 */ val styleUserZoom_Max: styleUserZoom_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleUserZoom with scala.Double] = js.native
}

