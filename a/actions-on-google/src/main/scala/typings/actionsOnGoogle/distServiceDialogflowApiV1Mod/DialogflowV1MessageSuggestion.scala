package typings.actionsOnGoogle.distServiceDialogflowApiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1MessageSuggestion extends StObject {
  
  var title: js.UndefOr[String] = js.undefined
}
object DialogflowV1MessageSuggestion {
  
  inline def apply(): DialogflowV1MessageSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1MessageSuggestion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogflowV1MessageSuggestion] (val x: Self) extends AnyVal {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
