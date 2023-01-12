package typings.angularCore.mod

import typings.angularCore.angularCoreStrings.any
import typings.angularCore.angularCoreStrings.platform
import typings.angularCore.angularCoreStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DeclareInjectableFacade extends StObject {
  
  var deps: js.UndefOr[js.Array[R3DeclareDependencyMetadataFacade]] = js.undefined
  
  var providedIn: js.UndefOr[Type2 | root | platform | any | Null] = js.undefined
  
  var `type`: Type2
  
  var useClass: js.UndefOr[OpaqueValue] = js.undefined
  
  var useExisting: js.UndefOr[OpaqueValue] = js.undefined
  
  var useFactory: js.UndefOr[OpaqueValue] = js.undefined
  
  var useValue: js.UndefOr[OpaqueValue] = js.undefined
}
object R3DeclareInjectableFacade {
  
  inline def apply(`type`: Type2): R3DeclareInjectableFacade = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclareInjectableFacade]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: R3DeclareInjectableFacade] (val x: Self) extends AnyVal {
    
    inline def setDeps(value: js.Array[R3DeclareDependencyMetadataFacade]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    inline def setDepsVarargs(value: R3DeclareDependencyMetadataFacade*): Self = StObject.set(x, "deps", js.Array(value*))
    
    inline def setProvidedIn(value: Type2 | root | platform | any): Self = StObject.set(x, "providedIn", value.asInstanceOf[js.Any])
    
    inline def setProvidedInNull: Self = StObject.set(x, "providedIn", null)
    
    inline def setProvidedInUndefined: Self = StObject.set(x, "providedIn", js.undefined)
    
    inline def setType(value: Type2): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUseClass(value: OpaqueValue): Self = StObject.set(x, "useClass", value.asInstanceOf[js.Any])
    
    inline def setUseClassUndefined: Self = StObject.set(x, "useClass", js.undefined)
    
    inline def setUseExisting(value: OpaqueValue): Self = StObject.set(x, "useExisting", value.asInstanceOf[js.Any])
    
    inline def setUseExistingUndefined: Self = StObject.set(x, "useExisting", js.undefined)
    
    inline def setUseFactory(value: OpaqueValue): Self = StObject.set(x, "useFactory", value.asInstanceOf[js.Any])
    
    inline def setUseFactoryUndefined: Self = StObject.set(x, "useFactory", js.undefined)
    
    inline def setUseValue(value: OpaqueValue): Self = StObject.set(x, "useValue", value.asInstanceOf[js.Any])
    
    inline def setUseValueUndefined: Self = StObject.set(x, "useValue", js.undefined)
  }
}
