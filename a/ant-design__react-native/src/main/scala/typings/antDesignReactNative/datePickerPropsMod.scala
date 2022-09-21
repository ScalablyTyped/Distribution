package typings.antDesignReactNative

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerPropsMod {
  
  trait DatePickerProps extends StObject {
    
    var date: js.UndefOr[Any] = js.undefined
    
    var defaultDate: js.UndefOr[Any] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var formatDay: js.UndefOr[js.Function2[/* day */ Double, /* date */ js.UndefOr[Any], Any]] = js.undefined
    
    var formatMonth: js.UndefOr[js.Function2[/* month */ Double, /* date */ js.UndefOr[Any], Any]] = js.undefined
    
    var itemStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var locale: js.UndefOr[Any] = js.undefined
    
    var maxDate: js.UndefOr[Any] = js.undefined
    
    var minDate: js.UndefOr[Any] = js.undefined
    
    var minuteStep: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[String] = js.undefined
    
    var onDateChange: js.UndefOr[js.Function1[/* date */ Any, Unit]] = js.undefined
    
    var onScrollChange: js.UndefOr[js.Function3[/* date */ Any, /* vals */ Any, /* index */ Double, Unit]] = js.undefined
    
    var onValueChange: js.UndefOr[js.Function2[/* vals */ Any, /* index */ Double, Unit]] = js.undefined
    
    var rootNativeProps: js.UndefOr[js.Object] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var use12Hours: js.UndefOr[Boolean] = js.undefined
  }
  object DatePickerProps {
    
    inline def apply(): DatePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerProps]
    }
    
    extension [Self <: DatePickerProps](x: Self) {
      
      inline def setDate(value: Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDefaultDate(value: Any): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
      
      inline def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFormatDay(value: (/* day */ Double, /* date */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "formatDay", js.Any.fromFunction2(value))
      
      inline def setFormatDayUndefined: Self = StObject.set(x, "formatDay", js.undefined)
      
      inline def setFormatMonth(value: (/* month */ Double, /* date */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "formatMonth", js.Any.fromFunction2(value))
      
      inline def setFormatMonthUndefined: Self = StObject.set(x, "formatMonth", js.undefined)
      
      inline def setItemStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      inline def setItemStyleNull: Self = StObject.set(x, "itemStyle", null)
      
      inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: Any): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: Any): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMinuteStep(value: Double): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
      
      inline def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnDateChange(value: /* date */ Any => Unit): Self = StObject.set(x, "onDateChange", js.Any.fromFunction1(value))
      
      inline def setOnDateChangeUndefined: Self = StObject.set(x, "onDateChange", js.undefined)
      
      inline def setOnScrollChange(value: (/* date */ Any, /* vals */ Any, /* index */ Double) => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction3(value))
      
      inline def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      inline def setOnValueChange(value: (/* vals */ Any, /* index */ Double) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction2(value))
      
      inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      inline def setRootNativeProps(value: js.Object): Self = StObject.set(x, "rootNativeProps", value.asInstanceOf[js.Any])
      
      inline def setRootNativePropsUndefined: Self = StObject.set(x, "rootNativeProps", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUse12Hours(value: Boolean): Self = StObject.set(x, "use12Hours", value.asInstanceOf[js.Any])
      
      inline def setUse12HoursUndefined: Self = StObject.set(x, "use12Hours", js.undefined)
    }
  }
}
