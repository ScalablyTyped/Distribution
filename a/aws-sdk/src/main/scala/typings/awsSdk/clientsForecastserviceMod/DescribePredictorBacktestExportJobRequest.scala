package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePredictorBacktestExportJobRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the predictor backtest export job.
    */
  var PredictorBacktestExportJobArn: Arn
}
object DescribePredictorBacktestExportJobRequest {
  
  inline def apply(PredictorBacktestExportJobArn: Arn): DescribePredictorBacktestExportJobRequest = {
    val __obj = js.Dynamic.literal(PredictorBacktestExportJobArn = PredictorBacktestExportJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePredictorBacktestExportJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribePredictorBacktestExportJobRequest] (val x: Self) extends AnyVal {
    
    inline def setPredictorBacktestExportJobArn(value: Arn): Self = StObject.set(x, "PredictorBacktestExportJobArn", value.asInstanceOf[js.Any])
  }
}
