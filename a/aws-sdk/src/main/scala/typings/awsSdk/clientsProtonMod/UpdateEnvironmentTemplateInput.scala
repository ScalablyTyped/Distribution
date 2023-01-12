package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEnvironmentTemplateInput extends StObject {
  
  /**
    * A description of the environment template update.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The name of the environment template to update as displayed in the developer interface.
    */
  var displayName: js.UndefOr[DisplayName] = js.undefined
  
  /**
    * The name of the environment template to update.
    */
  var name: ResourceName
}
object UpdateEnvironmentTemplateInput {
  
  inline def apply(name: ResourceName): UpdateEnvironmentTemplateInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnvironmentTemplateInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateEnvironmentTemplateInput] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
