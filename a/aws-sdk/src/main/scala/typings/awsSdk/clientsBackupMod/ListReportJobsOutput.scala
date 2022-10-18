package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReportJobsOutput extends StObject {
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Details about your report jobs in JSON format.
    */
  var ReportJobs: js.UndefOr[ReportJobList] = js.undefined
}
object ListReportJobsOutput {
  
  inline def apply(): ListReportJobsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReportJobsOutput]
  }
  
  extension [Self <: ListReportJobsOutput](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReportJobs(value: ReportJobList): Self = StObject.set(x, "ReportJobs", value.asInstanceOf[js.Any])
    
    inline def setReportJobsUndefined: Self = StObject.set(x, "ReportJobs", js.undefined)
    
    inline def setReportJobsVarargs(value: ReportJob*): Self = StObject.set(x, "ReportJobs", js.Array(value*))
  }
}
