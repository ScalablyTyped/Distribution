package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableFastLaunchRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Forces the image settings to turn off faster launching for your Windows AMI. This parameter overrides any errors that are encountered while cleaning up resources in your account.
    */
  var Force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the image for which you’re turning off faster launching, and removing pre-provisioned snapshots.
    */
  var ImageId: typings.awsSdk.clientsEc2Mod.ImageId
}
object DisableFastLaunchRequest {
  
  inline def apply(ImageId: ImageId): DisableFastLaunchRequest = {
    val __obj = js.Dynamic.literal(ImageId = ImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableFastLaunchRequest]
  }
  
  extension [Self <: DisableFastLaunchRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "Force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "Force", js.undefined)
    
    inline def setImageId(value: ImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
  }
}
