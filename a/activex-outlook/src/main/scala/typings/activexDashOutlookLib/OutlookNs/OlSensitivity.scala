package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlSensitivity extends js.Object

@JSGlobal("Outlook.OlSensitivity")
@js.native
object OlSensitivity extends js.Object {
  @js.native
  sealed trait olConfidential
    extends activexDashOutlookLib.OutlookNs.OlSensitivity
  
  @js.native
  sealed trait olNormal
    extends activexDashOutlookLib.OutlookNs.OlSensitivity
  
  @js.native
  sealed trait olPersonal
    extends activexDashOutlookLib.OutlookNs.OlSensitivity
  
  @js.native
  sealed trait olPrivate
    extends activexDashOutlookLib.OutlookNs.OlSensitivity
  
  /* 3 */ val olConfidential: olConfidential with scala.Double = js.native
  /* 0 */ val olNormal: olNormal with scala.Double = js.native
  /* 1 */ val olPersonal: olPersonal with scala.Double = js.native
  /* 2 */ val olPrivate: olPrivate with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlSensitivity with scala.Double] = js.native
}

