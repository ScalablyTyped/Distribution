package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlMailingAddress extends js.Object

@JSGlobal("Outlook.OlMailingAddress")
@js.native
object OlMailingAddress extends js.Object {
  @js.native
  sealed trait olBusiness
    extends activexDashOutlookLib.OutlookNs.OlMailingAddress
  
  @js.native
  sealed trait olHome
    extends activexDashOutlookLib.OutlookNs.OlMailingAddress
  
  @js.native
  sealed trait olNone
    extends activexDashOutlookLib.OutlookNs.OlMailingAddress
  
  @js.native
  sealed trait olOther
    extends activexDashOutlookLib.OutlookNs.OlMailingAddress
  
  /* 2 */ val olBusiness: olBusiness with scala.Double = js.native
  /* 1 */ val olHome: olHome with scala.Double = js.native
  /* 0 */ val olNone: olNone with scala.Double = js.native
  /* 3 */ val olOther: olOther with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlMailingAddress with scala.Double] = js.native
}

