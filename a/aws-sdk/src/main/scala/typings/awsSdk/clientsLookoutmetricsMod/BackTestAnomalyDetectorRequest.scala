package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackTestAnomalyDetectorRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the anomaly detector.
    */
  var AnomalyDetectorArn: Arn
}
object BackTestAnomalyDetectorRequest {
  
  inline def apply(AnomalyDetectorArn: Arn): BackTestAnomalyDetectorRequest = {
    val __obj = js.Dynamic.literal(AnomalyDetectorArn = AnomalyDetectorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackTestAnomalyDetectorRequest]
  }
  
  extension [Self <: BackTestAnomalyDetectorRequest](x: Self) {
    
    inline def setAnomalyDetectorArn(value: Arn): Self = StObject.set(x, "AnomalyDetectorArn", value.asInstanceOf[js.Any])
  }
}
