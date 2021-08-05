package typings.angularForms.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncValidator
  extends StObject
     with Validator
object AsyncValidator {
  
  inline def apply(validate: AbstractControl => ValidationErrors | Null): AsyncValidator = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[AsyncValidator]
  }
}
