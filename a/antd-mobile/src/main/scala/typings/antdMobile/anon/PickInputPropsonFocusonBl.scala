package typings.antdMobile.anon

import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.std.Element
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<antd-mobile.antd-mobile/es/components/input.InputProps, 'onFocus' | 'onBlur'> */
trait PickInputPropsonFocusonBl extends StObject {
  
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
}
object PickInputPropsonFocusonBl {
  
  inline def apply(): PickInputPropsonFocusonBl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickInputPropsonFocusonBl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickInputPropsonFocusonBl] (val x: Self) extends AnyVal {
    
    inline def setOnBlur(value: FocusEvent[HTMLInputElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnFocus(value: FocusEvent[HTMLInputElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
  }
}
