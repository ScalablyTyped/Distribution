package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAnomalyDetectorResponse extends StObject {
  
  /**
    * The ARN of the updated detector.
    */
  var AnomalyDetectorArn: js.UndefOr[Arn] = js.undefined
}
object UpdateAnomalyDetectorResponse {
  
  inline def apply(): UpdateAnomalyDetectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAnomalyDetectorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAnomalyDetectorResponse] (val x: Self) extends AnyVal {
    
    inline def setAnomalyDetectorArn(value: Arn): Self = StObject.set(x, "AnomalyDetectorArn", value.asInstanceOf[js.Any])
    
    inline def setAnomalyDetectorArnUndefined: Self = StObject.set(x, "AnomalyDetectorArn", js.undefined)
  }
}
