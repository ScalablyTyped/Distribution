package typings.antdMobile

import typings.antdMobile.datePickerPropsTypeMod.DatePickerPropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerViewPropsTypeMod {
  
  trait DatePickerProps
    extends StObject
       with DatePickerPropsType {
    
    var className: js.UndefOr[String] = js.undefined
    
    var onScrollChange: js.UndefOr[js.Function3[/* newValue */ js.Any, /* vals */ js.Any, /* index */ Double, Unit]] = js.undefined
    
    var pickerPrefixCls: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object DatePickerProps {
    
    inline def apply(): DatePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerProps]
    }
    
    extension [Self <: DatePickerProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setOnScrollChange(value: (/* newValue */ js.Any, /* vals */ js.Any, /* index */ Double) => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction3(value))
      
      inline def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      inline def setPickerPrefixCls(value: String): Self = StObject.set(x, "pickerPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setPickerPrefixClsUndefined: Self = StObject.set(x, "pickerPrefixCls", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
}
