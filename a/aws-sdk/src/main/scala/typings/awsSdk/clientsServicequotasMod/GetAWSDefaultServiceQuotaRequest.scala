package typings.awsSdk.clientsServicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAWSDefaultServiceQuotaRequest extends StObject {
  
  /**
    * The quota identifier.
    */
  var QuotaCode: typings.awsSdk.clientsServicequotasMod.QuotaCode
  
  /**
    * The service identifier.
    */
  var ServiceCode: typings.awsSdk.clientsServicequotasMod.ServiceCode
}
object GetAWSDefaultServiceQuotaRequest {
  
  inline def apply(QuotaCode: QuotaCode, ServiceCode: ServiceCode): GetAWSDefaultServiceQuotaRequest = {
    val __obj = js.Dynamic.literal(QuotaCode = QuotaCode.asInstanceOf[js.Any], ServiceCode = ServiceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAWSDefaultServiceQuotaRequest]
  }
  
  extension [Self <: GetAWSDefaultServiceQuotaRequest](x: Self) {
    
    inline def setQuotaCode(value: QuotaCode): Self = StObject.set(x, "QuotaCode", value.asInstanceOf[js.Any])
    
    inline def setServiceCode(value: ServiceCode): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
  }
}
