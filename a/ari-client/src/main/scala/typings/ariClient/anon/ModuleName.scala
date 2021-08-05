package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleName extends StObject {
  
  var moduleName: String
}
object ModuleName {
  
  inline def apply(moduleName: String): ModuleName = {
    val __obj = js.Dynamic.literal(moduleName = moduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleName]
  }
  
  extension [Self <: ModuleName](x: Self) {
    
    inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
  }
}
