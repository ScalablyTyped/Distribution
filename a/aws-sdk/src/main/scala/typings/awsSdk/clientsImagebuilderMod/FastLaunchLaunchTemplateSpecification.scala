package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FastLaunchLaunchTemplateSpecification extends StObject {
  
  /**
    * The ID of the launch template to use for faster launching for a Windows AMI.
    */
  var launchTemplateId: js.UndefOr[LaunchTemplateId] = js.undefined
  
  /**
    * The name of the launch template to use for faster launching for a Windows AMI.
    */
  var launchTemplateName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The version of the launch template to use for faster launching for a Windows AMI.
    */
  var launchTemplateVersion: js.UndefOr[NonEmptyString] = js.undefined
}
object FastLaunchLaunchTemplateSpecification {
  
  inline def apply(): FastLaunchLaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FastLaunchLaunchTemplateSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FastLaunchLaunchTemplateSpecification] (val x: Self) extends AnyVal {
    
    inline def setLaunchTemplateId(value: LaunchTemplateId): Self = StObject.set(x, "launchTemplateId", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateIdUndefined: Self = StObject.set(x, "launchTemplateId", js.undefined)
    
    inline def setLaunchTemplateName(value: NonEmptyString): Self = StObject.set(x, "launchTemplateName", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateNameUndefined: Self = StObject.set(x, "launchTemplateName", js.undefined)
    
    inline def setLaunchTemplateVersion(value: NonEmptyString): Self = StObject.set(x, "launchTemplateVersion", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateVersionUndefined: Self = StObject.set(x, "launchTemplateVersion", js.undefined)
  }
}
