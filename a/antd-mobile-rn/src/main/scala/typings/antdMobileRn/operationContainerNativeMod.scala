package typings.antdMobileRn

import typings.antdMobileRn.modalPropsTypeMod.Action
import typings.react.mod.Component
import typings.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationContainerNativeMod {
  
  @JSImport("antd-mobile-rn/lib/modal/OperationContainer.native", JSImport.Default)
  @js.native
  class default protected () extends OperationContainer {
    def this(props: OperationContainerProps) = this()
  }
  
  @js.native
  trait OperationContainer
    extends Component[OperationContainerProps, js.Any, js.Any] {
    
    def onClose(): Unit = js.native
  }
  
  @js.native
  trait OperationContainerProps extends StObject {
    
    var actions: js.Array[Action[TextStyle]] = js.native
    
    var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  }
  object OperationContainerProps {
    
    @scala.inline
    def apply(actions: js.Array[Action[TextStyle]]): OperationContainerProps = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperationContainerProps]
    }
    
    @scala.inline
    implicit class OperationContainerPropsMutableBuilder[Self <: OperationContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Array[Action[TextStyle]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsVarargs(value: Action[TextStyle]*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setOnAnimationEnd(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    }
  }
}
