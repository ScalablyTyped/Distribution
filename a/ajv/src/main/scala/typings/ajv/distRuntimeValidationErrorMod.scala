package typings.ajv

import typings.ajv.ajvBooleans.`true`
import typings.ajv.anon.PartialErrorObjectstringR
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRuntimeValidationErrorMod {
  
  @JSImport("ajv/dist/runtime/validation_error", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ValidationError {
    def this(errors: js.Array[PartialErrorObjectstringR]) = this()
    
    /* CompleteClass */
    override val ajv: `true` = js.native
    
    /* CompleteClass */
    override val errors: js.Array[PartialErrorObjectstringR] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override val validation: `true` = js.native
  }
  
  trait ValidationError
    extends StObject
       with Error {
    
    val ajv: `true`
    
    val errors: js.Array[PartialErrorObjectstringR]
    
    val validation: `true`
  }
  object ValidationError {
    
    inline def apply(errors: js.Array[PartialErrorObjectstringR], message: String, name: String): ValidationError = {
      val __obj = js.Dynamic.literal(ajv = true, errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], validation = true)
      __obj.asInstanceOf[ValidationError]
    }
    
    extension [Self <: ValidationError](x: Self) {
      
      inline def setAjv(value: `true`): Self = StObject.set(x, "ajv", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[PartialErrorObjectstringR]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: PartialErrorObjectstringR*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setValidation(value: `true`): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    }
  }
}
