package typings.atlaskitDsLib

import typings.react.mod.MutableRefObject
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BindFocus extends StObject {
    
    var bindFocus: OnBlur
    
    var isFocused: Boolean
  }
  object BindFocus {
    
    inline def apply(bindFocus: OnBlur, isFocused: Boolean): BindFocus = {
      val __obj = js.Dynamic.literal(bindFocus = bindFocus.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any])
      __obj.asInstanceOf[BindFocus]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BindFocus] (val x: Self) extends AnyVal {
      
      inline def setBindFocus(value: OnBlur): Self = StObject.set(x, "bindFocus", value.asInstanceOf[js.Any])
      
      inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnBlur extends StObject {
    
    def onBlur(): Unit
    
    def onFocus(): Unit
  }
  object OnBlur {
    
    inline def apply(onBlur: () => Unit, onFocus: () => Unit): OnBlur = {
      val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction0(onBlur), onFocus = js.Any.fromFunction0(onFocus))
      __obj.asInstanceOf[OnBlur]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnBlur] (val x: Self) extends AnyVal {
      
      inline def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      inline def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
    }
  }
  
  trait Ref extends StObject {
    
    var ref: MutableRefObject[HTMLDivElement | Null]
    
    var width: Double
  }
  object Ref {
    
    inline def apply(ref: MutableRefObject[HTMLDivElement | Null], width: Double): Ref = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ref]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ref] (val x: Self) extends AnyVal {
      
      inline def setRef(value: MutableRefObject[HTMLDivElement | Null]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
