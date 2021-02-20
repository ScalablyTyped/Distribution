package typings.antdMobileRn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchBarPropsTypeMod {
  
  object defaultProps {
    
    @JSImport("antd-mobile-rn/lib/search-bar/PropsType", "defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/search-bar/PropsType", "defaultProps.disabled")
    @js.native
    def disabled: Boolean = js.native
    @scala.inline
    def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/search-bar/PropsType", "defaultProps.onBlur")
    @js.native
    def onBlur: js.Function0[Unit] = js.native
    @scala.inline
    def onBlur_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/search-bar/PropsType", "defaultProps.onChange")
    @js.native
    def onChange: js.Function0[Unit] = js.native
    @scala.inline
    def onChange_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/search-bar/PropsType", "defaultProps.onClear")
    @js.native
    def onClear: js.Function0[Unit] = js.native
    @scala.inline
    def onClear_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClear")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/search-bar/PropsType", "defaultProps.onFocus")
    @js.native
    def onFocus: js.Function0[Unit] = js.native
    @scala.inline
    def onFocus_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/search-bar/PropsType", "defaultProps.onSubmit")
    @js.native
    def onSubmit: js.Function0[Unit] = js.native
    @scala.inline
    def onSubmit_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/search-bar/PropsType", "defaultProps.placeholder")
    @js.native
    def placeholder: String = js.native
    @scala.inline
    def placeholder_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/search-bar/PropsType", "defaultProps.prefixCls")
    @js.native
    def prefixCls: String = js.native
    @scala.inline
    def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/search-bar/PropsType", "defaultProps.showCancelButton")
    @js.native
    def showCancelButton: Boolean = js.native
    @scala.inline
    def showCancelButton_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showCancelButton")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait SearchBarPropsType extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var cancelText: js.UndefOr[String] = js.native
    
    var defaultValue: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var focused: js.UndefOr[Boolean] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var onBlur: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onCancel: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
    
    var onClear: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
    
    var onFocus: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onSubmit: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var showCancelButton: js.UndefOr[Boolean] = js.native
    
    var styles: js.UndefOr[js.Any] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object SearchBarPropsType {
    
    @scala.inline
    def apply(): SearchBarPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchBarPropsType]
    }
    
    @scala.inline
    implicit class SearchBarPropsTypeMutableBuilder[Self <: SearchBarPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCancel(value: /* value */ String => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClear(value: /* value */ String => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      @scala.inline
      def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: /* value */ String => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setShowCancelButton(value: Boolean): Self = StObject.set(x, "showCancelButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCancelButtonUndefined: Self = StObject.set(x, "showCancelButton", js.undefined)
      
      @scala.inline
      def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait SearchBarState extends StObject {
    
    var focus: js.UndefOr[Boolean] = js.native
    
    var focused: js.UndefOr[Boolean] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object SearchBarState {
    
    @scala.inline
    def apply(): SearchBarState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchBarState]
    }
    
    @scala.inline
    implicit class SearchBarStateMutableBuilder[Self <: SearchBarState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
