package typings.ajv.anon

import typings.ajv.distVocabulariesJtdPropertiesMod.PropError.Missing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MissingProperty extends StObject {
  
  var error: Missing
  
  var missingProperty: String
}
object MissingProperty {
  
  inline def apply(error: Missing, missingProperty: String): MissingProperty = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], missingProperty = missingProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissingProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MissingProperty] (val x: Self) extends AnyVal {
    
    inline def setError(value: Missing): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setMissingProperty(value: String): Self = StObject.set(x, "missingProperty", value.asInstanceOf[js.Any])
  }
}
