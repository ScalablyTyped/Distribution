package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteServiceTemplateInput extends StObject {
  
  /**
    * The name of the service template to delete.
    */
  var name: ResourceName
}
object DeleteServiceTemplateInput {
  
  inline def apply(name: ResourceName): DeleteServiceTemplateInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServiceTemplateInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteServiceTemplateInput] (val x: Self) extends AnyVal {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
