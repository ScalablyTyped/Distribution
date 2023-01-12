package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLaunchTemplateRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the launch template. You must specify either the LaunchTemplateId or the LaunchTemplateName, but not both.
    */
  var LaunchTemplateId: js.UndefOr[typings.awsSdk.clientsEc2Mod.LaunchTemplateId] = js.undefined
  
  /**
    * The name of the launch template. You must specify either the LaunchTemplateName or the LaunchTemplateId, but not both.
    */
  var LaunchTemplateName: js.UndefOr[typings.awsSdk.clientsEc2Mod.LaunchTemplateName] = js.undefined
}
object DeleteLaunchTemplateRequest {
  
  inline def apply(): DeleteLaunchTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLaunchTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteLaunchTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setLaunchTemplateId(value: LaunchTemplateId): Self = StObject.set(x, "LaunchTemplateId", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateIdUndefined: Self = StObject.set(x, "LaunchTemplateId", js.undefined)
    
    inline def setLaunchTemplateName(value: LaunchTemplateName): Self = StObject.set(x, "LaunchTemplateName", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateNameUndefined: Self = StObject.set(x, "LaunchTemplateName", js.undefined)
  }
}
