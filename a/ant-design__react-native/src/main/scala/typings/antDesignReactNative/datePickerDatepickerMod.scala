package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Day
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerDatepickerMod {
  
  @JSImport("@ant-design/react-native/lib/date-picker/datepicker", JSImport.Default)
  @js.native
  class default ()
    extends typings.antDesignReactNative.datePickerDatepickerDatePickerMod.default
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("@ant-design/react-native/lib/date-picker/datepicker", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@ant-design/react-native/lib/date-picker/datepicker", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/date-picker/datepicker", "default.defaultProps.locale")
      @js.native
      def locale: Day = js.native
      inline def locale_=(x: Day): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/date-picker/datepicker", "default.defaultProps.minuteStep")
      @js.native
      def minuteStep: Double = js.native
      inline def minuteStep_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minuteStep")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/date-picker/datepicker", "default.defaultProps.mode")
      @js.native
      def mode: String = js.native
      inline def mode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
      
      inline def onDateChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDateChange")().asInstanceOf[Unit]
      
      @JSImport("@ant-design/react-native/lib/date-picker/datepicker", "default.defaultProps.pickerPrefixCls")
      @js.native
      def pickerPrefixCls: String = js.native
      inline def pickerPrefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pickerPrefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/date-picker/datepicker", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      inline def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/date-picker/datepicker", "default.defaultProps.use12Hours")
      @js.native
      def use12Hours: Boolean = js.native
      inline def use12Hours_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("use12Hours")(x.asInstanceOf[js.Any])
    }
  }
}
