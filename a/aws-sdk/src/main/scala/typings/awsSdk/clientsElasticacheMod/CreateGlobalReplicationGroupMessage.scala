package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGlobalReplicationGroupMessage extends StObject {
  
  /**
    * Provides details of the Global datastore
    */
  var GlobalReplicationGroupDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The suffix name of a Global datastore. Amazon ElastiCache automatically applies a prefix to the Global datastore ID when it is created. Each Amazon Region has its own prefix. For instance, a Global datastore ID created in the US-West-1 region will begin with "dsdfu" along with the suffix name you provide. The suffix, combined with the auto-generated prefix, guarantees uniqueness of the Global datastore name across multiple regions.  For a full list of Amazon Regions and their respective Global datastore iD prefixes, see Using the Amazon CLI with Global datastores .
    */
  var GlobalReplicationGroupIdSuffix: String
  
  /**
    * The name of the primary cluster that accepts writes and will replicate updates to the secondary cluster.
    */
  var PrimaryReplicationGroupId: String
}
object CreateGlobalReplicationGroupMessage {
  
  inline def apply(GlobalReplicationGroupIdSuffix: String, PrimaryReplicationGroupId: String): CreateGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(GlobalReplicationGroupIdSuffix = GlobalReplicationGroupIdSuffix.asInstanceOf[js.Any], PrimaryReplicationGroupId = PrimaryReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGlobalReplicationGroupMessage]
  }
  
  extension [Self <: CreateGlobalReplicationGroupMessage](x: Self) {
    
    inline def setGlobalReplicationGroupDescription(value: String): Self = StObject.set(x, "GlobalReplicationGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setGlobalReplicationGroupDescriptionUndefined: Self = StObject.set(x, "GlobalReplicationGroupDescription", js.undefined)
    
    inline def setGlobalReplicationGroupIdSuffix(value: String): Self = StObject.set(x, "GlobalReplicationGroupIdSuffix", value.asInstanceOf[js.Any])
    
    inline def setPrimaryReplicationGroupId(value: String): Self = StObject.set(x, "PrimaryReplicationGroupId", value.asInstanceOf[js.Any])
  }
}
