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
  
  @scala.inline
  def apply(): Injectable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Injectable]
  }
  
  @scala.inline
  implicit class InjectableMutableBuilder[Self <: Injectable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeps(value: js.Array[Type | js.Array[js.Any]]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    @scala.inline
    def setDepsVarargs(value: (Type | js.Array[js.Any])*): Self = StObject.set(x, "deps", js.Array(value :_*))
    
    @scala.inline
    def setProvidedIn(value: Type | root | js.Any): Self = StObject.set(x, "providedIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidedInUndefined: Self = StObject.set(x, "providedIn", js.undefined)
    
    @scala.inline
    def setUseClass(value: Type | js.Any): Self = StObject.set(x, "useClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseClassUndefined: Self = StObject.set(x, "useClass", js.undefined)
    
    @scala.inline
    def setUseExisting(value: Type | js.Any): Self = StObject.set(x, "useExisting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseExistingUndefined: Self = StObject.set(x, "useExisting", js.undefined)
    
    @scala.inline
    def setUseFactory(value: Type | js.Any): Self = StObject.set(x, "useFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFactoryUndefined: Self = StObject.set(x, "useFactory", js.undefined)
    
    @scala.inline
    def setUseValue(value: js.Any): Self = StObject.set(x, "useValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseValueUndefined: Self = StObject.set(x, "useValue", js.undefined)
  }
}
