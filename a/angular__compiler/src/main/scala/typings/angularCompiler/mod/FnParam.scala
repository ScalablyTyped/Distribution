package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FnParam extends StObject {
  
  def isEquivalent(param: FnParam): Boolean
  
  var name: String
  
  var `type`: Type | Null
}
object FnParam {
  
  inline def apply(isEquivalent: FnParam => Boolean, name: String): FnParam = {
    val __obj = js.Dynamic.literal(isEquivalent = js.Any.fromFunction1(isEquivalent), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[FnParam]
  }
  
  extension [Self <: FnParam](x: Self) {
    
    inline def setIsEquivalent(value: FnParam => Boolean): Self = StObject.set(x, "isEquivalent", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
  }
}
