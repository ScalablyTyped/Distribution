package typings.awsLambda.triggerLexV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexV2SentimentScore extends StObject {
  
  var mixed: Double
  
  var negative: Double
  
  var neutral: Double
  
  var positive: Double
}
object LexV2SentimentScore {
  
  inline def apply(mixed: Double, negative: Double, neutral: Double, positive: Double): LexV2SentimentScore = {
    val __obj = js.Dynamic.literal(mixed = mixed.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], neutral = neutral.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexV2SentimentScore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LexV2SentimentScore] (val x: Self) extends AnyVal {
    
    inline def setMixed(value: Double): Self = StObject.set(x, "mixed", value.asInstanceOf[js.Any])
    
    inline def setNegative(value: Double): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    inline def setNeutral(value: Double): Self = StObject.set(x, "neutral", value.asInstanceOf[js.Any])
    
    inline def setPositive(value: Double): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
  }
}
