package typings.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Required extends StObject {
  
  var alias: String | Null
  
  var required: Boolean
}
object Required {
  
  inline def apply(required: Boolean): Required = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any], alias = null)
    __obj.asInstanceOf[Required]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Required] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasNull: Self = StObject.set(x, "alias", null)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
