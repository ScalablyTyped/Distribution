package typings.awsSdk.clientsLexruntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntentConfidence extends StObject {
  
  /**
    * A score that indicates how confident Amazon Lex is that an intent satisfies the user's intent. Ranges between 0.00 and 1.00. Higher scores indicate higher confidence.
    */
  var score: js.UndefOr[Double] = js.undefined
}
object IntentConfidence {
  
  inline def apply(): IntentConfidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntentConfidence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntentConfidence] (val x: Self) extends AnyVal {
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
