package typings.awsLambda.lexV2Mod

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
  
  extension [Self <: LexV2ImageResponseCardMessage](x: Self) {
    
    inline def setContentType(value: ImageResponseCard): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setImageResponseCard(value: LexV2ImageResponseCard): Self = StObject.set(x, "imageResponseCard", value.asInstanceOf[js.Any])
  }
}
