package typings.antd

import typings.antd.libDatePickerGeneratePickerMod.PickerProps
import typings.antd.libDatePickerGeneratePickerMod.RangePickerProps
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatePickerGeneratePickerInterfaceMod {
  
  trait CommonPickerMethods extends StObject {
    
    def blur(): Unit
    
    def focus(): Unit
  }
  object CommonPickerMethods {
    
    inline def apply(blur: () => Unit, focus: () => Unit): CommonPickerMethods = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[CommonPickerMethods]
    }
    
    extension [Self <: CommonPickerMethods](x: Self) {
      
      inline def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  type DatePickRef[DateType] = PickerRef[PickerProps[DateType]]
  
  @js.native
  trait PickerComponentClass[P, S]
    extends StObject
       with ComponentClass[P, S]
  
  type PickerRef[P] = ForwardedRef[(Component[P, js.Object, Any]) & CommonPickerMethods]
  
  type RangePickerRef[DateType] = PickerRef[RangePickerProps[DateType]]
}
