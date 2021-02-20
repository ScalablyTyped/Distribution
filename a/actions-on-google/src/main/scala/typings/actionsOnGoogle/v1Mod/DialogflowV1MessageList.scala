package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.actionsOnGoogleStrings.google
import typings.actionsOnGoogle.actionsOnGoogleStrings.list_card
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1MessageList
  extends DialogflowV1BaseGoogleMessage[list_card]
     with DialogflowV1Message {
  
  var items: js.UndefOr[js.Array[DialogflowV1MessageOptionItem]] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object DialogflowV1MessageList {
  
  @scala.inline
  def apply(platform: google): DialogflowV1MessageList = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageList]
  }
  
  @scala.inline
  implicit class DialogflowV1MessageListMutableBuilder[Self <: DialogflowV1MessageList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[DialogflowV1MessageOptionItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: DialogflowV1MessageOptionItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
