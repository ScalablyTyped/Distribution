package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDiskSnapshotsResult extends StObject {
  
  /**
    * An array of objects containing information about all block storage disk snapshots.
    */
  var diskSnapshots: js.UndefOr[DiskSnapshotList] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetDiskSnapshots request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GetDiskSnapshotsResult {
  
  inline def apply(): GetDiskSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDiskSnapshotsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDiskSnapshotsResult] (val x: Self) extends AnyVal {
    
    inline def setDiskSnapshots(value: DiskSnapshotList): Self = StObject.set(x, "diskSnapshots", value.asInstanceOf[js.Any])
    
    inline def setDiskSnapshotsUndefined: Self = StObject.set(x, "diskSnapshots", js.undefined)
    
    inline def setDiskSnapshotsVarargs(value: DiskSnapshot*): Self = StObject.set(x, "diskSnapshots", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
