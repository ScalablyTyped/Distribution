package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceTemplateInput extends StObject {
  
  /**
    * The name of the service template that you want to get detailed data for.
    */
  var name: ResourceName
}
object GetServiceTemplateInput {
  
  inline def apply(name: ResourceName): GetServiceTemplateInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceTemplateInput]
  }
  
  extension [Self <: GetServiceTemplateInput](x: Self) {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
