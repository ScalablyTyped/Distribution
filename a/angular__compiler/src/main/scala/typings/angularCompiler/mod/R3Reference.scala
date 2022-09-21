package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3Reference extends StObject {
  
  var `type`: Expression
  
  var value: Expression
}
object R3Reference {
  
  inline def apply(`type`: Expression, value: Expression): R3Reference = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3Reference]
  }
  
  extension [Self <: R3Reference](x: Self) {
    
    inline def setType(value: Expression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
