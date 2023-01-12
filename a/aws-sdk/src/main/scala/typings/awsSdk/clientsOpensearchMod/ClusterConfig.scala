package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterConfig extends StObject {
  
  /**
    * Container for cold storage configuration options.
    */
  var ColdStorageOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ColdStorageOptions] = js.undefined
  
  /**
    * Number of dedicated master nodes in the cluster. This number must be greater than 1, otherwise you receive a validation exception.
    */
  var DedicatedMasterCount: js.UndefOr[IntegerClass] = js.undefined
  
  /**
    * Indicates whether dedicated master nodes are enabled for the cluster.True if the cluster will use a dedicated master node.False if the cluster will not.
    */
  var DedicatedMasterEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * OpenSearch Service instance type of the dedicated master nodes in the cluster.
    */
  var DedicatedMasterType: js.UndefOr[OpenSearchPartitionInstanceType] = js.undefined
  
  /**
    * Number of dedicated master nodes in the cluster. This number must be greater than 1, otherwise you receive a validation exception.
    */
  var InstanceCount: js.UndefOr[IntegerClass] = js.undefined
  
  /**
    * Instance type of data nodes in the cluster.
    */
  var InstanceType: js.UndefOr[OpenSearchPartitionInstanceType] = js.undefined
  
  /**
    * The number of warm nodes in the cluster.
    */
  var WarmCount: js.UndefOr[IntegerClass] = js.undefined
  
  /**
    * Whether to enable warm storage for the cluster.
    */
  var WarmEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The instance type for the cluster's warm nodes.
    */
  var WarmType: js.UndefOr[OpenSearchWarmPartitionInstanceType] = js.undefined
  
  /**
    * Container for zone awareness configuration options. Only required if ZoneAwarenessEnabled is true.
    */
  var ZoneAwarenessConfig: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ZoneAwarenessConfig] = js.undefined
  
  /**
    * Indicates whether multiple Availability Zones are enabled. For more information, see Configuring a multi-AZ domain in Amazon OpenSearch Service.
    */
  var ZoneAwarenessEnabled: js.UndefOr[Boolean] = js.undefined
}
object ClusterConfig {
  
  inline def apply(): ClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterConfig] (val x: Self) extends AnyVal {
    
    inline def setColdStorageOptions(value: ColdStorageOptions): Self = StObject.set(x, "ColdStorageOptions", value.asInstanceOf[js.Any])
    
    inline def setColdStorageOptionsUndefined: Self = StObject.set(x, "ColdStorageOptions", js.undefined)
    
    inline def setDedicatedMasterCount(value: IntegerClass): Self = StObject.set(x, "DedicatedMasterCount", value.asInstanceOf[js.Any])
    
    inline def setDedicatedMasterCountUndefined: Self = StObject.set(x, "DedicatedMasterCount", js.undefined)
    
    inline def setDedicatedMasterEnabled(value: Boolean): Self = StObject.set(x, "DedicatedMasterEnabled", value.asInstanceOf[js.Any])
    
    inline def setDedicatedMasterEnabledUndefined: Self = StObject.set(x, "DedicatedMasterEnabled", js.undefined)
    
    inline def setDedicatedMasterType(value: OpenSearchPartitionInstanceType): Self = StObject.set(x, "DedicatedMasterType", value.asInstanceOf[js.Any])
    
    inline def setDedicatedMasterTypeUndefined: Self = StObject.set(x, "DedicatedMasterType", js.undefined)
    
    inline def setInstanceCount(value: IntegerClass): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
    
    inline def setInstanceType(value: OpenSearchPartitionInstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setWarmCount(value: IntegerClass): Self = StObject.set(x, "WarmCount", value.asInstanceOf[js.Any])
    
    inline def setWarmCountUndefined: Self = StObject.set(x, "WarmCount", js.undefined)
    
    inline def setWarmEnabled(value: Boolean): Self = StObject.set(x, "WarmEnabled", value.asInstanceOf[js.Any])
    
    inline def setWarmEnabledUndefined: Self = StObject.set(x, "WarmEnabled", js.undefined)
    
    inline def setWarmType(value: OpenSearchWarmPartitionInstanceType): Self = StObject.set(x, "WarmType", value.asInstanceOf[js.Any])
    
    inline def setWarmTypeUndefined: Self = StObject.set(x, "WarmType", js.undefined)
    
    inline def setZoneAwarenessConfig(value: ZoneAwarenessConfig): Self = StObject.set(x, "ZoneAwarenessConfig", value.asInstanceOf[js.Any])
    
    inline def setZoneAwarenessConfigUndefined: Self = StObject.set(x, "ZoneAwarenessConfig", js.undefined)
    
    inline def setZoneAwarenessEnabled(value: Boolean): Self = StObject.set(x, "ZoneAwarenessEnabled", value.asInstanceOf[js.Any])
    
    inline def setZoneAwarenessEnabledUndefined: Self = StObject.set(x, "ZoneAwarenessEnabled", js.undefined)
  }
}
