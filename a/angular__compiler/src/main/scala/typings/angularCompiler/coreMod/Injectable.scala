package typings.angularCompiler.coreMod

import typings.angularCompiler.angularCompilerStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Injectable extends StObject {
  
  var deps: js.UndefOr[js.Array[typings.angularCompiler.coreMod.Type | js.Array[_]]] = js.native
  
  var providedIn: js.UndefOr[typings.angularCompiler.coreMod.Type | root | js.Any] = js.native
  
  var useClass: js.UndefOr[typings.angularCompiler.coreMod.Type | js.Any] = js.native
  
  var useExisting: js.UndefOr[typings.angularCompiler.coreMod.Type | js.Any] = js.native
  
  var useFactory: js.UndefOr[typings.angularCompiler.coreMod.Type | js.Any] = js.native
  
  var useValue: js.UndefOr[js.Any] = js.native
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
    def setDeps(value: js.Array[typings.angularCompiler.coreMod.Type | js.Array[_]]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    @scala.inline
    def setDepsVarargs(value: (typings.angularCompiler.coreMod.Type | js.Array[js.Any])*): Self = StObject.set(x, "deps", js.Array(value :_*))
    
    @scala.inline
    def setProvidedIn(value: typings.angularCompiler.coreMod.Type | root | js.Any): Self = StObject.set(x, "providedIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidedInUndefined: Self = StObject.set(x, "providedIn", js.undefined)
    
    @scala.inline
    def setUseClass(value: typings.angularCompiler.coreMod.Type | js.Any): Self = StObject.set(x, "useClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseClassUndefined: Self = StObject.set(x, "useClass", js.undefined)
    
    @scala.inline
    def setUseExisting(value: typings.angularCompiler.coreMod.Type | js.Any): Self = StObject.set(x, "useExisting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseExistingUndefined: Self = StObject.set(x, "useExisting", js.undefined)
    
    @scala.inline
    def setUseFactory(value: typings.angularCompiler.coreMod.Type | js.Any): Self = StObject.set(x, "useFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFactoryUndefined: Self = StObject.set(x, "useFactory", js.undefined)
    
    @scala.inline
    def setUseValue(value: js.Any): Self = StObject.set(x, "useValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseValueUndefined: Self = StObject.set(x, "useValue", js.undefined)
  }
}
