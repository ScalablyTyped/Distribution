package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClustersResponse extends StObject {
  
  /**
    * A list of clusters
    */
  var Clusters: js.UndefOr[ClusterList] = js.undefined
  
  /**
    * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeClustersResponse {
  
  inline def apply(): DescribeClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClustersResponse]
  }
  
  extension [Self <: DescribeClustersResponse](x: Self) {
    
    inline def setClusters(value: ClusterList): Self = StObject.set(x, "Clusters", value.asInstanceOf[js.Any])
    
    inline def setClustersUndefined: Self = StObject.set(x, "Clusters", js.undefined)
    
    inline def setClustersVarargs(value: Cluster*): Self = StObject.set(x, "Clusters", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
