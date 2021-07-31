package typings.angularUiRouterDefault

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object ui {
    
    trait IState extends StObject {
      
      var default: js.UndefOr[StateDefaultSpecifier] = js.undefined
    }
    object IState {
      
      @scala.inline
      def apply(): IState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IState]
      }
      
      @scala.inline
      implicit class IStateMutableBuilder[Self <: IState] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefault(value: StateDefaultSpecifier): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultFunction1(value: /* repeated */ js.Any => IPromise[String] | String): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
        
        @scala.inline
        def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        @scala.inline
        def setDefaultVarargs(value: ((js.Function1[/* repeated */ js.Any, IPromise[String] | String]) | String)*): Self = StObject.set(x, "default", js.Array(value :_*))
      }
    }
    
    type StateDefaultSpecifier = String | (js.Function1[/* repeated */ js.Any, IPromise[String] | String]) | (js.Array[(js.Function1[/* repeated */ js.Any, IPromise[String] | String]) | String])
  }
}
