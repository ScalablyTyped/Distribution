package typings.antdMobileRn

import typings.antdMobileRn.anon.AntLocale
import typings.antdMobileRn.anon.MinuteStep
import typings.antdMobileRn.datePickerPropsTypeMod.DatePickerPropsType
import typings.antdMobileRn.pickerStyleIndexNativeMod.IPickerStyle
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/date-picker/index.native", JSImport.Default)
  @js.native
  class default () extends DatePicker
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/date-picker/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/date-picker/index.native", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    @scala.inline
    def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/date-picker/index.native", "default.defaultProps")
    @js.native
    def defaultProps: MinuteStep = js.native
    @scala.inline
    def defaultProps_=(x: MinuteStep): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DatePicker
    extends Component[DatePickerNativeProps, js.Any, js.Any]
  
  @js.native
  trait DatePickerNativeProps extends DatePickerPropsType {
    
    var styles: js.UndefOr[IPickerStyle] = js.native
    
    var triggerTypes: js.UndefOr[String] = js.native
  }
  object DatePickerNativeProps {
    
    @scala.inline
    def apply(): DatePickerNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerNativeProps]
    }
    
    @scala.inline
    implicit class DatePickerNativePropsMutableBuilder[Self <: DatePickerNativeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyles(value: IPickerStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTriggerTypes(value: String): Self = StObject.set(x, "triggerTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerTypesUndefined: Self = StObject.set(x, "triggerTypes", js.undefined)
    }
  }
}
