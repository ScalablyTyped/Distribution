package typings.awsLambda.lexV2Mod

import typings.awsLambda.awsLambdaStrings.CustomPayload
import typings.awsLambda.awsLambdaStrings.PlainText_
import typings.awsLambda.awsLambdaStrings.SSML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.awsLambda.lexV2Mod.LexV2ContentMessage
  - typings.awsLambda.lexV2Mod.LexV2ImageResponseCardMessage
*/
trait LexV2Message extends StObject
object LexV2Message {
  
  inline def LexV2ContentMessage(content: String, contentType: CustomPayload | PlainText_ | SSML): typings.awsLambda.lexV2Mod.LexV2ContentMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.awsLambda.lexV2Mod.LexV2ContentMessage]
  }
  
  inline def LexV2ImageResponseCardMessage(imageResponseCard: LexV2ImageResponseCard): typings.awsLambda.lexV2Mod.LexV2ImageResponseCardMessage = {
    val __obj = js.Dynamic.literal(contentType = "ImageResponseCard", imageResponseCard = imageResponseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.awsLambda.lexV2Mod.LexV2ImageResponseCardMessage]
  }
}
