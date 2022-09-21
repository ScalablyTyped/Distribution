package typings.actionsOnGoogle.apiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeV1SyncName extends StObject {
  
  var defaultNames: js.Array[String]
  
  var name: String
  
  var nicknames: js.Array[String]
}
object SmartHomeV1SyncName {
  
  inline def apply(defaultNames: js.Array[String], name: String, nicknames: js.Array[String]): SmartHomeV1SyncName = {
    val __obj = js.Dynamic.literal(defaultNames = defaultNames.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nicknames = nicknames.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1SyncName]
  }
  
  extension [Self <: SmartHomeV1SyncName](x: Self) {
    
    inline def setDefaultNames(value: js.Array[String]): Self = StObject.set(x, "defaultNames", value.asInstanceOf[js.Any])
    
    inline def setDefaultNamesVarargs(value: String*): Self = StObject.set(x, "defaultNames", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNicknames(value: js.Array[String]): Self = StObject.set(x, "nicknames", value.asInstanceOf[js.Any])
    
    inline def setNicknamesVarargs(value: String*): Self = StObject.set(x, "nicknames", js.Array(value*))
  }
}
