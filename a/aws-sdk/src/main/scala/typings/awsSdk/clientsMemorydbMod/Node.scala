package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  /**
    * The Availability Zone in which the node resides
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time when the node was created.
    */
  var CreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The hostname for connecting to this node.
    */
  var Endpoint: js.UndefOr[typings.awsSdk.clientsMemorydbMod.Endpoint] = js.undefined
  
  /**
    * The node identifier. A node name is a numeric identifier (0001, 0002, etc.). The combination of cluster name, shard name and node name uniquely identifies every node used in a customer's Amazon account.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the service update on the node
    */
  var Status: js.UndefOr[String] = js.undefined
}
object Node {
  
  inline def apply(): Node = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Node]
  }
  
  extension [Self <: Node](x: Self) {
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    inline def setEndpoint(value: Endpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
