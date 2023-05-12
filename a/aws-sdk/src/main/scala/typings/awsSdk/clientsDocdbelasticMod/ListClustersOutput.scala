package typings.awsSdk.clientsDocdbelasticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClustersOutput extends StObject {
  
  /**
    * A list of Elastic DocumentDB cluster.
    */
  var clusters: js.UndefOr[ClusterList] = js.undefined
  
  /**
    * The response will provide a nextToken if there is more data beyond the maxResults. If there is no more data in the responce, the nextToken will not be returned.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListClustersOutput {
  
  inline def apply(): ListClustersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClustersOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListClustersOutput] (val x: Self) extends AnyVal {
    
    inline def setClusters(value: ClusterList): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    inline def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    inline def setClustersVarargs(value: ClusterInList*): Self = StObject.set(x, "clusters", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
