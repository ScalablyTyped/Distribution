package typings.ajv.mod

import typings.ajv.ajvStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringFormatDefinition
  extends StObject
     with FormatDefinition {
  
  var async: js.UndefOr[Boolean] = js.undefined
  
  var compare: js.UndefOr[js.Function2[/* data1 */ String, /* data2 */ String, Double]] = js.undefined
  
  var `type`: js.UndefOr[string] = js.undefined
  
  var validate: FormatValidator
}
object StringFormatDefinition {
  
  inline def apply(validate: FormatValidator): StringFormatDefinition = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringFormatDefinition]
  }
  
  extension [Self <: StringFormatDefinition](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setCompare(value: (/* data1 */ String, /* data2 */ String) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    
    inline def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
    
    inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValidate(value: FormatValidator): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateFunction1(value: /* data */ String => Boolean | js.Thenable[js.Any]): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
  }
}
