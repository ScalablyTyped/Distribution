package typings.antDesignReactNative

import typings.antDesignReactNative.libModalPropsTypeMod.Action
import typings.antDesignReactNative.libModalPropsTypeMod.CallbackOnBackHandler
import typings.react.mod.Component
import typings.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModalOperationContainerMod {
  
  @JSImport("@ant-design/react-native/lib/modal/OperationContainer", JSImport.Default)
  @js.native
  open class default protected () extends OperationContainer {
    def this(props: OperationContainerProps) = this()
  }
  
  @js.native
  trait OperationContainer extends Component[OperationContainerProps, Any, Any] {
    
    def onBackAndroid(): Boolean = js.native
    
    def onClose(): Unit = js.native
  }
  
  trait OperationContainerProps extends StObject {
    
    var actions: js.Array[Action[TextStyle]]
    
    var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var onBackHandler: js.UndefOr[CallbackOnBackHandler] = js.undefined
  }
  object OperationContainerProps {
    
    inline def apply(actions: js.Array[Action[TextStyle]]): OperationContainerProps = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperationContainerProps]
    }
    
    extension [Self <: OperationContainerProps](x: Self) {
      
      inline def setActions(value: js.Array[Action[TextStyle]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: Action[TextStyle]*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setOnAnimationEnd(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnBackHandler(value: () => Boolean): Self = StObject.set(x, "onBackHandler", js.Any.fromFunction0(value))
      
      inline def setOnBackHandlerUndefined: Self = StObject.set(x, "onBackHandler", js.undefined)
    }
  }
}
