package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OntapVolumeConfiguration extends StObject {
  
  /**
    * A boolean flag indicating whether tags for the volume should be copied to backups. This value defaults to false. If it's set to true, all tags for the volume are copied to all automatic and user-initiated backups where the user doesn't specify tags. If this value is true, and you specify one or more tags, only the specified tags are copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from the volume, regardless of this value.
    */
  var CopyTagsToBackups: js.UndefOr[Flag] = js.undefined
  
  /**
    * Specifies the FlexCache endpoint type of the volume. Valid values are the following:    NONE specifies that the volume doesn't have a FlexCache configuration. NONE is the default.    ORIGIN specifies that the volume is the origin volume for a FlexCache volume.    CACHE specifies that the volume is a FlexCache volume.  
    */
  var FlexCacheEndpointType: js.UndefOr[typings.awsSdk.clientsFsxMod.FlexCacheEndpointType] = js.undefined
  
  /**
    * Specifies the directory that network-attached storage (NAS) clients use to mount the volume, along with the storage virtual machine (SVM) Domain Name System (DNS) name or IP address. You can create a JunctionPath directly below a parent volume junction or on a directory within a volume. A JunctionPath for a volume named vol3 might be /vol1/vol2/vol3, or /vol1/dir2/vol3, or even /dir1/dir2/vol3.
    */
  var JunctionPath: js.UndefOr[typings.awsSdk.clientsFsxMod.JunctionPath] = js.undefined
  
  /**
    * Specifies the type of volume. Valid values are the following:    RW specifies a read/write volume. RW is the default.    DP specifies a data-protection volume. You can protect data by replicating it to data-protection mirror copies. If a disaster occurs, you can use these data-protection mirror copies to recover data.    LS specifies a load-sharing mirror volume. A load-sharing mirror reduces the network traffic to a FlexVol volume by providing additional read-only access to clients.  
    */
  var OntapVolumeType: js.UndefOr[typings.awsSdk.clientsFsxMod.OntapVolumeType] = js.undefined
  
  /**
    * The security style for the volume, which can be UNIX, NTFS, or MIXED.
    */
  var SecurityStyle: js.UndefOr[typings.awsSdk.clientsFsxMod.SecurityStyle] = js.undefined
  
  /**
    * The configured size of the volume, in megabytes (MBs).
    */
  var SizeInMegabytes: js.UndefOr[VolumeCapacity] = js.undefined
  
  /**
    * Specifies the snapshot policy for the volume. There are three built-in snapshot policies:    default: This is the default policy. A maximum of six hourly snapshots taken five minutes past the hour. A maximum of two daily snapshots taken Monday through Saturday at 10 minutes after midnight. A maximum of two weekly snapshots taken every Sunday at 15 minutes after midnight.    default-1weekly: This policy is the same as the default policy except that it only retains one snapshot from the weekly schedule.    none: This policy does not take any snapshots. This policy can be assigned to volumes to prevent automatic snapshots from being taken.   You can also provide the name of a custom policy that you created with the ONTAP CLI or REST API. For more information, see Snapshot policies in the Amazon FSx for NetApp ONTAP User Guide.
    */
  var SnapshotPolicy: js.UndefOr[typings.awsSdk.clientsFsxMod.SnapshotPolicy] = js.undefined
  
  /**
    * The volume's storage efficiency setting.
    */
  var StorageEfficiencyEnabled: js.UndefOr[Flag] = js.undefined
  
  /**
    * The ID of the volume's storage virtual machine.
    */
  var StorageVirtualMachineId: js.UndefOr[typings.awsSdk.clientsFsxMod.StorageVirtualMachineId] = js.undefined
  
  /**
    * A Boolean flag indicating whether this volume is the root volume for its storage virtual machine (SVM). Only one volume on an SVM can be the root volume. This value defaults to false. If this value is true, then this is the SVM root volume. This flag is useful when you're deleting an SVM, because you must first delete all non-root volumes. This flag, when set to false, helps you identify which volumes to delete before you can delete the SVM.
    */
  var StorageVirtualMachineRoot: js.UndefOr[Flag] = js.undefined
  
  /**
    * The volume's TieringPolicy setting.
    */
  var TieringPolicy: js.UndefOr[typings.awsSdk.clientsFsxMod.TieringPolicy] = js.undefined
  
  /**
    * The volume's universally unique identifier (UUID).
    */
  var UUID: js.UndefOr[typings.awsSdk.clientsFsxMod.UUID] = js.undefined
}
object OntapVolumeConfiguration {
  
  inline def apply(): OntapVolumeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OntapVolumeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OntapVolumeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCopyTagsToBackups(value: Flag): Self = StObject.set(x, "CopyTagsToBackups", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsToBackupsUndefined: Self = StObject.set(x, "CopyTagsToBackups", js.undefined)
    
    inline def setFlexCacheEndpointType(value: FlexCacheEndpointType): Self = StObject.set(x, "FlexCacheEndpointType", value.asInstanceOf[js.Any])
    
    inline def setFlexCacheEndpointTypeUndefined: Self = StObject.set(x, "FlexCacheEndpointType", js.undefined)
    
    inline def setJunctionPath(value: JunctionPath): Self = StObject.set(x, "JunctionPath", value.asInstanceOf[js.Any])
    
    inline def setJunctionPathUndefined: Self = StObject.set(x, "JunctionPath", js.undefined)
    
    inline def setOntapVolumeType(value: OntapVolumeType): Self = StObject.set(x, "OntapVolumeType", value.asInstanceOf[js.Any])
    
    inline def setOntapVolumeTypeUndefined: Self = StObject.set(x, "OntapVolumeType", js.undefined)
    
    inline def setSecurityStyle(value: SecurityStyle): Self = StObject.set(x, "SecurityStyle", value.asInstanceOf[js.Any])
    
    inline def setSecurityStyleUndefined: Self = StObject.set(x, "SecurityStyle", js.undefined)
    
    inline def setSizeInMegabytes(value: VolumeCapacity): Self = StObject.set(x, "SizeInMegabytes", value.asInstanceOf[js.Any])
    
    inline def setSizeInMegabytesUndefined: Self = StObject.set(x, "SizeInMegabytes", js.undefined)
    
    inline def setSnapshotPolicy(value: SnapshotPolicy): Self = StObject.set(x, "SnapshotPolicy", value.asInstanceOf[js.Any])
    
    inline def setSnapshotPolicyUndefined: Self = StObject.set(x, "SnapshotPolicy", js.undefined)
    
    inline def setStorageEfficiencyEnabled(value: Flag): Self = StObject.set(x, "StorageEfficiencyEnabled", value.asInstanceOf[js.Any])
    
    inline def setStorageEfficiencyEnabledUndefined: Self = StObject.set(x, "StorageEfficiencyEnabled", js.undefined)
    
    inline def setStorageVirtualMachineId(value: StorageVirtualMachineId): Self = StObject.set(x, "StorageVirtualMachineId", value.asInstanceOf[js.Any])
    
    inline def setStorageVirtualMachineIdUndefined: Self = StObject.set(x, "StorageVirtualMachineId", js.undefined)
    
    inline def setStorageVirtualMachineRoot(value: Flag): Self = StObject.set(x, "StorageVirtualMachineRoot", value.asInstanceOf[js.Any])
    
    inline def setStorageVirtualMachineRootUndefined: Self = StObject.set(x, "StorageVirtualMachineRoot", js.undefined)
    
    inline def setTieringPolicy(value: TieringPolicy): Self = StObject.set(x, "TieringPolicy", value.asInstanceOf[js.Any])
    
    inline def setTieringPolicyUndefined: Self = StObject.set(x, "TieringPolicy", js.undefined)
    
    inline def setUUID(value: UUID): Self = StObject.set(x, "UUID", value.asInstanceOf[js.Any])
    
    inline def setUUIDUndefined: Self = StObject.set(x, "UUID", js.undefined)
  }
}
