package typings.awsSdk.clientsServicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceQuotaIncreaseRequestFromTemplateRequest extends StObject {
  
  /**
    * The AWS Region.
    */
  var AwsRegion: typings.awsSdk.clientsServicequotasMod.AwsRegion
  
  /**
    * The quota identifier.
    */
  var QuotaCode: typings.awsSdk.clientsServicequotasMod.QuotaCode
  
  /**
    * The service identifier.
    */
  var ServiceCode: typings.awsSdk.clientsServicequotasMod.ServiceCode
}
object GetServiceQuotaIncreaseRequestFromTemplateRequest {
  
  inline def apply(AwsRegion: AwsRegion, QuotaCode: QuotaCode, ServiceCode: ServiceCode): GetServiceQuotaIncreaseRequestFromTemplateRequest = {
    val __obj = js.Dynamic.literal(AwsRegion = AwsRegion.asInstanceOf[js.Any], QuotaCode = QuotaCode.asInstanceOf[js.Any], ServiceCode = ServiceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceQuotaIncreaseRequestFromTemplateRequest]
  }
  
  extension [Self <: GetServiceQuotaIncreaseRequestFromTemplateRequest](x: Self) {
    
    inline def setAwsRegion(value: AwsRegion): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    inline def setQuotaCode(value: QuotaCode): Self = StObject.set(x, "QuotaCode", value.asInstanceOf[js.Any])
    
    inline def setServiceCode(value: ServiceCode): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
  }
}
