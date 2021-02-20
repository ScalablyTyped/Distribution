package typings.angularUiRouterUibModal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object ui {
    
    @js.native
    trait IState extends StObject {
      
      var modal: js.UndefOr[Boolean | js.Array[String]] = js.native
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
        def setModal(value: Boolean | js.Array[String]): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
        
        @scala.inline
        def setModalVarargs(value: String*): Self = StObject.set(x, "modal", js.Array(value :_*))
      }
    }
  }
}
