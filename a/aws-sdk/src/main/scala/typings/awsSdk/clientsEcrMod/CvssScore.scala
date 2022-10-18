package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CvssScore extends StObject {
  
  /**
    * The base CVSS score used for the finding.
    */
  var baseScore: js.UndefOr[BaseScore] = js.undefined
  
  /**
    * The vector string of the CVSS score.
    */
  var scoringVector: js.UndefOr[ScoringVector] = js.undefined
  
  /**
    * The source of the CVSS score.
    */
  var source: js.UndefOr[Source] = js.undefined
  
  /**
    * The version of CVSS used for the score.
    */
  var version: js.UndefOr[Version] = js.undefined
}
object CvssScore {
  
  inline def apply(): CvssScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CvssScore]
  }
  
  extension [Self <: CvssScore](x: Self) {
    
    inline def setBaseScore(value: BaseScore): Self = StObject.set(x, "baseScore", value.asInstanceOf[js.Any])
    
    inline def setBaseScoreUndefined: Self = StObject.set(x, "baseScore", js.undefined)
    
    inline def setScoringVector(value: ScoringVector): Self = StObject.set(x, "scoringVector", value.asInstanceOf[js.Any])
    
    inline def setScoringVectorUndefined: Self = StObject.set(x, "scoringVector", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
