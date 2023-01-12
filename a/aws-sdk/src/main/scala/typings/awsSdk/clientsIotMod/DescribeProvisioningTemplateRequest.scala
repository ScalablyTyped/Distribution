package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProvisioningTemplateRequest extends StObject {
  
  /**
    * The name of the provisioning template.
    */
  var templateName: TemplateName
}
object DescribeProvisioningTemplateRequest {
  
  inline def apply(templateName: TemplateName): DescribeProvisioningTemplateRequest = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProvisioningTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeProvisioningTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setTemplateName(value: TemplateName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
