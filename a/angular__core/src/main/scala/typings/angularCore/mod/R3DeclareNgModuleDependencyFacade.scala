package typings.angularCore.mod

import typings.angularCore.angularCoreStrings.ngmodule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DeclareNgModuleDependencyFacade extends StObject {
  
  var kind: ngmodule
  
  var `type`: OpaqueValue | js.Function0[OpaqueValue]
}
object R3DeclareNgModuleDependencyFacade {
  
  inline def apply(`type`: OpaqueValue | js.Function0[OpaqueValue]): R3DeclareNgModuleDependencyFacade = {
    val __obj = js.Dynamic.literal(kind = "ngmodule")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclareNgModuleDependencyFacade]
  }
  
  extension [Self <: R3DeclareNgModuleDependencyFacade](x: Self) {
    
    inline def setKind(value: ngmodule): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setType(value: OpaqueValue | js.Function0[OpaqueValue]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeFunction0(value: () => OpaqueValue): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
  }
}
