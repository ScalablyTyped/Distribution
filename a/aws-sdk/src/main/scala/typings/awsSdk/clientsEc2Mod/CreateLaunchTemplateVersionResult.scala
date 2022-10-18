package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLaunchTemplateVersionResult extends StObject {
  
  /**
    * Information about the launch template version.
    */
  var LaunchTemplateVersion: js.UndefOr[typings.awsSdk.clientsEc2Mod.LaunchTemplateVersion] = js.undefined
  
  /**
    * If the new version of the launch template contains parameters or parameter combinations that are not valid, an error code and an error message are returned for each issue that's found.
    */
  var Warning: js.UndefOr[ValidationWarning] = js.undefined
}
object CreateLaunchTemplateVersionResult {
  
  inline def apply(): CreateLaunchTemplateVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLaunchTemplateVersionResult]
  }
  
  extension [Self <: CreateLaunchTemplateVersionResult](x: Self) {
    
    inline def setLaunchTemplateVersion(value: LaunchTemplateVersion): Self = StObject.set(x, "LaunchTemplateVersion", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateVersionUndefined: Self = StObject.set(x, "LaunchTemplateVersion", js.undefined)
    
    inline def setWarning(value: ValidationWarning): Self = StObject.set(x, "Warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "Warning", js.undefined)
  }
}
