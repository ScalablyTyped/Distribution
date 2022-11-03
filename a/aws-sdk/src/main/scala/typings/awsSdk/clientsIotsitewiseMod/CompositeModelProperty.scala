package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositeModelProperty extends StObject {
  
  var assetProperty: Property
  
  /**
    *  The ID of the composite model that contains the property. 
    */
  var id: js.UndefOr[ID] = js.undefined
  
  /**
    * The name of the property.
    */
  var name: Name
  
  /**
    * The type of the composite model that defines this property.
    */
  var `type`: Name
}
object CompositeModelProperty {
  
  inline def apply(assetProperty: Property, name: Name, `type`: Name): CompositeModelProperty = {
    val __obj = js.Dynamic.literal(assetProperty = assetProperty.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositeModelProperty]
  }
  
  extension [Self <: CompositeModelProperty](x: Self) {
    
    inline def setAssetProperty(value: Property): Self = StObject.set(x, "assetProperty", value.asInstanceOf[js.Any])
    
    inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: Name): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
