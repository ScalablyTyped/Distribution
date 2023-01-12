package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetCompositeModel extends StObject {
  
  /**
    * The description of the composite model.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    *  The ID of the asset composite model. 
    */
  var id: js.UndefOr[ID] = js.undefined
  
  /**
    * The name of the composite model.
    */
  var name: Name
  
  /**
    * The asset properties that this composite model defines.
    */
  var properties: AssetProperties
  
  /**
    * The type of the composite model. For alarm composite models, this type is AWS/ALARM.
    */
  var `type`: Name
}
object AssetCompositeModel {
  
  inline def apply(name: Name, properties: AssetProperties, `type`: Name): AssetCompositeModel = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetCompositeModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetCompositeModel] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: AssetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: AssetProperty*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setType(value: Name): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
