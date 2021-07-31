package typings.antdMobile

import typings.antdMobile.anon.AntLocale
import typings.antdMobile.anon.MinuteStep
import typings.antdMobile.datePickerPropsTypeMod.DatePickerPropsType
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerMod {
  
  @JSImport("antd-mobile/lib/date-picker", JSImport.Default)
  @js.native
  class default () extends DatePicker
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/date-picker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/date-picker", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    @scala.inline
    def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/date-picker", "default.defaultProps")
    @js.native
    def defaultProps: MinuteStep = js.native
    @scala.inline
    def defaultProps_=(x: MinuteStep): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DatePicker
    extends Component[PropsType, js.Any, js.Any] {
    
    def fixOnOk(picker: js.Any): Unit = js.native
    
    def onOk(v: js.Any): Unit = js.native
    
    def onVisibleChange(visible: Boolean): Unit = js.native
    
    var scrollValue: js.Any = js.native
    
    def setScrollValue(v: js.Any): Unit = js.native
  }
  
  trait PropsType
    extends StObject
       with DatePickerPropsType {
    
    var className: js.UndefOr[String] = js.undefined
    
    var onOk: js.UndefOr[js.Function1[/* x */ js.Any, Unit]] = js.undefined
    
    var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var pickerPrefixCls: js.UndefOr[String] = js.undefined
    
    var popupPrefixCls: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var use12Hours: js.UndefOr[Boolean] = js.undefined
  }
  object PropsType {
    
    @scala.inline
    def apply(): PropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropsType]
    }
    
    @scala.inline
    implicit class PropsTypeMutableBuilder[Self <: PropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOnOk(value: /* x */ js.Any => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      @scala.inline
      def setPickerPrefixCls(value: String): Self = StObject.set(x, "pickerPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerPrefixClsUndefined: Self = StObject.set(x, "pickerPrefixCls", js.undefined)
      
      @scala.inline
      def setPopupPrefixCls(value: String): Self = StObject.set(x, "popupPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupPrefixClsUndefined: Self = StObject.set(x, "popupPrefixCls", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setUse12Hours(value: Boolean): Self = StObject.set(x, "use12Hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse12HoursUndefined: Self = StObject.set(x, "use12Hours", js.undefined)
    }
  }
}
