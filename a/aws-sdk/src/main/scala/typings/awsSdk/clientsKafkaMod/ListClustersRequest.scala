package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClustersRequest extends StObject {
  
  /**
    * 
    Specify a prefix of the name of the clusters that you want to list. The service lists all the clusters whose names start with this prefix.
    
    */
  var ClusterNameFilter: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The maximum number of results to return in the response. If there are more results, the response includes a NextToken parameter.
    
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsKafkaMod.MaxResults] = js.undefined
  
  /**
    * 
    The paginated results marker. When the result of the operation is truncated, the call returns NextToken in the response. 
    To get the next batch, provide this token in your next request.
    
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListClustersRequest {
  
  inline def apply(): ListClustersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClustersRequest]
  }
  
  extension [Self <: ListClustersRequest](x: Self) {
    
    inline def setClusterNameFilter(value: string): Self = StObject.set(x, "ClusterNameFilter", value.asInstanceOf[js.Any])
    
    inline def setClusterNameFilterUndefined: Self = StObject.set(x, "ClusterNameFilter", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
