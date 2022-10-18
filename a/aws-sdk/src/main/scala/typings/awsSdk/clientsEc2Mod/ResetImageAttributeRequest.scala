package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetImageAttributeRequest extends StObject {
  
  /**
    * The attribute to reset (currently you can only reset the launch permission attribute).
    */
  var Attribute: ResetImageAttributeName
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the AMI.
    */
  var ImageId: typings.awsSdk.clientsEc2Mod.ImageId
}
object ResetImageAttributeRequest {
  
  inline def apply(Attribute: ResetImageAttributeName, ImageId: ImageId): ResetImageAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], ImageId = ImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetImageAttributeRequest]
  }
  
  extension [Self <: ResetImageAttributeRequest](x: Self) {
    
    inline def setAttribute(value: ResetImageAttributeName): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setImageId(value: ImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
  }
}
