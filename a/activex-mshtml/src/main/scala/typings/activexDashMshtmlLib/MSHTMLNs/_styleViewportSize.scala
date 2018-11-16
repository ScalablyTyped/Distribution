package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleViewportSize extends js.Object

@JSGlobal("MSHTML._styleViewportSize")
@js.native
object _styleViewportSize extends js.Object {
  @js.native
  sealed trait styleViewportSizeAuto
    extends activexDashMshtmlLib.MSHTMLNs._styleViewportSize
  
  @js.native
  sealed trait styleViewportSizeDeviceHeight
    extends activexDashMshtmlLib.MSHTMLNs._styleViewportSize
  
  @js.native
  sealed trait styleViewportSizeDeviceWidth
    extends activexDashMshtmlLib.MSHTMLNs._styleViewportSize
  
  @js.native
  sealed trait styleViewportSize_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleViewportSize
  
  /* 0 */ val styleViewportSizeAuto: styleViewportSizeAuto with scala.Double = js.native
  /* 2 */ val styleViewportSizeDeviceHeight: styleViewportSizeDeviceHeight with scala.Double = js.native
  /* 1 */ val styleViewportSizeDeviceWidth: styleViewportSizeDeviceWidth with scala.Double = js.native
  /* 2147483647 */ val styleViewportSize_Max: styleViewportSize_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleViewportSize with scala.Double] = js.native
}

