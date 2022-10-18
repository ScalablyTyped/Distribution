package typings.awsLambda.triggerLexV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexV2SentimentResponse extends StObject {
  
  var sentiment: String
  
  var sentimentScore: LexV2SentimentScore
}
object LexV2SentimentResponse {
  
  inline def apply(sentiment: String, sentimentScore: LexV2SentimentScore): LexV2SentimentResponse = {
    val __obj = js.Dynamic.literal(sentiment = sentiment.asInstanceOf[js.Any], sentimentScore = sentimentScore.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexV2SentimentResponse]
  }
  
  extension [Self <: LexV2SentimentResponse](x: Self) {
    
    inline def setSentiment(value: String): Self = StObject.set(x, "sentiment", value.asInstanceOf[js.Any])
    
    inline def setSentimentScore(value: LexV2SentimentScore): Self = StObject.set(x, "sentimentScore", value.asInstanceOf[js.Any])
  }
}
