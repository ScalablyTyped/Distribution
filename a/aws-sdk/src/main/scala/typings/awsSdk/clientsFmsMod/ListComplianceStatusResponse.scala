package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListComplianceStatusResponse extends StObject {
  
  /**
    * If you have more PolicyComplianceStatus objects than the number that you specified for MaxResults in the request, the response includes a NextToken value. To list more PolicyComplianceStatus objects, submit another ListComplianceStatus request, and specify the NextToken value from the response in the NextToken value in the next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * An array of PolicyComplianceStatus objects.
    */
  var PolicyComplianceStatusList: js.UndefOr[typings.awsSdk.clientsFmsMod.PolicyComplianceStatusList] = js.undefined
}
object ListComplianceStatusResponse {
  
  inline def apply(): ListComplianceStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListComplianceStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListComplianceStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPolicyComplianceStatusList(value: PolicyComplianceStatusList): Self = StObject.set(x, "PolicyComplianceStatusList", value.asInstanceOf[js.Any])
    
    inline def setPolicyComplianceStatusListUndefined: Self = StObject.set(x, "PolicyComplianceStatusList", js.undefined)
    
    inline def setPolicyComplianceStatusListVarargs(value: PolicyComplianceStatus*): Self = StObject.set(x, "PolicyComplianceStatusList", js.Array(value*))
  }
}
