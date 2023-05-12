package typings.awsSdk.clientsDocdbelasticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClusterSnapshotsOutput extends StObject {
  
  /**
    * The response will provide a nextToken if there is more data beyond the maxResults. If there is no more data in the responce, the nextToken will not be returned.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * A list of Elastic DocumentDB snapshots for a specified cluster.
    */
  var snapshots: js.UndefOr[ClusterSnapshotList] = js.undefined
}
object ListClusterSnapshotsOutput {
  
  inline def apply(): ListClusterSnapshotsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClusterSnapshotsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListClusterSnapshotsOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSnapshots(value: ClusterSnapshotList): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
    
    inline def setSnapshotsUndefined: Self = StObject.set(x, "snapshots", js.undefined)
    
    inline def setSnapshotsVarargs(value: ClusterSnapshotInList*): Self = StObject.set(x, "snapshots", js.Array(value*))
  }
}
