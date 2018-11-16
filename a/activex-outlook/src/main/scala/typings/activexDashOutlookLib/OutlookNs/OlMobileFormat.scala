package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlMobileFormat extends js.Object

@JSGlobal("Outlook.OlMobileFormat")
@js.native
object OlMobileFormat extends js.Object {
  @js.native
  sealed trait olMMS
    extends activexDashOutlookLib.OutlookNs.OlMobileFormat
  
  @js.native
  sealed trait olSMS
    extends activexDashOutlookLib.OutlookNs.OlMobileFormat
  
  /* 1 */ val olMMS: olMMS with scala.Double = js.native
  /* 0 */ val olSMS: olSMS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlMobileFormat with scala.Double] = js.native
}

