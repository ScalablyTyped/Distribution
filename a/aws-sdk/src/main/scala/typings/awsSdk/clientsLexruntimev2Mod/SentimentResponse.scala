package typings.awsSdk.clientsLexruntimev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SentimentResponse extends StObject {
  
  /**
    * The overall sentiment expressed in the user's response. This is the sentiment most likely expressed by the user based on the analysis by Amazon Comprehend.
    */
  var sentiment: js.UndefOr[SentimentType] = js.undefined
  
  var sentimentScore: js.UndefOr[SentimentScore] = js.undefined
}
object SentimentResponse {
  
  inline def apply(): SentimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SentimentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SentimentResponse] (val x: Self) extends AnyVal {
    
    inline def setSentiment(value: SentimentType): Self = StObject.set(x, "sentiment", value.asInstanceOf[js.Any])
    
    inline def setSentimentScore(value: SentimentScore): Self = StObject.set(x, "sentimentScore", value.asInstanceOf[js.Any])
    
    inline def setSentimentScoreUndefined: Self = StObject.set(x, "sentimentScore", js.undefined)
    
    inline def setSentimentUndefined: Self = StObject.set(x, "sentiment", js.undefined)
  }
}
