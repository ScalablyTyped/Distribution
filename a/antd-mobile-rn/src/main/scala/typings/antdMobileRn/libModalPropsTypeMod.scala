package typings.antdMobileRn

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModalPropsTypeMod {
  
  trait Action[T] extends StObject {
    
    var onPress: js.UndefOr[js.Function0[Unit | js.Promise[Any]]] = js.undefined
    
    var style: js.UndefOr[T | String] = js.undefined
    
    var text: String
  }
  object Action {
    
    inline def apply[T](text: String): Action[T] = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action[T]]
    }
    
    extension [Self <: Action[?], T](x: Self & Action[T]) {
      
      inline def setOnPress(value: () => Unit | js.Promise[Any]): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setStyle(value: T | String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  type Callback = js.Function2[/* valueOrLogin */ String, /* password */ js.UndefOr[String], Unit]
  
  type CallbackOrActions[T] = Callback | js.Array[Action[T]]
  
  trait ModalPropsType[T] extends StObject {
    
    var animateAppear: js.UndefOr[Boolean] = js.undefined
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var animationType: js.UndefOr[Any] = js.undefined
    
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
    
    inline def apply[T](visible: Boolean): ModalPropsType[T] = {
      val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalPropsType[T]]
    }
    
    extension [Self <: ModalPropsType[?], T](x: Self & ModalPropsType[T]) {
      
      inline def setAnimateAppear(value: Boolean): Self = StObject.set(x, "animateAppear", value.asInstanceOf[js.Any])
      
      inline def setAnimateAppearUndefined: Self = StObject.set(x, "animateAppear", js.undefined)
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setAnimationType(value: Any): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
      
      inline def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setFooter(value: js.Array[Action[T]]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setFooterVarargs(value: Action[T]*): Self = StObject.set(x, "footer", js.Array(value*))
      
      inline def setLocale(value: js.Object): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaskClosable(value: Boolean): Self = StObject.set(x, "maskClosable", value.asInstanceOf[js.Any])
      
      inline def setMaskClosableUndefined: Self = StObject.set(x, "maskClosable", js.undefined)
      
      inline def setOnAnimationEnd(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOperation(value: Boolean): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
      
      inline def setPopup(value: Boolean): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
      
      inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
