package typings.antdMobileRn

import typings.antdMobileRn.modalPropsTypeMod.Action
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alertContainerNativeMod {
  
  @JSImport("antd-mobile-rn/lib/modal/AlertContainer.native", JSImport.Default)
  @js.native
  open class default protected () extends AlertContainer {
    def this(props: AlertContainerProps) = this()
  }
  
  @js.native
  trait AlertContainer extends Component[AlertContainerProps, Any, Any] {
    
    def onClose(): Unit = js.native
  }
  
  trait AlertContainerProps extends StObject {
    
    var actions: js.Array[Action[TextStyle]]
    
    var content: ReactNode
    
    var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var title: ReactNode
  }
  object AlertContainerProps {
    
    inline def apply(actions: js.Array[Action[TextStyle]]): AlertContainerProps = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlertContainerProps]
    }
    
    extension [Self <: AlertContainerProps](x: Self) {
      
      inline def setActions(value: js.Array[Action[TextStyle]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: Action[TextStyle]*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setOnAnimationEnd(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
