package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceTemplateOutput extends StObject {
  
  /**
    * The service template detail data that's returned by Proton.
    */
  var serviceTemplate: ServiceTemplate
}
object UpdateServiceTemplateOutput {
  
  inline def apply(serviceTemplate: ServiceTemplate): UpdateServiceTemplateOutput = {
    val __obj = js.Dynamic.literal(serviceTemplate = serviceTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceTemplateOutput]
  }
  
  extension [Self <: UpdateServiceTemplateOutput](x: Self) {
    
    inline def setServiceTemplate(value: ServiceTemplate): Self = StObject.set(x, "serviceTemplate", value.asInstanceOf[js.Any])
  }
}
