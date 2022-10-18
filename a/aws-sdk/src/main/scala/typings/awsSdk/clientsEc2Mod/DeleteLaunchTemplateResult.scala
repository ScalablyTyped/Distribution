package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLaunchTemplateResult extends StObject {
  
  /**
    * Information about the launch template.
    */
  var LaunchTemplate: js.UndefOr[typings.awsSdk.clientsEc2Mod.LaunchTemplate] = js.undefined
}
object DeleteLaunchTemplateResult {
  
  inline def apply(): DeleteLaunchTemplateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLaunchTemplateResult]
  }
  
  extension [Self <: DeleteLaunchTemplateResult](x: Self) {
    
    inline def setLaunchTemplate(value: LaunchTemplate): Self = StObject.set(x, "LaunchTemplate", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateUndefined: Self = StObject.set(x, "LaunchTemplate", js.undefined)
  }
}
