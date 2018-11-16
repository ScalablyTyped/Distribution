package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlBackStyle extends js.Object

@JSGlobal("Outlook.OlBackStyle")
@js.native
object OlBackStyle extends js.Object {
  @js.native
  sealed trait olBackStyleOpaque
    extends activexDashOutlookLib.OutlookNs.OlBackStyle
  
  @js.native
  sealed trait olBackStyleTransparent
    extends activexDashOutlookLib.OutlookNs.OlBackStyle
  
  /* 1 */ val olBackStyleOpaque: olBackStyleOpaque with scala.Double = js.native
  /* 0 */ val olBackStyleTransparent: olBackStyleTransparent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlBackStyle with scala.Double] = js.native
}

