package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Digits[ValueType] extends StObject {
  
  var digits: js.UndefOr[Double] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var formatter: js.UndefOr[js.Function1[/* value */ js.UndefOr[ValueType], String]] = js.undefined
  
  var inputReadOnly: js.UndefOr[Boolean] = js.undefined
  
  var max: js.UndefOr[ValueType] = js.undefined
  
  var min: js.UndefOr[ValueType] = js.undefined
  
  var parser: js.UndefOr[js.Function1[/* text */ String, ValueType]] = js.undefined
  
  var step: js.UndefOr[ValueType] = js.undefined
}
object Digits {
  
  inline def apply[ValueType](): Digits[ValueType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Digits[ValueType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Digits[?], ValueType] (val x: Self & Digits[ValueType]) extends AnyVal {
    
    inline def setDigits(value: Double): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
    
    inline def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFormatter(value: /* value */ js.UndefOr[ValueType] => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setInputReadOnly(value: Boolean): Self = StObject.set(x, "inputReadOnly", value.asInstanceOf[js.Any])
    
    inline def setInputReadOnlyUndefined: Self = StObject.set(x, "inputReadOnly", js.undefined)
    
    inline def setMax(value: ValueType): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: ValueType): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setParser(value: /* text */ String => ValueType): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
    
    inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    
    inline def setStep(value: ValueType): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
