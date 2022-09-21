package typings.awsLambda.lexV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexV2ImageResponseCard extends StObject {
  
  var buttons: js.UndefOr[js.Array[LexV2ImageResponseCardButton]] = js.undefined
  
  var imageUrl: js.UndefOr[String] = js.undefined
  
  var subtitle: js.UndefOr[String] = js.undefined
  
  var title: String
}
object LexV2ImageResponseCard {
  
  inline def apply(title: String): LexV2ImageResponseCard = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexV2ImageResponseCard]
  }
  
  extension [Self <: LexV2ImageResponseCard](x: Self) {
    
    inline def setButtons(value: js.Array[LexV2ImageResponseCardButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: LexV2ImageResponseCardButton*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
