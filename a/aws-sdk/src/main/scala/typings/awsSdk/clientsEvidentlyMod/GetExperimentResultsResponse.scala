package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExperimentResultsResponse extends StObject {
  
  /**
    * If the experiment doesn't yet have enough events to provide valid results, this field is returned with the message Not enough events to generate results. If there are enough events to provide valid results, this field is not returned.
    */
  var details: js.UndefOr[String] = js.undefined
  
  /**
    * An array of structures that include the reports that you requested.
    */
  var reports: js.UndefOr[ExperimentReportList] = js.undefined
  
  /**
    * An array of structures that include experiment results including metric names and values. 
    */
  var resultsData: js.UndefOr[ExperimentResultsDataList] = js.undefined
  
  /**
    * The timestamps of each result returned.
    */
  var timestamps: js.UndefOr[TimestampList] = js.undefined
}
object GetExperimentResultsResponse {
  
  inline def apply(): GetExperimentResultsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExperimentResultsResponse]
  }
  
  extension [Self <: GetExperimentResultsResponse](x: Self) {
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setReports(value: ExperimentReportList): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
    
    inline def setReportsUndefined: Self = StObject.set(x, "reports", js.undefined)
    
    inline def setReportsVarargs(value: ExperimentReport*): Self = StObject.set(x, "reports", js.Array(value*))
    
    inline def setResultsData(value: ExperimentResultsDataList): Self = StObject.set(x, "resultsData", value.asInstanceOf[js.Any])
    
    inline def setResultsDataUndefined: Self = StObject.set(x, "resultsData", js.undefined)
    
    inline def setResultsDataVarargs(value: ExperimentResultsData*): Self = StObject.set(x, "resultsData", js.Array(value*))
    
    inline def setTimestamps(value: TimestampList): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
    
    inline def setTimestampsUndefined: Self = StObject.set(x, "timestamps", js.undefined)
    
    inline def setTimestampsVarargs(value: js.Date*): Self = StObject.set(x, "timestamps", js.Array(value*))
  }
}
