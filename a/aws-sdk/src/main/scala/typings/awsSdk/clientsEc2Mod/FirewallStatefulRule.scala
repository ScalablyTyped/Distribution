package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallStatefulRule extends StObject {
  
  /**
    * The destination ports.
    */
  var DestinationPorts: js.UndefOr[PortRangeList] = js.undefined
  
  /**
    * The destination IP addresses, in CIDR notation.
    */
  var Destinations: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The direction. The possible values are FORWARD and ANY.
    */
  var Direction: js.UndefOr[String] = js.undefined
  
  /**
    * The protocol.
    */
  var Protocol: js.UndefOr[String] = js.undefined
  
  /**
    * The rule action. The possible values are pass, drop, and alert.
    */
  var RuleAction: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the stateful rule group.
    */
  var RuleGroupArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The source ports.
    */
  var SourcePorts: js.UndefOr[PortRangeList] = js.undefined
  
  /**
    * The source IP addresses, in CIDR notation.
    */
  var Sources: js.UndefOr[ValueStringList] = js.undefined
}
object FirewallStatefulRule {
  
  inline def apply(): FirewallStatefulRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallStatefulRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirewallStatefulRule] (val x: Self) extends AnyVal {
    
    inline def setDestinationPorts(value: PortRangeList): Self = StObject.set(x, "DestinationPorts", value.asInstanceOf[js.Any])
    
    inline def setDestinationPortsUndefined: Self = StObject.set(x, "DestinationPorts", js.undefined)
    
    inline def setDestinationPortsVarargs(value: PortRange*): Self = StObject.set(x, "DestinationPorts", js.Array(value*))
    
    inline def setDestinations(value: ValueStringList): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: String*): Self = StObject.set(x, "Destinations", js.Array(value*))
    
    inline def setDirection(value: String): Self = StObject.set(x, "Direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "Direction", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setRuleAction(value: String): Self = StObject.set(x, "RuleAction", value.asInstanceOf[js.Any])
    
    inline def setRuleActionUndefined: Self = StObject.set(x, "RuleAction", js.undefined)
    
    inline def setRuleGroupArn(value: ResourceArn): Self = StObject.set(x, "RuleGroupArn", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupArnUndefined: Self = StObject.set(x, "RuleGroupArn", js.undefined)
    
    inline def setSourcePorts(value: PortRangeList): Self = StObject.set(x, "SourcePorts", value.asInstanceOf[js.Any])
    
    inline def setSourcePortsUndefined: Self = StObject.set(x, "SourcePorts", js.undefined)
    
    inline def setSourcePortsVarargs(value: PortRange*): Self = StObject.set(x, "SourcePorts", js.Array(value*))
    
    inline def setSources(value: ValueStringList): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "Sources", js.undefined)
    
    inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "Sources", js.Array(value*))
  }
}
