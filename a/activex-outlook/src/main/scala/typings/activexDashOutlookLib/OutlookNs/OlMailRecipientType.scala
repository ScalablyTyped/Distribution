package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlMailRecipientType extends js.Object

@JSGlobal("Outlook.OlMailRecipientType")
@js.native
object OlMailRecipientType extends js.Object {
  @js.native
  sealed trait olBCC
    extends activexDashOutlookLib.OutlookNs.OlMailRecipientType
  
  @js.native
  sealed trait olCC
    extends activexDashOutlookLib.OutlookNs.OlMailRecipientType
  
  @js.native
  sealed trait olOriginator
    extends activexDashOutlookLib.OutlookNs.OlMailRecipientType
  
  @js.native
  sealed trait olTo
    extends activexDashOutlookLib.OutlookNs.OlMailRecipientType
  
  /* 3 */ val olBCC: olBCC with scala.Double = js.native
  /* 2 */ val olCC: olCC with scala.Double = js.native
  /* 0 */ val olOriginator: olOriginator with scala.Double = js.native
  /* 1 */ val olTo: olTo with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlMailRecipientType with scala.Double] = js.native
}

