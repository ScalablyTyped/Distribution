package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagMFADeviceRequest extends StObject {
  
  /**
    * The unique identifier for the IAM virtual MFA device to which you want to add tags. For virtual MFA devices, the serial number is the same as the ARN. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var SerialNumber: serialNumberType
  
  /**
    * The list of tags that you want to attach to the IAM virtual MFA device. Each tag consists of a key name and an associated value.
    */
  var Tags: tagListType
}
object TagMFADeviceRequest {
  
  inline def apply(SerialNumber: serialNumberType, Tags: tagListType): TagMFADeviceRequest = {
    val __obj = js.Dynamic.literal(SerialNumber = SerialNumber.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagMFADeviceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagMFADeviceRequest] (val x: Self) extends AnyVal {
    
    inline def setSerialNumber(value: serialNumberType): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
    
    inline def setTags(value: tagListType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
