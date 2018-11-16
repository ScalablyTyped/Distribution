package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlDownloadState extends js.Object

@JSGlobal("Outlook.OlDownloadState")
@js.native
object OlDownloadState extends js.Object {
  @js.native
  sealed trait olFullItem
    extends activexDashOutlookLib.OutlookNs.OlDownloadState
  
  @js.native
  sealed trait olHeaderOnly
    extends activexDashOutlookLib.OutlookNs.OlDownloadState
  
  /* 1 */ val olFullItem: olFullItem with scala.Double = js.native
  /* 0 */ val olHeaderOnly: olHeaderOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlDownloadState with scala.Double] = js.native
}

