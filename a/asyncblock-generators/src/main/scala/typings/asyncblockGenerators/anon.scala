package typings.asyncblockGenerators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Key extends StObject {
    
    var key: Any
    
    var runtime: Double
  }
  object Key {
    
    inline def apply(key: Any, runtime: Double): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: Double): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    }
  }
}
