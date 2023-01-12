package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsAutoScalingAutoScalingGroupLaunchTemplateLaunchTemplateSpecification extends StObject {
  
  /**
    * The identifier of the launch template. You must specify either LaunchTemplateId or LaunchTemplateName.
    */
  var LaunchTemplateId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the launch template. You must specify either LaunchTemplateId or LaunchTemplateName.
    */
  var LaunchTemplateName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Identifies the version of the launch template. You can specify a version identifier, or use the values $Latest or $Default.
    */
  var Version: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsAutoScalingAutoScalingGroupLaunchTemplateLaunchTemplateSpecification {
  
  inline def apply(): AwsAutoScalingAutoScalingGroupLaunchTemplateLaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsAutoScalingAutoScalingGroupLaunchTemplateLaunchTemplateSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsAutoScalingAutoScalingGroupLaunchTemplateLaunchTemplateSpecification] (val x: Self) extends AnyVal {
    
    inline def setLaunchTemplateId(value: NonEmptyString): Self = StObject.set(x, "LaunchTemplateId", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateIdUndefined: Self = StObject.set(x, "LaunchTemplateId", js.undefined)
    
    inline def setLaunchTemplateName(value: NonEmptyString): Self = StObject.set(x, "LaunchTemplateName", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateNameUndefined: Self = StObject.set(x, "LaunchTemplateName", js.undefined)
    
    inline def setVersion(value: NonEmptyString): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
