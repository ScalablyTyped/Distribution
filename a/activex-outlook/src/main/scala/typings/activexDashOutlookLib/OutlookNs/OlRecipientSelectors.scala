package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlRecipientSelectors extends js.Object

@JSGlobal("Outlook.OlRecipientSelectors")
@js.native
object OlRecipientSelectors extends js.Object {
  @js.native
  sealed trait olShowNone
    extends activexDashOutlookLib.OutlookNs.OlRecipientSelectors
  
  @js.native
  sealed trait olShowTo
    extends activexDashOutlookLib.OutlookNs.OlRecipientSelectors
  
  @js.native
  sealed trait olShowToCc
    extends activexDashOutlookLib.OutlookNs.OlRecipientSelectors
  
  @js.native
  sealed trait olShowToCcBcc
    extends activexDashOutlookLib.OutlookNs.OlRecipientSelectors
  
  /* 0 */ val olShowNone: olShowNone with scala.Double = js.native
  /* 1 */ val olShowTo: olShowTo with scala.Double = js.native
  /* 2 */ val olShowToCc: olShowToCc with scala.Double = js.native
  /* 3 */ val olShowToCcBcc: olShowToCcBcc with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlRecipientSelectors with scala.Double] = js.native
}

