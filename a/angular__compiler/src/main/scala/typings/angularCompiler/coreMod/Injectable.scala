package typings.angularCompiler.coreMod

import typings.angularCompiler.angularCompilerStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Injectable extends StObject {
  
  var deps: js.UndefOr[js.Array[Type | js.Array[js.Any]]] = js.undefined
  
  var providedIn: js.UndefOr[Type | root | js.Any] = js.undefined
  
  var useClass: js.UndefOr[Type | js.Any] = js.undefined
  
  var useExisting: js.UndefOr[Type | js.Any] = js.undefined
  
  var useFactory: js.UndefOr[Type | js.Any] = js.undefined
  
  var useValue: js.UndefOr[js.Any] = js.undefined
}
object Injectable {
  
  inline def apply(): Injectable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Injectable]
  }
  
  extension [Self <: Injectable](x: Self) {
    
    inline def setDeps(value: js.Array[Type | js.Array[js.Any]]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    inline def setDepsVarargs(value: (Type | js.Array[js.Any])*): Self = StObject.set(x, "deps", js.Array(value :_*))
    
    inline def setProvidedIn(value: Type | root | js.Any): Self = StObject.set(x, "providedIn", value.asInstanceOf[js.Any])
    
    inline def setProvidedInUndefined: Self = StObject.set(x, "providedIn", js.undefined)
    
    inline def setUseClass(value: Type | js.Any): Self = StObject.set(x, "useClass", value.asInstanceOf[js.Any])
    
    inline def setUseClassUndefined: Self = StObject.set(x, "useClass", js.undefined)
    
    inline def setUseExisting(value: Type | js.Any): Self = StObject.set(x, "useExisting", value.asInstanceOf[js.Any])
    
    inline def setUseExistingUndefined: Self = StObject.set(x, "useExisting", js.undefined)
    
    inline def setUseFactory(value: Type | js.Any): Self = StObject.set(x, "useFactory", value.asInstanceOf[js.Any])
    
    inline def setUseFactoryUndefined: Self = StObject.set(x, "useFactory", js.undefined)
    
    inline def setUseValue(value: js.Any): Self = StObject.set(x, "useValue", value.asInstanceOf[js.Any])
    
    inline def setUseValueUndefined: Self = StObject.set(x, "useValue", js.undefined)
  }
}
