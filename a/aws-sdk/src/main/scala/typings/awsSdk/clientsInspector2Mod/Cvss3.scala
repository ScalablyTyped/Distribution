package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cvss3 extends StObject {
  
  /**
    * The CVSS v3 base score for the vulnerability.
    */
  var baseScore: js.UndefOr[Cvss3BaseScore] = js.undefined
  
  /**
    * The scoring vector associated with the CVSS v3 score.
    */
  var scoringVector: js.UndefOr[Cvss3ScoringVector] = js.undefined
}
object Cvss3 {
  
  inline def apply(): Cvss3 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cvss3]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cvss3] (val x: Self) extends AnyVal {
    
    inline def setBaseScore(value: Cvss3BaseScore): Self = StObject.set(x, "baseScore", value.asInstanceOf[js.Any])
    
    inline def setBaseScoreUndefined: Self = StObject.set(x, "baseScore", js.undefined)
    
    inline def setScoringVector(value: Cvss3ScoringVector): Self = StObject.set(x, "scoringVector", value.asInstanceOf[js.Any])
    
    inline def setScoringVectorUndefined: Self = StObject.set(x, "scoringVector", js.undefined)
  }
}
