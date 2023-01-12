package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProvisioningTemplateRequest extends StObject {
  
  /**
    * The name of the fleet provision template to delete.
    */
  var templateName: TemplateName
}
object DeleteProvisioningTemplateRequest {
  
  inline def apply(templateName: TemplateName): DeleteProvisioningTemplateRequest = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProvisioningTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteProvisioningTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setTemplateName(value: TemplateName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
