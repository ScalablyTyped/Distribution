package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFastLaunchImagesSuccessItem extends StObject {
  
  /**
    * The image ID that identifies the fast-launch enabled Windows image.
    */
  var ImageId: js.UndefOr[typings.awsSdk.clientsEc2Mod.ImageId] = js.undefined
  
  /**
    * The launch template that the fast-launch enabled Windows AMI uses when it launches Windows instances from pre-provisioned snapshots.
    */
  var LaunchTemplate: js.UndefOr[FastLaunchLaunchTemplateSpecificationResponse] = js.undefined
  
  /**
    * The maximum number of parallel instances that are launched for creating resources.
    */
  var MaxParallelLaunches: js.UndefOr[Integer] = js.undefined
  
  /**
    * The owner ID for the fast-launch enabled Windows AMI.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The resource type that is used for pre-provisioning the Windows AMI. Supported values include: snapshot.
    */
  var ResourceType: js.UndefOr[FastLaunchResourceType] = js.undefined
  
  /**
    * A group of parameters that are used for pre-provisioning the associated Windows AMI using snapshots.
    */
  var SnapshotConfiguration: js.UndefOr[FastLaunchSnapshotConfigurationResponse] = js.undefined
  
  /**
    * The current state of faster launching for the specified Windows AMI.
    */
  var State: js.UndefOr[FastLaunchStateCode] = js.undefined
  
  /**
    * The reason that faster launching for the Windows AMI changed to the current state.
    */
  var StateTransitionReason: js.UndefOr[String] = js.undefined
  
  /**
    * The time that faster launching for the Windows AMI changed to the current state.
    */
  var StateTransitionTime: js.UndefOr[js.Date] = js.undefined
}
object DescribeFastLaunchImagesSuccessItem {
  
  inline def apply(): DescribeFastLaunchImagesSuccessItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFastLaunchImagesSuccessItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFastLaunchImagesSuccessItem] (val x: Self) extends AnyVal {
    
    inline def setImageId(value: ImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setLaunchTemplate(value: FastLaunchLaunchTemplateSpecificationResponse): Self = StObject.set(x, "LaunchTemplate", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateUndefined: Self = StObject.set(x, "LaunchTemplate", js.undefined)
    
    inline def setMaxParallelLaunches(value: Integer): Self = StObject.set(x, "MaxParallelLaunches", value.asInstanceOf[js.Any])
    
    inline def setMaxParallelLaunchesUndefined: Self = StObject.set(x, "MaxParallelLaunches", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setResourceType(value: FastLaunchResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setSnapshotConfiguration(value: FastLaunchSnapshotConfigurationResponse): Self = StObject.set(x, "SnapshotConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSnapshotConfigurationUndefined: Self = StObject.set(x, "SnapshotConfiguration", js.undefined)
    
    inline def setState(value: FastLaunchStateCode): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateTransitionReason(value: String): Self = StObject.set(x, "StateTransitionReason", value.asInstanceOf[js.Any])
    
    inline def setStateTransitionReasonUndefined: Self = StObject.set(x, "StateTransitionReason", js.undefined)
    
    inline def setStateTransitionTime(value: js.Date): Self = StObject.set(x, "StateTransitionTime", value.asInstanceOf[js.Any])
    
    inline def setStateTransitionTimeUndefined: Self = StObject.set(x, "StateTransitionTime", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
