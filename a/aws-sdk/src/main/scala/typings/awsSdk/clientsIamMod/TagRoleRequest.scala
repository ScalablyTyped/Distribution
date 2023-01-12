package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagRoleRequest extends StObject {
  
  /**
    * The name of the IAM role to which you want to add tags. This parameter accepts (through its regex pattern) a string of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var RoleName: roleNameType
  
  /**
    * The list of tags that you want to attach to the IAM role. Each tag consists of a key name and an associated value.
    */
  var Tags: tagListType
}
object TagRoleRequest {
  
  inline def apply(RoleName: roleNameType, Tags: tagListType): TagRoleRequest = {
    val __obj = js.Dynamic.literal(RoleName = RoleName.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagRoleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagRoleRequest] (val x: Self) extends AnyVal {
    
    inline def setRoleName(value: roleNameType): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: tagListType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
