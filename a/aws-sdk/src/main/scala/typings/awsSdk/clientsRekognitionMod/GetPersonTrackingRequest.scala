package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPersonTrackingRequest extends StObject {
  
  /**
    * The identifier for a job that tracks persons in a video. You get the JobId from a call to StartPersonTracking. 
    */
  var JobId: typings.awsSdk.clientsRekognitionMod.JobId
  
  /**
    * Maximum number of results to return per paginated call. The largest value you can specify is 1000. If you specify a value greater than 1000, a maximum of 1000 results is returned. The default value is 1000.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsRekognitionMod.MaxResults] = js.undefined
  
  /**
    * If the previous response was incomplete (because there are more persons to retrieve), Amazon Rekognition Video returns a pagination token in the response. You can use this pagination token to retrieve the next set of persons. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Sort to use for elements in the Persons array. Use TIMESTAMP to sort array elements by the time persons are detected. Use INDEX to sort by the tracked persons. If you sort by INDEX, the array elements for each person are sorted by detection confidence. The default sort is by TIMESTAMP.
    */
  var SortBy: js.UndefOr[PersonTrackingSortBy] = js.undefined
}
object GetPersonTrackingRequest {
  
  inline def apply(JobId: JobId): GetPersonTrackingRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPersonTrackingRequest]
  }
  
  extension [Self <: GetPersonTrackingRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: PersonTrackingSortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
  }
}
