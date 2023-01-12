package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutFeedbackRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the anomaly detector.
    */
  var AnomalyDetectorArn: Arn
  
  /**
    * Feedback for an anomalous metric.
    */
  var AnomalyGroupTimeSeriesFeedback: typings.awsSdk.clientsLookoutmetricsMod.AnomalyGroupTimeSeriesFeedback
}
object PutFeedbackRequest {
  
  inline def apply(AnomalyDetectorArn: Arn, AnomalyGroupTimeSeriesFeedback: AnomalyGroupTimeSeriesFeedback): PutFeedbackRequest = {
    val __obj = js.Dynamic.literal(AnomalyDetectorArn = AnomalyDetectorArn.asInstanceOf[js.Any], AnomalyGroupTimeSeriesFeedback = AnomalyGroupTimeSeriesFeedback.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutFeedbackRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutFeedbackRequest] (val x: Self) extends AnyVal {
    
    inline def setAnomalyDetectorArn(value: Arn): Self = StObject.set(x, "AnomalyDetectorArn", value.asInstanceOf[js.Any])
    
    inline def setAnomalyGroupTimeSeriesFeedback(value: AnomalyGroupTimeSeriesFeedback): Self = StObject.set(x, "AnomalyGroupTimeSeriesFeedback", value.asInstanceOf[js.Any])
  }
}
