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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputNumberMod {
  
  @JSImport("@ant-design/react-native/lib/stepper/InputNumber", JSImport.Default)
  @js.native
  open class default[P /* <: InputNumberProps */, S /* <: InputNumberState */] protected () extends InputNumber[P, S] {
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
    inline def defaultProps_=(x: Max): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait InputNumber[P /* <: InputNumberProps */, S /* <: InputNumberState */] extends Component[P, S, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MInputNumber(nextProps: P): Unit = js.native
    
    var _stepDown: Any = js.native
    
    var _stepDownText: Any = js.native
    
    var _stepUp: Any = js.native
    
    var _stepUpText: Any = js.native
    
    def action(`type`: up | down, e: Any): Unit = js.native
    def action(`type`: up | down, e: Any, ratio: Any): Unit = js.native
    def action(`type`: up | down, e: Any, ratio: Any, recursive: Any): Unit = js.native
    def action(`type`: up | down, e: Any, ratio: Unit, recursive: Any): Unit = js.native
    
    var autoStepTimer: Any = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MInputNumber(): Unit = js.native
    
    def down(e: Any): Unit = js.native
    def down(e: Any, ratio: Any): Unit = js.native
    def down(e: Any, ratio: Any, recursive: Any): Unit = js.native
    def down(e: Any, ratio: Unit, recursive: Any): Unit = js.native
    
    def getCurrentValidValue(value: Any): Any = js.native
    
    def getMaxPrecision(currentValue: Any): Double = js.native
    def getMaxPrecision(currentValue: Any, ratio: Double): Double = js.native
    
    def getPrecision(value: Any): Double = js.native
    
    def getPrecisionFactor(currentValue: Any): Double = js.native
    def getPrecisionFactor(currentValue: Any, ratio: Double): Double = js.native
    
    def getValidValue(value: Any): Any = js.native
    
    def getValueFromEvent(e: Any): Any = js.native
    
    def isNotCompleteNumber(num: Any): Any = js.native
    
    def onBlur(e: Any, args: Any*): Unit = js.native
    
    def onChange(e: Any): Unit = js.native
    
    def onFocus(args: Any*): Unit = js.native
    
    def onPressIn(`type`: String): Unit = js.native
    
    def onPressInDown(e: Any): Unit = js.native
    
    def onPressInUp(e: Any): Unit = js.native
    
    def onPressOut(`type`: Any): Unit = js.native
    
    def onPressOutDown(): Unit = js.native
    
    def onPressOutUp(): Unit = js.native
    
    def setValue(v: Any): Unit = js.native
    def setValue(v: Any, callback: Any): Unit = js.native
    
    def step(`type`: up | down, e: Any): Boolean = js.native
    def step(`type`: up | down, e: Any, ratio: Double): Boolean = js.native
    
    def stepCompute(`type`: up | down, `val`: Any, rat: Any): Any = js.native
    
    def stop(): Unit = js.native
    
    def toNumber(num: Any): Any = js.native
    
    def toNumberWhenUserInput(num: Any): Any = js.native
    
    def toPrecisionAsStep(num: Any): Any = js.native
    
    def up(e: Any): Unit = js.native
    def up(e: Any, ratio: Any): Unit = js.native
    def up(e: Any, ratio: Any, recursive: Any): Unit = js.native
    def up(e: Any, ratio: Unit, recursive: Any): Unit = js.native
  }
  
  trait InputNumberProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[Double] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var downStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var inputStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var keyboardType: js.UndefOr[Any] = js.undefined
    
    var max: Double
    
    var min: Double
    
    var onBlur: js.UndefOr[js.Function2[/* e */ Any, /* repeated */ Any, Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ Any, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* e */ js.UndefOr[Any], Unit]] = js.undefined
    
    var parser: js.UndefOr[js.Function1[/* v */ Any, Unit]] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var step: String | Double
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: ReturnType[js.Function1[/* theme */ Theme, StepperStyle]]
    
    var upStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object InputNumberProps {
    
    inline def apply(
      max: Double,
      min: Double,
      step: String | Double,
      styles: ReturnType[js.Function1[/* theme */ Theme, StepperStyle]]
    ): InputNumberProps = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputNumberProps]
    }
    
    extension [Self <: InputNumberProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDownStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "downStyle", value.asInstanceOf[js.Any])
      
      inline def setDownStyleNull: Self = StObject.set(x, "downStyle", null)
      
      inline def setDownStyleUndefined: Self = StObject.set(x, "downStyle", js.undefined)
      
      inline def setInputStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      inline def setInputStyleNull: Self = StObject.set(x, "inputStyle", null)
      
      inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      inline def setKeyboardType(value: Any): Self = StObject.set(x, "keyboardType", value.asInstanceOf[js.Any])
      
      inline def setKeyboardTypeUndefined: Self = StObject.set(x, "keyboardType", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: (/* e */ Any, /* repeated */ Any) => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction2(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* e */ Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: /* e */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setParser(value: /* v */ Any => Unit): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setStep(value: String | Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: ReturnType[js.Function1[/* theme */ Theme, StepperStyle]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setUpStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "upStyle", value.asInstanceOf[js.Any])
      
      inline def setUpStyleNull: Self = StObject.set(x, "upStyle", null)
      
      inline def setUpStyleUndefined: Self = StObject.set(x, "upStyle", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait InputNumberState extends StObject {
    
    var focused: js.UndefOr[Boolean] = js.undefined
    
    var inputValue: js.UndefOr[Double] = js.undefined
    
    var value: Double
  }
  object InputNumberState {
    
    inline def apply(value: Double): InputNumberState = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputNumberState]
    }
    
    extension [Self <: InputNumberState](x: Self) {
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setInputValue(value: Double): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      inline def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
