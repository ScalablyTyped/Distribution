package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccountResponse extends StObject {
  
  /**
    * Indicates whether or not the automatic warm-up feature is enabled for dedicated IP addresses that are associated with your account.
    */
  var DedicatedIpAutoWarmupEnabled: js.UndefOr[Enabled] = js.undefined
  
  /**
    * An object that defines your account details.
    */
  var Details: js.UndefOr[AccountDetails] = js.undefined
  
  /**
    * The reputation status of your Amazon SES account. The status can be one of the following:    HEALTHY – There are no reputation-related issues that currently impact your account.    PROBATION – We've identified potential issues with your Amazon SES account. We're placing your account under review while you work on correcting these issues.    SHUTDOWN – Your account's ability to send email is currently paused because of an issue with the email sent from your account. When you correct the issue, you can contact us and request that your account's ability to send email is resumed.  
    */
  var EnforcementStatus: js.UndefOr[GeneralEnforcementStatus] = js.undefined
  
  /**
    * Indicates whether or not your account has production access in the current Amazon Web Services Region. If the value is false, then your account is in the sandbox. When your account is in the sandbox, you can only send email to verified identities. Additionally, the maximum number of emails you can send in a 24-hour period (your sending quota) is 200, and the maximum number of emails you can send per second (your maximum sending rate) is 1. If the value is true, then your account has production access. When your account has production access, you can send email to any address. The sending quota and maximum sending rate for your account vary based on your specific use case.
    */
  var ProductionAccessEnabled: js.UndefOr[Enabled] = js.undefined
  
  /**
    * An object that contains information about the per-day and per-second sending limits for your Amazon SES account in the current Amazon Web Services Region.
    */
  var SendQuota: js.UndefOr[typings.awsSdk.clientsSesv2Mod.SendQuota] = js.undefined
  
  /**
    * Indicates whether or not email sending is enabled for your Amazon SES account in the current Amazon Web Services Region.
    */
  var SendingEnabled: js.UndefOr[Enabled] = js.undefined
  
  /**
    * An object that contains information about the email address suppression preferences for your account in the current Amazon Web Services Region.
    */
  var SuppressionAttributes: js.UndefOr[typings.awsSdk.clientsSesv2Mod.SuppressionAttributes] = js.undefined
}
object GetAccountResponse {
  
  inline def apply(): GetAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountResponse]
  }
  
  extension [Self <: GetAccountResponse](x: Self) {
    
    inline def setDedicatedIpAutoWarmupEnabled(value: Enabled): Self = StObject.set(x, "DedicatedIpAutoWarmupEnabled", value.asInstanceOf[js.Any])
    
    inline def setDedicatedIpAutoWarmupEnabledUndefined: Self = StObject.set(x, "DedicatedIpAutoWarmupEnabled", js.undefined)
    
    inline def setDetails(value: AccountDetails): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    
    inline def setEnforcementStatus(value: GeneralEnforcementStatus): Self = StObject.set(x, "EnforcementStatus", value.asInstanceOf[js.Any])
    
    inline def setEnforcementStatusUndefined: Self = StObject.set(x, "EnforcementStatus", js.undefined)
    
    inline def setProductionAccessEnabled(value: Enabled): Self = StObject.set(x, "ProductionAccessEnabled", value.asInstanceOf[js.Any])
    
    inline def setProductionAccessEnabledUndefined: Self = StObject.set(x, "ProductionAccessEnabled", js.undefined)
    
    inline def setSendQuota(value: SendQuota): Self = StObject.set(x, "SendQuota", value.asInstanceOf[js.Any])
    
    inline def setSendQuotaUndefined: Self = StObject.set(x, "SendQuota", js.undefined)
    
    inline def setSendingEnabled(value: Enabled): Self = StObject.set(x, "SendingEnabled", value.asInstanceOf[js.Any])
    
    inline def setSendingEnabledUndefined: Self = StObject.set(x, "SendingEnabled", js.undefined)
    
    inline def setSuppressionAttributes(value: SuppressionAttributes): Self = StObject.set(x, "SuppressionAttributes", value.asInstanceOf[js.Any])
    
    inline def setSuppressionAttributesUndefined: Self = StObject.set(x, "SuppressionAttributes", js.undefined)
  }
}
