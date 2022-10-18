package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectSentimentResponse extends StObject {
  
  /**
    * The inferred sentiment that Amazon Comprehend has the highest level of confidence in.
    */
  var Sentiment: js.UndefOr[SentimentType] = js.undefined
  
  /**
    * An object that lists the sentiments, and their corresponding confidence levels.
    */
  var SentimentScore: js.UndefOr[typings.awsSdk.clientsComprehendMod.SentimentScore] = js.undefined
}
object DetectSentimentResponse {
  
  inline def apply(): DetectSentimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectSentimentResponse]
  }
  
  extension [Self <: DetectSentimentResponse](x: Self) {
    
    inline def setSentiment(value: SentimentType): Self = StObject.set(x, "Sentiment", value.asInstanceOf[js.Any])
    
    inline def setSentimentScore(value: SentimentScore): Self = StObject.set(x, "SentimentScore", value.asInstanceOf[js.Any])
    
    inline def setSentimentScoreUndefined: Self = StObject.set(x, "SentimentScore", js.undefined)
    
    inline def setSentimentUndefined: Self = StObject.set(x, "Sentiment", js.undefined)
  }
}
