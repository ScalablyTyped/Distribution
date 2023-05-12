package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreVolumeFromSnapshotResponse extends StObject {
  
  /**
    * A list of administrative actions for the file system that are in process or waiting to be processed. Administrative actions describe changes to the Amazon FSx system.
    */
  var AdministrativeActions: js.UndefOr[typings.awsSdk.clientsFsxMod.AdministrativeActions] = js.undefined
  
  /**
    * The lifecycle state of the volume being restored.
    */
  var Lifecycle: js.UndefOr[VolumeLifecycle] = js.undefined
  
  /**
    * The ID of the volume that you restored.
    */
  var VolumeId: js.UndefOr[typings.awsSdk.clientsFsxMod.VolumeId] = js.undefined
}
object RestoreVolumeFromSnapshotResponse {
  
  inline def apply(): RestoreVolumeFromSnapshotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreVolumeFromSnapshotResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestoreVolumeFromSnapshotResponse] (val x: Self) extends AnyVal {
    
    inline def setAdministrativeActions(value: AdministrativeActions): Self = StObject.set(x, "AdministrativeActions", value.asInstanceOf[js.Any])
    
    inline def setAdministrativeActionsUndefined: Self = StObject.set(x, "AdministrativeActions", js.undefined)
    
    inline def setAdministrativeActionsVarargs(value: AdministrativeAction*): Self = StObject.set(x, "AdministrativeActions", js.Array(value*))
    
    inline def setLifecycle(value: VolumeLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    inline def setVolumeId(value: VolumeId): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
  }
}
