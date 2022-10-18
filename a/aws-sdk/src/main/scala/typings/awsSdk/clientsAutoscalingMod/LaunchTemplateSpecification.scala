package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateSpecification extends StObject {
  
  /**
    * The ID of the launch template. To get the template ID, use the Amazon EC2 DescribeLaunchTemplates API operation. New launch templates can be created using the Amazon EC2 CreateLaunchTemplate API.  Conditional: You must specify either a LaunchTemplateId or a LaunchTemplateName.
    */
  var LaunchTemplateId: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * The name of the launch template. To get the template name, use the Amazon EC2 DescribeLaunchTemplates API operation. New launch templates can be created using the Amazon EC2 CreateLaunchTemplate API.  Conditional: You must specify either a LaunchTemplateId or a LaunchTemplateName.
    */
  var LaunchTemplateName: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.LaunchTemplateName] = js.undefined
  
  /**
    * The version number, $Latest, or $Default. To get the version number, use the Amazon EC2 DescribeLaunchTemplateVersions API operation. New launch template versions can be created using the Amazon EC2 CreateLaunchTemplateVersion API. If the value is $Latest, Amazon EC2 Auto Scaling selects the latest version of the launch template when launching instances. If the value is $Default, Amazon EC2 Auto Scaling selects the default version of the launch template when launching instances. The default value is $Default.
    */
  var Version: js.UndefOr[XmlStringMaxLen255] = js.undefined
}
object LaunchTemplateSpecification {
  
  inline def apply(): LaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateSpecification]
  }
  
  extension [Self <: LaunchTemplateSpecification](x: Self) {
    
    inline def setLaunchTemplateId(value: XmlStringMaxLen255): Self = StObject.set(x, "LaunchTemplateId", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateIdUndefined: Self = StObject.set(x, "LaunchTemplateId", js.undefined)
    
    inline def setLaunchTemplateName(value: LaunchTemplateName): Self = StObject.set(x, "LaunchTemplateName", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateNameUndefined: Self = StObject.set(x, "LaunchTemplateName", js.undefined)
    
    inline def setVersion(value: XmlStringMaxLen255): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
