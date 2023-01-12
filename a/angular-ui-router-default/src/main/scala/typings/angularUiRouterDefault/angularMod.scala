package typings.angularUiRouterDefault

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object angularMod {
  
  object ui {
    
    trait IState extends StObject {
      
      var default: js.UndefOr[StateDefaultSpecifier] = js.undefined
    }
    object IState {
      
      inline def apply(): IState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IState]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IState] (val x: Self) extends AnyVal {
        
        inline def setDefault(value: StateDefaultSpecifier): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        inline def setDefaultFunction1(value: /* repeated */ Any => IPromise[String] | String): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
        
        inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        inline def setDefaultVarargs(value: ((js.Function1[/* repeated */ Any, IPromise[String] | String]) | String)*): Self = StObject.set(x, "default", js.Array(value*))
      }
    }
    
    type StateDefaultSpecifier = String | (js.Function1[/* repeated */ Any, IPromise[String] | String]) | (js.Array[(js.Function1[/* repeated */ Any, IPromise[String] | String]) | String])
  }
}
