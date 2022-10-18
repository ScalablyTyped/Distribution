package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagInstanceProfileRequest extends StObject {
  
  /**
    * The name of the IAM instance profile from which you want to remove tags. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var InstanceProfileName: instanceProfileNameType
  
  /**
    * A list of key names as a simple array of strings. The tags with matching keys are removed from the specified instance profile.
    */
  var TagKeys: tagKeyListType
}
object UntagInstanceProfileRequest {
  
  inline def apply(InstanceProfileName: instanceProfileNameType, TagKeys: tagKeyListType): UntagInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(InstanceProfileName = InstanceProfileName.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagInstanceProfileRequest]
  }
  
  extension [Self <: UntagInstanceProfileRequest](x: Self) {
    
    inline def setInstanceProfileName(value: instanceProfileNameType): Self = StObject.set(x, "InstanceProfileName", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: tagKeyListType): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: tagKeyType*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
