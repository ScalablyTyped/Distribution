package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceActionSummary extends StObject {
  
  /**
    * The self-service action definition type. For example, SSM_AUTOMATION.
    */
  var DefinitionType: js.UndefOr[ServiceActionDefinitionType] = js.undefined
  
  /**
    * The self-service action description.
    */
  var Description: js.UndefOr[ServiceActionDescription] = js.undefined
  
  /**
    * The self-service action identifier.
    */
  var Id: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.Id] = js.undefined
  
  /**
    * The self-service action name.
    */
  var Name: js.UndefOr[ServiceActionName] = js.undefined
}
object ServiceActionSummary {
  
  inline def apply(): ServiceActionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceActionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceActionSummary] (val x: Self) extends AnyVal {
    
    inline def setDefinitionType(value: ServiceActionDefinitionType): Self = StObject.set(x, "DefinitionType", value.asInstanceOf[js.Any])
    
    inline def setDefinitionTypeUndefined: Self = StObject.set(x, "DefinitionType", js.undefined)
    
    inline def setDescription(value: ServiceActionDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: ServiceActionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
