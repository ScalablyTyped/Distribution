package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImageAttributeRequest extends StObject {
  
  /**
    * The AMI attribute.  Note: The blockDeviceMapping attribute is deprecated. Using this attribute returns the Client.AuthFailure error. To get information about the block device mappings for an AMI, use the DescribeImages action.
    */
  var Attribute: ImageAttributeName
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the AMI.
    */
  var ImageId: typings.awsSdk.clientsEc2Mod.ImageId
}
object DescribeImageAttributeRequest {
  
  inline def apply(Attribute: ImageAttributeName, ImageId: ImageId): DescribeImageAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], ImageId = ImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImageAttributeRequest]
  }
  
  extension [Self <: DescribeImageAttributeRequest](x: Self) {
    
    inline def setAttribute(value: ImageAttributeName): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setImageId(value: ImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
  }
}
