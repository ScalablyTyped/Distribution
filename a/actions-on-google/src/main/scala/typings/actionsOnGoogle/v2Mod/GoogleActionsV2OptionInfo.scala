package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OptionInfo extends StObject {
  
  /**
    * A unique key that will be sent back to the agent if this response is given.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * A list of synonyms that can also be used to trigger this item in dialog.
    */
  var synonyms: js.UndefOr[js.Array[String]] = js.native
}
object GoogleActionsV2OptionInfo {
  
  @scala.inline
  def apply(): GoogleActionsV2OptionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OptionInfo]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OptionInfoMutableBuilder[Self <: GoogleActionsV2OptionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setSynonyms(value: js.Array[String]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
    
    @scala.inline
    def setSynonymsVarargs(value: String*): Self = StObject.set(x, "synonyms", js.Array(value :_*))
  }
}
