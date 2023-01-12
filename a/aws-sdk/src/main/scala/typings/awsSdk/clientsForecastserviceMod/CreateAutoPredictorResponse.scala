package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAutoPredictorResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the predictor.
    */
  var PredictorArn: js.UndefOr[Arn] = js.undefined
}
object CreateAutoPredictorResponse {
  
  inline def apply(): CreateAutoPredictorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAutoPredictorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAutoPredictorResponse] (val x: Self) extends AnyVal {
    
    inline def setPredictorArn(value: Arn): Self = StObject.set(x, "PredictorArn", value.asInstanceOf[js.Any])
    
    inline def setPredictorArnUndefined: Self = StObject.set(x, "PredictorArn", js.undefined)
  }
}
