package typings.atlaskitFocusRing

import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.ReactElement
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  trait FocusEventHandlers extends StObject {
    
    var onBlur: FocusEventHandler[Element]
    
    var onFocus: FocusEventHandler[Element]
  }
  object FocusEventHandlers {
    
    inline def apply(onBlur: FocusEvent[Element, Element] => Unit, onFocus: FocusEvent[Element, Element] => Unit): FocusEventHandlers = {
      val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction1(onBlur), onFocus = js.Any.fromFunction1(onFocus))
      __obj.asInstanceOf[FocusEventHandlers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusEventHandlers] (val x: Self) extends AnyVal {
      
      inline def setOnBlur(value: FocusEvent[Element, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnFocus(value: FocusEvent[Element, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    }
  }
  
  trait FocusRingProps extends StObject {
    
    /**
      * The focusable element to be rendered within the `FocusRing`.
      */
    var children: ReactElement
    
    /**
      * Makes the `FocusRing` a controlled component (opting out of native focus behavior). The focus ring
      * will apply the visual focus indicator when the `focus` prop is set to `on`. This prop should be used
      * in conjunction with `useFocusRing`.
      */
    var focus: js.UndefOr[FocusState] = js.undefined
    
    /**
      * Controls whether the focus ring should be applied around or within the composed element.
      */
    var isInset: js.UndefOr[Boolean] = js.undefined
  }
  object FocusRingProps {
    
    inline def apply(children: ReactElement): FocusRingProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusRingProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusRingProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setFocus(value: FocusState): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setIsInset(value: Boolean): Self = StObject.set(x, "isInset", value.asInstanceOf[js.Any])
      
      inline def setIsInsetUndefined: Self = StObject.set(x, "isInset", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitFocusRing.atlaskitFocusRingStrings.on
    - typings.atlaskitFocusRing.atlaskitFocusRingStrings.off
  */
  trait FocusState extends StObject
  object FocusState {
    
    inline def off: typings.atlaskitFocusRing.atlaskitFocusRingStrings.off = "off".asInstanceOf[typings.atlaskitFocusRing.atlaskitFocusRingStrings.off]
    
    inline def on: typings.atlaskitFocusRing.atlaskitFocusRingStrings.on = "on".asInstanceOf[typings.atlaskitFocusRing.atlaskitFocusRingStrings.on]
  }
}
