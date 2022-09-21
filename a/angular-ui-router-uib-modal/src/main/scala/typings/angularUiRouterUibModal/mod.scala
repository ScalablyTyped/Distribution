package typings.angularUiRouterUibModal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object ui {
    
    trait IState extends StObject {
      
      var modal: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    }
    object IState {
      
      inline def apply(): IState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IState]
      }
      
      extension [Self <: IState](x: Self) {
        
        inline def setModal(value: Boolean | js.Array[String]): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
        
        inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
        
        inline def setModalVarargs(value: String*): Self = StObject.set(x, "modal", js.Array(value*))
      }
    }
  }
}
