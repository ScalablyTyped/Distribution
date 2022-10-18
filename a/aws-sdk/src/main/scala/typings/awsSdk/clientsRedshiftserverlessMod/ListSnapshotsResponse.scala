package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSnapshotsResponse extends StObject {
  
  /**
    * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * All of the returned snapshot objects.
    */
  var snapshots: js.UndefOr[SnapshotList] = js.undefined
}
object ListSnapshotsResponse {
  
  inline def apply(): ListSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSnapshotsResponse]
  }
  
  extension [Self <: ListSnapshotsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSnapshots(value: SnapshotList): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
    
    inline def setSnapshotsUndefined: Self = StObject.set(x, "snapshots", js.undefined)
    
    inline def setSnapshotsVarargs(value: Snapshot*): Self = StObject.set(x, "snapshots", js.Array(value*))
  }
}
