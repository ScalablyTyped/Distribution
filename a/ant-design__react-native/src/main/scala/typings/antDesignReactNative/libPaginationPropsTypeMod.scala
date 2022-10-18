package typings.antDesignReactNative

import typings.antDesignReactNative.antDesignReactNativeStrings.button
import typings.antDesignReactNative.antDesignReactNativeStrings.number
import typings.antDesignReactNative.antDesignReactNativeStrings.pointer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPaginationPropsTypeMod {
  
  trait PaginationPropsType extends StObject {
    
    var current: Double
    
    var mode: js.UndefOr[button | number | pointer] = js.undefined
    
    var nextText: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* current */ Double, Unit]] = js.undefined
    
    var onNext: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPrev: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var prevText: js.UndefOr[String] = js.undefined
    
    var simple: js.UndefOr[Boolean] = js.undefined
    
    var total: Double
  }
  object PaginationPropsType {
    
    inline def apply(current: Double, total: Double): PaginationPropsType = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationPropsType]
    }
    
    extension [Self <: PaginationPropsType](x: Self) {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setMode(value: button | number | pointer): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setNextText(value: String): Self = StObject.set(x, "nextText", value.asInstanceOf[js.Any])
      
      inline def setNextTextUndefined: Self = StObject.set(x, "nextText", js.undefined)
      
      inline def setOnChange(value: /* current */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnNext(value: () => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction0(value))
      
      inline def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
      
      inline def setOnPrev(value: () => Unit): Self = StObject.set(x, "onPrev", js.Any.fromFunction0(value))
      
      inline def setOnPrevUndefined: Self = StObject.set(x, "onPrev", js.undefined)
      
      inline def setPrevText(value: String): Self = StObject.set(x, "prevText", value.asInstanceOf[js.Any])
      
      inline def setPrevTextUndefined: Self = StObject.set(x, "prevText", js.undefined)
      
      inline def setSimple(value: Boolean): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
      
      inline def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaginationState extends StObject {
    
    var current: Double
  }
  object PaginationState {
    
    inline def apply(current: Double): PaginationState = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationState]
    }
    
    extension [Self <: PaginationState](x: Self) {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    }
  }
}
