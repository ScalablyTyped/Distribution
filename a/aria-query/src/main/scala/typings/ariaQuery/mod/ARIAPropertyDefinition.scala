package typings.ariaQuery.mod

import typings.ariaQuery.ariaQueryStrings.boolean
import typings.ariaQuery.ariaQueryStrings.id
import typings.ariaQuery.ariaQueryStrings.idlist
import typings.ariaQuery.ariaQueryStrings.integer
import typings.ariaQuery.ariaQueryStrings.number
import typings.ariaQuery.ariaQueryStrings.string
import typings.ariaQuery.ariaQueryStrings.token
import typings.ariaQuery.ariaQueryStrings.tokenlist
import typings.ariaQuery.ariaQueryStrings.tristate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ARIAPropertyDefinition extends StObject {
  
  var allowundefined: js.UndefOr[Boolean] = js.undefined
  
  var `type`: string | id | idlist | integer | number | boolean | token | tokenlist | tristate
  
  var values: js.UndefOr[js.Array[String | Boolean]] = js.undefined
}
object ARIAPropertyDefinition {
  
  inline def apply(`type`: string | id | idlist | integer | number | boolean | token | tokenlist | tristate): ARIAPropertyDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIAPropertyDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ARIAPropertyDefinition] (val x: Self) extends AnyVal {
    
    inline def setAllowundefined(value: Boolean): Self = StObject.set(x, "allowundefined", value.asInstanceOf[js.Any])
    
    inline def setAllowundefinedUndefined: Self = StObject.set(x, "allowundefined", js.undefined)
    
    inline def setType(value: string | id | idlist | integer | number | boolean | token | tokenlist | tristate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[String | Boolean]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: (String | Boolean)*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
