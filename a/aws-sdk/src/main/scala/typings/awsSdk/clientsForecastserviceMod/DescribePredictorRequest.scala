package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePredictorRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the predictor that you want information about.
    */
  var PredictorArn: Arn
}
object DescribePredictorRequest {
  
  inline def apply(PredictorArn: Arn): DescribePredictorRequest = {
    val __obj = js.Dynamic.literal(PredictorArn = PredictorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePredictorRequest]
  }
  
  extension [Self <: DescribePredictorRequest](x: Self) {
    
    inline def setPredictorArn(value: Arn): Self = StObject.set(x, "PredictorArn", value.asInstanceOf[js.Any])
  }
}
