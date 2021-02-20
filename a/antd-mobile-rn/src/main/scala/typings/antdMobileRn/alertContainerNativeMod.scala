package typings.antdMobileRn

import typings.antdMobileRn.modalPropsTypeMod.Action
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alertContainerNativeMod {
  
  @JSImport("antd-mobile-rn/lib/modal/AlertContainer.native", JSImport.Default)
  @js.native
  class default protected () extends AlertContainer {
    def this(props: AlertContainerProps) = this()
  }
  
  @js.native
  trait AlertContainer
    extends Component[AlertContainerProps, js.Any, js.Any] {
    
    def onClose(): Unit = js.native
  }
  
  @js.native
  trait AlertContainerProps extends StObject {
    
    var actions: js.Array[Action[TextStyle]] = js.native
    
    var content: ReactNode = js.native
    
    var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
    
    var title: ReactNode = js.native
  }
  object AlertContainerProps {
    
    @scala.inline
    def apply(actions: js.Array[Action[TextStyle]]): AlertContainerProps = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlertContainerProps]
    }
    
    @scala.inline
    implicit class AlertContainerPropsMutableBuilder[Self <: AlertContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Array[Action[TextStyle]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsVarargs(value: Action[TextStyle]*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
