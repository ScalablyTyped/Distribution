package typings.angularCompiler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ctor extends StObject {
  
  var ctor: js.Any
  
  var filePath: String
  
  var name: String
}
object Ctor {
  
  inline def apply(ctor: js.Any, filePath: String, name: String): Ctor = {
    val __obj = js.Dynamic.literal(ctor = ctor.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ctor]
  }
  
  extension [Self <: Ctor](x: Self) {
    
    inline def setCtor(value: js.Any): Self = StObject.set(x, "ctor", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
