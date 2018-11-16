package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlGender extends js.Object

@JSGlobal("Outlook.OlGender")
@js.native
object OlGender extends js.Object {
  @js.native
  sealed trait olFemale
    extends activexDashOutlookLib.OutlookNs.OlGender
  
  @js.native
  sealed trait olMale
    extends activexDashOutlookLib.OutlookNs.OlGender
  
  @js.native
  sealed trait olUnspecified
    extends activexDashOutlookLib.OutlookNs.OlGender
  
  /* 1 */ val olFemale: olFemale with scala.Double = js.native
  /* 2 */ val olMale: olMale with scala.Double = js.native
  /* 0 */ val olUnspecified: olUnspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlGender with scala.Double] = js.native
}

