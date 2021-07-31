package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.actionsOnGoogleNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1MessageCard
  extends StObject
     with DialogflowV1BaseMessage[`1`]
     with DialogflowV1Message {
  
  var buttons: js.UndefOr[js.Array[DialogflowV1Button]] = js.undefined
  
  var imageUrl: js.UndefOr[String] = js.undefined
  
  var subtitle: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object DialogflowV1MessageCard {
  
  @scala.inline
  def apply(): DialogflowV1MessageCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1MessageCard]
  }
  
  @scala.inline
  implicit class DialogflowV1MessageCardMutableBuilder[Self <: DialogflowV1MessageCard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Array[DialogflowV1Button]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: DialogflowV1Button*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
