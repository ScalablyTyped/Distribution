package typings.actionsOnGoogle.v1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1MessageSuggestion extends StObject {
  
  var title: js.UndefOr[String] = js.native
}
object DialogflowV1MessageSuggestion {
  
  @scala.inline
  def apply(): DialogflowV1MessageSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1MessageSuggestion]
  }
  
  @scala.inline
  implicit class DialogflowV1MessageSuggestionMutableBuilder[Self <: DialogflowV1MessageSuggestion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
