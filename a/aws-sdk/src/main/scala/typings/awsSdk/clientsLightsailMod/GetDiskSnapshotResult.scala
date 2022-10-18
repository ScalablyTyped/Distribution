package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDiskSnapshotResult extends StObject {
  
  /**
    * An object containing information about the disk snapshot.
    */
  var diskSnapshot: js.UndefOr[DiskSnapshot] = js.undefined
}
object GetDiskSnapshotResult {
  
  inline def apply(): GetDiskSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDiskSnapshotResult]
  }
  
  extension [Self <: GetDiskSnapshotResult](x: Self) {
    
    inline def setDiskSnapshot(value: DiskSnapshot): Self = StObject.set(x, "diskSnapshot", value.asInstanceOf[js.Any])
    
    inline def setDiskSnapshotUndefined: Self = StObject.set(x, "diskSnapshot", js.undefined)
  }
}
