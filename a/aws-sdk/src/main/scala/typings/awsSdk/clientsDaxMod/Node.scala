package typings.awsSdk.clientsDaxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  /**
    * The Availability Zone (AZ) in which the node has been deployed.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The endpoint for the node, consisting of a DNS name and a port number. Client applications can connect directly to a node endpoint, if desired (as an alternative to allowing DAX client software to intelligently route requests and responses to nodes in the DAX cluster.
    */
  var Endpoint: js.UndefOr[typings.awsSdk.clientsDaxMod.Endpoint] = js.undefined
  
  /**
    * The date and time (in UNIX epoch format) when the node was launched.
    */
  var NodeCreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A system-generated identifier for the node.
    */
  var NodeId: js.UndefOr[String] = js.undefined
  
  /**
    * The current status of the node. For example: available.
    */
  var NodeStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the parameter group associated with this node. For example, in-sync.
    */
  var ParameterGroupStatus: js.UndefOr[String] = js.undefined
}
object Node {
  
  inline def apply(): Node = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Node]
  }
  
  extension [Self <: Node](x: Self) {
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setEndpoint(value: Endpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    inline def setNodeCreateTime(value: js.Date): Self = StObject.set(x, "NodeCreateTime", value.asInstanceOf[js.Any])
    
    inline def setNodeCreateTimeUndefined: Self = StObject.set(x, "NodeCreateTime", js.undefined)
    
    inline def setNodeId(value: String): Self = StObject.set(x, "NodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "NodeId", js.undefined)
    
    inline def setNodeStatus(value: String): Self = StObject.set(x, "NodeStatus", value.asInstanceOf[js.Any])
    
    inline def setNodeStatusUndefined: Self = StObject.set(x, "NodeStatus", js.undefined)
    
    inline def setParameterGroupStatus(value: String): Self = StObject.set(x, "ParameterGroupStatus", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupStatusUndefined: Self = StObject.set(x, "ParameterGroupStatus", js.undefined)
  }
}
