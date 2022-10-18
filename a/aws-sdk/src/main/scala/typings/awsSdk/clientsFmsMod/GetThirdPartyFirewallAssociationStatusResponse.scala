package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetThirdPartyFirewallAssociationStatusResponse extends StObject {
  
  /**
    * The status for subscribing to the third-party firewall vendor in the Amazon Web Services Marketplace.    NO_SUBSCRIPTION - The Firewall Manager policy administrator isn't subscribed to the third-party firewall service in the Amazon Web Services Marketplace.    NOT_COMPLETE - The Firewall Manager policy administrator is in the process of subscribing to the third-party firewall service in the Amazon Web Services Marketplace, but doesn't yet have an active subscription.    COMPLETE - The Firewall Manager policy administrator has an active subscription to the third-party firewall service in the Amazon Web Services Marketplace.  
    */
  var MarketplaceOnboardingStatus: js.UndefOr[MarketplaceSubscriptionOnboardingStatus] = js.undefined
  
  /**
    * The current status for setting a Firewall Manager policy administrators account as an administrator of the third-party firewall tenant.    ONBOARDING - The Firewall Manager policy administrator is being designated as a tenant administrator.    ONBOARD_COMPLETE - The Firewall Manager policy administrator is designated as a tenant administrator.    OFFBOARDING - The Firewall Manager policy administrator is being removed as a tenant administrator.    OFFBOARD_COMPLETE - The Firewall Manager policy administrator has been removed as a tenant administrator.    NOT_EXIST - The Firewall Manager policy administrator doesn't exist as a tenant administrator.  
    */
  var ThirdPartyFirewallStatus: js.UndefOr[ThirdPartyFirewallAssociationStatus] = js.undefined
}
object GetThirdPartyFirewallAssociationStatusResponse {
  
  inline def apply(): GetThirdPartyFirewallAssociationStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetThirdPartyFirewallAssociationStatusResponse]
  }
  
  extension [Self <: GetThirdPartyFirewallAssociationStatusResponse](x: Self) {
    
    inline def setMarketplaceOnboardingStatus(value: MarketplaceSubscriptionOnboardingStatus): Self = StObject.set(x, "MarketplaceOnboardingStatus", value.asInstanceOf[js.Any])
    
    inline def setMarketplaceOnboardingStatusUndefined: Self = StObject.set(x, "MarketplaceOnboardingStatus", js.undefined)
    
    inline def setThirdPartyFirewallStatus(value: ThirdPartyFirewallAssociationStatus): Self = StObject.set(x, "ThirdPartyFirewallStatus", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyFirewallStatusUndefined: Self = StObject.set(x, "ThirdPartyFirewallStatus", js.undefined)
  }
}
