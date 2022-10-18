package typings.ajv.distTypesMod

import typings.ajv.ajvBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncFormatDefinition[T /* <: String | Double */] extends StObject {
  
  var async: `true`
  
  var compare: js.UndefOr[FormatCompare[T]] = js.undefined
  
  var `type`: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends string ? 'string' | undefined : 'number' */ js.Any
  ] = js.undefined
  
  def validate(data: T): js.Promise[Boolean]
  @JSName("validate")
  var validate_Original: AsyncFormatValidator[T]
}
object AsyncFormatDefinition {
  
  inline def apply[T /* <: String | Double */](validate: T => js.Promise[Boolean]): AsyncFormatDefinition[T] = {
    val __obj = js.Dynamic.literal(async = true, validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[AsyncFormatDefinition[T]]
  }
  
  extension [Self <: AsyncFormatDefinition[?], T /* <: String | Double */](x: Self & AsyncFormatDefinition[T]) {
    
    inline def setAsync(value: `true`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setCompare(value: (T, T) => js.UndefOr[Double]): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    
    inline def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
    
    inline def setType(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends string ? 'string' | undefined : 'number' */ js.Any
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValidate(value: T => js.Promise[Boolean]): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
  }
}
