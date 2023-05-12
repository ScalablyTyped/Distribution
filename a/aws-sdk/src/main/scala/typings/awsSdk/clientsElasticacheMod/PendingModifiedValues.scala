package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingModifiedValues extends StObject {
  
  /**
    * The auth token status
    */
  var AuthTokenStatus: js.UndefOr[AuthTokenUpdateStatus] = js.undefined
  
  /**
    * A list of cache node IDs that are being removed (or will be removed) from the cluster. A node ID is a 4-digit numeric identifier (0001, 0002, etc.).
    */
  var CacheNodeIdsToRemove: js.UndefOr[CacheNodeIdsList] = js.undefined
  
  /**
    * The cache node type that this cluster or replication group is scaled to.
    */
  var CacheNodeType: js.UndefOr[String] = js.undefined
  
  /**
    * The new cache engine version that the cluster runs.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The log delivery configurations being modified 
    */
  var LogDeliveryConfigurations: js.UndefOr[PendingLogDeliveryConfigurationList] = js.undefined
  
  /**
    * The new number of cache nodes for the cluster. For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1 and 40.
    */
  var NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A flag that enables in-transit encryption when set to true.
    */
  var TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A setting that allows you to migrate your clients to use in-transit encryption, with no downtime.
    */
  var TransitEncryptionMode: js.UndefOr[typings.awsSdk.clientsElasticacheMod.TransitEncryptionMode] = js.undefined
}
object PendingModifiedValues {
  
  inline def apply(): PendingModifiedValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingModifiedValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PendingModifiedValues] (val x: Self) extends AnyVal {
    
    inline def setAuthTokenStatus(value: AuthTokenUpdateStatus): Self = StObject.set(x, "AuthTokenStatus", value.asInstanceOf[js.Any])
    
    inline def setAuthTokenStatusUndefined: Self = StObject.set(x, "AuthTokenStatus", js.undefined)
    
    inline def setCacheNodeIdsToRemove(value: CacheNodeIdsList): Self = StObject.set(x, "CacheNodeIdsToRemove", value.asInstanceOf[js.Any])
    
    inline def setCacheNodeIdsToRemoveUndefined: Self = StObject.set(x, "CacheNodeIdsToRemove", js.undefined)
    
    inline def setCacheNodeIdsToRemoveVarargs(value: String*): Self = StObject.set(x, "CacheNodeIdsToRemove", js.Array(value*))
    
    inline def setCacheNodeType(value: String): Self = StObject.set(x, "CacheNodeType", value.asInstanceOf[js.Any])
    
    inline def setCacheNodeTypeUndefined: Self = StObject.set(x, "CacheNodeType", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setLogDeliveryConfigurations(value: PendingLogDeliveryConfigurationList): Self = StObject.set(x, "LogDeliveryConfigurations", value.asInstanceOf[js.Any])
    
    inline def setLogDeliveryConfigurationsUndefined: Self = StObject.set(x, "LogDeliveryConfigurations", js.undefined)
    
    inline def setLogDeliveryConfigurationsVarargs(value: PendingLogDeliveryConfiguration*): Self = StObject.set(x, "LogDeliveryConfigurations", js.Array(value*))
    
    inline def setNumCacheNodes(value: IntegerOptional): Self = StObject.set(x, "NumCacheNodes", value.asInstanceOf[js.Any])
    
    inline def setNumCacheNodesUndefined: Self = StObject.set(x, "NumCacheNodes", js.undefined)
    
    inline def setTransitEncryptionEnabled(value: BooleanOptional): Self = StObject.set(x, "TransitEncryptionEnabled", value.asInstanceOf[js.Any])
    
    inline def setTransitEncryptionEnabledUndefined: Self = StObject.set(x, "TransitEncryptionEnabled", js.undefined)
    
    inline def setTransitEncryptionMode(value: TransitEncryptionMode): Self = StObject.set(x, "TransitEncryptionMode", value.asInstanceOf[js.Any])
    
    inline def setTransitEncryptionModeUndefined: Self = StObject.set(x, "TransitEncryptionMode", js.undefined)
  }
}
