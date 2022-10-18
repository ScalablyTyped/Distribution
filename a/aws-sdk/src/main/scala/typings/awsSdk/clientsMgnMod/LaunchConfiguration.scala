package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchConfiguration extends StObject {
  
  /**
    * Launch configuration boot mode.
    */
  var bootMode: js.UndefOr[BootMode] = js.undefined
  
  /**
    * Copy Private IP during Launch Configuration.
    */
  var copyPrivateIp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Copy Tags during Launch Configuration.
    */
  var copyTags: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Launch configuration EC2 Launch template ID.
    */
  var ec2LaunchTemplateID: js.UndefOr[BoundedString] = js.undefined
  
  /**
    * Launch disposition for launch configuration.
    */
  var launchDisposition: js.UndefOr[LaunchDisposition] = js.undefined
  
  /**
    * Launch configuration OS licensing.
    */
  var licensing: js.UndefOr[Licensing] = js.undefined
  
  /**
    * Launch configuration name.
    */
  var name: js.UndefOr[SmallBoundedString] = js.undefined
  
  var postLaunchActions: js.UndefOr[PostLaunchActions] = js.undefined
  
  /**
    * Launch configuration Source Server ID.
    */
  var sourceServerID: js.UndefOr[SourceServerID] = js.undefined
  
  /**
    * Launch configuration Target instance type right sizing method.
    */
  var targetInstanceTypeRightSizingMethod: js.UndefOr[TargetInstanceTypeRightSizingMethod] = js.undefined
}
object LaunchConfiguration {
  
  inline def apply(): LaunchConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchConfiguration]
  }
  
  extension [Self <: LaunchConfiguration](x: Self) {
    
    inline def setBootMode(value: BootMode): Self = StObject.set(x, "bootMode", value.asInstanceOf[js.Any])
    
    inline def setBootModeUndefined: Self = StObject.set(x, "bootMode", js.undefined)
    
    inline def setCopyPrivateIp(value: Boolean): Self = StObject.set(x, "copyPrivateIp", value.asInstanceOf[js.Any])
    
    inline def setCopyPrivateIpUndefined: Self = StObject.set(x, "copyPrivateIp", js.undefined)
    
    inline def setCopyTags(value: Boolean): Self = StObject.set(x, "copyTags", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsUndefined: Self = StObject.set(x, "copyTags", js.undefined)
    
    inline def setEc2LaunchTemplateID(value: BoundedString): Self = StObject.set(x, "ec2LaunchTemplateID", value.asInstanceOf[js.Any])
    
    inline def setEc2LaunchTemplateIDUndefined: Self = StObject.set(x, "ec2LaunchTemplateID", js.undefined)
    
    inline def setLaunchDisposition(value: LaunchDisposition): Self = StObject.set(x, "launchDisposition", value.asInstanceOf[js.Any])
    
    inline def setLaunchDispositionUndefined: Self = StObject.set(x, "launchDisposition", js.undefined)
    
    inline def setLicensing(value: Licensing): Self = StObject.set(x, "licensing", value.asInstanceOf[js.Any])
    
    inline def setLicensingUndefined: Self = StObject.set(x, "licensing", js.undefined)
    
    inline def setName(value: SmallBoundedString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPostLaunchActions(value: PostLaunchActions): Self = StObject.set(x, "postLaunchActions", value.asInstanceOf[js.Any])
    
    inline def setPostLaunchActionsUndefined: Self = StObject.set(x, "postLaunchActions", js.undefined)
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
    
    inline def setSourceServerIDUndefined: Self = StObject.set(x, "sourceServerID", js.undefined)
    
    inline def setTargetInstanceTypeRightSizingMethod(value: TargetInstanceTypeRightSizingMethod): Self = StObject.set(x, "targetInstanceTypeRightSizingMethod", value.asInstanceOf[js.Any])
    
    inline def setTargetInstanceTypeRightSizingMethodUndefined: Self = StObject.set(x, "targetInstanceTypeRightSizingMethod", js.undefined)
  }
}
