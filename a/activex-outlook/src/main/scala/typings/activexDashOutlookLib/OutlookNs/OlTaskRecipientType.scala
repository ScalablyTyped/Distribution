package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlTaskRecipientType extends js.Object

@JSGlobal("Outlook.OlTaskRecipientType")
@js.native
object OlTaskRecipientType extends js.Object {
  @js.native
  sealed trait olFinalStatus
    extends activexDashOutlookLib.OutlookNs.OlTaskRecipientType
  
  @js.native
  sealed trait olUpdate
    extends activexDashOutlookLib.OutlookNs.OlTaskRecipientType
  
  /* 3 */ val olFinalStatus: olFinalStatus with scala.Double = js.native
  /* 2 */ val olUpdate: olUpdate with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlTaskRecipientType with scala.Double] = js.native
}

