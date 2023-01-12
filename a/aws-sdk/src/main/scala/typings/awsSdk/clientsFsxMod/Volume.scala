package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Volume extends StObject {
  
  /**
    * A list of administrative actions for the file system that are in process or waiting to be processed. Administrative actions describe changes to the Amazon FSx system that you initiated.
    */
  var AdministrativeActions: js.UndefOr[typings.awsSdk.clientsFsxMod.AdministrativeActions] = js.undefined
  
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  var FileSystemId: js.UndefOr[typings.awsSdk.clientsFsxMod.FileSystemId] = js.undefined
  
  /**
    * The lifecycle status of the volume.    AVAILABLE - The volume is fully available for use.    CREATED - The volume has been created.    CREATING - Amazon FSx is creating the new volume.    DELETING - Amazon FSx is deleting an existing volume.    FAILED - Amazon FSx was unable to create the volume.    MISCONFIGURED - The volume is in a failed but recoverable state.    PENDING - Amazon FSx hasn't started creating the volume.  
    */
  var Lifecycle: js.UndefOr[VolumeLifecycle] = js.undefined
  
  /**
    * The reason why the volume lifecycle status changed.
    */
  var LifecycleTransitionReason: js.UndefOr[typings.awsSdk.clientsFsxMod.LifecycleTransitionReason] = js.undefined
  
  /**
    * The name of the volume.
    */
  var Name: js.UndefOr[VolumeName] = js.undefined
  
  var OntapConfiguration: js.UndefOr[OntapVolumeConfiguration] = js.undefined
  
  /**
    * The configuration of an Amazon FSx for OpenZFS volume.
    */
  var OpenZFSConfiguration: js.UndefOr[OpenZFSVolumeConfiguration] = js.undefined
  
  var ResourceARN: js.UndefOr[typings.awsSdk.clientsFsxMod.ResourceARN] = js.undefined
  
  var Tags: js.UndefOr[typings.awsSdk.clientsFsxMod.Tags] = js.undefined
  
  /**
    * The system-generated, unique ID of the volume.
    */
  var VolumeId: js.UndefOr[typings.awsSdk.clientsFsxMod.VolumeId] = js.undefined
  
  /**
    * The type of the volume.
    */
  var VolumeType: js.UndefOr[typings.awsSdk.clientsFsxMod.VolumeType] = js.undefined
}
object Volume {
  
  inline def apply(): Volume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Volume]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Volume] (val x: Self) extends AnyVal {
    
    inline def setAdministrativeActions(value: AdministrativeActions): Self = StObject.set(x, "AdministrativeActions", value.asInstanceOf[js.Any])
    
    inline def setAdministrativeActionsUndefined: Self = StObject.set(x, "AdministrativeActions", js.undefined)
    
    inline def setAdministrativeActionsVarargs(value: AdministrativeAction*): Self = StObject.set(x, "AdministrativeActions", js.Array(value*))
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    inline def setFileSystemIdUndefined: Self = StObject.set(x, "FileSystemId", js.undefined)
    
    inline def setLifecycle(value: VolumeLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleTransitionReason(value: LifecycleTransitionReason): Self = StObject.set(x, "LifecycleTransitionReason", value.asInstanceOf[js.Any])
    
    inline def setLifecycleTransitionReasonUndefined: Self = StObject.set(x, "LifecycleTransitionReason", js.undefined)
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    inline def setName(value: VolumeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOntapConfiguration(value: OntapVolumeConfiguration): Self = StObject.set(x, "OntapConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOntapConfigurationUndefined: Self = StObject.set(x, "OntapConfiguration", js.undefined)
    
    inline def setOpenZFSConfiguration(value: OpenZFSVolumeConfiguration): Self = StObject.set(x, "OpenZFSConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOpenZFSConfigurationUndefined: Self = StObject.set(x, "OpenZFSConfiguration", js.undefined)
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVolumeId(value: VolumeId): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
    
    inline def setVolumeType(value: VolumeType): Self = StObject.set(x, "VolumeType", value.asInstanceOf[js.Any])
    
    inline def setVolumeTypeUndefined: Self = StObject.set(x, "VolumeType", js.undefined)
  }
}
