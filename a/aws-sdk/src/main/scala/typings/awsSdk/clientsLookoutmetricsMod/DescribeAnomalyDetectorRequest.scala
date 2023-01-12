package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAnomalyDetectorRequest extends StObject {
  
  /**
    * The ARN of the detector to describe.
    */
  var AnomalyDetectorArn: Arn
}
object DescribeAnomalyDetectorRequest {
  
  inline def apply(AnomalyDetectorArn: Arn): DescribeAnomalyDetectorRequest = {
    val __obj = js.Dynamic.literal(AnomalyDetectorArn = AnomalyDetectorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAnomalyDetectorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAnomalyDetectorRequest] (val x: Self) extends AnyVal {
    
    inline def setAnomalyDetectorArn(value: Arn): Self = StObject.set(x, "AnomalyDetectorArn", value.asInstanceOf[js.Any])
  }
}
