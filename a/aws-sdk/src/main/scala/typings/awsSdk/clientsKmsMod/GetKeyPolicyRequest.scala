package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetKeyPolicyRequest extends StObject {
  
  /**
    * Gets the key policy for the specified KMS key. Specify the key ID or key ARN of the KMS key. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a KMS key, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType
  
  /**
    * Specifies the name of the key policy. The only valid name is default. To get the names of key policies, use ListKeyPolicies.
    */
  var PolicyName: PolicyNameType
}
object GetKeyPolicyRequest {
  
  inline def apply(KeyId: KeyIdType, PolicyName: PolicyNameType): GetKeyPolicyRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyPolicyRequest]
  }
  
  extension [Self <: GetKeyPolicyRequest](x: Self) {
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setPolicyName(value: PolicyNameType): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
  }
}
