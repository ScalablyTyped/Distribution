package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableFastLaunchRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the image for which you’re enabling faster launching.
    */
  var ImageId: typings.awsSdk.clientsEc2Mod.ImageId
  
  /**
    * The launch template to use when launching Windows instances from pre-provisioned snapshots. Launch template parameters can include either the name or ID of the launch template, but not both.
    */
  var LaunchTemplate: js.UndefOr[FastLaunchLaunchTemplateSpecificationRequest] = js.undefined
  
  /**
    * The maximum number of instances that Amazon EC2 can launch at the same time to create pre-provisioned snapshots for Windows faster launching. Value must be 6 or greater.
    */
  var MaxParallelLaunches: js.UndefOr[Integer] = js.undefined
  
  /**
    * The type of resource to use for pre-provisioning the Windows AMI for faster launching. Supported values include: snapshot, which is the default value.
    */
  var ResourceType: js.UndefOr[String] = js.undefined
  
  /**
    * Configuration settings for creating and managing the snapshots that are used for pre-provisioning the Windows AMI for faster launching. The associated ResourceType must be snapshot.
    */
  var SnapshotConfiguration: js.UndefOr[FastLaunchSnapshotConfigurationRequest] = js.undefined
}
object EnableFastLaunchRequest {
  
  inline def apply(ImageId: ImageId): EnableFastLaunchRequest = {
    val __obj = js.Dynamic.literal(ImageId = ImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableFastLaunchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableFastLaunchRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setImageId(value: ImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplate(value: FastLaunchLaunchTemplateSpecificationRequest): Self = StObject.set(x, "LaunchTemplate", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateUndefined: Self = StObject.set(x, "LaunchTemplate", js.undefined)
    
    inline def setMaxParallelLaunches(value: Integer): Self = StObject.set(x, "MaxParallelLaunches", value.asInstanceOf[js.Any])
    
    inline def setMaxParallelLaunchesUndefined: Self = StObject.set(x, "MaxParallelLaunches", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setSnapshotConfiguration(value: FastLaunchSnapshotConfigurationRequest): Self = StObject.set(x, "SnapshotConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSnapshotConfigurationUndefined: Self = StObject.set(x, "SnapshotConfiguration", js.undefined)
  }
}
