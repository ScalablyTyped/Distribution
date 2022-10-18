package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeactivateAnomalyDetectorRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the anomaly detector.
    */
  var AnomalyDetectorArn: Arn
}
object DeactivateAnomalyDetectorRequest {
  
  inline def apply(AnomalyDetectorArn: Arn): DeactivateAnomalyDetectorRequest = {
    val __obj = js.Dynamic.literal(AnomalyDetectorArn = AnomalyDetectorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeactivateAnomalyDetectorRequest]
  }
  
  extension [Self <: DeactivateAnomalyDetectorRequest](x: Self) {
    
    inline def setAnomalyDetectorArn(value: Arn): Self = StObject.set(x, "AnomalyDetectorArn", value.asInstanceOf[js.Any])
  }
}
