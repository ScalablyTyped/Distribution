package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DeclareInjectorFacade extends StObject {
  
  var imports: js.UndefOr[js.Array[OpaqueValue]] = js.undefined
  
  var providers: js.UndefOr[js.Array[OpaqueValue]] = js.undefined
  
  var `type`: Type2
}
object R3DeclareInjectorFacade {
  
  inline def apply(`type`: Type2): R3DeclareInjectorFacade = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclareInjectorFacade]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: R3DeclareInjectorFacade] (val x: Self) extends AnyVal {
    
    inline def setImports(value: js.Array[OpaqueValue]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setImportsVarargs(value: OpaqueValue*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setProviders(value: js.Array[OpaqueValue]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    inline def setProvidersVarargs(value: OpaqueValue*): Self = StObject.set(x, "providers", js.Array(value*))
    
    inline def setType(value: Type2): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
