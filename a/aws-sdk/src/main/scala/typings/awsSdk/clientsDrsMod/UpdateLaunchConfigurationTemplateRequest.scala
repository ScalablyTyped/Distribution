package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLaunchConfigurationTemplateRequest extends StObject {
  
  /**
    * Copy private IP.
    */
  var copyPrivateIp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Copy tags.
    */
  var copyTags: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Launch Configuration Template ID.
    */
  var launchConfigurationTemplateID: LaunchConfigurationTemplateID
  
  /**
    * Launch disposition.
    */
  var launchDisposition: js.UndefOr[LaunchDisposition] = js.undefined
  
  /**
    * Licensing.
    */
  var licensing: js.UndefOr[Licensing] = js.undefined
  
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
    
    inline def setCopyPrivateIp(value: Boolean): Self = StObject.set(x, "copyPrivateIp", value.asInstanceOf[js.Any])
    
    inline def setCopyPrivateIpUndefined: Self = StObject.set(x, "copyPrivateIp", js.undefined)
    
    inline def setCopyTags(value: Boolean): Self = StObject.set(x, "copyTags", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsUndefined: Self = StObject.set(x, "copyTags", js.undefined)
    
    inline def setLaunchConfigurationTemplateID(value: LaunchConfigurationTemplateID): Self = StObject.set(x, "launchConfigurationTemplateID", value.asInstanceOf[js.Any])
    
    inline def setLaunchDisposition(value: LaunchDisposition): Self = StObject.set(x, "launchDisposition", value.asInstanceOf[js.Any])
    
    inline def setLaunchDispositionUndefined: Self = StObject.set(x, "launchDisposition", js.undefined)
    
    inline def setLicensing(value: Licensing): Self = StObject.set(x, "licensing", value.asInstanceOf[js.Any])
    
    inline def setLicensingUndefined: Self = StObject.set(x, "licensing", js.undefined)
    
    inline def setTargetInstanceTypeRightSizingMethod(value: TargetInstanceTypeRightSizingMethod): Self = StObject.set(x, "targetInstanceTypeRightSizingMethod", value.asInstanceOf[js.Any])
    
    inline def setTargetInstanceTypeRightSizingMethodUndefined: Self = StObject.set(x, "targetInstanceTypeRightSizingMethod", js.undefined)
  }
}
