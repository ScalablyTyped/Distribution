package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceRequest extends StObject {
  
  /**
    * Identifies a customer managed key in the account and Region. Specify the key ID or key ARN of the KMS key. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a KMS key, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType
  
  /**
    * One or more tags.  Each tag consists of a tag key and a tag value. The tag value can be an empty (null) string.  You cannot have more than one tag on a KMS key with the same tag key. If you specify an existing tag key with a different tag value, KMS replaces the current tag value with the specified one.
    */
  var Tags: TagList
}
object TagResourceRequest {
  
  inline def apply(KeyId: KeyIdType, Tags: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  extension [Self <: TagResourceRequest](x: Self) {
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
