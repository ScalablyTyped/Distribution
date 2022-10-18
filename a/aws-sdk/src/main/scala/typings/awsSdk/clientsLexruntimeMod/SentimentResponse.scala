package typings.awsSdk.clientsLexruntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SentimentResponse extends StObject {
  
  /**
    * The inferred sentiment that Amazon Comprehend has the highest confidence in.
    */
  var sentimentLabel: js.UndefOr[SentimentLabel] = js.undefined
  
  /**
    * The likelihood that the sentiment was correctly inferred.
    */
  var sentimentScore: js.UndefOr[SentimentScore] = js.undefined
}
object SentimentResponse {
  
  inline def apply(): SentimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SentimentResponse]
  }
  
  extension [Self <: SentimentResponse](x: Self) {
    
    inline def setSentimentLabel(value: SentimentLabel): Self = StObject.set(x, "sentimentLabel", value.asInstanceOf[js.Any])
    
    inline def setSentimentLabelUndefined: Self = StObject.set(x, "sentimentLabel", js.undefined)
    
    inline def setSentimentScore(value: SentimentScore): Self = StObject.set(x, "sentimentScore", value.asInstanceOf[js.Any])
    
    inline def setSentimentScoreUndefined: Self = StObject.set(x, "sentimentScore", js.undefined)
  }
}
