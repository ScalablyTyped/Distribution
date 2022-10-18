package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutDeliverabilityDashboardOptionRequest extends StObject {
  
  /**
    * Specifies whether to enable the Deliverability dashboard. To enable the dashboard, set this value to true.
    */
  var DashboardEnabled: Enabled
  
  /**
    * An array of objects, one for each verified domain that you use to send email and enabled the Deliverability dashboard for.
    */
  var SubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions] = js.undefined
}
object PutDeliverabilityDashboardOptionRequest {
  
  inline def apply(DashboardEnabled: Enabled): PutDeliverabilityDashboardOptionRequest = {
    val __obj = js.Dynamic.literal(DashboardEnabled = DashboardEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDeliverabilityDashboardOptionRequest]
  }
  
  extension [Self <: PutDeliverabilityDashboardOptionRequest](x: Self) {
    
    inline def setDashboardEnabled(value: Enabled): Self = StObject.set(x, "DashboardEnabled", value.asInstanceOf[js.Any])
    
    inline def setSubscribedDomains(value: DomainDeliverabilityTrackingOptions): Self = StObject.set(x, "SubscribedDomains", value.asInstanceOf[js.Any])
    
    inline def setSubscribedDomainsUndefined: Self = StObject.set(x, "SubscribedDomains", js.undefined)
    
    inline def setSubscribedDomainsVarargs(value: DomainDeliverabilityTrackingOption*): Self = StObject.set(x, "SubscribedDomains", js.Array(value*))
  }
}
