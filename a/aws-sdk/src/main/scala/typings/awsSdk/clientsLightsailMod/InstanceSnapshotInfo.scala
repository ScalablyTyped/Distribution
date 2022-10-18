package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceSnapshotInfo extends StObject {
  
  /**
    * The blueprint ID from which the source instance (e.g., os_debian_8_3).
    */
  var fromBlueprintId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The bundle ID from which the source instance was created (e.g., micro_1_0).
    */
  var fromBundleId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A list of objects describing the disks that were attached to the source instance.
    */
  var fromDiskInfo: js.UndefOr[DiskInfoList] = js.undefined
}
object InstanceSnapshotInfo {
  
  inline def apply(): InstanceSnapshotInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceSnapshotInfo]
  }
  
  extension [Self <: InstanceSnapshotInfo](x: Self) {
    
    inline def setFromBlueprintId(value: NonEmptyString): Self = StObject.set(x, "fromBlueprintId", value.asInstanceOf[js.Any])
    
    inline def setFromBlueprintIdUndefined: Self = StObject.set(x, "fromBlueprintId", js.undefined)
    
    inline def setFromBundleId(value: NonEmptyString): Self = StObject.set(x, "fromBundleId", value.asInstanceOf[js.Any])
    
    inline def setFromBundleIdUndefined: Self = StObject.set(x, "fromBundleId", js.undefined)
    
    inline def setFromDiskInfo(value: DiskInfoList): Self = StObject.set(x, "fromDiskInfo", value.asInstanceOf[js.Any])
    
    inline def setFromDiskInfoUndefined: Self = StObject.set(x, "fromDiskInfo", js.undefined)
    
    inline def setFromDiskInfoVarargs(value: DiskInfo*): Self = StObject.set(x, "fromDiskInfo", js.Array(value*))
  }
}
