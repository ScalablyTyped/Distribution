package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyRequest extends StObject {
  
  /**
    * The revision ID that Amazon Comprehend assigned to the policy that you are updating. If you are creating a new policy that has no prior version, don't use this parameter. Amazon Comprehend creates the revision ID for you.
    */
  var PolicyRevisionId: js.UndefOr[typings.awsSdk.clientsComprehendMod.PolicyRevisionId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the custom model to attach the policy to.
    */
  var ResourceArn: ComprehendModelArn
  
  /**
    * The JSON resource-based policy to attach to your custom model. Provide your JSON as a UTF-8 encoded string without line breaks. To provide valid JSON for your policy, enclose the attribute names and values in double quotes. If the JSON body is also enclosed in double quotes, then you must escape the double quotes that are inside the policy:  "{\"attribute\": \"value\", \"attribute\": [\"value\"]}"  To avoid escaping quotes, you can use single quotes to enclose the policy and double quotes to enclose the JSON names and values:  '{"attribute": "value", "attribute": ["value"]}' 
    */
  var ResourcePolicy: Policy
}
object PutResourcePolicyRequest {
  
  inline def apply(ResourceArn: ComprehendModelArn, ResourcePolicy: Policy): PutResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], ResourcePolicy = ResourcePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePolicyRequest]
  }
  
  extension [Self <: PutResourcePolicyRequest](x: Self) {
    
    inline def setPolicyRevisionId(value: PolicyRevisionId): Self = StObject.set(x, "PolicyRevisionId", value.asInstanceOf[js.Any])
    
    inline def setPolicyRevisionIdUndefined: Self = StObject.set(x, "PolicyRevisionId", js.undefined)
    
    inline def setResourceArn(value: ComprehendModelArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourcePolicy(value: Policy): Self = StObject.set(x, "ResourcePolicy", value.asInstanceOf[js.Any])
  }
}
