package typings.angularForms.anon

import typings.angularForms.angularFormsBooleans.`false`
import typings.angularForms.angularFormsStrings.email
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alias extends StObject {
  
  var alias: email
  
  var required: `false`
}
object Alias {
  
  inline def apply(): Alias = {
    val __obj = js.Dynamic.literal(alias = "email", required = false)
    __obj.asInstanceOf[Alias]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Alias] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: email): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: `false`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
