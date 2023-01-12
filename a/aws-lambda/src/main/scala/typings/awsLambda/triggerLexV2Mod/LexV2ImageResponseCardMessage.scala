package typings.awsLambda.triggerLexV2Mod

import typings.awsLambda.awsLambdaStrings.ImageResponseCard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexV2ImageResponseCardMessage
  extends StObject
     with LexV2Message {
  
  var contentType: ImageResponseCard
  
  var imageResponseCard: LexV2ImageResponseCard
}
object LexV2ImageResponseCardMessage {
  
  inline def apply(imageResponseCard: LexV2ImageResponseCard): LexV2ImageResponseCardMessage = {
    val __obj = js.Dynamic.literal(contentType = "ImageResponseCard", imageResponseCard = imageResponseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexV2ImageResponseCardMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LexV2ImageResponseCardMessage] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: ImageResponseCard): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setImageResponseCard(value: LexV2ImageResponseCard): Self = StObject.set(x, "imageResponseCard", value.asInstanceOf[js.Any])
  }
}
