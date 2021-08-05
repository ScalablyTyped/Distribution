package typings.ariClient.anon

import typings.ariClient.mod.Containers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fields extends StObject {
  
  var configClass: String
  
  var fields: js.UndefOr[Containers] = js.undefined
  
  var id: String
  
  var objectType: String
}
object Fields {
  
  inline def apply(configClass: String, id: String, objectType: String): Fields = {
    val __obj = js.Dynamic.literal(configClass = configClass.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
  
  extension [Self <: Fields](x: Self) {
    
    inline def setConfigClass(value: String): Self = StObject.set(x, "configClass", value.asInstanceOf[js.Any])
    
    inline def setFields(value: Containers): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
  }
}
