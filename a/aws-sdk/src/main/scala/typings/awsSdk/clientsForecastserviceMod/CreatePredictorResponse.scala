package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePredictorResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the predictor.
    */
  var PredictorArn: js.UndefOr[Arn] = js.undefined
}
object CreatePredictorResponse {
  
  inline def apply(): CreatePredictorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePredictorResponse]
  }
  
  extension [Self <: CreatePredictorResponse](x: Self) {
    
    inline def setPredictorArn(value: Arn): Self = StObject.set(x, "PredictorArn", value.asInstanceOf[js.Any])
    
    inline def setPredictorArnUndefined: Self = StObject.set(x, "PredictorArn", js.undefined)
  }
}
