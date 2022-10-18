package typings.actionsOnGoogle.distServiceDialogflowApiV1Mod

import typings.actionsOnGoogle.actionsOnGoogleStrings.list_card
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1MessageList
  extends StObject
     with DialogflowV1BaseGoogleMessage[list_card]
     with DialogflowV1Message {
  
  var items: js.UndefOr[js.Array[DialogflowV1MessageOptionItem]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object DialogflowV1MessageList {
  
  inline def apply(): DialogflowV1MessageList = {
    val __obj = js.Dynamic.literal(platform = "google")
    __obj.asInstanceOf[DialogflowV1MessageList]
  }
  
  extension [Self <: DialogflowV1MessageList](x: Self) {
    
    inline def setItems(value: js.Array[DialogflowV1MessageOptionItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: DialogflowV1MessageOptionItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
