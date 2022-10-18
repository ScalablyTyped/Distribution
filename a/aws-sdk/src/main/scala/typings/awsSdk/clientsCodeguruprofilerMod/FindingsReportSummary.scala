package typings.awsSdk.clientsCodeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindingsReportSummary extends StObject {
  
  /**
    * The universally unique identifier (UUID) of the recommendation report.
    */
  var id: js.UndefOr[FindingsReportId] = js.undefined
  
  /**
    *  The end time of the period during which the metric is flagged as anomalous. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var profileEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The start time of the profile the analysis data is about. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
    */
  var profileStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the profiling group that is associated with the analysis data.
    */
  var profilingGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of different recommendations that were found by the analysis.
    */
  var totalNumberOfFindings: js.UndefOr[Integer] = js.undefined
}
object FindingsReportSummary {
  
  inline def apply(): FindingsReportSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingsReportSummary]
  }
  
  extension [Self <: FindingsReportSummary](x: Self) {
    
    inline def setId(value: FindingsReportId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setProfileEndTime(value: js.Date): Self = StObject.set(x, "profileEndTime", value.asInstanceOf[js.Any])
    
    inline def setProfileEndTimeUndefined: Self = StObject.set(x, "profileEndTime", js.undefined)
    
    inline def setProfileStartTime(value: js.Date): Self = StObject.set(x, "profileStartTime", value.asInstanceOf[js.Any])
    
    inline def setProfileStartTimeUndefined: Self = StObject.set(x, "profileStartTime", js.undefined)
    
    inline def setProfilingGroupName(value: String): Self = StObject.set(x, "profilingGroupName", value.asInstanceOf[js.Any])
    
    inline def setProfilingGroupNameUndefined: Self = StObject.set(x, "profilingGroupName", js.undefined)
    
    inline def setTotalNumberOfFindings(value: Integer): Self = StObject.set(x, "totalNumberOfFindings", value.asInstanceOf[js.Any])
    
    inline def setTotalNumberOfFindingsUndefined: Self = StObject.set(x, "totalNumberOfFindings", js.undefined)
  }
}
