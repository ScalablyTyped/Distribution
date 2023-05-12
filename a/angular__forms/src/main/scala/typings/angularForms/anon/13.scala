package typings.angularForms.anon

import typings.angularForms.angularFormsBooleans.`false`
import typings.angularForms.angularFormsStrings.min
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  var alias: min
  
  var required: `false`
}
object `13` {
  
  inline def apply(): `13` = {
    val __obj = js.Dynamic.literal(alias = "min", required = false)
    __obj.asInstanceOf[`13`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `13`] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: min): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: `false`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
