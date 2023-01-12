package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClustersV2Response extends StObject {
  
  /**
    * 
    Information on each of the MSK clusters in the response.
    
    */
  var ClusterInfoList: js.UndefOr[listOfCluster] = js.undefined
  
  /**
    * 
    The paginated results marker. When the result of a ListClusters operation is truncated, the call returns NextToken in the response. 
    To get another batch of clusters, provide this token in your next request.
    
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListClustersV2Response {
  
  inline def apply(): ListClustersV2Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClustersV2Response]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListClustersV2Response] (val x: Self) extends AnyVal {
    
    inline def setClusterInfoList(value: listOfCluster): Self = StObject.set(x, "ClusterInfoList", value.asInstanceOf[js.Any])
    
    inline def setClusterInfoListUndefined: Self = StObject.set(x, "ClusterInfoList", js.undefined)
    
    inline def setClusterInfoListVarargs(value: Cluster*): Self = StObject.set(x, "ClusterInfoList", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
