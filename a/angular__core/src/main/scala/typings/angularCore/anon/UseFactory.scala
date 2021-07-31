package typings.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseFactory extends StObject {
  
  var deps: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var useFactory: js.UndefOr[js.Function] = js.undefined
  
  var useValue: js.UndefOr[js.Any] = js.undefined
}
object UseFactory {
  
  @scala.inline
  def apply(): UseFactory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseFactory]
  }
  
  @scala.inline
  implicit class UseFactoryMutableBuilder[Self <: UseFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeps(value: js.Array[js.Any]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    @scala.inline
    def setDepsVarargs(value: js.Any*): Self = StObject.set(x, "deps", js.Array(value :_*))
    
    @scala.inline
    def setUseFactory(value: js.Function): Self = StObject.set(x, "useFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFactoryUndefined: Self = StObject.set(x, "useFactory", js.undefined)
    
    @scala.inline
    def setUseValue(value: js.Any): Self = StObject.set(x, "useValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseValueUndefined: Self = StObject.set(x, "useValue", js.undefined)
  }
}
