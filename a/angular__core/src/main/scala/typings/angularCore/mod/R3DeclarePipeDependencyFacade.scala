package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DeclarePipeDependencyFacade extends StObject {
  
  var kind: js.UndefOr["pipe"] = js.undefined
  
  var name: String
  
  var `type`: OpaqueValue | js.Function0[OpaqueValue]
}
object R3DeclarePipeDependencyFacade {
  
  inline def apply(name: String, `type`: OpaqueValue | js.Function0[OpaqueValue]): R3DeclarePipeDependencyFacade = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclarePipeDependencyFacade]
  }
  
  extension [Self <: R3DeclarePipeDependencyFacade](x: Self) {
    
    inline def setKind(value: "pipe"): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: OpaqueValue | js.Function0[OpaqueValue]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeFunction0(value: () => OpaqueValue): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
  }
}
