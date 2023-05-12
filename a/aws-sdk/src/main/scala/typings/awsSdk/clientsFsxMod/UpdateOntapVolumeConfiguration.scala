package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOntapVolumeConfiguration extends StObject {
  
  /**
    * A boolean flag indicating whether tags for the volume should be copied to backups. This value defaults to false. If it's set to true, all tags for the volume are copied to all automatic and user-initiated backups where the user doesn't specify tags. If this value is true, and you specify one or more tags, only the specified tags are copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from the volume, regardless of this value.
    */
  var CopyTagsToBackups: js.UndefOr[Flag] = js.undefined
  
  /**
    * Specifies the location in the SVM's namespace where the volume is mounted. The JunctionPath must have a leading forward slash, such as /vol3.
    */
  var JunctionPath: js.UndefOr[typings.awsSdk.clientsFsxMod.JunctionPath] = js.undefined
  
  /**
    * The security style for the volume, which can be UNIX. NTFS, or MIXED.
    */
  var SecurityStyle: js.UndefOr[typings.awsSdk.clientsFsxMod.SecurityStyle] = js.undefined
  
  /**
    * Specifies the size of the volume in megabytes.
    */
  var SizeInMegabytes: js.UndefOr[VolumeCapacity] = js.undefined
  
  /**
    * Specifies the snapshot policy for the volume. There are three built-in snapshot policies:    default: This is the default policy. A maximum of six hourly snapshots taken five minutes past the hour. A maximum of two daily snapshots taken Monday through Saturday at 10 minutes after midnight. A maximum of two weekly snapshots taken every Sunday at 15 minutes after midnight.    default-1weekly: This policy is the same as the default policy except that it only retains one snapshot from the weekly schedule.    none: This policy does not take any snapshots. This policy can be assigned to volumes to prevent automatic snapshots from being taken.   You can also provide the name of a custom policy that you created with the ONTAP CLI or REST API. For more information, see Snapshot policies in the Amazon FSx for NetApp ONTAP User Guide.
    */
  var SnapshotPolicy: js.UndefOr[typings.awsSdk.clientsFsxMod.SnapshotPolicy] = js.undefined
  
  /**
    * Default is false. Set to true to enable the deduplication, compression, and compaction storage efficiency features on the volume.
    */
  var StorageEfficiencyEnabled: js.UndefOr[Flag] = js.undefined
  
  /**
    * Update the volume's data tiering policy.
    */
  var TieringPolicy: js.UndefOr[typings.awsSdk.clientsFsxMod.TieringPolicy] = js.undefined
}
object UpdateOntapVolumeConfiguration {
  
  inline def apply(): UpdateOntapVolumeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOntapVolumeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateOntapVolumeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCopyTagsToBackups(value: Flag): Self = StObject.set(x, "CopyTagsToBackups", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsToBackupsUndefined: Self = StObject.set(x, "CopyTagsToBackups", js.undefined)
    
    inline def setJunctionPath(value: JunctionPath): Self = StObject.set(x, "JunctionPath", value.asInstanceOf[js.Any])
    
    inline def setJunctionPathUndefined: Self = StObject.set(x, "JunctionPath", js.undefined)
    
    inline def setSecurityStyle(value: SecurityStyle): Self = StObject.set(x, "SecurityStyle", value.asInstanceOf[js.Any])
    
    inline def setSecurityStyleUndefined: Self = StObject.set(x, "SecurityStyle", js.undefined)
    
    inline def setSizeInMegabytes(value: VolumeCapacity): Self = StObject.set(x, "SizeInMegabytes", value.asInstanceOf[js.Any])
    
    inline def setSizeInMegabytesUndefined: Self = StObject.set(x, "SizeInMegabytes", js.undefined)
    
    inline def setSnapshotPolicy(value: SnapshotPolicy): Self = StObject.set(x, "SnapshotPolicy", value.asInstanceOf[js.Any])
    
    inline def setSnapshotPolicyUndefined: Self = StObject.set(x, "SnapshotPolicy", js.undefined)
    
    inline def setStorageEfficiencyEnabled(value: Flag): Self = StObject.set(x, "StorageEfficiencyEnabled", value.asInstanceOf[js.Any])
    
    inline def setStorageEfficiencyEnabledUndefined: Self = StObject.set(x, "StorageEfficiencyEnabled", js.undefined)
    
    inline def setTieringPolicy(value: TieringPolicy): Self = StObject.set(x, "TieringPolicy", value.asInstanceOf[js.Any])
    
    inline def setTieringPolicyUndefined: Self = StObject.set(x, "TieringPolicy", js.undefined)
  }
}
