package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetAppONTAPCluster extends StObject {
  
  /**
    * The number of CIFS shares in the cluster.
    */
  var CifsShareCount: js.UndefOr[NonNegativeLong] = js.undefined
  
  /**
    * The storage space that's being used in the cluster without accounting for compression or deduplication.
    */
  var ClusterBlockStorageLogicalUsed: js.UndefOr[NonNegativeLong] = js.undefined
  
  /**
    * The total storage space that's available in the cluster.
    */
  var ClusterBlockStorageSize: js.UndefOr[NonNegativeLong] = js.undefined
  
  /**
    * The storage space that's being used in a cluster.
    */
  var ClusterBlockStorageUsed: js.UndefOr[NonNegativeLong] = js.undefined
  
  /**
    * The name of the cluster.
    */
  var ClusterName: js.UndefOr[PtolemyString] = js.undefined
  
  /**
    * The performance data that DataSync Discovery collects about the cluster.
    */
  var MaxP95Performance: js.UndefOr[typings.awsSdk.clientsDatasyncMod.MaxP95Performance] = js.undefined
  
  /**
    * The number of NFS volumes in the cluster.
    */
  var NfsExportedVolumes: js.UndefOr[NonNegativeLong] = js.undefined
  
  /**
    * Indicates whether DataSync Discovery recommendations for the cluster are ready to view, incomplete, or can't be determined. For more information, see Recommendation statuses.
    */
  var RecommendationStatus: js.UndefOr[typings.awsSdk.clientsDatasyncMod.RecommendationStatus] = js.undefined
  
  /**
    * The Amazon Web Services storage services that DataSync Discovery recommends for the cluster. For more information, see Recommendations provided by DataSync Discovery.
    */
  var Recommendations: js.UndefOr[typings.awsSdk.clientsDatasyncMod.Recommendations] = js.undefined
  
  /**
    * The universally unique identifier (UUID) of the cluster.
    */
  var ResourceId: js.UndefOr[PtolemyUUID] = js.undefined
}
object NetAppONTAPCluster {
  
  inline def apply(): NetAppONTAPCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetAppONTAPCluster]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetAppONTAPCluster] (val x: Self) extends AnyVal {
    
    inline def setCifsShareCount(value: NonNegativeLong): Self = StObject.set(x, "CifsShareCount", value.asInstanceOf[js.Any])
    
    inline def setCifsShareCountUndefined: Self = StObject.set(x, "CifsShareCount", js.undefined)
    
    inline def setClusterBlockStorageLogicalUsed(value: NonNegativeLong): Self = StObject.set(x, "ClusterBlockStorageLogicalUsed", value.asInstanceOf[js.Any])
    
    inline def setClusterBlockStorageLogicalUsedUndefined: Self = StObject.set(x, "ClusterBlockStorageLogicalUsed", js.undefined)
    
    inline def setClusterBlockStorageSize(value: NonNegativeLong): Self = StObject.set(x, "ClusterBlockStorageSize", value.asInstanceOf[js.Any])
    
    inline def setClusterBlockStorageSizeUndefined: Self = StObject.set(x, "ClusterBlockStorageSize", js.undefined)
    
    inline def setClusterBlockStorageUsed(value: NonNegativeLong): Self = StObject.set(x, "ClusterBlockStorageUsed", value.asInstanceOf[js.Any])
    
    inline def setClusterBlockStorageUsedUndefined: Self = StObject.set(x, "ClusterBlockStorageUsed", js.undefined)
    
    inline def setClusterName(value: PtolemyString): Self = StObject.set(x, "ClusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "ClusterName", js.undefined)
    
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
  }
}
