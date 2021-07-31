package typings.ajv.mod

import typings.ajv.ajvStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberFormatDefinition
  extends StObject
     with FormatDefinition {
  
  var async: js.UndefOr[Boolean] = js.undefined
  
  var compare: js.UndefOr[js.Function2[/* data1 */ Double, /* data2 */ Double, Double]] = js.undefined
  
  var `type`: number
  
  def validate(data: Double): Boolean | js.Thenable[js.Any]
  @JSName("validate")
  var validate_Original: NumberFormatValidator
}
object NumberFormatDefinition {
  
  @scala.inline
  def apply(validate: /* data */ Double => Boolean | js.Thenable[js.Any]): NumberFormatDefinition = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[NumberFormatDefinition]
  }
  
  @scala.inline
  implicit class NumberFormatDefinitionMutableBuilder[Self <: NumberFormatDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    @scala.inline
    def setCompare(value: (/* data1 */ Double, /* data2 */ Double) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
    
    @scala.inline
    def setType(value: number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate(value: /* data */ Double => Boolean | js.Thenable[js.Any]): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
  }
}
