package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageResponseCard extends StObject {
  
  /**
    * A list of buttons that should be displayed on the response card. The arrangement of the buttons is determined by the platform that displays the button.
    */
  var buttons: js.UndefOr[ButtonsList] = js.undefined
  
  /**
    * The URL of an image to display on the response card. The image URL must be publicly available so that the platform displaying the response card has access to the image.
    */
  var imageUrl: js.UndefOr[AttachmentUrl] = js.undefined
  
  /**
    * The subtitle to display on the response card. The format of the subtitle is determined by the platform displaying the response card.
    */
  var subtitle: js.UndefOr[AttachmentTitle] = js.undefined
  
  /**
    * The title to display on the response card. The format of the title is determined by the platform displaying the response card.
    */
  var title: AttachmentTitle
}
object ImageResponseCard {
  
  inline def apply(title: AttachmentTitle): ImageResponseCard = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageResponseCard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageResponseCard] (val x: Self) extends AnyVal {
    
    inline def setButtons(value: ButtonsList): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: Button*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setImageUrl(value: AttachmentUrl): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setSubtitle(value: AttachmentTitle): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: AttachmentTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
