package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAutoPredictorRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the predictor.
    */
  var PredictorArn: Arn
}
object DescribeAutoPredictorRequest {
  
  inline def apply(PredictorArn: Arn): DescribeAutoPredictorRequest = {
    val __obj = js.Dynamic.literal(PredictorArn = PredictorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAutoPredictorRequest]
  }
  
  extension [Self <: DescribeAutoPredictorRequest](x: Self) {
    
    inline def setPredictorArn(value: Arn): Self = StObject.set(x, "PredictorArn", value.asInstanceOf[js.Any])
  }
}
