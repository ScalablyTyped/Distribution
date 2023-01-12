package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagMFADeviceRequest extends StObject {
  
  /**
    * The unique identifier for the IAM virtual MFA device from which you want to remove tags. For virtual MFA devices, the serial number is the same as the ARN. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var SerialNumber: serialNumberType
  
  /**
    * A list of key names as a simple array of strings. The tags with matching keys are removed from the specified instance profile.
    */
  var TagKeys: tagKeyListType
}
object UntagMFADeviceRequest {
  
  inline def apply(SerialNumber: serialNumberType, TagKeys: tagKeyListType): UntagMFADeviceRequest = {
    val __obj = js.Dynamic.literal(SerialNumber = SerialNumber.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagMFADeviceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UntagMFADeviceRequest] (val x: Self) extends AnyVal {
    
    inline def setSerialNumber(value: serialNumberType): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: tagKeyListType): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: tagKeyType*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
