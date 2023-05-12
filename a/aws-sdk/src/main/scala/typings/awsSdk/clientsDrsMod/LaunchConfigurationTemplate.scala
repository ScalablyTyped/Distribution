package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchConfigurationTemplate extends StObject {
  
  /**
    * ARN of the Launch Configuration Template.
    */
  var arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * Copy private IP.
    */
  var copyPrivateIp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Copy tags.
    */
  var copyTags: js.UndefOr[Boolean] = js.undefined
  
  /**
    * ID of the Launch Configuration Template.
    */
  var launchConfigurationTemplateID: js.UndefOr[LaunchConfigurationTemplateID] = js.undefined
  
  /**
    * Launch disposition.
    */
  var launchDisposition: js.UndefOr[LaunchDisposition] = js.undefined
  
  /**
    * Licensing.
    */
  var licensing: js.UndefOr[Licensing] = js.undefined
  
  /**
    * Tags of the Launch Configuration Template.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
  
  /**
    * Target instance type right-sizing method.
    */
  var targetInstanceTypeRightSizingMethod: js.UndefOr[TargetInstanceTypeRightSizingMethod] = js.undefined
}
object LaunchConfigurationTemplate {
  
  inline def apply(): LaunchConfigurationTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchConfigurationTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchConfigurationTemplate] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCopyPrivateIp(value: Boolean): Self = StObject.set(x, "copyPrivateIp", value.asInstanceOf[js.Any])
    
    inline def setCopyPrivateIpUndefined: Self = StObject.set(x, "copyPrivateIp", js.undefined)
    
    inline def setCopyTags(value: Boolean): Self = StObject.set(x, "copyTags", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsUndefined: Self = StObject.set(x, "copyTags", js.undefined)
    
    inline def setLaunchConfigurationTemplateID(value: LaunchConfigurationTemplateID): Self = StObject.set(x, "launchConfigurationTemplateID", value.asInstanceOf[js.Any])
    
    inline def setLaunchConfigurationTemplateIDUndefined: Self = StObject.set(x, "launchConfigurationTemplateID", js.undefined)
    
    inline def setLaunchDisposition(value: LaunchDisposition): Self = StObject.set(x, "launchDisposition", value.asInstanceOf[js.Any])
    
    inline def setLaunchDispositionUndefined: Self = StObject.set(x, "launchDisposition", js.undefined)
    
    inline def setLicensing(value: Licensing): Self = StObject.set(x, "licensing", value.asInstanceOf[js.Any])
    
    inline def setLicensingUndefined: Self = StObject.set(x, "licensing", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTargetInstanceTypeRightSizingMethod(value: TargetInstanceTypeRightSizingMethod): Self = StObject.set(x, "targetInstanceTypeRightSizingMethod", value.asInstanceOf[js.Any])
    
    inline def setTargetInstanceTypeRightSizingMethodUndefined: Self = StObject.set(x, "targetInstanceTypeRightSizingMethod", js.undefined)
  }
}
