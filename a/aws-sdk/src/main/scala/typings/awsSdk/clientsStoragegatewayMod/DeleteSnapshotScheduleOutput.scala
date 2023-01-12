package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSnapshotScheduleOutput extends StObject {
  
  /**
    * The volume which snapshot schedule was deleted.
    */
  var VolumeARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.VolumeARN] = js.undefined
}
object DeleteSnapshotScheduleOutput {
  
  inline def apply(): DeleteSnapshotScheduleOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSnapshotScheduleOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSnapshotScheduleOutput] (val x: Self) extends AnyVal {
    
    inline def setVolumeARN(value: VolumeARN): Self = StObject.set(x, "VolumeARN", value.asInstanceOf[js.Any])
    
    inline def setVolumeARNUndefined: Self = StObject.set(x, "VolumeARN", js.undefined)
  }
}
