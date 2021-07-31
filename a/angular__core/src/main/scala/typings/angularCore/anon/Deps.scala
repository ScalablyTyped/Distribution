package typings.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deps extends StObject {
  
  var deps: js.Array[js.Any]
  
  var useFactory: js.Function
}
object Deps {
  
  @scala.inline
  def apply(deps: js.Array[js.Any], useFactory: js.Function): Deps = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], useFactory = useFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deps]
  }
  
  @scala.inline
  implicit class DepsMutableBuilder[Self <: Deps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeps(value: js.Array[js.Any]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepsVarargs(value: js.Any*): Self = StObject.set(x, "deps", js.Array(value :_*))
    
    @scala.inline
    def setUseFactory(value: js.Function): Self = StObject.set(x, "useFactory", value.asInstanceOf[js.Any])
  }
}
