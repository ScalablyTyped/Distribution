package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CvssScoreDetails extends StObject {
  
  /**
    * An object that contains details about an adjustment that Amazon Inspector made to the CVSS score for the finding.
    */
  var adjustments: js.UndefOr[CvssScoreAdjustmentList] = js.undefined
  
  /**
    * The source of the finding.
    */
  var cvssSource: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The CVSS score.
    */
  var score: js.UndefOr[NonNegativeDouble] = js.undefined
  
  /**
    * The source for the CVSS score.
    */
  var scoreSource: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A vector that measures the severity of the vulnerability.
    */
  var scoringVector: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The CVSS version that generated the score.
    */
  var version: js.UndefOr[NonEmptyString] = js.undefined
}
object CvssScoreDetails {
  
  inline def apply(): CvssScoreDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CvssScoreDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CvssScoreDetails] (val x: Self) extends AnyVal {
    
    inline def setAdjustments(value: CvssScoreAdjustmentList): Self = StObject.set(x, "adjustments", value.asInstanceOf[js.Any])
    
    inline def setAdjustmentsUndefined: Self = StObject.set(x, "adjustments", js.undefined)
    
    inline def setAdjustmentsVarargs(value: CvssScoreAdjustment*): Self = StObject.set(x, "adjustments", js.Array(value*))
    
    inline def setCvssSource(value: NonEmptyString): Self = StObject.set(x, "cvssSource", value.asInstanceOf[js.Any])
    
    inline def setCvssSourceUndefined: Self = StObject.set(x, "cvssSource", js.undefined)
    
    inline def setScore(value: NonNegativeDouble): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreSource(value: NonEmptyString): Self = StObject.set(x, "scoreSource", value.asInstanceOf[js.Any])
    
    inline def setScoreSourceUndefined: Self = StObject.set(x, "scoreSource", js.undefined)
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setScoringVector(value: NonEmptyString): Self = StObject.set(x, "scoringVector", value.asInstanceOf[js.Any])
    
    inline def setScoringVectorUndefined: Self = StObject.set(x, "scoringVector", js.undefined)
    
    inline def setVersion(value: NonEmptyString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
