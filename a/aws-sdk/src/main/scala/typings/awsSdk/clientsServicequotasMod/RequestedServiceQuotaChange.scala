package typings.awsSdk.clientsServicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestedServiceQuotaChange extends StObject {
  
  /**
    * The case ID.
    */
  var CaseId: js.UndefOr[CustomerServiceEngagementId] = js.undefined
  
  /**
    * The date and time when the quota increase request was received and the case ID was created.
    */
  var Created: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The new, increased value for the quota.
    */
  var DesiredValue: js.UndefOr[QuotaValue] = js.undefined
  
  /**
    * Indicates whether the quota is global.
    */
  var GlobalQuota: js.UndefOr[typings.awsSdk.clientsServicequotasMod.GlobalQuota] = js.undefined
  
  /**
    * The unique identifier.
    */
  var Id: js.UndefOr[RequestId] = js.undefined
  
  /**
    * The date and time of the most recent change.
    */
  var LastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the quota.
    */
  var QuotaArn: js.UndefOr[typings.awsSdk.clientsServicequotasMod.QuotaArn] = js.undefined
  
  /**
    * The quota identifier.
    */
  var QuotaCode: js.UndefOr[typings.awsSdk.clientsServicequotasMod.QuotaCode] = js.undefined
  
  /**
    * The quota name.
    */
  var QuotaName: js.UndefOr[typings.awsSdk.clientsServicequotasMod.QuotaName] = js.undefined
  
  /**
    * The IAM identity of the requester.
    */
  var Requester: js.UndefOr[typings.awsSdk.clientsServicequotasMod.Requester] = js.undefined
  
  /**
    * The service identifier.
    */
  var ServiceCode: js.UndefOr[typings.awsSdk.clientsServicequotasMod.ServiceCode] = js.undefined
  
  /**
    * The service name.
    */
  var ServiceName: js.UndefOr[typings.awsSdk.clientsServicequotasMod.ServiceName] = js.undefined
  
  /**
    * The state of the quota increase request.
    */
  var Status: js.UndefOr[RequestStatus] = js.undefined
  
  /**
    * The unit of measurement.
    */
  var Unit: js.UndefOr[QuotaUnit] = js.undefined
}
object RequestedServiceQuotaChange {
  
  inline def apply(): RequestedServiceQuotaChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestedServiceQuotaChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestedServiceQuotaChange] (val x: Self) extends AnyVal {
    
    inline def setCaseId(value: CustomerServiceEngagementId): Self = StObject.set(x, "CaseId", value.asInstanceOf[js.Any])
    
    inline def setCaseIdUndefined: Self = StObject.set(x, "CaseId", js.undefined)
    
    inline def setCreated(value: js.Date): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "Created", js.undefined)
    
    inline def setDesiredValue(value: QuotaValue): Self = StObject.set(x, "DesiredValue", value.asInstanceOf[js.Any])
    
    inline def setDesiredValueUndefined: Self = StObject.set(x, "DesiredValue", js.undefined)
    
    inline def setGlobalQuota(value: GlobalQuota): Self = StObject.set(x, "GlobalQuota", value.asInstanceOf[js.Any])
    
    inline def setGlobalQuotaUndefined: Self = StObject.set(x, "GlobalQuota", js.undefined)
    
    inline def setId(value: RequestId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    inline def setQuotaArn(value: QuotaArn): Self = StObject.set(x, "QuotaArn", value.asInstanceOf[js.Any])
    
    inline def setQuotaArnUndefined: Self = StObject.set(x, "QuotaArn", js.undefined)
    
    inline def setQuotaCode(value: QuotaCode): Self = StObject.set(x, "QuotaCode", value.asInstanceOf[js.Any])
    
    inline def setQuotaCodeUndefined: Self = StObject.set(x, "QuotaCode", js.undefined)
    
    inline def setQuotaName(value: QuotaName): Self = StObject.set(x, "QuotaName", value.asInstanceOf[js.Any])
    
    inline def setQuotaNameUndefined: Self = StObject.set(x, "QuotaName", js.undefined)
    
    inline def setRequester(value: Requester): Self = StObject.set(x, "Requester", value.asInstanceOf[js.Any])
    
    inline def setRequesterUndefined: Self = StObject.set(x, "Requester", js.undefined)
    
    inline def setServiceCode(value: ServiceCode): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
    
    inline def setServiceCodeUndefined: Self = StObject.set(x, "ServiceCode", js.undefined)
    
    inline def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
    
    inline def setStatus(value: RequestStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUnit(value: QuotaUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
