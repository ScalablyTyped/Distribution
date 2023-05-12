package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLaunchConfigurationTemplateRequest extends StObject {
  
  /**
    * Associate public Ip address.
    */
  var associatePublicIpAddress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Launch configuration template boot mode.
    */
  var bootMode: js.UndefOr[BootMode] = js.undefined
  
  /**
    * Copy private Ip.
    */
  var copyPrivateIp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Copy tags.
    */
  var copyTags: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable map auto tagging.
    */
  var enableMapAutoTagging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Large volume config.
    */
  var largeVolumeConf: js.UndefOr[LaunchTemplateDiskConf] = js.undefined
  
  /**
    * Launch Configuration Template ID.
    */
  var launchConfigurationTemplateID: LaunchConfigurationTemplateID
  
  /**
    * Launch disposition.
    */
  var launchDisposition: js.UndefOr[LaunchDisposition] = js.undefined
  
  var licensing: js.UndefOr[Licensing] = js.undefined
  
  /**
    * Launch configuration template map auto tagging MPE ID.
    */
  var mapAutoTaggingMpeID: js.UndefOr[TagValue] = js.undefined
  
  /**
    * Post Launch Action to execute on the Test or Cutover instance.
    */
  var postLaunchActions: js.UndefOr[PostLaunchActions] = js.undefined
  
  /**
    * Small volume config.
    */
  var smallVolumeConf: js.UndefOr[LaunchTemplateDiskConf] = js.undefined
  
  /**
    * Small volume maximum size.
    */
  var smallVolumeMaxSize: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * Target instance type right-sizing method.
    */
  var targetInstanceTypeRightSizingMethod: js.UndefOr[TargetInstanceTypeRightSizingMethod] = js.undefined
}
object UpdateLaunchConfigurationTemplateRequest {
  
  inline def apply(launchConfigurationTemplateID: LaunchConfigurationTemplateID): UpdateLaunchConfigurationTemplateRequest = {
    val __obj = js.Dynamic.literal(launchConfigurationTemplateID = launchConfigurationTemplateID.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLaunchConfigurationTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateLaunchConfigurationTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setAssociatePublicIpAddress(value: Boolean): Self = StObject.set(x, "associatePublicIpAddress", value.asInstanceOf[js.Any])
    
    inline def setAssociatePublicIpAddressUndefined: Self = StObject.set(x, "associatePublicIpAddress", js.undefined)
    
    inline def setBootMode(value: BootMode): Self = StObject.set(x, "bootMode", value.asInstanceOf[js.Any])
    
    inline def setBootModeUndefined: Self = StObject.set(x, "bootMode", js.undefined)
    
    inline def setCopyPrivateIp(value: Boolean): Self = StObject.set(x, "copyPrivateIp", value.asInstanceOf[js.Any])
    
    inline def setCopyPrivateIpUndefined: Self = StObject.set(x, "copyPrivateIp", js.undefined)
    
    inline def setCopyTags(value: Boolean): Self = StObject.set(x, "copyTags", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsUndefined: Self = StObject.set(x, "copyTags", js.undefined)
    
    inline def setEnableMapAutoTagging(value: Boolean): Self = StObject.set(x, "enableMapAutoTagging", value.asInstanceOf[js.Any])
    
    inline def setEnableMapAutoTaggingUndefined: Self = StObject.set(x, "enableMapAutoTagging", js.undefined)
    
    inline def setLargeVolumeConf(value: LaunchTemplateDiskConf): Self = StObject.set(x, "largeVolumeConf", value.asInstanceOf[js.Any])
    
    inline def setLargeVolumeConfUndefined: Self = StObject.set(x, "largeVolumeConf", js.undefined)
    
    inline def setLaunchConfigurationTemplateID(value: LaunchConfigurationTemplateID): Self = StObject.set(x, "launchConfigurationTemplateID", value.asInstanceOf[js.Any])
    
    inline def setLaunchDisposition(value: LaunchDisposition): Self = StObject.set(x, "launchDisposition", value.asInstanceOf[js.Any])
    
    inline def setLaunchDispositionUndefined: Self = StObject.set(x, "launchDisposition", js.undefined)
    
    inline def setLicensing(value: Licensing): Self = StObject.set(x, "licensing", value.asInstanceOf[js.Any])
    
    inline def setLicensingUndefined: Self = StObject.set(x, "licensing", js.undefined)
    
    inline def setMapAutoTaggingMpeID(value: TagValue): Self = StObject.set(x, "mapAutoTaggingMpeID", value.asInstanceOf[js.Any])
    
    inline def setMapAutoTaggingMpeIDUndefined: Self = StObject.set(x, "mapAutoTaggingMpeID", js.undefined)
    
    inline def setPostLaunchActions(value: PostLaunchActions): Self = StObject.set(x, "postLaunchActions", value.asInstanceOf[js.Any])
    
    inline def setPostLaunchActionsUndefined: Self = StObject.set(x, "postLaunchActions", js.undefined)
    
    inline def setSmallVolumeConf(value: LaunchTemplateDiskConf): Self = StObject.set(x, "smallVolumeConf", value.asInstanceOf[js.Any])
    
    inline def setSmallVolumeConfUndefined: Self = StObject.set(x, "smallVolumeConf", js.undefined)
    
    inline def setSmallVolumeMaxSize(value: PositiveInteger): Self = StObject.set(x, "smallVolumeMaxSize", value.asInstanceOf[js.Any])
    
    inline def setSmallVolumeMaxSizeUndefined: Self = StObject.set(x, "smallVolumeMaxSize", js.undefined)
    
    inline def setTargetInstanceTypeRightSizingMethod(value: TargetInstanceTypeRightSizingMethod): Self = StObject.set(x, "targetInstanceTypeRightSizingMethod", value.asInstanceOf[js.Any])
    
    inline def setTargetInstanceTypeRightSizingMethodUndefined: Self = StObject.set(x, "targetInstanceTypeRightSizingMethod", js.undefined)
  }
}
