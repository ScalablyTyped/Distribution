package typings.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobsByStatusResponse extends StObject {
  
  /**
    * An array of Job objects that have the specified status.
    */
  var Jobs: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.Jobs] = js.undefined
  
  /**
    *  A value that you use to access the second and subsequent pages of results, if any. When the jobs in the specified pipeline fit on one page or when you've reached the last page of results, the value of NextPageToken is null. 
    */
  var NextPageToken: js.UndefOr[Id] = js.undefined
}
object ListJobsByStatusResponse {
  
  inline def apply(): ListJobsByStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsByStatusResponse]
  }
  
  extension [Self <: ListJobsByStatusResponse](x: Self) {
    
    inline def setJobs(value: Jobs): Self = StObject.set(x, "Jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "Jobs", js.undefined)
    
    inline def setJobsVarargs(value: Job*): Self = StObject.set(x, "Jobs", js.Array(value*))
    
    inline def setNextPageToken(value: Id): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
  }
}
