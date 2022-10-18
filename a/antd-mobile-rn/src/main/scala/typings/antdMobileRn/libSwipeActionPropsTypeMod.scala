package typings.antdMobileRn

import typings.antdMobileRn.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSwipeActionPropsTypeMod {
  
  trait SwipeActionPropsType[T] extends StObject {
    
    /** whether button is disabled*/
    var autoClose: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var left: js.UndefOr[js.Array[ClassName[T]]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var right: js.UndefOr[js.Array[ClassName[T]]] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object SwipeActionPropsType {
    
    inline def apply[T](): SwipeActionPropsType[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeActionPropsType[T]]
    }
    
    extension [Self <: SwipeActionPropsType[?], T](x: Self & SwipeActionPropsType[T]) {
      
      inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLeft(value: js.Array[ClassName[T]]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setLeftVarargs(value: ClassName[T]*): Self = StObject.set(x, "left", js.Array(value*))
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setRight(value: js.Array[ClassName[T]]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setRightVarargs(value: ClassName[T]*): Self = StObject.set(x, "right", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
