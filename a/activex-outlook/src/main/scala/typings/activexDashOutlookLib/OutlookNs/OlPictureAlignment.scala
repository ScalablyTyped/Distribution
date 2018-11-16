package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlPictureAlignment extends js.Object

@JSGlobal("Outlook.OlPictureAlignment")
@js.native
object OlPictureAlignment extends js.Object {
  @js.native
  sealed trait olPictureAlignmentLeft
    extends activexDashOutlookLib.OutlookNs.OlPictureAlignment
  
  @js.native
  sealed trait olPictureAlignmentTop
    extends activexDashOutlookLib.OutlookNs.OlPictureAlignment
  
  /* 0 */ val olPictureAlignmentLeft: olPictureAlignmentLeft with scala.Double = js.native
  /* 1 */ val olPictureAlignmentTop: olPictureAlignmentTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlPictureAlignment with scala.Double] = js.native
}

