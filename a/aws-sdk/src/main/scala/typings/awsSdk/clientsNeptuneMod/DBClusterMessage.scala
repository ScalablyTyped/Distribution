package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBClusterMessage extends StObject {
  
  /**
    * Contains a list of DB clusters for the user.
    */
  var DBClusters: js.UndefOr[DBClusterList] = js.undefined
  
  /**
    * A pagination token that can be used in a subsequent DescribeDBClusters request.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DBClusterMessage {
  
  inline def apply(): DBClusterMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterMessage]
  }
  
  extension [Self <: DBClusterMessage](x: Self) {
    
    inline def setDBClusters(value: DBClusterList): Self = StObject.set(x, "DBClusters", value.asInstanceOf[js.Any])
    
    inline def setDBClustersUndefined: Self = StObject.set(x, "DBClusters", js.undefined)
    
    inline def setDBClustersVarargs(value: DBCluster*): Self = StObject.set(x, "DBClusters", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
