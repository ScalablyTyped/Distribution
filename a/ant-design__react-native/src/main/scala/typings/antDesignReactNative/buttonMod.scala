package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Disabled
import typings.antDesignReactNative.buttonStyleMod.ButtonStyles
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.propsTypeMod.ButtonPropsType
import typings.react.mod.Component
import typings.reactNative.mod.AccessibilityProps
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TargetedEvent
import typings.reactNative.mod.TouchableWithoutFeedbackPropsAndroid
import typings.reactNative.mod.TouchableWithoutFeedbackPropsIOS
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod {
  
  @JSImport("@ant-design/react-native/lib/button", JSImport.Default)
  @js.native
  class default protected () extends Button {
    def this(props: ButtonProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/button", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/button", "default.defaultProps")
    @js.native
    def defaultProps: Disabled = js.native
    @scala.inline
    def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Button
    extends Component[ButtonProps, js.Any, js.Any] {
    
    def onHideUnderlay(arg: js.Any*): Unit = js.native
    
    def onPressIn(arg: js.Any*): Unit = js.native
    
    def onPressOut(arg: js.Any*): Unit = js.native
    
    def onShowUnderlay(arg: js.Any*): Unit = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactNative.mod.TouchableWithoutFeedbackProps because var conflicts: disabled. Inlined onPress, onPressOut, hitSlop, style, onFocus, onLayout, delayLongPress, onLongPress, onBlur, delayPressOut, pressRetentionOffset, delayPressIn, onPressIn, testID
  - typings.reactNative.mod.TouchableHighlightProps because var conflicts: disabled. Inlined onShowUnderlay, onHideUnderlay, underlayColor, activeOpacity */ trait ButtonProps
    extends StObject
       with ButtonPropsType
       with WithThemeStyles[ButtonStyles]
       with TouchableWithoutFeedbackPropsIOS
       with TouchableWithoutFeedbackPropsAndroid
       with AccessibilityProps {
    
    /**
      * Determines what the opacity of the wrapped view should be when touch is active.
      */
    var activeOpacity: js.UndefOr[Double] = js.undefined
    
    var activeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Delay in ms, from onPressIn, before onLongPress is called.
      */
    var delayLongPress: js.UndefOr[Double] = js.undefined
    
    /**
      * Delay in ms, from the start of the touch, before onPressIn is called.
      */
    var delayPressIn: js.UndefOr[Double] = js.undefined
    
    /**
      * Delay in ms, from the release of the touch, before onPressOut is called.
      */
    var delayPressOut: js.UndefOr[Double] = js.undefined
    
    /**
      * This defines how far your touch can start away from the button.
      * This is added to pressRetentionOffset when moving off of the button.
      * NOTE The touch area never extends past the parent view bounds and
      * the Z-index of sibling views always takes precedence if a touch hits
      * two overlapping views.
      */
    var hitSlop: js.UndefOr[Insets] = js.undefined
    
    /**
      * When `accessible` is true (which is the default) this may be called when
      * the OS-specific concept of "blur" occurs, meaning the element lost focus.
      * Some platforms may not have the concept of blur.
      */
    var onBlur: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
    
    /**
      * When `accessible` is true (which is the default) this may be called when
      * the OS-specific concept of "focus" occurs. Some platforms may not have
      * the concept of focus.
      */
    var onFocus: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
    
    /**
      *
      * Called immediately after the underlay is hidden
      */
    var onHideUnderlay: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Invoked on mount and layout changes with
      * {nativeEvent: {layout: {x, y, width, height}}}
      */
    var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
    
    var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onPress: js.UndefOr[js.Function1[js.UndefOr[js.Any | (/* event */ GestureResponderEvent)], Unit]] = js.undefined
    
    var onPressIn: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onPressOut: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    /**
      * Called immediately after the underlay is shown
      */
    var onShowUnderlay: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * When the scroll view is disabled, this defines how far your
      * touch may move off of the button, before deactivating the button.
      * Once deactivated, try moving it back and you'll see that the button
      * is once again reactivated! Move it back and forth several times
      * while the scroll view is disabled. Ensure you pass in a constant
      * to reduce memory allocations.
      */
    var pressRetentionOffset: js.UndefOr[Insets] = js.undefined
    
    /**
      * //FIXME: not in doc but available in examples
      */
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Used to locate this view in end-to-end tests.
      */
    var testID: js.UndefOr[String] = js.undefined
    
    /**
      * The color of the underlay that will show through when the touch is active.
      */
    var underlayColor: js.UndefOr[ColorValue] = js.undefined
  }
  object ButtonProps {
    
    @scala.inline
    def apply(): ButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonProps]
    }
    
    @scala.inline
    implicit class ButtonPropsMutableBuilder[Self <: ButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
      
      @scala.inline
      def setActiveStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveStyleNull: Self = StObject.set(x, "activeStyle", null)
      
      @scala.inline
      def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      @scala.inline
      def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
      
      @scala.inline
      def setDelayPressIn(value: Double): Self = StObject.set(x, "delayPressIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayPressInUndefined: Self = StObject.set(x, "delayPressIn", js.undefined)
      
      @scala.inline
      def setDelayPressOut(value: Double): Self = StObject.set(x, "delayPressOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayPressOutUndefined: Self = StObject.set(x, "delayPressOut", js.undefined)
      
      @scala.inline
      def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnHideUnderlay(value: () => Unit): Self = StObject.set(x, "onHideUnderlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnHideUnderlayUndefined: Self = StObject.set(x, "onHideUnderlay", js.undefined)
      
      @scala.inline
      def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      @scala.inline
      def setOnLongPress(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      @scala.inline
      def setOnPress(value: js.UndefOr[js.Any | (/* event */ GestureResponderEvent)] => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressIn(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
      
      @scala.inline
      def setOnPressOut(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      @scala.inline
      def setOnShowUnderlay(value: () => Unit): Self = StObject.set(x, "onShowUnderlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShowUnderlayUndefined: Self = StObject.set(x, "onShowUnderlay", js.undefined)
      
      @scala.inline
      def setPressRetentionOffset(value: Insets): Self = StObject.set(x, "pressRetentionOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPressRetentionOffsetUndefined: Self = StObject.set(x, "pressRetentionOffset", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      @scala.inline
      def setUnderlayColor(value: ColorValue): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    }
  }
}
