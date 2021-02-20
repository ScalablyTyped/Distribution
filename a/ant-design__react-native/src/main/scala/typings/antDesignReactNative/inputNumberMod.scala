package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Max
import typings.antDesignReactNative.antDesignReactNativeStrings.down
import typings.antDesignReactNative.antDesignReactNativeStrings.up
import typings.antDesignReactNative.libStyleMod.Theme
import typings.antDesignReactNative.stepperStyleMod.StepperStyle
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputNumberMod {
  
  @JSImport("@ant-design/react-native/lib/stepper/InputNumber", JSImport.Default)
  @js.native
  class default[P /* <: InputNumberProps */, S /* <: InputNumberState */] protected () extends InputNumber[P, S] {
    def this(props: P) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/stepper/InputNumber", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/stepper/InputNumber", "default.defaultProps")
    @js.native
    def defaultProps: Max = js.native
    @scala.inline
    def defaultProps_=(x: Max): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait InputNumber[P /* <: InputNumberProps */, S /* <: InputNumberState */]
    extends Component[P, S, js.Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MInputNumber(nextProps: P): Unit = js.native
    
    var _stepDown: js.Any = js.native
    
    var _stepDownText: js.Any = js.native
    
    var _stepUp: js.Any = js.native
    
    var _stepUpText: js.Any = js.native
    
    @JSName("action")
    def action_down(`type`: down, e: js.Any): Unit = js.native
    @JSName("action")
    def action_down(`type`: down, e: js.Any, ratio: js.UndefOr[scala.Nothing], recursive: js.Any): Unit = js.native
    @JSName("action")
    def action_down(`type`: down, e: js.Any, ratio: js.Any): Unit = js.native
    @JSName("action")
    def action_down(`type`: down, e: js.Any, ratio: js.Any, recursive: js.Any): Unit = js.native
    @JSName("action")
    def action_up(`type`: up, e: js.Any): Unit = js.native
    @JSName("action")
    def action_up(`type`: up, e: js.Any, ratio: js.UndefOr[scala.Nothing], recursive: js.Any): Unit = js.native
    @JSName("action")
    def action_up(`type`: up, e: js.Any, ratio: js.Any): Unit = js.native
    @JSName("action")
    def action_up(`type`: up, e: js.Any, ratio: js.Any, recursive: js.Any): Unit = js.native
    
    var autoStepTimer: js.Any = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MInputNumber(): Unit = js.native
    
    def down(e: js.Any): Unit = js.native
    def down(e: js.Any, ratio: js.UndefOr[scala.Nothing], recursive: js.Any): Unit = js.native
    def down(e: js.Any, ratio: js.Any): Unit = js.native
    def down(e: js.Any, ratio: js.Any, recursive: js.Any): Unit = js.native
    
    def getCurrentValidValue(value: js.Any): js.Any = js.native
    
    def getMaxPrecision(currentValue: js.Any): Double = js.native
    def getMaxPrecision(currentValue: js.Any, ratio: Double): Double = js.native
    
    def getPrecision(value: js.Any): Double = js.native
    
    def getPrecisionFactor(currentValue: js.Any): Double = js.native
    def getPrecisionFactor(currentValue: js.Any, ratio: Double): Double = js.native
    
    def getValidValue(value: js.Any): js.Any = js.native
    
    def getValueFromEvent(e: js.Any): js.Any = js.native
    
    def isNotCompleteNumber(num: js.Any): Boolean = js.native
    
    def onBlur(e: js.Any, args: js.Any*): Unit = js.native
    
    def onChange(e: js.Any): Unit = js.native
    
    def onFocus(args: js.Any*): Unit = js.native
    
    def onPressIn(`type`: String): Unit = js.native
    
    def onPressInDown(e: js.Any): Unit = js.native
    
    def onPressInUp(e: js.Any): Unit = js.native
    
    def onPressOut(`type`: js.Any): Unit = js.native
    
    def onPressOutDown(): Unit = js.native
    
    def onPressOutUp(): Unit = js.native
    
    def setValue(v: js.Any): Unit = js.native
    def setValue(v: js.Any, callback: js.Any): Unit = js.native
    
    @JSName("stepCompute")
    def stepCompute_down(`type`: down, `val`: js.Any, rat: js.Any): js.Any = js.native
    @JSName("stepCompute")
    def stepCompute_up(`type`: up, `val`: js.Any, rat: js.Any): js.Any = js.native
    
    @JSName("step")
    def step_down(`type`: down, e: js.Any): Boolean = js.native
    @JSName("step")
    def step_down(`type`: down, e: js.Any, ratio: Double): Boolean = js.native
    @JSName("step")
    def step_up(`type`: up, e: js.Any): Boolean = js.native
    @JSName("step")
    def step_up(`type`: up, e: js.Any, ratio: Double): Boolean = js.native
    
    def stop(): Unit = js.native
    
    def toNumber(num: js.Any): js.Any = js.native
    
    def toNumberWhenUserInput(num: js.Any): js.Any = js.native
    
    def toPrecisionAsStep(num: js.Any): js.Any = js.native
    
    def up(e: js.Any): Unit = js.native
    def up(e: js.Any, ratio: js.UndefOr[scala.Nothing], recursive: js.Any): Unit = js.native
    def up(e: js.Any, ratio: js.Any): Unit = js.native
    def up(e: js.Any, ratio: js.Any, recursive: js.Any): Unit = js.native
  }
  
  @js.native
  trait InputNumberProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var defaultValue: js.UndefOr[Double] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var downStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var inputStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    var keyboardType: js.UndefOr[js.Any] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var onBlur: js.UndefOr[js.Function2[/* e */ js.Any, /* repeated */ js.Any, Unit]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
    
    var parser: js.UndefOr[js.Function1[/* v */ js.Any, Unit]] = js.native
    
    var precision: js.UndefOr[Double] = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var step: js.UndefOr[String | Double] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var styles: ReturnType[js.Function1[/* theme */ Theme, StepperStyle]] = js.native
    
    var upStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object InputNumberProps {
    
    @scala.inline
    def apply(styles: ReturnType[js.Function1[/* theme */ Theme, StepperStyle]]): InputNumberProps = {
      val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputNumberProps]
    }
    
    @scala.inline
    implicit class InputNumberPropsMutableBuilder[Self <: InputNumberProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDownStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "downStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownStyleNull: Self = StObject.set(x, "downStyle", null)
      
      @scala.inline
      def setDownStyleUndefined: Self = StObject.set(x, "downStyle", js.undefined)
      
      @scala.inline
      def setInputStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputStyleNull: Self = StObject.set(x, "inputStyle", null)
      
      @scala.inline
      def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      @scala.inline
      def setKeyboardType(value: js.Any): Self = StObject.set(x, "keyboardType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardTypeUndefined: Self = StObject.set(x, "keyboardType", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOnBlur(value: (/* e */ js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* e */ js.Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setParser(value: /* v */ js.Any => Unit): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setStep(value: String | Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: ReturnType[js.Function1[/* theme */ Theme, StepperStyle]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "upStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpStyleNull: Self = StObject.set(x, "upStyle", null)
      
      @scala.inline
      def setUpStyleUndefined: Self = StObject.set(x, "upStyle", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait InputNumberState extends StObject {
    
    var focused: js.UndefOr[Boolean] = js.native
    
    var inputValue: js.UndefOr[Double] = js.native
    
    var value: Double = js.native
  }
  object InputNumberState {
    
    @scala.inline
    def apply(value: Double): InputNumberState = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputNumberState]
    }
    
    @scala.inline
    implicit class InputNumberStateMutableBuilder[Self <: InputNumberState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      @scala.inline
      def setInputValue(value: Double): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
