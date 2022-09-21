package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClustersResponse extends StObject {
  
  /**
    * List of clusters.
    */
  var clusters: js.Array[Cluster]
}
object ListClustersResponse {
  
  inline def apply(clusters: js.Array[Cluster]): ListClustersResponse = {
    val __obj = js.Dynamic.literal(clusters = clusters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListClustersResponse]
  }
  
  extension [Self <: ListClustersResponse](x: Self) {
    
    inline def setClusters(value: js.Array[Cluster]): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    inline def setClustersVarargs(value: Cluster*): Self = StObject.set(x, "clusters", js.Array(value*))
  }
}
