package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClustersOutput extends StObject {
  
  /**
    * The list of clusters for the account based on the given filters.
    */
  var Clusters: js.UndefOr[ClusterSummaryList] = js.undefined
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.clientsEmrMod.Marker] = js.undefined
}
object ListClustersOutput {
  
  inline def apply(): ListClustersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClustersOutput]
  }
  
  extension [Self <: ListClustersOutput](x: Self) {
    
    inline def setClusters(value: ClusterSummaryList): Self = StObject.set(x, "Clusters", value.asInstanceOf[js.Any])
    
    inline def setClustersUndefined: Self = StObject.set(x, "Clusters", js.undefined)
    
    inline def setClustersVarargs(value: ClusterSummary*): Self = StObject.set(x, "Clusters", js.Array(value*))
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
