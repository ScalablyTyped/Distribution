package typings.actionsOnGoogle.v1Mod

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
  
  extension [Self <: DialogflowV1MessageSuggestion](x: Self) {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
