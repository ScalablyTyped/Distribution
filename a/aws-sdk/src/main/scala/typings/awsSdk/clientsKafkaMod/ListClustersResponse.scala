package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClustersResponse extends StObject {
  
  /**
    * 
    Information on each of the MSK clusters in the response.
    
    */
  var ClusterInfoList: js.UndefOr[listOfClusterInfo] = js.undefined
  
  /**
    * 
    The paginated results marker. When the result of a ListClusters operation is truncated, the call returns NextToken in the response. 
    To get another batch of clusters, provide this token in your next request.
    
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListClustersResponse {
  
  inline def apply(): ListClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClustersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListClustersResponse] (val x: Self) extends AnyVal {
    
    inline def setClusterInfoList(value: listOfClusterInfo): Self = StObject.set(x, "ClusterInfoList", value.asInstanceOf[js.Any])
    
    inline def setClusterInfoListUndefined: Self = StObject.set(x, "ClusterInfoList", js.undefined)
    
    inline def setClusterInfoListVarargs(value: ClusterInfo*): Self = StObject.set(x, "ClusterInfoList", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
