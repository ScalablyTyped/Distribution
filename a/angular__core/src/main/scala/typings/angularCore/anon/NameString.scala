package typings.angularCore.anon

import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameString extends StObject {
  
  var name: String
  
  var target: (Window & (/* globalThis */ js.Any)) | Null
}
object NameString {
  
  inline def apply(name: String): NameString = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = null)
    __obj.asInstanceOf[NameString]
  }
  
  extension [Self <: NameString](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Window & (/* globalThis */ js.Any)): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
  }
}
