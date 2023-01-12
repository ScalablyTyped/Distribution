package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAnomalyDetectorRequest extends StObject {
  
  /**
    * The ARN of the detector to delete.
    */
  var AnomalyDetectorArn: Arn
}
object DeleteAnomalyDetectorRequest {
  
  inline def apply(AnomalyDetectorArn: Arn): DeleteAnomalyDetectorRequest = {
    val __obj = js.Dynamic.literal(AnomalyDetectorArn = AnomalyDetectorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnomalyDetectorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAnomalyDetectorRequest] (val x: Self) extends AnyVal {
    
    inline def setAnomalyDetectorArn(value: Arn): Self = StObject.set(x, "AnomalyDetectorArn", value.asInstanceOf[js.Any])
  }
}
