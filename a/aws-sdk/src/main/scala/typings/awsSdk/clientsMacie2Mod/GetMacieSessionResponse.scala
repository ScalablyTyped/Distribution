package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMacieSessionResponse extends StObject {
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the Amazon Macie account was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The frequency with which Amazon Macie publishes updates to policy findings for the account. This includes publishing updates to Security Hub and Amazon EventBridge (formerly Amazon CloudWatch Events).
    */
  var findingPublishingFrequency: js.UndefOr[FindingPublishingFrequency] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the service-linked role that allows Amazon Macie to monitor and analyze data in Amazon Web Services resources for the account.
    */
  var serviceRole: js.UndefOr[string] = js.undefined
  
  /**
    * The current status of the Amazon Macie account. Possible values are: PAUSED, the account is enabled but all Macie activities are suspended (paused) for the account; and, ENABLED, the account is enabled and all Macie activities are enabled for the account.
    */
  var status: js.UndefOr[MacieStatus] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, of the most recent change to the status of the Amazon Macie account.
    */
  var updatedAt: js.UndefOr[js.Date] = js.undefined
}
object GetMacieSessionResponse {
  
  inline def apply(): GetMacieSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMacieSessionResponse]
  }
  
  extension [Self <: GetMacieSessionResponse](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setFindingPublishingFrequency(value: FindingPublishingFrequency): Self = StObject.set(x, "findingPublishingFrequency", value.asInstanceOf[js.Any])
    
    inline def setFindingPublishingFrequencyUndefined: Self = StObject.set(x, "findingPublishingFrequency", js.undefined)
    
    inline def setServiceRole(value: string): Self = StObject.set(x, "serviceRole", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleUndefined: Self = StObject.set(x, "serviceRole", js.undefined)
    
    inline def setStatus(value: MacieStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
