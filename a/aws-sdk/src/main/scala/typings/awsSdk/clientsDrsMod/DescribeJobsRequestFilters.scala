package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobsRequestFilters extends StObject {
  
  /**
    * The start date in a date range query.
    */
  var fromDate: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * An array of Job IDs that should be returned. An empty array means all jobs.
    */
  var jobIDs: js.UndefOr[DescribeJobsRequestFiltersJobIDs] = js.undefined
  
  /**
    * The end date in a date range query.
    */
  var toDate: js.UndefOr[ISO8601DatetimeString] = js.undefined
}
object DescribeJobsRequestFilters {
  
  inline def apply(): DescribeJobsRequestFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobsRequestFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeJobsRequestFilters] (val x: Self) extends AnyVal {
    
    inline def setFromDate(value: ISO8601DatetimeString): Self = StObject.set(x, "fromDate", value.asInstanceOf[js.Any])
    
    inline def setFromDateUndefined: Self = StObject.set(x, "fromDate", js.undefined)
    
    inline def setJobIDs(value: DescribeJobsRequestFiltersJobIDs): Self = StObject.set(x, "jobIDs", value.asInstanceOf[js.Any])
    
    inline def setJobIDsUndefined: Self = StObject.set(x, "jobIDs", js.undefined)
    
    inline def setJobIDsVarargs(value: JobID*): Self = StObject.set(x, "jobIDs", js.Array(value*))
    
    inline def setToDate(value: ISO8601DatetimeString): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
    
    inline def setToDateUndefined: Self = StObject.set(x, "toDate", js.undefined)
  }
}
