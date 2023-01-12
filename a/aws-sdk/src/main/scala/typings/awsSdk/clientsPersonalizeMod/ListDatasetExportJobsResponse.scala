package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatasetExportJobsResponse extends StObject {
  
  /**
    * The list of dataset export jobs.
    */
  var datasetExportJobs: js.UndefOr[DatasetExportJobs] = js.undefined
  
  /**
    * A token for getting the next set of dataset export jobs (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDatasetExportJobsResponse {
  
  inline def apply(): ListDatasetExportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetExportJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDatasetExportJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setDatasetExportJobs(value: DatasetExportJobs): Self = StObject.set(x, "datasetExportJobs", value.asInstanceOf[js.Any])
    
    inline def setDatasetExportJobsUndefined: Self = StObject.set(x, "datasetExportJobs", js.undefined)
    
    inline def setDatasetExportJobsVarargs(value: DatasetExportJobSummary*): Self = StObject.set(x, "datasetExportJobs", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
