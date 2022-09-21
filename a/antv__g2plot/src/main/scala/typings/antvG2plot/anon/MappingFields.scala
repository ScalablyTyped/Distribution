package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingFields extends StObject {
  
  var mappingFields: js.Array[String]
  
  var tileMappingField: String
}
object MappingFields {
  
  inline def apply(mappingFields: js.Array[String], tileMappingField: String): MappingFields = {
    val __obj = js.Dynamic.literal(mappingFields = mappingFields.asInstanceOf[js.Any], tileMappingField = tileMappingField.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingFields]
  }
  
  extension [Self <: MappingFields](x: Self) {
    
    inline def setMappingFields(value: js.Array[String]): Self = StObject.set(x, "mappingFields", value.asInstanceOf[js.Any])
    
    inline def setMappingFieldsVarargs(value: String*): Self = StObject.set(x, "mappingFields", js.Array(value*))
    
    inline def setTileMappingField(value: String): Self = StObject.set(x, "tileMappingField", value.asInstanceOf[js.Any])
  }
}
