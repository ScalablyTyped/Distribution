package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CvssScore extends StObject {
  
  /**
    * The base CVSS score used for the finding.
    */
  var baseScore: Double
  
  /**
    * The vector string of the CVSS score.
    */
  var scoringVector: NonEmptyString
  
  /**
    * The source of the CVSS score.
    */
  var source: NonEmptyString
  
  /**
    * The version of CVSS used for the score.
    */
  var version: NonEmptyString
}
object CvssScore {
  
  inline def apply(baseScore: Double, scoringVector: NonEmptyString, source: NonEmptyString, version: NonEmptyString): CvssScore = {
    val __obj = js.Dynamic.literal(baseScore = baseScore.asInstanceOf[js.Any], scoringVector = scoringVector.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CvssScore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CvssScore] (val x: Self) extends AnyVal {
    
    inline def setBaseScore(value: Double): Self = StObject.set(x, "baseScore", value.asInstanceOf[js.Any])
    
    inline def setScoringVector(value: NonEmptyString): Self = StObject.set(x, "scoringVector", value.asInstanceOf[js.Any])
    
    inline def setSource(value: NonEmptyString): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: NonEmptyString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
