package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DeclareFactoryFacade extends StObject {
  
  var deps: js.Array[R3DeclareDependencyMetadataFacade] | "invalid" | Null
  
  var target: ɵɵFactoryTarget
  
  var `type`: Type2
}
object R3DeclareFactoryFacade {
  
  inline def apply(target: ɵɵFactoryTarget, `type`: Type2): R3DeclareFactoryFacade = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], deps = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclareFactoryFacade]
  }
  
  extension [Self <: R3DeclareFactoryFacade](x: Self) {
    
    inline def setDeps(value: js.Array[R3DeclareDependencyMetadataFacade] | "invalid"): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsNull: Self = StObject.set(x, "deps", null)
    
    inline def setDepsVarargs(value: R3DeclareDependencyMetadataFacade*): Self = StObject.set(x, "deps", js.Array(value*))
    
    inline def setTarget(value: ɵɵFactoryTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: Type2): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
