package typings.astTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cooked extends StObject {
  
  var cooked: String | Null
  
  var raw: String
}
object Cooked {
  
  inline def apply(raw: String): Cooked = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], cooked = null)
    __obj.asInstanceOf[Cooked]
  }
  
  extension [Self <: Cooked](x: Self) {
    
    inline def setCooked(value: String): Self = StObject.set(x, "cooked", value.asInstanceOf[js.Any])
    
    inline def setCookedNull: Self = StObject.set(x, "cooked", null)
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
  }
}
