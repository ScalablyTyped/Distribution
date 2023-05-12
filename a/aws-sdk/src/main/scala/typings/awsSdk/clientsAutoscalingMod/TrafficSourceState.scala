package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficSourceState extends StObject {
  
  /**
    * The unique identifier of the traffic source.
    */
  var Identifier: js.UndefOr[XmlStringMaxLen511] = js.undefined
  
  /**
    * Describes the current state of a traffic source. The state values are as follows:    Adding - The Auto Scaling instances are being registered with the load balancer or target group.    Added - All Auto Scaling instances are registered with the load balancer or target group.    InService - For an Elastic Load Balancing load balancer or target group, at least one Auto Scaling instance passed an ELB health check. For VPC Lattice, at least one Auto Scaling instance passed an VPC_LATTICE health check.    Removing - The Auto Scaling instances are being deregistered from the load balancer or target group. If connection draining (deregistration delay) is enabled, Elastic Load Balancing or VPC Lattice waits for in-flight requests to complete before deregistering the instances.    Removed - All Auto Scaling instances are deregistered from the load balancer or target group.  
    */
  var State: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * This is replaced by Identifier.
    */
  var TrafficSource: js.UndefOr[XmlStringMaxLen511] = js.undefined
  
  /**
    * Provides additional context for the value of Identifier. The following lists the valid values:    elb if Identifier is the name of a Classic Load Balancer.    elbv2 if Identifier is the ARN of an Application Load Balancer, Gateway Load Balancer, or Network Load Balancer target group.    vpc-lattice if Identifier is the ARN of a VPC Lattice target group.   Required if the identifier is the name of a Classic Load Balancer.
    */
  var Type: js.UndefOr[XmlStringMaxLen511] = js.undefined
}
object TrafficSourceState {
  
  inline def apply(): TrafficSourceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficSourceState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrafficSourceState] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: XmlStringMaxLen511): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "Identifier", js.undefined)
    
    inline def setState(value: XmlStringMaxLen255): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTrafficSource(value: XmlStringMaxLen511): Self = StObject.set(x, "TrafficSource", value.asInstanceOf[js.Any])
    
    inline def setTrafficSourceUndefined: Self = StObject.set(x, "TrafficSource", js.undefined)
    
    inline def setType(value: XmlStringMaxLen511): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
