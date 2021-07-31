package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2RawInput extends StObject {
  
  /**
    * Indicates how the user provided this input: a typed response, a voice
    * response, unspecified, etc.
    */
  var inputType: js.UndefOr[GoogleActionsV2RawInputInputType] = js.undefined
  
  /**
    * Typed or spoken input from the end user.
    */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * The triggering URL.
    */
  var url: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2RawInput {
  
  @scala.inline
  def apply(): GoogleActionsV2RawInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2RawInput]
  }
  
  @scala.inline
  implicit class GoogleActionsV2RawInputMutableBuilder[Self <: GoogleActionsV2RawInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputType(value: GoogleActionsV2RawInputInputType): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
