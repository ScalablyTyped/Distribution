package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlFormRegionMode extends js.Object

@JSGlobal("Outlook.OlFormRegionMode")
@js.native
object OlFormRegionMode extends js.Object {
  @js.native
  sealed trait olFormRegionCompose
    extends activexDashOutlookLib.OutlookNs.OlFormRegionMode
  
  @js.native
  sealed trait olFormRegionPreview
    extends activexDashOutlookLib.OutlookNs.OlFormRegionMode
  
  @js.native
  sealed trait olFormRegionRead
    extends activexDashOutlookLib.OutlookNs.OlFormRegionMode
  
  /* 1 */ val olFormRegionCompose: olFormRegionCompose with scala.Double = js.native
  /* 2 */ val olFormRegionPreview: olFormRegionPreview with scala.Double = js.native
  /* 0 */ val olFormRegionRead: olFormRegionRead with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlFormRegionMode with scala.Double] = js.native
}

