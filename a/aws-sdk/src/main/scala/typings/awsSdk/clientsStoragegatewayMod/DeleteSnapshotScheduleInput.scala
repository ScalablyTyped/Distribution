package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSnapshotScheduleInput extends StObject {
  
  /**
    * The volume which snapshot schedule to delete.
    */
  var VolumeARN: typings.awsSdk.clientsStoragegatewayMod.VolumeARN
}
object DeleteSnapshotScheduleInput {
  
  inline def apply(VolumeARN: VolumeARN): DeleteSnapshotScheduleInput = {
    val __obj = js.Dynamic.literal(VolumeARN = VolumeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSnapshotScheduleInput]
  }
  
  extension [Self <: DeleteSnapshotScheduleInput](x: Self) {
    
    inline def setVolumeARN(value: VolumeARN): Self = StObject.set(x, "VolumeARN", value.asInstanceOf[js.Any])
  }
}
