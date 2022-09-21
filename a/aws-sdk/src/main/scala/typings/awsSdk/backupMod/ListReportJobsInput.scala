package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReportJobsInput extends StObject {
  
  /**
    * Returns only report jobs that were created after the date and time specified in Unix format and Coordinated Universal Time (UTC). For example, the value 1516925490 represents Friday, January 26, 2018 12:11:30 AM.
    */
  var ByCreationAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Returns only report jobs that were created before the date and time specified in Unix format and Coordinated Universal Time (UTC). For example, the value 1516925490 represents Friday, January 26, 2018 12:11:30 AM.
    */
  var ByCreationBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Returns only report jobs with the specified report plan name.
    */
  var ByReportPlanName: js.UndefOr[ReportPlanName] = js.undefined
  
  /**
    * Returns only report jobs that are in the specified status. The statuses are:  CREATED | RUNNING | COMPLETED | FAILED 
    */
  var ByStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The number of desired results from 1 to 1000. Optional. If unspecified, the query will return 1 MB of data.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.backupMod.MaxResults] = js.undefined
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListReportJobsInput {
  
  inline def apply(): ListReportJobsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReportJobsInput]
  }
  
  extension [Self <: ListReportJobsInput](x: Self) {
    
    inline def setByCreationAfter(value: js.Date): Self = StObject.set(x, "ByCreationAfter", value.asInstanceOf[js.Any])
    
    inline def setByCreationAfterUndefined: Self = StObject.set(x, "ByCreationAfter", js.undefined)
    
    inline def setByCreationBefore(value: js.Date): Self = StObject.set(x, "ByCreationBefore", value.asInstanceOf[js.Any])
    
    inline def setByCreationBeforeUndefined: Self = StObject.set(x, "ByCreationBefore", js.undefined)
    
    inline def setByReportPlanName(value: ReportPlanName): Self = StObject.set(x, "ByReportPlanName", value.asInstanceOf[js.Any])
    
    inline def setByReportPlanNameUndefined: Self = StObject.set(x, "ByReportPlanName", js.undefined)
    
    inline def setByStatus(value: String): Self = StObject.set(x, "ByStatus", value.asInstanceOf[js.Any])
    
    inline def setByStatusUndefined: Self = StObject.set(x, "ByStatus", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
