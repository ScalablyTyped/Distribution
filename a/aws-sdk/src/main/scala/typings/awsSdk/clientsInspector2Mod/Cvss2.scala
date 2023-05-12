package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cvss2 extends StObject {
  
  /**
    * The CVSS v2 base score for the vulnerability.
    */
  var baseScore: js.UndefOr[Cvss2BaseScore] = js.undefined
  
  /**
    * The scoring vector associated with the CVSS v2 score.
    */
  var scoringVector: js.UndefOr[Cvss2ScoringVector] = js.undefined
}
object Cvss2 {
  
  inline def apply(): Cvss2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cvss2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cvss2] (val x: Self) extends AnyVal {
    
    inline def setBaseScore(value: Cvss2BaseScore): Self = StObject.set(x, "baseScore", value.asInstanceOf[js.Any])
    
    inline def setBaseScoreUndefined: Self = StObject.set(x, "baseScore", js.undefined)
    
    inline def setScoringVector(value: Cvss2ScoringVector): Self = StObject.set(x, "scoringVector", value.asInstanceOf[js.Any])
    
    inline def setScoringVectorUndefined: Self = StObject.set(x, "scoringVector", js.undefined)
  }
}
