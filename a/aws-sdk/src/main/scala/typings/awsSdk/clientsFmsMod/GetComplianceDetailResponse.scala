package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComplianceDetailResponse extends StObject {
  
  /**
    * Information about the resources and the policy that you specified in the GetComplianceDetail request.
    */
  var PolicyComplianceDetail: js.UndefOr[typings.awsSdk.clientsFmsMod.PolicyComplianceDetail] = js.undefined
}
object GetComplianceDetailResponse {
  
  inline def apply(): GetComplianceDetailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComplianceDetailResponse]
  }
  
  extension [Self <: GetComplianceDetailResponse](x: Self) {
    
    inline def setPolicyComplianceDetail(value: PolicyComplianceDetail): Self = StObject.set(x, "PolicyComplianceDetail", value.asInstanceOf[js.Any])
    
    inline def setPolicyComplianceDetailUndefined: Self = StObject.set(x, "PolicyComplianceDetail", js.undefined)
  }
}
