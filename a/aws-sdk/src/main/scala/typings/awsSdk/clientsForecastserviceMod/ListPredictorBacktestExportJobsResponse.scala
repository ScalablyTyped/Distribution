package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPredictorBacktestExportJobsResponse extends StObject {
  
  /**
    * Returns this token if the response is truncated. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.NextToken] = js.undefined
  
  /**
    * An array of objects that summarize the properties of each predictor backtest export job.
    */
  var PredictorBacktestExportJobs: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.PredictorBacktestExportJobs] = js.undefined
}
object ListPredictorBacktestExportJobsResponse {
  
  inline def apply(): ListPredictorBacktestExportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPredictorBacktestExportJobsResponse]
  }
  
  extension [Self <: ListPredictorBacktestExportJobsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPredictorBacktestExportJobs(value: PredictorBacktestExportJobs): Self = StObject.set(x, "PredictorBacktestExportJobs", value.asInstanceOf[js.Any])
    
    inline def setPredictorBacktestExportJobsUndefined: Self = StObject.set(x, "PredictorBacktestExportJobs", js.undefined)
    
    inline def setPredictorBacktestExportJobsVarargs(value: PredictorBacktestExportJobSummary*): Self = StObject.set(x, "PredictorBacktestExportJobs", js.Array(value*))
  }
}
