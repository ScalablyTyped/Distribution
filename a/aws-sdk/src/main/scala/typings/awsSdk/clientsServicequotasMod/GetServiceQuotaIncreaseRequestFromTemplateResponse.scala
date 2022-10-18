package typings.awsSdk.clientsServicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceQuotaIncreaseRequestFromTemplateResponse extends StObject {
  
  /**
    * Information about the quota increase request.
    */
  var ServiceQuotaIncreaseRequestInTemplate: js.UndefOr[typings.awsSdk.clientsServicequotasMod.ServiceQuotaIncreaseRequestInTemplate] = js.undefined
}
object GetServiceQuotaIncreaseRequestFromTemplateResponse {
  
  inline def apply(): GetServiceQuotaIncreaseRequestFromTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceQuotaIncreaseRequestFromTemplateResponse]
  }
  
  extension [Self <: GetServiceQuotaIncreaseRequestFromTemplateResponse](x: Self) {
    
    inline def setServiceQuotaIncreaseRequestInTemplate(value: ServiceQuotaIncreaseRequestInTemplate): Self = StObject.set(x, "ServiceQuotaIncreaseRequestInTemplate", value.asInstanceOf[js.Any])
    
    inline def setServiceQuotaIncreaseRequestInTemplateUndefined: Self = StObject.set(x, "ServiceQuotaIncreaseRequestInTemplate", js.undefined)
  }
}
