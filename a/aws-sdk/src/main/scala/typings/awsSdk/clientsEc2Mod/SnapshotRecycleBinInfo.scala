package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotRecycleBinInfo extends StObject {
  
  /**
    * The description for the snapshot.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time when the snaphsot entered the Recycle Bin.
    */
  var RecycleBinEnterTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time when the snapshot is to be permanently deleted from the Recycle Bin.
    */
  var RecycleBinExitTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the volume from which the snapshot was created.
    */
  var VolumeId: js.UndefOr[String] = js.undefined
}
object SnapshotRecycleBinInfo {
  
  inline def apply(): SnapshotRecycleBinInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotRecycleBinInfo]
  }
  
  extension [Self <: SnapshotRecycleBinInfo](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setRecycleBinEnterTime(value: js.Date): Self = StObject.set(x, "RecycleBinEnterTime", value.asInstanceOf[js.Any])
    
    inline def setRecycleBinEnterTimeUndefined: Self = StObject.set(x, "RecycleBinEnterTime", js.undefined)
    
    inline def setRecycleBinExitTime(value: js.Date): Self = StObject.set(x, "RecycleBinExitTime", value.asInstanceOf[js.Any])
    
    inline def setRecycleBinExitTimeUndefined: Self = StObject.set(x, "RecycleBinExitTime", js.undefined)
    
    inline def setSnapshotId(value: String): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
  }
}
