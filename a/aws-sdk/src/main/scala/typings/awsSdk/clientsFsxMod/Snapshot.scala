package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Snapshot extends StObject {
  
  /**
    * A list of administrative actions for the file system that are in process or waiting to be processed. Administrative actions describe changes to the Amazon FSx system.
    */
  var AdministrativeActions: js.UndefOr[typings.awsSdk.clientsFsxMod.AdministrativeActions] = js.undefined
  
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The lifecycle status of the snapshot.    PENDING - Amazon FSx hasn't started creating the snapshot.    CREATING - Amazon FSx is creating the snapshot.    DELETING - Amazon FSx is deleting the snapshot.    AVAILABLE - The snapshot is fully available.  
    */
  var Lifecycle: js.UndefOr[SnapshotLifecycle] = js.undefined
  
  var LifecycleTransitionReason: js.UndefOr[typings.awsSdk.clientsFsxMod.LifecycleTransitionReason] = js.undefined
  
  /**
    * The name of the snapshot.
    */
  var Name: js.UndefOr[SnapshotName] = js.undefined
  
  var ResourceARN: js.UndefOr[typings.awsSdk.clientsFsxMod.ResourceARN] = js.undefined
  
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.clientsFsxMod.SnapshotId] = js.undefined
  
  var Tags: js.UndefOr[typings.awsSdk.clientsFsxMod.Tags] = js.undefined
  
  /**
    * The ID of the volume that the snapshot is of.
    */
  var VolumeId: js.UndefOr[typings.awsSdk.clientsFsxMod.VolumeId] = js.undefined
}
object Snapshot {
  
  inline def apply(): Snapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Snapshot]
  }
  
  extension [Self <: Snapshot](x: Self) {
    
    inline def setAdministrativeActions(value: AdministrativeActions): Self = StObject.set(x, "AdministrativeActions", value.asInstanceOf[js.Any])
    
    inline def setAdministrativeActionsUndefined: Self = StObject.set(x, "AdministrativeActions", js.undefined)
    
    inline def setAdministrativeActionsVarargs(value: AdministrativeAction*): Self = StObject.set(x, "AdministrativeActions", js.Array(value*))
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLifecycle(value: SnapshotLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleTransitionReason(value: LifecycleTransitionReason): Self = StObject.set(x, "LifecycleTransitionReason", value.asInstanceOf[js.Any])
    
    inline def setLifecycleTransitionReasonUndefined: Self = StObject.set(x, "LifecycleTransitionReason", js.undefined)
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    inline def setName(value: SnapshotName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVolumeId(value: VolumeId): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
  }
}
