package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeGroupConfiguration extends StObject {
  
  /**
    * Either the ElastiCache for Redis supplied 4-digit id or a user supplied id for the node group these configuration values apply to.
    */
  var NodeGroupId: js.UndefOr[AllowedNodeGroupId] = js.undefined
  
  /**
    * The Availability Zone where the primary node of this node group (shard) is launched.
    */
  var PrimaryAvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The outpost ARN of the primary node.
    */
  var PrimaryOutpostArn: js.UndefOr[String] = js.undefined
  
  /**
    * A list of Availability Zones to be used for the read replicas. The number of Availability Zones in this list must match the value of ReplicaCount or ReplicasPerNodeGroup if not specified.
    */
  var ReplicaAvailabilityZones: js.UndefOr[AvailabilityZonesList] = js.undefined
  
  /**
    * The number of read replica nodes in this node group (shard).
    */
  var ReplicaCount: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The outpost ARN of the node replicas.
    */
  var ReplicaOutpostArns: js.UndefOr[OutpostArnsList] = js.undefined
  
  /**
    * A string that specifies the keyspace for a particular node group. Keyspaces range from 0 to 16,383. The string is in the format startkey-endkey. Example: "0-3999" 
    */
  var Slots: js.UndefOr[String] = js.undefined
}
object NodeGroupConfiguration {
  
  inline def apply(): NodeGroupConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeGroupConfiguration] (val x: Self) extends AnyVal {
    
    inline def setNodeGroupId(value: AllowedNodeGroupId): Self = StObject.set(x, "NodeGroupId", value.asInstanceOf[js.Any])
    
    inline def setNodeGroupIdUndefined: Self = StObject.set(x, "NodeGroupId", js.undefined)
    
    inline def setPrimaryAvailabilityZone(value: String): Self = StObject.set(x, "PrimaryAvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setPrimaryAvailabilityZoneUndefined: Self = StObject.set(x, "PrimaryAvailabilityZone", js.undefined)
    
    inline def setPrimaryOutpostArn(value: String): Self = StObject.set(x, "PrimaryOutpostArn", value.asInstanceOf[js.Any])
    
    inline def setPrimaryOutpostArnUndefined: Self = StObject.set(x, "PrimaryOutpostArn", js.undefined)
    
    inline def setReplicaAvailabilityZones(value: AvailabilityZonesList): Self = StObject.set(x, "ReplicaAvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setReplicaAvailabilityZonesUndefined: Self = StObject.set(x, "ReplicaAvailabilityZones", js.undefined)
    
    inline def setReplicaAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "ReplicaAvailabilityZones", js.Array(value*))
    
    inline def setReplicaCount(value: IntegerOptional): Self = StObject.set(x, "ReplicaCount", value.asInstanceOf[js.Any])
    
    inline def setReplicaCountUndefined: Self = StObject.set(x, "ReplicaCount", js.undefined)
    
    inline def setReplicaOutpostArns(value: OutpostArnsList): Self = StObject.set(x, "ReplicaOutpostArns", value.asInstanceOf[js.Any])
    
    inline def setReplicaOutpostArnsUndefined: Self = StObject.set(x, "ReplicaOutpostArns", js.undefined)
    
    inline def setReplicaOutpostArnsVarargs(value: String*): Self = StObject.set(x, "ReplicaOutpostArns", js.Array(value*))
    
    inline def setSlots(value: String): Self = StObject.set(x, "Slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "Slots", js.undefined)
  }
}
