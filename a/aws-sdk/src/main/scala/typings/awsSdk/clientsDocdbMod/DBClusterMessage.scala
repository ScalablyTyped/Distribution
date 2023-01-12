package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBClusterMessage extends StObject {
  
  /**
    * A list of clusters.
    */
  var DBClusters: js.UndefOr[DBClusterList] = js.undefined
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DBClusterMessage {
  
  inline def apply(): DBClusterMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DBClusterMessage] (val x: Self) extends AnyVal {
    
    inline def setDBClusters(value: DBClusterList): Self = StObject.set(x, "DBClusters", value.asInstanceOf[js.Any])
    
    inline def setDBClustersUndefined: Self = StObject.set(x, "DBClusters", js.undefined)
    
    inline def setDBClustersVarargs(value: DBCluster*): Self = StObject.set(x, "DBClusters", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
