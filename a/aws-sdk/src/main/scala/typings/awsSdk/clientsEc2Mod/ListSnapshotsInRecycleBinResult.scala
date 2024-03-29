package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSnapshotsInRecycleBinResult extends StObject {
  
  /**
    * The token to include in another request to get the next page of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the snapshots.
    */
  var Snapshots: js.UndefOr[SnapshotRecycleBinInfoList] = js.undefined
}
object ListSnapshotsInRecycleBinResult {
  
  inline def apply(): ListSnapshotsInRecycleBinResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSnapshotsInRecycleBinResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSnapshotsInRecycleBinResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSnapshots(value: SnapshotRecycleBinInfoList): Self = StObject.set(x, "Snapshots", value.asInstanceOf[js.Any])
    
    inline def setSnapshotsUndefined: Self = StObject.set(x, "Snapshots", js.undefined)
    
    inline def setSnapshotsVarargs(value: SnapshotRecycleBinInfo*): Self = StObject.set(x, "Snapshots", js.Array(value*))
  }
}
