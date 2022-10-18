package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListKeyPoliciesRequest extends StObject {
  
  /**
    * Gets the names of key policies for the specified KMS key. Specify the key ID or key ARN of the KMS key. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a KMS key, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType
  
  /**
    * Use this parameter to specify the maximum number of items to return. When this value is present, KMS does not return more than the specified number of items, but it might return fewer. This value is optional. If you include a value, it must be between 1 and 1000, inclusive. If you do not include a value, it defaults to 100. Only one policy can be attached to a key.
    */
  var Limit: js.UndefOr[LimitType] = js.undefined
  
  /**
    * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the value of NextMarker from the truncated response you just received.
    */
  var Marker: js.UndefOr[MarkerType] = js.undefined
}
object ListKeyPoliciesRequest {
  
  inline def apply(KeyId: KeyIdType): ListKeyPoliciesRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListKeyPoliciesRequest]
  }
  
  extension [Self <: ListKeyPoliciesRequest](x: Self) {
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: LimitType): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setMarker(value: MarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
