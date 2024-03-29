package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLaunchTemplateResult extends StObject {
  
  /**
    * Information about the launch template.
    */
  var LaunchTemplate: js.UndefOr[typings.awsSdk.clientsEc2Mod.LaunchTemplate] = js.undefined
  
  /**
    * If the launch template contains parameters or parameter combinations that are not valid, an error code and an error message are returned for each issue that's found.
    */
  var Warning: js.UndefOr[ValidationWarning] = js.undefined
}
object CreateLaunchTemplateResult {
  
  inline def apply(): CreateLaunchTemplateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLaunchTemplateResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLaunchTemplateResult] (val x: Self) extends AnyVal {
    
    inline def setLaunchTemplate(value: LaunchTemplate): Self = StObject.set(x, "LaunchTemplate", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateUndefined: Self = StObject.set(x, "LaunchTemplate", js.undefined)
    
    inline def setWarning(value: ValidationWarning): Self = StObject.set(x, "Warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "Warning", js.undefined)
  }
}
