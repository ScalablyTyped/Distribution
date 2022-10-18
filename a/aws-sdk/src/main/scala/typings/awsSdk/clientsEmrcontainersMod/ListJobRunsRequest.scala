package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobRunsRequest extends StObject {
  
  /**
    * The date and time after which the job runs were submitted.
    */
  var createdAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time before which the job runs were submitted.
    */
  var createdBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum number of job runs that can be listed.
    */
  var maxResults: js.UndefOr[JavaInteger] = js.undefined
  
  /**
    * The name of the job run.
    */
  var name: js.UndefOr[ResourceNameString] = js.undefined
  
  /**
    * The token for the next set of job runs to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The states of the job run.
    */
  var states: js.UndefOr[JobRunStates] = js.undefined
  
  /**
    * The ID of the virtual cluster for which to list the job run. 
    */
  var virtualClusterId: ResourceIdString
}
object ListJobRunsRequest {
  
  inline def apply(virtualClusterId: ResourceIdString): ListJobRunsRequest = {
    val __obj = js.Dynamic.literal(virtualClusterId = virtualClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobRunsRequest]
  }
  
  extension [Self <: ListJobRunsRequest](x: Self) {
    
    inline def setCreatedAfter(value: js.Date): Self = StObject.set(x, "createdAfter", value.asInstanceOf[js.Any])
    
    inline def setCreatedAfterUndefined: Self = StObject.set(x, "createdAfter", js.undefined)
    
    inline def setCreatedBefore(value: js.Date): Self = StObject.set(x, "createdBefore", value.asInstanceOf[js.Any])
    
    inline def setCreatedBeforeUndefined: Self = StObject.set(x, "createdBefore", js.undefined)
    
    inline def setMaxResults(value: JavaInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setName(value: ResourceNameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStates(value: JobRunStates): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    inline def setStatesVarargs(value: JobRunState*): Self = StObject.set(x, "states", js.Array(value*))
    
    inline def setVirtualClusterId(value: ResourceIdString): Self = StObject.set(x, "virtualClusterId", value.asInstanceOf[js.Any])
  }
}
