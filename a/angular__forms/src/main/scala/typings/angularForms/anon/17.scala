package typings.angularForms.anon

import typings.angularForms.angularFormsBooleans.`false`
import typings.angularForms.angularFormsStrings.pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17` extends StObject {
  
  var alias: pattern
  
  var required: `false`
}
object `17` {
  
  inline def apply(): `17` = {
    val __obj = js.Dynamic.literal(alias = "pattern", required = false)
    __obj.asInstanceOf[`17`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `17`] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: pattern): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: `false`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
