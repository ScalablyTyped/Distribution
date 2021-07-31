package typings.angularCompiler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deps extends StObject {
  
  var deps: js.UndefOr[js.Array[js.Object] | Null] = js.undefined
  
  var multi: js.UndefOr[Boolean] = js.undefined
  
  var useClass: js.UndefOr[typings.angularCompiler.coreMod.Type] = js.undefined
  
  var useExisting: js.UndefOr[js.Any] = js.undefined
  
  var useFactory: js.UndefOr[js.Function | Null] = js.undefined
  
  var useValue: js.UndefOr[js.Any] = js.undefined
}
object Deps {
  
  @scala.inline
  def apply(): Deps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deps]
  }
  
  @scala.inline
  implicit class DepsMutableBuilder[Self <: Deps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeps(value: js.Array[js.Object]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepsNull: Self = StObject.set(x, "deps", null)
    
    @scala.inline
    def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    @scala.inline
    def setDepsVarargs(value: js.Object*): Self = StObject.set(x, "deps", js.Array(value :_*))
    
    @scala.inline
    def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    @scala.inline
    def setUseClass(value: typings.angularCompiler.coreMod.Type): Self = StObject.set(x, "useClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseClassUndefined: Self = StObject.set(x, "useClass", js.undefined)
    
    @scala.inline
    def setUseExisting(value: js.Any): Self = StObject.set(x, "useExisting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseExistingUndefined: Self = StObject.set(x, "useExisting", js.undefined)
    
    @scala.inline
    def setUseFactory(value: js.Function): Self = StObject.set(x, "useFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFactoryNull: Self = StObject.set(x, "useFactory", null)
    
    @scala.inline
    def setUseFactoryUndefined: Self = StObject.set(x, "useFactory", js.undefined)
    
    @scala.inline
    def setUseValue(value: js.Any): Self = StObject.set(x, "useValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseValueUndefined: Self = StObject.set(x, "useValue", js.undefined)
  }
}
