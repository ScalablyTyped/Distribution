package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Snapshot extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) of the snapshot.
    */
  var ARN: js.UndefOr[String] = js.undefined
  
  /**
    * The configuration of the cluster from which the snapshot was taken
    */
  var ClusterConfiguration: js.UndefOr[typings.awsSdk.clientsMemorydbMod.ClusterConfiguration] = js.undefined
  
  /**
    * Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This parameter must be set when using r6gd nodes. For more information, see Data tiering.
    */
  var DataTiering: js.UndefOr[DataTieringStatus] = js.undefined
  
  /**
    * The ID of the KMS key used to encrypt the snapshot.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the snapshot
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the snapshot is from an automatic backup (automated) or was created manually (manual).
    */
  var Source: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the snapshot. Valid values: creating | available | restoring | copying | deleting.
    */
  var Status: js.UndefOr[String] = js.undefined
}
object Snapshot {
  
  inline def apply(): Snapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Snapshot]
  }
  
  extension [Self <: Snapshot](x: Self) {
    
    inline def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setClusterConfiguration(value: ClusterConfiguration): Self = StObject.set(x, "ClusterConfiguration", value.asInstanceOf[js.Any])
    
    inline def setClusterConfigurationUndefined: Self = StObject.set(x, "ClusterConfiguration", js.undefined)
    
    inline def setDataTiering(value: DataTieringStatus): Self = StObject.set(x, "DataTiering", value.asInstanceOf[js.Any])
    
    inline def setDataTieringUndefined: Self = StObject.set(x, "DataTiering", js.undefined)
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
