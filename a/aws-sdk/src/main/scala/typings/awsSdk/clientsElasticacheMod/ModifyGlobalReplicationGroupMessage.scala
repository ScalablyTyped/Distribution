package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyGlobalReplicationGroupMessage extends StObject {
  
  /**
    * This parameter causes the modifications in this request and any pending modifications to be applied, asynchronously and as soon as possible. Modifications to Global Replication Groups cannot be requested to be applied in PreferredMaintenceWindow. 
    */
  var ApplyImmediately: Boolean
  
  /**
    * Determines whether a read replica is automatically promoted to read/write primary if the existing primary encounters a failure. 
    */
  var AutomaticFailoverEnabled: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A valid cache node type that you want to scale this Global datastore to.
    */
  var CacheNodeType: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the cache parameter group to use with the Global datastore. It must be compatible with the major engine version used by the Global datastore.
    */
  var CacheParameterGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The upgraded version of the cache engine to be run on the clusters in the Global datastore. 
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the Global datastore
    */
  var GlobalReplicationGroupDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Global datastore
    */
  var GlobalReplicationGroupId: String
}
object ModifyGlobalReplicationGroupMessage {
  
  inline def apply(ApplyImmediately: Boolean, GlobalReplicationGroupId: String): ModifyGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(ApplyImmediately = ApplyImmediately.asInstanceOf[js.Any], GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyGlobalReplicationGroupMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyGlobalReplicationGroupMessage] (val x: Self) extends AnyVal {
    
    inline def setApplyImmediately(value: Boolean): Self = StObject.set(x, "ApplyImmediately", value.asInstanceOf[js.Any])
    
    inline def setAutomaticFailoverEnabled(value: BooleanOptional): Self = StObject.set(x, "AutomaticFailoverEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutomaticFailoverEnabledUndefined: Self = StObject.set(x, "AutomaticFailoverEnabled", js.undefined)
    
    inline def setCacheNodeType(value: String): Self = StObject.set(x, "CacheNodeType", value.asInstanceOf[js.Any])
    
    inline def setCacheNodeTypeUndefined: Self = StObject.set(x, "CacheNodeType", js.undefined)
    
    inline def setCacheParameterGroupName(value: String): Self = StObject.set(x, "CacheParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setCacheParameterGroupNameUndefined: Self = StObject.set(x, "CacheParameterGroupName", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setGlobalReplicationGroupDescription(value: String): Self = StObject.set(x, "GlobalReplicationGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setGlobalReplicationGroupDescriptionUndefined: Self = StObject.set(x, "GlobalReplicationGroupDescription", js.undefined)
    
    inline def setGlobalReplicationGroupId(value: String): Self = StObject.set(x, "GlobalReplicationGroupId", value.asInstanceOf[js.Any])
  }
}
