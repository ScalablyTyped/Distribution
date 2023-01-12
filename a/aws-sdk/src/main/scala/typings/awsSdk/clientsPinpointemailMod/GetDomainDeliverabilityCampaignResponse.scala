package typings.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainDeliverabilityCampaignResponse extends StObject {
  
  /**
    * An object that contains the deliverability data for the campaign.
    */
  var DomainDeliverabilityCampaign: typings.awsSdk.clientsPinpointemailMod.DomainDeliverabilityCampaign
}
object GetDomainDeliverabilityCampaignResponse {
  
  inline def apply(DomainDeliverabilityCampaign: DomainDeliverabilityCampaign): GetDomainDeliverabilityCampaignResponse = {
    val __obj = js.Dynamic.literal(DomainDeliverabilityCampaign = DomainDeliverabilityCampaign.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainDeliverabilityCampaignResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDomainDeliverabilityCampaignResponse] (val x: Self) extends AnyVal {
    
    inline def setDomainDeliverabilityCampaign(value: DomainDeliverabilityCampaign): Self = StObject.set(x, "DomainDeliverabilityCampaign", value.asInstanceOf[js.Any])
  }
}
