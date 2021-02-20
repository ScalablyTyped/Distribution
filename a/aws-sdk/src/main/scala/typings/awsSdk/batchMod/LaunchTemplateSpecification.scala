package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplateSpecification extends StObject {
  
  /**
    * The ID of the launch template.
    */
  var launchTemplateId: js.UndefOr[String] = js.native
  
  /**
    * The name of the launch template.
    */
  var launchTemplateName: js.UndefOr[String] = js.native
  
  /**
    * The version number of the launch template, $Latest, or $Default. If the value is $Latest, the latest version of the launch template is used. If the value is $Default, the default version of the launch template is used. Default: $Default.
    */
  var version: js.UndefOr[String] = js.native
}
object LaunchTemplateSpecification {
  
  @scala.inline
  def apply(): LaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateSpecification]
  }
  
  @scala.inline
  implicit class LaunchTemplateSpecificationMutableBuilder[Self <: LaunchTemplateSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLaunchTemplateId(value: String): Self = StObject.set(x, "launchTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateIdUndefined: Self = StObject.set(x, "launchTemplateId", js.undefined)
    
    @scala.inline
    def setLaunchTemplateName(value: String): Self = StObject.set(x, "launchTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateNameUndefined: Self = StObject.set(x, "launchTemplateName", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
