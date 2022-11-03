package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetModelPropertySummary extends StObject {
  
  /**
    *  The ID of the composite model that contains the asset model property. 
    */
  var assetModelCompositeModelId: js.UndefOr[ID] = js.undefined
  
  /**
    * The data type of the property.
    */
  var dataType: PropertyDataType
  
  /**
    * The data type of the structure for this property. This parameter exists on properties that have the STRUCT data type.
    */
  var dataTypeSpec: js.UndefOr[Name] = js.undefined
  
  /**
    * The ID of the property.
    */
  var id: js.UndefOr[ID] = js.undefined
  
  /**
    * The name of the property.
    */
  var name: Name
  
  var `type`: PropertyType
  
  /**
    * The unit (such as Newtons or RPM) of the property.
    */
  var unit: js.UndefOr[PropertyUnit] = js.undefined
}
object AssetModelPropertySummary {
  
  inline def apply(dataType: PropertyDataType, name: Name, `type`: PropertyType): AssetModelPropertySummary = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetModelPropertySummary]
  }
  
  extension [Self <: AssetModelPropertySummary](x: Self) {
    
    inline def setAssetModelCompositeModelId(value: ID): Self = StObject.set(x, "assetModelCompositeModelId", value.asInstanceOf[js.Any])
    
    inline def setAssetModelCompositeModelIdUndefined: Self = StObject.set(x, "assetModelCompositeModelId", js.undefined)
    
    inline def setDataType(value: PropertyDataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeSpec(value: Name): Self = StObject.set(x, "dataTypeSpec", value.asInstanceOf[js.Any])
    
    inline def setDataTypeSpecUndefined: Self = StObject.set(x, "dataTypeSpec", js.undefined)
    
    inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropertyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: PropertyUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
