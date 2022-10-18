package typings.antDesignReactNative

import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.TextInputFocusEventData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSearchBarPropsTypeMod {
  
  object defaultProps {
    
    @JSImport("@ant-design/react-native/lib/search-bar/PropsType", "defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/search-bar/PropsType", "defaultProps.disabled")
    @js.native
    def disabled: Boolean = js.native
    inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/search-bar/PropsType", "defaultProps.onBlur")
    @js.native
    def onBlur: js.Function0[Unit] = js.native
    inline def onBlur_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/search-bar/PropsType", "defaultProps.onChange")
    @js.native
    def onChange: js.Function0[Unit] = js.native
    inline def onChange_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/search-bar/PropsType", "defaultProps.onClear")
    @js.native
    def onClear: js.Function0[Unit] = js.native
    inline def onClear_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClear")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/search-bar/PropsType", "defaultProps.onFocus")
    @js.native
    def onFocus: js.Function0[Unit] = js.native
    inline def onFocus_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/search-bar/PropsType", "defaultProps.onSubmit")
    @js.native
    def onSubmit: js.Function0[Unit] = js.native
    inline def onSubmit_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/search-bar/PropsType", "defaultProps.placeholder")
    @js.native
    def placeholder: String = js.native
    inline def placeholder_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/search-bar/PropsType", "defaultProps.showCancelButton")
    @js.native
    def showCancelButton: Boolean = js.native
    inline def showCancelButton_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showCancelButton")(x.asInstanceOf[js.Any])
  }
  
  trait SearchBarPropsType extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var cancelText: js.UndefOr[String] = js.undefined
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var focused: js.UndefOr[Boolean] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputFocusEventData], Unit]] = js.undefined
    
    var onCancel: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onClear: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputFocusEventData], Unit]] = js.undefined
    
    var onSubmit: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var showCancelButton: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object SearchBarPropsType {
    
    inline def apply(): SearchBarPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchBarPropsType]
    }
    
    extension [Self <: SearchBarPropsType](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setOnBlur(value: /* e */ NativeSyntheticEvent[TextInputFocusEventData] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCancel(value: /* value */ String => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnChange(value: /* value */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClear(value: /* value */ String => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction1(value))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnFocus(value: /* e */ NativeSyntheticEvent[TextInputFocusEventData] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnSubmit(value: /* value */ String => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setShowCancelButton(value: Boolean): Self = StObject.set(x, "showCancelButton", value.asInstanceOf[js.Any])
      
      inline def setShowCancelButtonUndefined: Self = StObject.set(x, "showCancelButton", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SearchBarState extends StObject {
    
    var focus: js.UndefOr[Boolean] = js.undefined
    
    var focused: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object SearchBarState {
    
    inline def apply(): SearchBarState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchBarState]
    }
    
    extension [Self <: SearchBarState](x: Self) {
      
      inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
