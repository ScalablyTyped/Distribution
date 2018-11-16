package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlSharingProvider extends js.Object

@JSGlobal("Outlook.OlSharingProvider")
@js.native
object OlSharingProvider extends js.Object {
  @js.native
  sealed trait olProviderExchange
    extends activexDashOutlookLib.OutlookNs.OlSharingProvider
  
  @js.native
  sealed trait olProviderFederate
    extends activexDashOutlookLib.OutlookNs.OlSharingProvider
  
  @js.native
  sealed trait olProviderICal
    extends activexDashOutlookLib.OutlookNs.OlSharingProvider
  
  @js.native
  sealed trait olProviderPubCal
    extends activexDashOutlookLib.OutlookNs.OlSharingProvider
  
  @js.native
  sealed trait olProviderRSS
    extends activexDashOutlookLib.OutlookNs.OlSharingProvider
  
  @js.native
  sealed trait olProviderSharePoint
    extends activexDashOutlookLib.OutlookNs.OlSharingProvider
  
  @js.native
  sealed trait olProviderUnknown
    extends activexDashOutlookLib.OutlookNs.OlSharingProvider
  
  @js.native
  sealed trait olProviderWebCal
    extends activexDashOutlookLib.OutlookNs.OlSharingProvider
  
  /* 1 */ val olProviderExchange: olProviderExchange with scala.Double = js.native
  /* 7 */ val olProviderFederate: olProviderFederate with scala.Double = js.native
  /* 4 */ val olProviderICal: olProviderICal with scala.Double = js.native
  /* 3 */ val olProviderPubCal: olProviderPubCal with scala.Double = js.native
  /* 6 */ val olProviderRSS: olProviderRSS with scala.Double = js.native
  /* 5 */ val olProviderSharePoint: olProviderSharePoint with scala.Double = js.native
  /* 0 */ val olProviderUnknown: olProviderUnknown with scala.Double = js.native
  /* 2 */ val olProviderWebCal: olProviderWebCal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlSharingProvider with scala.Double] = js.native
}

