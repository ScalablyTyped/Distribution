package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlReferenceType extends js.Object

@JSGlobal("Outlook.OlReferenceType")
@js.native
object OlReferenceType extends js.Object {
  @js.native
  sealed trait olStrong
    extends activexDashOutlookLib.OutlookNs.OlReferenceType
  
  @js.native
  sealed trait olWeak
    extends activexDashOutlookLib.OutlookNs.OlReferenceType
  
  /* 1 */ val olStrong: olStrong with scala.Double = js.native
  /* 0 */ val olWeak: olWeak with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlReferenceType with scala.Double] = js.native
}

