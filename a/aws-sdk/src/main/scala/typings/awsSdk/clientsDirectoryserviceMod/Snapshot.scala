package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Snapshot extends StObject {
  
  /**
    * The directory identifier.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.DirectoryId] = js.undefined
  
  /**
    * The descriptive name of the snapshot.
    */
  var Name: js.UndefOr[SnapshotName] = js.undefined
  
  /**
    * The snapshot identifier.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.SnapshotId] = js.undefined
  
  /**
    * The date and time that the snapshot was taken.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The snapshot status.
    */
  var Status: js.UndefOr[SnapshotStatus] = js.undefined
  
  /**
    * The snapshot type.
    */
  var Type: js.UndefOr[SnapshotType] = js.undefined
}
object Snapshot {
  
  inline def apply(): Snapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Snapshot]
  }
  
  extension [Self <: Snapshot](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    inline def setName(value: SnapshotName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setStatus(value: SnapshotStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setType(value: SnapshotType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
