package typings.antdMobileRn

import typings.antdMobileRn.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swipeActionPropsTypeMod {
  
  @js.native
  trait SwipeActionPropsType[T] extends StObject {
    
    /** whether button is disabled*/
    var autoClose: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var left: js.UndefOr[js.Array[ClassName[T]]] = js.native
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onOpen: js.UndefOr[js.Function0[Unit]] = js.native
    
    var right: js.UndefOr[js.Array[ClassName[T]]] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object SwipeActionPropsType {
    
    @scala.inline
    def apply[T](): SwipeActionPropsType[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeActionPropsType[T]]
    }
    
    @scala.inline
    implicit class SwipeActionPropsTypeMutableBuilder[Self <: SwipeActionPropsType[_], T] (val x: Self with SwipeActionPropsType[T]) extends AnyVal {
      
      @scala.inline
      def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setLeft(value: js.Array[ClassName[T]]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setLeftVarargs(value: ClassName[T]*): Self = StObject.set(x, "left", js.Array(value :_*))
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setRight(value: js.Array[ClassName[T]]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setRightVarargs(value: ClassName[T]*): Self = StObject.set(x, "right", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
