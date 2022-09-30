package typings.angularForms.anon

import typings.angularForms.angularFormsStrings.required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Required extends StObject {
  
  var required: typings.angularForms.angularFormsStrings.required
}
object Required {
  
  inline def apply(): Required = {
    val __obj = js.Dynamic.literal(required = "required")
    __obj.asInstanceOf[Required]
  }
  
  extension [Self <: Required](x: Self) {
    
    inline def setRequired(value: required): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
