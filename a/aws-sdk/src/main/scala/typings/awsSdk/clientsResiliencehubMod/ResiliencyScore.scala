package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResiliencyScore extends StObject {
  
  /**
    * The disruption score for a valid key.
    */
  var disruptionScore: DisruptionResiliencyScore
  
  /**
    * The outage score for a valid key.
    */
  var score: Double
}
object ResiliencyScore {
  
  inline def apply(disruptionScore: DisruptionResiliencyScore, score: Double): ResiliencyScore = {
    val __obj = js.Dynamic.literal(disruptionScore = disruptionScore.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResiliencyScore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResiliencyScore] (val x: Self) extends AnyVal {
    
    inline def setDisruptionScore(value: DisruptionResiliencyScore): Self = StObject.set(x, "disruptionScore", value.asInstanceOf[js.Any])
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
  }
}
