package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DeclareNgModuleFacade extends StObject {
  
  var bootstrap: js.UndefOr[js.Array[OpaqueValue] | js.Function0[js.Array[OpaqueValue]]] = js.undefined
  
  var declarations: js.UndefOr[js.Array[OpaqueValue] | js.Function0[js.Array[OpaqueValue]]] = js.undefined
  
  var exports: js.UndefOr[js.Array[OpaqueValue] | js.Function0[js.Array[OpaqueValue]]] = js.undefined
  
  var id: js.UndefOr[OpaqueValue] = js.undefined
  
  var imports: js.UndefOr[js.Array[OpaqueValue] | js.Function0[js.Array[OpaqueValue]]] = js.undefined
  
  var schemas: js.UndefOr[js.Array[OpaqueValue]] = js.undefined
  
  var `type`: Type2
}
object R3DeclareNgModuleFacade {
  
  inline def apply(`type`: Type2): R3DeclareNgModuleFacade = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclareNgModuleFacade]
  }
  
  extension [Self <: R3DeclareNgModuleFacade](x: Self) {
    
    inline def setBootstrap(value: js.Array[OpaqueValue] | js.Function0[js.Array[OpaqueValue]]): Self = StObject.set(x, "bootstrap", value.asInstanceOf[js.Any])
    
    inline def setBootstrapFunction0(value: () => js.Array[OpaqueValue]): Self = StObject.set(x, "bootstrap", js.Any.fromFunction0(value))
    
    inline def setBootstrapUndefined: Self = StObject.set(x, "bootstrap", js.undefined)
    
    inline def setBootstrapVarargs(value: OpaqueValue*): Self = StObject.set(x, "bootstrap", js.Array(value*))
    
    inline def setDeclarations(value: js.Array[OpaqueValue] | js.Function0[js.Array[OpaqueValue]]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    inline def setDeclarationsFunction0(value: () => js.Array[OpaqueValue]): Self = StObject.set(x, "declarations", js.Any.fromFunction0(value))
    
    inline def setDeclarationsUndefined: Self = StObject.set(x, "declarations", js.undefined)
    
    inline def setDeclarationsVarargs(value: OpaqueValue*): Self = StObject.set(x, "declarations", js.Array(value*))
    
    inline def setExports(value: js.Array[OpaqueValue] | js.Function0[js.Array[OpaqueValue]]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsFunction0(value: () => js.Array[OpaqueValue]): Self = StObject.set(x, "exports", js.Any.fromFunction0(value))
    
    inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
    
    inline def setExportsVarargs(value: OpaqueValue*): Self = StObject.set(x, "exports", js.Array(value*))
    
    inline def setId(value: OpaqueValue): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImports(value: js.Array[OpaqueValue] | js.Function0[js.Array[OpaqueValue]]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsFunction0(value: () => js.Array[OpaqueValue]): Self = StObject.set(x, "imports", js.Any.fromFunction0(value))
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setImportsVarargs(value: OpaqueValue*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setSchemas(value: js.Array[OpaqueValue]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    inline def setSchemasVarargs(value: OpaqueValue*): Self = StObject.set(x, "schemas", js.Array(value*))
    
    inline def setType(value: Type2): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
