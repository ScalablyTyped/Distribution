package typings.antDesignReactNative

import typings.antDesignReactNative.anon.DatePickerLocale
import typings.antDesignReactNative.antDesignReactNativeStrings.date
import typings.antDesignReactNative.antDesignReactNativeStrings.datetime
import typings.antDesignReactNative.antDesignReactNativeStrings.month
import typings.antDesignReactNative.antDesignReactNativeStrings.time
import typings.antDesignReactNative.antDesignReactNativeStrings.year
import typings.antDesignReactNative.libDatePickerDatepickerDatePickerPropsMod.DatePickerProps
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatePickerPropsTypeMod {
  
  trait DatePickerPropsType
    extends StObject
       with DatePickerProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    @JSName("defaultDate")
    var defaultDate_DatePickerPropsType: js.UndefOr[js.Date] = js.undefined
    
    var dismissText: js.UndefOr[ReactNode] = js.undefined
    
    var extra: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[String | (js.Function1[/* value */ js.Date, String])] = js.undefined
    
    @JSName("locale")
    var locale_DatePickerPropsType: js.UndefOr[DatePickerLocale] = js.undefined
    
    @JSName("maxDate")
    var maxDate_DatePickerPropsType: js.UndefOr[js.Date] = js.undefined
    
    @JSName("minDate")
    var minDate_DatePickerPropsType: js.UndefOr[js.Date] = js.undefined
    
    @JSName("mode")
    var mode_DatePickerPropsType: js.UndefOr[datetime | date | year | month | time] = js.undefined
    
    var okText: js.UndefOr[ReactNode] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.Date, Unit]] = js.undefined
    
    var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onOk: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
    
    var value: js.UndefOr[js.Date] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object DatePickerPropsType {
    
    inline def apply(): DatePickerPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerPropsType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatePickerPropsType] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultDate(value: js.Date): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
      
      inline def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
      
      inline def setDismissText(value: ReactNode): Self = StObject.set(x, "dismissText", value.asInstanceOf[js.Any])
      
      inline def setDismissTextUndefined: Self = StObject.set(x, "dismissText", js.undefined)
      
      inline def setExtra(value: String): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setFormat(value: String | (js.Function1[/* value */ js.Date, String])): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatFunction1(value: /* value */ js.Date => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLocale(value: DatePickerLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMode(value: datetime | date | year | month | time): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOkText(value: ReactNode): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      inline def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
      
      inline def setOnChange(value: /* value */ js.Date => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setOnOk(value: () => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction0(value))
      
      inline def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
