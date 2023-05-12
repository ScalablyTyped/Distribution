package typings.angularForms.anon

import typings.angularForms.angularFormsBooleans.`false`
import typings.angularForms.angularFormsStrings.ngModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var alias: ngModel
  
  var required: `false`
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal(alias = "ngModel", required = false)
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: ngModel): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: `false`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
