package typings.antDesignReactNative

import typings.antDesignReactNative.anon.DatePickerLocale
import typings.antDesignReactNative.antDesignReactNativeStrings.date
import typings.antDesignReactNative.antDesignReactNativeStrings.datetime
import typings.antDesignReactNative.antDesignReactNativeStrings.month
import typings.antDesignReactNative.antDesignReactNativeStrings.time
import typings.antDesignReactNative.antDesignReactNativeStrings.year
import typings.antDesignReactNative.datePickerPropsMod.DatePickerProps
import typings.react.mod.ReactNode
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerPropsTypeMod {
  
  @js.native
  trait DatePickerPropsType extends DatePickerProps {
    
    var children: js.UndefOr[ReactNode] = js.native
    
    @JSName("defaultDate")
    var defaultDate_DatePickerPropsType: js.UndefOr[Date] = js.native
    
    var dismissText: js.UndefOr[ReactNode] = js.native
    
    var extra: js.UndefOr[String] = js.native
    
    var format: js.UndefOr[String | (js.Function1[/* value */ Date, String])] = js.native
    
    @JSName("locale")
    var locale_DatePickerPropsType: js.UndefOr[DatePickerLocale] = js.native
    
    @JSName("maxDate")
    var maxDate_DatePickerPropsType: js.UndefOr[Date] = js.native
    
    @JSName("minDate")
    var minDate_DatePickerPropsType: js.UndefOr[Date] = js.native
    
    @JSName("mode")
    var mode_DatePickerPropsType: js.UndefOr[datetime | date | year | month | time] = js.native
    
    var okText: js.UndefOr[ReactNode] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ Date, Unit]] = js.native
    
    var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
    
    var title: js.UndefOr[ReactNode] = js.native
    
    var value: js.UndefOr[Date] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object DatePickerPropsType {
    
    @scala.inline
    def apply(): DatePickerPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerPropsType]
    }
    
    @scala.inline
    implicit class DatePickerPropsTypeMutableBuilder[Self <: DatePickerPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDefaultDate(value: Date): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
      
      @scala.inline
      def setDismissText(value: ReactNode): Self = StObject.set(x, "dismissText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissTextUndefined: Self = StObject.set(x, "dismissText", js.undefined)
      
      @scala.inline
      def setExtra(value: String): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setFormat(value: String | (js.Function1[/* value */ Date, String])): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatFunction1(value: /* value */ Date => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setLocale(value: DatePickerLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setMode(value: datetime | date | year | month | time): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOkText(value: ReactNode): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ Date => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
