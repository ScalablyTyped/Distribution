package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetAppONTAPSVM extends StObject {
  
  /**
    * The number of CIFS shares in the SVM.
    */
  var CifsShareCount: js.UndefOr[NonNegativeLong] = js.undefined
  
  /**
    * The universally unique identifier (UUID) of the cluster associated with the SVM.
    */
  var ClusterUuid: js.UndefOr[PtolemyUUID] = js.undefined
  
  /**
    * The data transfer protocols (such as NFS) configured for the SVM.
    */
  var EnabledProtocols: js.UndefOr[typings.awsSdk.clientsDatasyncMod.EnabledProtocols] = js.undefined
  
  /**
    * The performance data that DataSync Discovery collects about the SVM.
    */
  var MaxP95Performance: js.UndefOr[typings.awsSdk.clientsDatasyncMod.MaxP95Performance] = js.undefined
  
  /**
    * The number of NFS volumes in the SVM.
    */
  var NfsExportedVolumes: js.UndefOr[NonNegativeLong] = js.undefined
  
  /**
    * Indicates whether DataSync Discovery recommendations for the SVM are ready to view, incomplete, or can't be determined. For more information, see Recommendation statuses.
    */
  var RecommendationStatus: js.UndefOr[typings.awsSdk.clientsDatasyncMod.RecommendationStatus] = js.undefined
  
  /**
    * The Amazon Web Services storage services that DataSync Discovery recommends for the SVM. For more information, see Recommendations provided by DataSync Discovery.
    */
  var Recommendations: js.UndefOr[typings.awsSdk.clientsDatasyncMod.Recommendations] = js.undefined
  
  /**
    * The UUID of the SVM.
    */
  var ResourceId: js.UndefOr[PtolemyUUID] = js.undefined
  
  /**
    * The name of the SVM
    */
  var SvmName: js.UndefOr[PtolemyString] = js.undefined
  
  /**
    * The total storage space that's available in the SVM.
    */
  var TotalCapacityProvisioned: js.UndefOr[NonNegativeLong] = js.undefined
  
  /**
    * The storage space that's being used in the SVM.
    */
  var TotalCapacityUsed: js.UndefOr[NonNegativeLong] = js.undefined
  
  /**
    * The storage space that's being used in the SVM without accounting for compression or deduplication.
    */
  var TotalLogicalCapacityUsed: js.UndefOr[NonNegativeLong] = js.undefined
  
  /**
    * The amount of storage in the SVM that's being used for snapshots.
    */
  var TotalSnapshotCapacityUsed: js.UndefOr[NonNegativeLong] = js.undefined
}
object NetAppONTAPSVM {
  
  inline def apply(): NetAppONTAPSVM = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetAppONTAPSVM]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetAppONTAPSVM] (val x: Self) extends AnyVal {
    
    inline def setCifsShareCount(value: NonNegativeLong): Self = StObject.set(x, "CifsShareCount", value.asInstanceOf[js.Any])
    
    inline def setCifsShareCountUndefined: Self = StObject.set(x, "CifsShareCount", js.undefined)
    
    inline def setClusterUuid(value: PtolemyUUID): Self = StObject.set(x, "ClusterUuid", value.asInstanceOf[js.Any])
    
    inline def setClusterUuidUndefined: Self = StObject.set(x, "ClusterUuid", js.undefined)
    
    inline def setEnabledProtocols(value: EnabledProtocols): Self = StObject.set(x, "EnabledProtocols", value.asInstanceOf[js.Any])
    
    inline def setEnabledProtocolsUndefined: Self = StObject.set(x, "EnabledProtocols", js.undefined)
    
    inline def setEnabledProtocolsVarargs(value: PtolemyString*): Self = StObject.set(x, "EnabledProtocols", js.Array(value*))
    
    inline def setMaxP95Performance(value: MaxP95Performance): Self = StObject.set(x, "MaxP95Performance", value.asInstanceOf[js.Any])
    
    inline def setMaxP95PerformanceUndefined: Self = StObject.set(x, "MaxP95Performance", js.undefined)
    
    inline def setNfsExportedVolumes(value: NonNegativeLong): Self = StObject.set(x, "NfsExportedVolumes", value.asInstanceOf[js.Any])
    
    inline def setNfsExportedVolumesUndefined: Self = StObject.set(x, "NfsExportedVolumes", js.undefined)
    
    inline def setRecommendationStatus(value: RecommendationStatus): Self = StObject.set(x, "RecommendationStatus", value.asInstanceOf[js.Any])
    
    inline def setRecommendationStatusUndefined: Self = StObject.set(x, "RecommendationStatus", js.undefined)
    
    inline def setRecommendations(value: Recommendations): Self = StObject.set(x, "Recommendations", value.asInstanceOf[js.Any])
    
    inline def setRecommendationsUndefined: Self = StObject.set(x, "Recommendations", js.undefined)
    
    inline def setRecommendationsVarargs(value: Recommendation*): Self = StObject.set(x, "Recommendations", js.Array(value*))
    
    inline def setResourceId(value: PtolemyUUID): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setSvmName(value: PtolemyString): Self = StObject.set(x, "SvmName", value.asInstanceOf[js.Any])
    
    inline def setSvmNameUndefined: Self = StObject.set(x, "SvmName", js.undefined)
    
    inline def setTotalCapacityProvisioned(value: NonNegativeLong): Self = StObject.set(x, "TotalCapacityProvisioned", value.asInstanceOf[js.Any])
    
    inline def setTotalCapacityProvisionedUndefined: Self = StObject.set(x, "TotalCapacityProvisioned", js.undefined)
    
    inline def setTotalCapacityUsed(value: NonNegativeLong): Self = StObject.set(x, "TotalCapacityUsed", value.asInstanceOf[js.Any])
    
    inline def setTotalCapacityUsedUndefined: Self = StObject.set(x, "TotalCapacityUsed", js.undefined)
    
    inline def setTotalLogicalCapacityUsed(value: NonNegativeLong): Self = StObject.set(x, "TotalLogicalCapacityUsed", value.asInstanceOf[js.Any])
    
    inline def setTotalLogicalCapacityUsedUndefined: Self = StObject.set(x, "TotalLogicalCapacityUsed", js.undefined)
    
    inline def setTotalSnapshotCapacityUsed(value: NonNegativeLong): Self = StObject.set(x, "TotalSnapshotCapacityUsed", value.asInstanceOf[js.Any])
    
    inline def setTotalSnapshotCapacityUsedUndefined: Self = StObject.set(x, "TotalSnapshotCapacityUsed", js.undefined)
  }
}
