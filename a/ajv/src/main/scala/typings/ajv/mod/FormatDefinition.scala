package typings.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ajv.mod.NumberFormatDefinition
  - typings.ajv.mod.StringFormatDefinition
*/
trait FormatDefinition extends StObject
object FormatDefinition {
  
  inline def NumberFormatDefinition(validate: /* data */ Double => Boolean | js.Thenable[js.Any]): typings.ajv.mod.NumberFormatDefinition = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[typings.ajv.mod.NumberFormatDefinition]
  }
  
  inline def StringFormatDefinition(validate: FormatValidator): typings.ajv.mod.StringFormatDefinition = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ajv.mod.StringFormatDefinition]
  }
}
