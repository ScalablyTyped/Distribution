package typings.actionsOnGoogle.distServiceDialogflowApiV1Mod

import typings.actionsOnGoogle.actionsOnGoogleStrings.basic_card
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1MessageBasicCard
  extends StObject
     with DialogflowV1BaseGoogleMessage[basic_card]
     with DialogflowV1Message {
  
  var buttons: js.UndefOr[js.Array[DialogflowV1MessageBasicCardButton]] = js.undefined
  
  var formattedText: js.UndefOr[String] = js.undefined
  
  var image: js.UndefOr[DialogflowV1MessageImage] = js.undefined
  
  var subtitle: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object DialogflowV1MessageBasicCard {
  
  inline def apply(): DialogflowV1MessageBasicCard = {
    val __obj = js.Dynamic.literal(platform = "google")
    __obj.asInstanceOf[DialogflowV1MessageBasicCard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogflowV1MessageBasicCard] (val x: Self) extends AnyVal {
    
    inline def setButtons(value: js.Array[DialogflowV1MessageBasicCardButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: DialogflowV1MessageBasicCardButton*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setFormattedText(value: String): Self = StObject.set(x, "formattedText", value.asInstanceOf[js.Any])
    
    inline def setFormattedTextUndefined: Self = StObject.set(x, "formattedText", js.undefined)
    
    inline def setImage(value: DialogflowV1MessageImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
