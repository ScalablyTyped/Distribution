package typings.angularCompiler.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pipe extends StObject {
  
  var name: String
  
  var pure: js.UndefOr[Boolean] = js.undefined
}
object Pipe {
  
  inline def apply(name: String): Pipe = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pipe]
  }
  
  extension [Self <: Pipe](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
    
    inline def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
  }
}
