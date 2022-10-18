package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CvssScoreAdjustment extends StObject {
  
  /**
    * The metric used to adjust the CVSS score.
    */
  var metric: NonEmptyString
  
  /**
    * The reason the CVSS score has been adjustment.
    */
  var reason: NonEmptyString
}
object CvssScoreAdjustment {
  
  inline def apply(metric: NonEmptyString, reason: NonEmptyString): CvssScoreAdjustment = {
    val __obj = js.Dynamic.literal(metric = metric.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[CvssScoreAdjustment]
  }
  
  extension [Self <: CvssScoreAdjustment](x: Self) {
    
    inline def setMetric(value: NonEmptyString): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setReason(value: NonEmptyString): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
