package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetAppONTAPVolume extends StObject {
  
  /**
    * The total storage space that's available in the volume.
    */
  var CapacityProvisioned: js.UndefOr[NonNegativeLong] = js.undefined
  
  /**
    * The storage space that's being used in the volume.
    */
  var CapacityUsed: js.UndefOr[NonNegativeLong] = js.undefined
  
  /**
    * The number of CIFS shares in the volume.
    */
  var CifsShareCount: js.UndefOr[NonNegativeLong] = js.undefined
  
  /**
    * The storage space that's being used in the volume without accounting for compression or deduplication.
    */
  var LogicalCapacityUsed: js.UndefOr[NonNegativeLong] = js.undefined
  
  /**
    * The performance data that DataSync Discovery collects about the volume.
    */
  var MaxP95Performance: js.UndefOr[typings.awsSdk.clientsDatasyncMod.MaxP95Performance] = js.undefined
  
  /**
    * The number of NFS volumes in the volume.
    */
  var NfsExported: js.UndefOr[PtolemyBoolean] = js.undefined
  
  /**
    * Indicates whether DataSync Discovery recommendations for the volume are ready to view, incomplete, or can't be determined. For more information, see Recommendation statuses.
    */
  var RecommendationStatus: js.UndefOr[typings.awsSdk.clientsDatasyncMod.RecommendationStatus] = js.undefined
  
  /**
    * The Amazon Web Services storage services that DataSync Discovery recommends for the volume. For more information, see Recommendations provided by DataSync Discovery.
    */
  var Recommendations: js.UndefOr[typings.awsSdk.clientsDatasyncMod.Recommendations] = js.undefined
  
  /**
    * The universally unique identifier (UUID) of the volume.
    */
  var ResourceId: js.UndefOr[PtolemyUUID] = js.undefined
  
  /**
    * The volume's security style (such as Unix or NTFS).
    */
  var SecurityStyle: js.UndefOr[PtolemyString] = js.undefined
  
  /**
    * The amount of storage in the volume that's being used for snapshots.
    */
  var SnapshotCapacityUsed: js.UndefOr[NonNegativeLong] = js.undefined
  
  /**
    * The name of the SVM associated with the volume.
    */
  var SvmName: js.UndefOr[PtolemyString] = js.undefined
  
  /**
    * The UUID of the storage virtual machine (SVM) associated with the volume.
    */
  var SvmUuid: js.UndefOr[PtolemyUUID] = js.undefined
  
  /**
    * The name of the volume.
    */
  var VolumeName: js.UndefOr[PtolemyString] = js.undefined
}
object NetAppONTAPVolume {
  
  inline def apply(): NetAppONTAPVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetAppONTAPVolume]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetAppONTAPVolume] (val x: Self) extends AnyVal {
    
    inline def setCapacityProvisioned(value: NonNegativeLong): Self = StObject.set(x, "CapacityProvisioned", value.asInstanceOf[js.Any])
    
    inline def setCapacityProvisionedUndefined: Self = StObject.set(x, "CapacityProvisioned", js.undefined)
    
    inline def setCapacityUsed(value: NonNegativeLong): Self = StObject.set(x, "CapacityUsed", value.asInstanceOf[js.Any])
    
    inline def setCapacityUsedUndefined: Self = StObject.set(x, "CapacityUsed", js.undefined)
    
    inline def setCifsShareCount(value: NonNegativeLong): Self = StObject.set(x, "CifsShareCount", value.asInstanceOf[js.Any])
    
    inline def setCifsShareCountUndefined: Self = StObject.set(x, "CifsShareCount", js.undefined)
    
    inline def setLogicalCapacityUsed(value: NonNegativeLong): Self = StObject.set(x, "LogicalCapacityUsed", value.asInstanceOf[js.Any])
    
    inline def setLogicalCapacityUsedUndefined: Self = StObject.set(x, "LogicalCapacityUsed", js.undefined)
    
    inline def setMaxP95Performance(value: MaxP95Performance): Self = StObject.set(x, "MaxP95Performance", value.asInstanceOf[js.Any])
    
    inline def setMaxP95PerformanceUndefined: Self = StObject.set(x, "MaxP95Performance", js.undefined)
    
    inline def setNfsExported(value: PtolemyBoolean): Self = StObject.set(x, "NfsExported", value.asInstanceOf[js.Any])
    
    inline def setNfsExportedUndefined: Self = StObject.set(x, "NfsExported", js.undefined)
    
    inline def setRecommendationStatus(value: RecommendationStatus): Self = StObject.set(x, "RecommendationStatus", value.asInstanceOf[js.Any])
    
    inline def setRecommendationStatusUndefined: Self = StObject.set(x, "RecommendationStatus", js.undefined)
    
    inline def setRecommendations(value: Recommendations): Self = StObject.set(x, "Recommendations", value.asInstanceOf[js.Any])
    
    inline def setRecommendationsUndefined: Self = StObject.set(x, "Recommendations", js.undefined)
    
    inline def setRecommendationsVarargs(value: Recommendation*): Self = StObject.set(x, "Recommendations", js.Array(value*))
    
    inline def setResourceId(value: PtolemyUUID): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setSecurityStyle(value: PtolemyString): Self = StObject.set(x, "SecurityStyle", value.asInstanceOf[js.Any])
    
    inline def setSecurityStyleUndefined: Self = StObject.set(x, "SecurityStyle", js.undefined)
    
    inline def setSnapshotCapacityUsed(value: NonNegativeLong): Self = StObject.set(x, "SnapshotCapacityUsed", value.asInstanceOf[js.Any])
    
    inline def setSnapshotCapacityUsedUndefined: Self = StObject.set(x, "SnapshotCapacityUsed", js.undefined)
    
    inline def setSvmName(value: PtolemyString): Self = StObject.set(x, "SvmName", value.asInstanceOf[js.Any])
    
    inline def setSvmNameUndefined: Self = StObject.set(x, "SvmName", js.undefined)
    
    inline def setSvmUuid(value: PtolemyUUID): Self = StObject.set(x, "SvmUuid", value.asInstanceOf[js.Any])
    
    inline def setSvmUuidUndefined: Self = StObject.set(x, "SvmUuid", js.undefined)
    
    inline def setVolumeName(value: PtolemyString): Self = StObject.set(x, "VolumeName", value.asInstanceOf[js.Any])
    
    inline def setVolumeNameUndefined: Self = StObject.set(x, "VolumeName", js.undefined)
  }
}
