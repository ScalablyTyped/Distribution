package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagInstanceProfileRequest extends StObject {
  
  /**
    * The name of the IAM instance profile to which you want to add tags. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var InstanceProfileName: instanceProfileNameType
  
  /**
    * The list of tags that you want to attach to the IAM instance profile. Each tag consists of a key name and an associated value.
    */
  var Tags: tagListType
}
object TagInstanceProfileRequest {
  
  inline def apply(InstanceProfileName: instanceProfileNameType, Tags: tagListType): TagInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(InstanceProfileName = InstanceProfileName.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagInstanceProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagInstanceProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setInstanceProfileName(value: instanceProfileNameType): Self = StObject.set(x, "InstanceProfileName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: tagListType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
