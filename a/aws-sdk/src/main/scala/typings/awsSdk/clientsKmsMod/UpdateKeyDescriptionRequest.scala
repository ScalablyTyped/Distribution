package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateKeyDescriptionRequest extends StObject {
  
  /**
    * New description for the KMS key.  Do not include confidential or sensitive information in this field. This field may be displayed in plaintext in CloudTrail logs and other output. 
    */
  var Description: DescriptionType
  
  /**
    * Updates the description of the specified KMS key. Specify the key ID or key ARN of the KMS key. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a KMS key, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType
}
object UpdateKeyDescriptionRequest {
  
  inline def apply(Description: DescriptionType, KeyId: KeyIdType): UpdateKeyDescriptionRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateKeyDescriptionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateKeyDescriptionRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: DescriptionType): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
  }
}
