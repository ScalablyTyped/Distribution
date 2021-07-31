package typings.antDesignReactNative

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalPropsTypeMod {
  
  trait Action[T] extends StObject {
    
    var onPress: js.UndefOr[js.Function0[Unit | js.Promise[js.Any]]] = js.undefined
    
    var style: js.UndefOr[T | String] = js.undefined
    
    var text: String
  }
  object Action {
    
    @scala.inline
    def apply[T](text: String): Action[T] = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action[T]]
    }
    
    @scala.inline
    implicit class ActionMutableBuilder[Self <: Action[?], T] (val x: Self & Action[T]) extends AnyVal {
      
      @scala.inline
      def setOnPress(value: () => Unit | js.Promise[js.Any]): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      @scala.inline
      def setStyle(value: T | String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  type Callback = js.Function2[/* valueOrLogin */ String, /* password */ js.UndefOr[String], Unit]
  
  type CallbackOnBackHandler = js.Function0[Boolean]
  
  type CallbackOrActions[T] = Callback | js.Array[Action[T]]
  
  trait ModalPropsType[T] extends StObject {
    
    var animateAppear: js.UndefOr[Boolean] = js.undefined
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var animationType: js.UndefOr[js.Any] = js.undefined
    
    var closable: js.UndefOr[Boolean] = js.undefined
    
    var footer: js.UndefOr[js.Array[Action[T]]] = js.undefined
    
    var locale: js.UndefOr[js.Object] = js.undefined
    
    var maskClosable: js.UndefOr[Boolean] = js.undefined
    
    var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var operation: js.UndefOr[Boolean] = js.undefined
    
    var popup: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
    
    var transparent: js.UndefOr[Boolean] = js.undefined
    
    var visible: Boolean
  }
  object ModalPropsType {
    
    @scala.inline
    def apply[T](visible: Boolean): ModalPropsType[T] = {
      val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalPropsType[T]]
    }
    
    @scala.inline
    implicit class ModalPropsTypeMutableBuilder[Self <: ModalPropsType[?], T] (val x: Self & ModalPropsType[T]) extends AnyVal {
      
      @scala.inline
      def setAnimateAppear(value: Boolean): Self = StObject.set(x, "animateAppear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateAppearUndefined: Self = StObject.set(x, "animateAppear", js.undefined)
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setAnimationType(value: js.Any): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setFooter(value: js.Array[Action[T]]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setFooterVarargs(value: Action[T]*): Self = StObject.set(x, "footer", js.Array(value :_*))
      
      @scala.inline
      def setLocale(value: js.Object): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMaskClosable(value: Boolean): Self = StObject.set(x, "maskClosable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskClosableUndefined: Self = StObject.set(x, "maskClosable", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOperation(value: Boolean): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
      
      @scala.inline
      def setPopup(value: Boolean): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
