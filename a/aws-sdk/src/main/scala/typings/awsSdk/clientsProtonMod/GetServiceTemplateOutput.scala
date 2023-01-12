package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceTemplateOutput extends StObject {
  
  /**
    * The detailed data of the requested service template.
    */
  var serviceTemplate: ServiceTemplate
}
object GetServiceTemplateOutput {
  
  inline def apply(serviceTemplate: ServiceTemplate): GetServiceTemplateOutput = {
    val __obj = js.Dynamic.literal(serviceTemplate = serviceTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceTemplateOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetServiceTemplateOutput] (val x: Self) extends AnyVal {
    
    inline def setServiceTemplate(value: ServiceTemplate): Self = StObject.set(x, "serviceTemplate", value.asInstanceOf[js.Any])
  }
}
