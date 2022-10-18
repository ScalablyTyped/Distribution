package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeResourcePolicyResponse extends StObject {
  
  /**
    * The time at which the policy was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which the policy was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The revision ID of the policy. Each time you modify a policy, Amazon Comprehend assigns a new revision ID, and it deletes the prior version of the policy.
    */
  var PolicyRevisionId: js.UndefOr[typings.awsSdk.clientsComprehendMod.PolicyRevisionId] = js.undefined
  
  /**
    * The JSON body of the resource-based policy.
    */
  var ResourcePolicy: js.UndefOr[Policy] = js.undefined
}
object DescribeResourcePolicyResponse {
  
  inline def apply(): DescribeResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeResourcePolicyResponse]
  }
  
  extension [Self <: DescribeResourcePolicyResponse](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setPolicyRevisionId(value: PolicyRevisionId): Self = StObject.set(x, "PolicyRevisionId", value.asInstanceOf[js.Any])
    
    inline def setPolicyRevisionIdUndefined: Self = StObject.set(x, "PolicyRevisionId", js.undefined)
    
    inline def setResourcePolicy(value: Policy): Self = StObject.set(x, "ResourcePolicy", value.asInstanceOf[js.Any])
    
    inline def setResourcePolicyUndefined: Self = StObject.set(x, "ResourcePolicy", js.undefined)
  }
}
