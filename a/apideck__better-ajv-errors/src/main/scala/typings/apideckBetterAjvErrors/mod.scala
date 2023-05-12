package typings.apideckBetterAjvErrors

import typings.ajv.distTypesMod.ErrorObject
import typings.apideckBetterAjvErrors.distTypesValidationErrorMod.ValidationError
import typings.jsonSchema.mod.JSONSchema6
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@apideck/better-ajv-errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def betterAjvErrors(param0: BetterAjvErrorsOptions): js.Array[ValidationError] = ^.asInstanceOf[js.Dynamic].applyDynamic("betterAjvErrors")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[ValidationError]]
  
  trait BetterAjvErrorsOptions extends StObject {
    
    var basePath: js.UndefOr[String] = js.undefined
    
    var data: Any
    
    var errors: js.UndefOr[(js.Array[ErrorObject[String, Record[String, Any], Any]]) | Null] = js.undefined
    
    var schema: JSONSchema6
  }
  object BetterAjvErrorsOptions {
    
    inline def apply(data: Any, schema: JSONSchema6): BetterAjvErrorsOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[BetterAjvErrorsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BetterAjvErrorsOptions] (val x: Self) extends AnyVal {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[ErrorObject[String, Record[String, Any], Any]]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsNull: Self = StObject.set(x, "errors", null)
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: (ErrorObject[String, Record[String, Any], Any])*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setSchema(value: JSONSchema6): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    }
  }
}
