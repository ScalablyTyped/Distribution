package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePredictorBacktestExportJobResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the predictor backtest export job that you want to export.
    */
  var PredictorBacktestExportJobArn: js.UndefOr[Arn] = js.undefined
}
object CreatePredictorBacktestExportJobResponse {
  
  inline def apply(): CreatePredictorBacktestExportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePredictorBacktestExportJobResponse]
  }
  
  extension [Self <: CreatePredictorBacktestExportJobResponse](x: Self) {
    
    inline def setPredictorBacktestExportJobArn(value: Arn): Self = StObject.set(x, "PredictorBacktestExportJobArn", value.asInstanceOf[js.Any])
    
    inline def setPredictorBacktestExportJobArnUndefined: Self = StObject.set(x, "PredictorBacktestExportJobArn", js.undefined)
  }
}
