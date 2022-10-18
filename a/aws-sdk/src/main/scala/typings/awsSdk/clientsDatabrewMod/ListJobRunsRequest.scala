package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobRunsRequest extends StObject {
  
  /**
    * The maximum number of results to return in this request. 
    */
  var MaxResults: js.UndefOr[MaxResults100] = js.undefined
  
  /**
    * The name of the job.
    */
  var Name: JobName
  
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsDatabrewMod.NextToken] = js.undefined
}
object ListJobRunsRequest {
  
  inline def apply(Name: JobName): ListJobRunsRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobRunsRequest]
  }
  
  extension [Self <: ListJobRunsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setName(value: JobName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
