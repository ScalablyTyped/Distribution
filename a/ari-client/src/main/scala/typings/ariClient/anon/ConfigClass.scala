package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigClass extends StObject {
  
  var configClass: String
  
  var id: String
  
  var objectType: String
}
object ConfigClass {
  
  inline def apply(configClass: String, id: String, objectType: String): ConfigClass = {
    val __obj = js.Dynamic.literal(configClass = configClass.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigClass]
  }
  
  extension [Self <: ConfigClass](x: Self) {
    
    inline def setConfigClass(value: String): Self = StObject.set(x, "configClass", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
  }
}
