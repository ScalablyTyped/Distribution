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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ARIAPropertyDefinition extends StObject {
  
  var allowundefined: js.UndefOr[Boolean] = js.native
  
  var `type`: string | id | idlist | integer | number | boolean | token | tokenlist | tristate = js.native
  
  var value: js.UndefOr[js.Array[String | Boolean]] = js.native
}
object ARIAPropertyDefinition {
  
  @scala.inline
  def apply(`type`: string | id | idlist | integer | number | boolean | token | tokenlist | tristate): ARIAPropertyDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIAPropertyDefinition]
  }
  
  @scala.inline
  implicit class ARIAPropertyDefinitionMutableBuilder[Self <: ARIAPropertyDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowundefined(value: Boolean): Self = StObject.set(x, "allowundefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowundefinedUndefined: Self = StObject.set(x, "allowundefined", js.undefined)
    
    @scala.inline
    def setType(value: string | id | idlist | integer | number | boolean | token | tokenlist | tristate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[String | Boolean]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: (String | Boolean)*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
