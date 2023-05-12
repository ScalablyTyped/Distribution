package typings.angularForms.anon

import typings.angularForms.angularFormsBooleans.`false`
import typings.angularForms.angularFormsStrings.compareWith
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19` extends StObject {
  
  var alias: compareWith
  
  var required: `false`
}
object `19` {
  
  inline def apply(): `19` = {
    val __obj = js.Dynamic.literal(alias = "compareWith", required = false)
    __obj.asInstanceOf[`19`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `19`] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: compareWith): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: `false`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
