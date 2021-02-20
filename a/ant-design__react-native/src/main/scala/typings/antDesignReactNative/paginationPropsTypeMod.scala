package typings.antDesignReactNative

import typings.antDesignReactNative.antDesignReactNativeStrings.button
import typings.antDesignReactNative.antDesignReactNativeStrings.number
import typings.antDesignReactNative.antDesignReactNativeStrings.pointer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationPropsTypeMod {
  
  @js.native
  trait PaginationPropsType extends StObject {
    
    var current: Double = js.native
    
    var mode: js.UndefOr[button | number | pointer] = js.native
    
    var nextText: js.UndefOr[String] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* current */ Double, Unit]] = js.native
    
    var onNext: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onPrev: js.UndefOr[js.Function0[Unit]] = js.native
    
    var prevText: js.UndefOr[String] = js.native
    
    var simple: js.UndefOr[Boolean] = js.native
    
    var total: Double = js.native
  }
  object PaginationPropsType {
    
    @scala.inline
    def apply(current: Double, total: Double): PaginationPropsType = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationPropsType]
    }
    
    @scala.inline
    implicit class PaginationPropsTypeMutableBuilder[Self <: PaginationPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: button | number | pointer): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setNextText(value: String): Self = StObject.set(x, "nextText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTextUndefined: Self = StObject.set(x, "nextText", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* current */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnNext(value: () => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
      
      @scala.inline
      def setOnPrev(value: () => Unit): Self = StObject.set(x, "onPrev", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPrevUndefined: Self = StObject.set(x, "onPrev", js.undefined)
      
      @scala.inline
      def setPrevText(value: String): Self = StObject.set(x, "prevText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevTextUndefined: Self = StObject.set(x, "prevText", js.undefined)
      
      @scala.inline
      def setSimple(value: Boolean): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PaginationState extends StObject {
    
    var current: Double = js.native
  }
  object PaginationState {
    
    @scala.inline
    def apply(current: Double): PaginationState = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationState]
    }
    
    @scala.inline
    implicit class PaginationStateMutableBuilder[Self <: PaginationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    }
  }
}
