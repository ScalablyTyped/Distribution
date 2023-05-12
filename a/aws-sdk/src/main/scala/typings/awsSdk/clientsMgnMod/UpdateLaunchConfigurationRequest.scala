package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLaunchConfigurationRequest extends StObject {
  
  /**
    * Update Launch configuration boot mode request.
    */
  var bootMode: js.UndefOr[BootMode] = js.undefined
  
  /**
    * Update Launch configuration copy Private IP request.
    */
  var copyPrivateIp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Update Launch configuration copy Tags request.
    */
  var copyTags: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable map auto tagging.
    */
  var enableMapAutoTagging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Update Launch configuration launch disposition request.
    */
  var launchDisposition: js.UndefOr[LaunchDisposition] = js.undefined
  
  /**
    * Update Launch configuration licensing request.
    */
  var licensing: js.UndefOr[Licensing] = js.undefined
  
  /**
    * Launch configuration map auto tagging MPE ID.
    */
  var mapAutoTaggingMpeID: js.UndefOr[TagValue] = js.undefined
  
  /**
    * Update Launch configuration name request.
    */
  var name: js.UndefOr[SmallBoundedString] = js.undefined
  
  var postLaunchActions: js.UndefOr[PostLaunchActions] = js.undefined
  
  /**
    * Update Launch configuration by Source Server ID request.
    */
  var sourceServerID: SourceServerID
  
  /**
    * Update Launch configuration Target instance right sizing request.
    */
  var targetInstanceTypeRightSizingMethod: js.UndefOr[TargetInstanceTypeRightSizingMethod] = js.undefined
}
object UpdateLaunchConfigurationRequest {
  
  inline def apply(sourceServerID: SourceServerID): UpdateLaunchConfigurationRequest = {
    val __obj = js.Dynamic.literal(sourceServerID = sourceServerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLaunchConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateLaunchConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setBootMode(value: BootMode): Self = StObject.set(x, "bootMode", value.asInstanceOf[js.Any])
    
    inline def setBootModeUndefined: Self = StObject.set(x, "bootMode", js.undefined)
    
    inline def setCopyPrivateIp(value: Boolean): Self = StObject.set(x, "copyPrivateIp", value.asInstanceOf[js.Any])
    
    inline def setCopyPrivateIpUndefined: Self = StObject.set(x, "copyPrivateIp", js.undefined)
    
    inline def setCopyTags(value: Boolean): Self = StObject.set(x, "copyTags", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsUndefined: Self = StObject.set(x, "copyTags", js.undefined)
    
    inline def setEnableMapAutoTagging(value: Boolean): Self = StObject.set(x, "enableMapAutoTagging", value.asInstanceOf[js.Any])
    
    inline def setEnableMapAutoTaggingUndefined: Self = StObject.set(x, "enableMapAutoTagging", js.undefined)
    
    inline def setLaunchDisposition(value: LaunchDisposition): Self = StObject.set(x, "launchDisposition", value.asInstanceOf[js.Any])
    
    inline def setLaunchDispositionUndefined: Self = StObject.set(x, "launchDisposition", js.undefined)
    
    inline def setLicensing(value: Licensing): Self = StObject.set(x, "licensing", value.asInstanceOf[js.Any])
    
    inline def setLicensingUndefined: Self = StObject.set(x, "licensing", js.undefined)
    
    inline def setMapAutoTaggingMpeID(value: TagValue): Self = StObject.set(x, "mapAutoTaggingMpeID", value.asInstanceOf[js.Any])
    
    inline def setMapAutoTaggingMpeIDUndefined: Self = StObject.set(x, "mapAutoTaggingMpeID", js.undefined)
    
    inline def setName(value: SmallBoundedString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPostLaunchActions(value: PostLaunchActions): Self = StObject.set(x, "postLaunchActions", value.asInstanceOf[js.Any])
    
    inline def setPostLaunchActionsUndefined: Self = StObject.set(x, "postLaunchActions", js.undefined)
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
    
    inline def setTargetInstanceTypeRightSizingMethod(value: TargetInstanceTypeRightSizingMethod): Self = StObject.set(x, "targetInstanceTypeRightSizingMethod", value.asInstanceOf[js.Any])
    
    inline def setTargetInstanceTypeRightSizingMethodUndefined: Self = StObject.set(x, "targetInstanceTypeRightSizingMethod", js.undefined)
  }
}
