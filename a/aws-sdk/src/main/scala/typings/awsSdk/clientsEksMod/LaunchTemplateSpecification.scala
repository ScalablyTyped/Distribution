package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateSpecification extends StObject {
  
  /**
    * The ID of the launch template. You must specify either the launch template ID or the launch template name in the request, but not both.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the launch template. You must specify either the launch template name or the launch template ID in the request, but not both.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The launch template version number, $Latest, or $Default. If the value is $Latest, Amazon EKS uses the latest version of the launch template. If the value is $Default, Amazon EKS uses the default version of the launch template. Default: The default version of the launch template.
    */
  var version: js.UndefOr[String] = js.undefined
}
object LaunchTemplateSpecification {
  
  inline def apply(): LaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchTemplateSpecification] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
