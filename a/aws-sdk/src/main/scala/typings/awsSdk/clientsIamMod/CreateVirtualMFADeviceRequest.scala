package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVirtualMFADeviceRequest extends StObject {
  
  /**
    *  The path for the virtual MFA device. For more information about paths, see IAM identifiers in the IAM User Guide. This parameter is optional. If it is not included, it defaults to a slash (/). This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
    */
  var Path: js.UndefOr[pathType] = js.undefined
  
  /**
    * A list of tags that you want to attach to the new IAM virtual MFA device. Each tag consists of a key name and an associated value. For more information about tagging, see Tagging IAM resources in the IAM User Guide.  If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. 
    */
  var Tags: js.UndefOr[tagListType] = js.undefined
  
  /**
    * The name of the virtual MFA device, which must be unique. Use with path to uniquely identify a virtual MFA device. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var VirtualMFADeviceName: virtualMFADeviceName
}
object CreateVirtualMFADeviceRequest {
  
  inline def apply(VirtualMFADeviceName: virtualMFADeviceName): CreateVirtualMFADeviceRequest = {
    val __obj = js.Dynamic.literal(VirtualMFADeviceName = VirtualMFADeviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVirtualMFADeviceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVirtualMFADeviceRequest] (val x: Self) extends AnyVal {
    
    inline def setPath(value: pathType): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    inline def setTags(value: tagListType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVirtualMFADeviceName(value: virtualMFADeviceName): Self = StObject.set(x, "VirtualMFADeviceName", value.asInstanceOf[js.Any])
  }
}
