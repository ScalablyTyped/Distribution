package typings.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccountResponse extends StObject {
  
  /**
    * Indicates whether or not the automatic warm-up feature is enabled for dedicated IP addresses that are associated with your account.
    */
  var DedicatedIpAutoWarmupEnabled: js.UndefOr[Enabled] = js.undefined
  
  /**
    * The reputation status of your Amazon Pinpoint account. The status can be one of the following:    HEALTHY – There are no reputation-related issues that currently impact your account.    PROBATION – We've identified some issues with your Amazon Pinpoint account. We're placing your account under review while you work on correcting these issues.    SHUTDOWN – Your account's ability to send email is currently paused because of an issue with the email sent from your account. When you correct the issue, you can contact us and request that your account's ability to send email is resumed.  
    */
  var EnforcementStatus: js.UndefOr[GeneralEnforcementStatus] = js.undefined
  
  /**
    * Indicates whether or not your account has production access in the current AWS Region. If the value is false, then your account is in the sandbox. When your account is in the sandbox, you can only send email to verified identities. Additionally, the maximum number of emails you can send in a 24-hour period (your sending quota) is 200, and the maximum number of emails you can send per second (your maximum sending rate) is 1. If the value is true, then your account has production access. When your account has production access, you can send email to any address. The sending quota and maximum sending rate for your account vary based on your specific use case.
    */
  var ProductionAccessEnabled: js.UndefOr[Enabled] = js.undefined
  
  /**
    * An object that contains information about the per-day and per-second sending limits for your Amazon Pinpoint account in the current AWS Region.
    */
  var SendQuota: js.UndefOr[typings.awsSdk.clientsPinpointemailMod.SendQuota] = js.undefined
  
  /**
    * Indicates whether or not email sending is enabled for your Amazon Pinpoint account in the current AWS Region.
    */
  var SendingEnabled: js.UndefOr[Enabled] = js.undefined
}
object GetAccountResponse {
  
  inline def apply(): GetAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAccountResponse] (val x: Self) extends AnyVal {
    
    inline def setDedicatedIpAutoWarmupEnabled(value: Enabled): Self = StObject.set(x, "DedicatedIpAutoWarmupEnabled", value.asInstanceOf[js.Any])
    
    inline def setDedicatedIpAutoWarmupEnabledUndefined: Self = StObject.set(x, "DedicatedIpAutoWarmupEnabled", js.undefined)
    
    inline def setEnforcementStatus(value: GeneralEnforcementStatus): Self = StObject.set(x, "EnforcementStatus", value.asInstanceOf[js.Any])
    
    inline def setEnforcementStatusUndefined: Self = StObject.set(x, "EnforcementStatus", js.undefined)
    
    inline def setProductionAccessEnabled(value: Enabled): Self = StObject.set(x, "ProductionAccessEnabled", value.asInstanceOf[js.Any])
    
    inline def setProductionAccessEnabledUndefined: Self = StObject.set(x, "ProductionAccessEnabled", js.undefined)
    
    inline def setSendQuota(value: SendQuota): Self = StObject.set(x, "SendQuota", value.asInstanceOf[js.Any])
    
    inline def setSendQuotaUndefined: Self = StObject.set(x, "SendQuota", js.undefined)
    
    inline def setSendingEnabled(value: Enabled): Self = StObject.set(x, "SendingEnabled", value.asInstanceOf[js.Any])
    
    inline def setSendingEnabledUndefined: Self = StObject.set(x, "SendingEnabled", js.undefined)
  }
}
