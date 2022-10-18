package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProtectionStatusRequest extends StObject {
  
  /**
    * The end of the time period to query for the attacks. This is a timestamp type. The request syntax listing indicates a number type because the default used by Firewall Manager is Unix time in seconds. However, any valid timestamp format is allowed.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies the number of objects that you want Firewall Manager to return for this request. If you have more objects than the number that you specify for MaxResults, the response includes a NextToken value that you can use to get another batch of objects.
    */
  var MaxResults: js.UndefOr[PaginationMaxResults] = js.undefined
  
  /**
    * The Amazon Web Services account that is in scope of the policy that you want to get the details for.
    */
  var MemberAccountId: js.UndefOr[AWSAccountId] = js.undefined
  
  /**
    * If you specify a value for MaxResults and you have more objects than the number that you specify for MaxResults, Firewall Manager returns a NextToken value in the response, which you can use to retrieve another group of objects. For the second and subsequent GetProtectionStatus requests, specify the value of NextToken from the previous response to get information about another batch of objects.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The ID of the policy for which you want to get the attack information.
    */
  var PolicyId: typings.awsSdk.clientsFmsMod.PolicyId
  
  /**
    * The start of the time period to query for the attacks. This is a timestamp type. The request syntax listing indicates a number type because the default used by Firewall Manager is Unix time in seconds. However, any valid timestamp format is allowed.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object GetProtectionStatusRequest {
  
  inline def apply(PolicyId: PolicyId): GetProtectionStatusRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProtectionStatusRequest]
  }
  
  extension [Self <: GetProtectionStatusRequest](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setMaxResults(value: PaginationMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMemberAccountId(value: AWSAccountId): Self = StObject.set(x, "MemberAccountId", value.asInstanceOf[js.Any])
    
    inline def setMemberAccountIdUndefined: Self = StObject.set(x, "MemberAccountId", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
