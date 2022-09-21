package typings.awsLambda.lexV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexV2Interpretation extends StObject {
  
  var intent: LexV2Intent
  
  var nluConfidence: js.UndefOr[Double] = js.undefined
  
  var sentimentResponse: js.UndefOr[LexV2SentimentResponse] = js.undefined
}
object LexV2Interpretation {
  
  inline def apply(intent: LexV2Intent): LexV2Interpretation = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexV2Interpretation]
  }
  
  extension [Self <: LexV2Interpretation](x: Self) {
    
    inline def setIntent(value: LexV2Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setNluConfidence(value: Double): Self = StObject.set(x, "nluConfidence", value.asInstanceOf[js.Any])
    
    inline def setNluConfidenceUndefined: Self = StObject.set(x, "nluConfidence", js.undefined)
    
    inline def setSentimentResponse(value: LexV2SentimentResponse): Self = StObject.set(x, "sentimentResponse", value.asInstanceOf[js.Any])
    
    inline def setSentimentResponseUndefined: Self = StObject.set(x, "sentimentResponse", js.undefined)
  }
}
