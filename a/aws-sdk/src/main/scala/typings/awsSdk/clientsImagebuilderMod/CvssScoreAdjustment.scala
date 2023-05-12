package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CvssScoreAdjustment extends StObject {
  
  /**
    * The metric that Amazon Inspector used to adjust the CVSS score.
    */
  var metric: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The reason for the CVSS score adjustment.
    */
  var reason: js.UndefOr[NonEmptyString] = js.undefined
}
object CvssScoreAdjustment {
  
  inline def apply(): CvssScoreAdjustment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CvssScoreAdjustment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CvssScoreAdjustment] (val x: Self) extends AnyVal {
    
    inline def setMetric(value: NonEmptyString): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setReason(value: NonEmptyString): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
