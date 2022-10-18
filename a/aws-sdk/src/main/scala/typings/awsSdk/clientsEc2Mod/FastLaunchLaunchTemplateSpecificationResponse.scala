package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FastLaunchLaunchTemplateSpecificationResponse extends StObject {
  
  /**
    * The ID of the launch template for faster launching of the associated Windows AMI.
    */
  var LaunchTemplateId: js.UndefOr[typings.awsSdk.clientsEc2Mod.LaunchTemplateId] = js.undefined
  
  /**
    * The name of the launch template for faster launching of the associated Windows AMI.
    */
  var LaunchTemplateName: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the launch template for faster launching of the associated Windows AMI.
    */
  var Version: js.UndefOr[String] = js.undefined
}
object FastLaunchLaunchTemplateSpecificationResponse {
  
  inline def apply(): FastLaunchLaunchTemplateSpecificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FastLaunchLaunchTemplateSpecificationResponse]
  }
  
  extension [Self <: FastLaunchLaunchTemplateSpecificationResponse](x: Self) {
    
    inline def setLaunchTemplateId(value: LaunchTemplateId): Self = StObject.set(x, "LaunchTemplateId", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateIdUndefined: Self = StObject.set(x, "LaunchTemplateId", js.undefined)
    
    inline def setLaunchTemplateName(value: String): Self = StObject.set(x, "LaunchTemplateName", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateNameUndefined: Self = StObject.set(x, "LaunchTemplateName", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
