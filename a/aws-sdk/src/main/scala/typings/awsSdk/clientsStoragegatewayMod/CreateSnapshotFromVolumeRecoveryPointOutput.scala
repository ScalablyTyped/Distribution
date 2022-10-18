package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSnapshotFromVolumeRecoveryPointOutput extends StObject {
  
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.SnapshotId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the DescribeStorediSCSIVolumes operation to return to retrieve the TargetARN for specified VolumeARN.
    */
  var VolumeARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.VolumeARN] = js.undefined
  
  /**
    * The time the volume was created from the recovery point.
    */
  var VolumeRecoveryPointTime: js.UndefOr[String] = js.undefined
}
object CreateSnapshotFromVolumeRecoveryPointOutput {
  
  inline def apply(): CreateSnapshotFromVolumeRecoveryPointOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSnapshotFromVolumeRecoveryPointOutput]
  }
  
  extension [Self <: CreateSnapshotFromVolumeRecoveryPointOutput](x: Self) {
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    inline def setVolumeARN(value: VolumeARN): Self = StObject.set(x, "VolumeARN", value.asInstanceOf[js.Any])
    
    inline def setVolumeARNUndefined: Self = StObject.set(x, "VolumeARN", js.undefined)
    
    inline def setVolumeRecoveryPointTime(value: String): Self = StObject.set(x, "VolumeRecoveryPointTime", value.asInstanceOf[js.Any])
    
    inline def setVolumeRecoveryPointTimeUndefined: Self = StObject.set(x, "VolumeRecoveryPointTime", js.undefined)
  }
}
