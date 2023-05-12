package typings.antdMobile

import typings.antdMobile.anon.Digits
import typings.antdMobile.anon.PickInputPropsonFocusonBl
import typings.antdMobile.anon.StringMode
import typings.antdMobile.anon.`0`
import typings.antdMobile.antdMobileBooleans.`false`
import typings.antdMobile.antdMobileBooleans.`true`
import typings.antdMobile.antdMobileStrings.`--active-border`
import typings.antdMobile.antdMobileStrings.`--border-inner`
import typings.antdMobile.antdMobileStrings.`--border-radius`
import typings.antdMobile.antdMobileStrings.`--border`
import typings.antdMobile.antdMobileStrings.`--button-background-color`
import typings.antdMobile.antdMobileStrings.`--button-font-size`
import typings.antdMobile.antdMobileStrings.`--button-text-color`
import typings.antdMobile.antdMobileStrings.`--button-width`
import typings.antdMobile.antdMobileStrings.`--height`
import typings.antdMobile.antdMobileStrings.`--input-background-color`
import typings.antdMobile.antdMobileStrings.`--input-font-color`
import typings.antdMobile.antdMobileStrings.`--input-font-size`
import typings.antdMobile.antdMobileStrings.`--input-width`
import typings.antdMobile.esUtilsNativePropsMod.NativeProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsStepperStepperMod {
  
  @JSImport("antd-mobile/es/components/stepper/stepper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerStepper[ValueType /* <: Double | String */](p: StepperProps, ref: ForwardedRef[StepperRef]): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("InnerStepper")(p.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  @JSImport("antd-mobile/es/components/stepper/stepper", "Stepper")
  @js.native
  val Stepper: ForwardRefExoticComponent[StepperProps & RefAttributes[StepperRef]] = js.native
  
  type BaseStepperProps[ValueType] = (ValuePropsWithNull[ValueType] & PickInputPropsonFocusonBl & Digits[ValueType] & (NativeProps[
    `--height` | `--input-width` | `--input-font-size` | `--input-background-color` | `--border-radius` | `--border` | `--border-inner` | `--active-border` | `--button-font-size` | `--button-background-color` | `--button-width` | `--input-font-color` | `--button-text-color`
  ])) | (ValueProps[ValueType] & PickInputPropsonFocusonBl & Digits[ValueType] & (NativeProps[
    `--height` | `--input-width` | `--input-font-size` | `--input-background-color` | `--border-radius` | `--border` | `--border-inner` | `--active-border` | `--button-font-size` | `--button-background-color` | `--button-width` | `--input-font-color` | `--button-text-color`
  ]))
  
  type NumberStepperProps = BaseStepperProps[Double] & StringMode
  
  type StepperProps = NumberStepperProps | StringStepperProps
  
  /* Inlined std.Pick<antd-mobile.antd-mobile/es/components/input.InputRef, 'blur' | 'focus' | 'nativeElement'> */
  trait StepperRef extends StObject {
    
    var blur: js.Function0[Unit]
    
    var focus: js.Function0[Unit]
    
    var nativeElement: HTMLInputElement | Null
  }
  object StepperRef {
    
    inline def apply(blur: () => Unit, focus: () => Unit): StepperRef = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus), nativeElement = null)
      __obj.asInstanceOf[StepperRef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StepperRef] (val x: Self) extends AnyVal {
      
      inline def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      inline def setNativeElement(value: HTMLInputElement): Self = StObject.set(x, "nativeElement", value.asInstanceOf[js.Any])
      
      inline def setNativeElementNull: Self = StObject.set(x, "nativeElement", null)
    }
  }
  
  type StringStepperProps = BaseStepperProps[String] & `0`
  
  trait ValueProps[ValueType] extends StObject {
    
    var allowEmpty: `true`
    
    var defaultValue: js.UndefOr[ValueType | Null] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ ValueType | Null, Unit]] = js.undefined
    
    var value: js.UndefOr[ValueType | Null] = js.undefined
  }
  object ValueProps {
    
    inline def apply[ValueType](): ValueProps[ValueType] = {
      val __obj = js.Dynamic.literal(allowEmpty = true)
      __obj.asInstanceOf[ValueProps[ValueType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueProps[?], ValueType] (val x: Self & ValueProps[ValueType]) extends AnyVal {
      
      inline def setAllowEmpty(value: `true`): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setDefaultValue(value: ValueType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setOnChange(value: /* value */ ValueType | Null => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setValue(value: ValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ValuePropsWithNull[ValueType] extends StObject {
    
    var allowEmpty: js.UndefOr[`false`] = js.undefined
    
    var defaultValue: js.UndefOr[ValueType] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ ValueType, Unit]] = js.undefined
    
    var value: js.UndefOr[ValueType] = js.undefined
  }
  object ValuePropsWithNull {
    
    inline def apply[ValueType](): ValuePropsWithNull[ValueType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValuePropsWithNull[ValueType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValuePropsWithNull[?], ValueType] (val x: Self & ValuePropsWithNull[ValueType]) extends AnyVal {
      
      inline def setAllowEmpty(value: `false`): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      inline def setDefaultValue(value: ValueType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setOnChange(value: /* value */ ValueType => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setValue(value: ValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
