package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImportJobsRequest extends StObject {
  
  /**
    * The destination of the import job, which can be used to list import jobs that have a certain ImportDestinationType.
    */
  var ImportDestinationType: js.UndefOr[typings.awsSdk.clientsSesv2Mod.ImportDestinationType] = js.undefined
  
  /**
    * A string token indicating that there might be additional import jobs available to be listed. Copy this token to a subsequent call to ListImportJobs with the same parameters to retrieve the next page of import jobs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSesv2Mod.NextToken] = js.undefined
  
  /**
    * Maximum number of import jobs to return at once. Use this parameter to paginate results. If additional import jobs exist beyond the specified limit, the NextToken element is sent in the response. Use the NextToken value in subsequent requests to retrieve additional addresses.
    */
  var PageSize: js.UndefOr[MaxItems] = js.undefined
}
object ListImportJobsRequest {
  
  inline def apply(): ListImportJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImportJobsRequest]
  }
  
  extension [Self <: ListImportJobsRequest](x: Self) {
    
    inline def setImportDestinationType(value: ImportDestinationType): Self = StObject.set(x, "ImportDestinationType", value.asInstanceOf[js.Any])
    
    inline def setImportDestinationTypeUndefined: Self = StObject.set(x, "ImportDestinationType", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPageSize(value: MaxItems): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
  }
}
