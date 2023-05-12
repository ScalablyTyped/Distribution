package typings.angularForms.anon

import typings.angularForms.angularFormsBooleans.`false`
import typings.angularForms.angularFormsStrings.ngFormOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  var alias: ngFormOptions
  
  var required: `false`
}
object `9` {
  
  inline def apply(): `9` = {
    val __obj = js.Dynamic.literal(alias = "ngFormOptions", required = false)
    __obj.asInstanceOf[`9`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `9`] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: ngFormOptions): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: `false`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
