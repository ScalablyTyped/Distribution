package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagPolicyRequest extends StObject {
  
  /**
    * The ARN of the IAM customer managed policy to which you want to add tags. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var PolicyArn: arnType
  
  /**
    * The list of tags that you want to attach to the IAM customer managed policy. Each tag consists of a key name and an associated value.
    */
  var Tags: tagListType
}
object TagPolicyRequest {
  
  inline def apply(PolicyArn: arnType, Tags: tagListType): TagPolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyArn = PolicyArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setPolicyArn(value: arnType): Self = StObject.set(x, "PolicyArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: tagListType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
