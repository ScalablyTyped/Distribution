package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSnapshotScheduleInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the volume. Use the ListVolumes operation to return a list of gateway volumes.
    */
  var VolumeARN: typings.awsSdk.clientsStoragegatewayMod.VolumeARN
}
object DescribeSnapshotScheduleInput {
  
  inline def apply(VolumeARN: VolumeARN): DescribeSnapshotScheduleInput = {
    val __obj = js.Dynamic.literal(VolumeARN = VolumeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSnapshotScheduleInput]
  }
  
  extension [Self <: DescribeSnapshotScheduleInput](x: Self) {
    
    inline def setVolumeARN(value: VolumeARN): Self = StObject.set(x, "VolumeARN", value.asInstanceOf[js.Any])
  }
}
