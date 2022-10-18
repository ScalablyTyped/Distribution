package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAnomalyGroupRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the anomaly detector.
    */
  var AnomalyDetectorArn: Arn
  
  /**
    * The ID of the anomaly group.
    */
  var AnomalyGroupId: UUID
}
object GetAnomalyGroupRequest {
  
  inline def apply(AnomalyDetectorArn: Arn, AnomalyGroupId: UUID): GetAnomalyGroupRequest = {
    val __obj = js.Dynamic.literal(AnomalyDetectorArn = AnomalyDetectorArn.asInstanceOf[js.Any], AnomalyGroupId = AnomalyGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAnomalyGroupRequest]
  }
  
  extension [Self <: GetAnomalyGroupRequest](x: Self) {
    
    inline def setAnomalyDetectorArn(value: Arn): Self = StObject.set(x, "AnomalyDetectorArn", value.asInstanceOf[js.Any])
    
    inline def setAnomalyGroupId(value: UUID): Self = StObject.set(x, "AnomalyGroupId", value.asInstanceOf[js.Any])
  }
}
