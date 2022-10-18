package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListModelPackagingJobsResponse extends StObject {
  
  /**
    *  A list of the model packaging jobs created for the specified Amazon Lookout for Vision project. 
    */
  var ModelPackagingJobs: js.UndefOr[ModelPackagingJobsList] = js.undefined
  
  /**
    * If the previous response was incomplete (because there is more results to retrieve), Amazon Lookout for Vision returns a pagination token in the response. You can use this pagination token to retrieve the next set of results. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListModelPackagingJobsResponse {
  
  inline def apply(): ListModelPackagingJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListModelPackagingJobsResponse]
  }
  
  extension [Self <: ListModelPackagingJobsResponse](x: Self) {
    
    inline def setModelPackagingJobs(value: ModelPackagingJobsList): Self = StObject.set(x, "ModelPackagingJobs", value.asInstanceOf[js.Any])
    
    inline def setModelPackagingJobsUndefined: Self = StObject.set(x, "ModelPackagingJobs", js.undefined)
    
    inline def setModelPackagingJobsVarargs(value: ModelPackagingJobMetadata*): Self = StObject.set(x, "ModelPackagingJobs", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
