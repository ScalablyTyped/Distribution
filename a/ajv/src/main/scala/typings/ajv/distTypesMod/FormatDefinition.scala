package typings.ajv.distTypesMod

import typings.ajv.ajvBooleans.`false`
import typings.ajv.ajvStrings.number
import typings.ajv.ajvStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatDefinition[T /* <: String | Double */] extends StObject {
  
  var async: js.UndefOr[`false`] = js.undefined
  
  var compare: js.UndefOr[FormatCompare[T]] = js.undefined
  
  var `type`: js.UndefOr[number | string] = js.undefined
  
  var validate: FormatValidator[T] | String | js.RegExp
}
object FormatDefinition {
  
  inline def apply[T /* <: String | Double */](validate: FormatValidator[T] | String | js.RegExp): FormatDefinition[T] = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatDefinition[T]]
  }
  
  extension [Self <: FormatDefinition[?], T /* <: String | Double */](x: Self & FormatDefinition[T]) {
    
    inline def setAsync(value: `false`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setCompare(value: (T, T) => js.UndefOr[Double]): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    
    inline def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
    
    inline def setType(value: number | string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValidate(value: FormatValidator[T] | String | js.RegExp): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateFunction1(value: T => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
  }
}
