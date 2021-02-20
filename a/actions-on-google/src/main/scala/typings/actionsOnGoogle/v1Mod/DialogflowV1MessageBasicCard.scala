package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.actionsOnGoogleStrings.basic_card
import typings.actionsOnGoogle.actionsOnGoogleStrings.google
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1MessageBasicCard
  extends DialogflowV1BaseGoogleMessage[basic_card]
     with DialogflowV1Message {
  
  var buttons: js.UndefOr[js.Array[DialogflowV1MessageBasicCardButton]] = js.native
  
  var formattedText: js.UndefOr[String] = js.native
  
  var image: js.UndefOr[DialogflowV1MessageImage] = js.native
  
  var subtitle: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object DialogflowV1MessageBasicCard {
  
  @scala.inline
  def apply(platform: google): DialogflowV1MessageBasicCard = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageBasicCard]
  }
  
  @scala.inline
  implicit class DialogflowV1MessageBasicCardMutableBuilder[Self <: DialogflowV1MessageBasicCard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Array[DialogflowV1MessageBasicCardButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: DialogflowV1MessageBasicCardButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setFormattedText(value: String): Self = StObject.set(x, "formattedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedTextUndefined: Self = StObject.set(x, "formattedText", js.undefined)
    
    @scala.inline
    def setImage(value: DialogflowV1MessageImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
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
