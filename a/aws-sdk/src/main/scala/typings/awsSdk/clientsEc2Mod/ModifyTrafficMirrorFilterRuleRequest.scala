package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyTrafficMirrorFilterRuleRequest extends StObject {
  
  /**
    * The description to assign to the Traffic Mirror rule.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The destination CIDR block to assign to the Traffic Mirror rule.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * The destination ports that are associated with the Traffic Mirror rule.
    */
  var DestinationPortRange: js.UndefOr[TrafficMirrorPortRangeRequest] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The protocol, for example TCP, to assign to the Traffic Mirror rule.
    */
  var Protocol: js.UndefOr[Integer] = js.undefined
  
  /**
    * The properties that you want to remove from the Traffic Mirror filter rule. When you remove a property from a Traffic Mirror filter rule, the property is set to the default.
    */
  var RemoveFields: js.UndefOr[TrafficMirrorFilterRuleFieldList] = js.undefined
  
  /**
    * The action to assign to the rule.
    */
  var RuleAction: js.UndefOr[TrafficMirrorRuleAction] = js.undefined
  
  /**
    * The number of the Traffic Mirror rule. This number must be unique for each Traffic Mirror rule in a given direction. The rules are processed in ascending order by rule number.
    */
  var RuleNumber: js.UndefOr[Integer] = js.undefined
  
  /**
    * The source CIDR block to assign to the Traffic Mirror rule.
    */
  var SourceCidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * The port range to assign to the Traffic Mirror rule.
    */
  var SourcePortRange: js.UndefOr[TrafficMirrorPortRangeRequest] = js.undefined
  
  /**
    * The type of traffic to assign to the rule.
    */
  var TrafficDirection: js.UndefOr[typings.awsSdk.clientsEc2Mod.TrafficDirection] = js.undefined
  
  /**
    * The ID of the Traffic Mirror rule.
    */
  var TrafficMirrorFilterRuleId: typings.awsSdk.clientsEc2Mod.TrafficMirrorFilterRuleId
}
object ModifyTrafficMirrorFilterRuleRequest {
  
  inline def apply(TrafficMirrorFilterRuleId: TrafficMirrorFilterRuleId): ModifyTrafficMirrorFilterRuleRequest = {
    val __obj = js.Dynamic.literal(TrafficMirrorFilterRuleId = TrafficMirrorFilterRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyTrafficMirrorFilterRuleRequest]
  }
  
  extension [Self <: ModifyTrafficMirrorFilterRuleRequest](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDestinationCidrBlock(value: String): Self = StObject.set(x, "DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    inline def setDestinationCidrBlockUndefined: Self = StObject.set(x, "DestinationCidrBlock", js.undefined)
    
    inline def setDestinationPortRange(value: TrafficMirrorPortRangeRequest): Self = StObject.set(x, "DestinationPortRange", value.asInstanceOf[js.Any])
    
    inline def setDestinationPortRangeUndefined: Self = StObject.set(x, "DestinationPortRange", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setProtocol(value: Integer): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setRemoveFields(value: TrafficMirrorFilterRuleFieldList): Self = StObject.set(x, "RemoveFields", value.asInstanceOf[js.Any])
    
    inline def setRemoveFieldsUndefined: Self = StObject.set(x, "RemoveFields", js.undefined)
    
    inline def setRemoveFieldsVarargs(value: TrafficMirrorFilterRuleField*): Self = StObject.set(x, "RemoveFields", js.Array(value*))
    
    inline def setRuleAction(value: TrafficMirrorRuleAction): Self = StObject.set(x, "RuleAction", value.asInstanceOf[js.Any])
    
    inline def setRuleActionUndefined: Self = StObject.set(x, "RuleAction", js.undefined)
    
    inline def setRuleNumber(value: Integer): Self = StObject.set(x, "RuleNumber", value.asInstanceOf[js.Any])
    
    inline def setRuleNumberUndefined: Self = StObject.set(x, "RuleNumber", js.undefined)
    
    inline def setSourceCidrBlock(value: String): Self = StObject.set(x, "SourceCidrBlock", value.asInstanceOf[js.Any])
    
    inline def setSourceCidrBlockUndefined: Self = StObject.set(x, "SourceCidrBlock", js.undefined)
    
    inline def setSourcePortRange(value: TrafficMirrorPortRangeRequest): Self = StObject.set(x, "SourcePortRange", value.asInstanceOf[js.Any])
    
    inline def setSourcePortRangeUndefined: Self = StObject.set(x, "SourcePortRange", js.undefined)
    
    inline def setTrafficDirection(value: TrafficDirection): Self = StObject.set(x, "TrafficDirection", value.asInstanceOf[js.Any])
    
    inline def setTrafficDirectionUndefined: Self = StObject.set(x, "TrafficDirection", js.undefined)
    
    inline def setTrafficMirrorFilterRuleId(value: TrafficMirrorFilterRuleId): Self = StObject.set(x, "TrafficMirrorFilterRuleId", value.asInstanceOf[js.Any])
  }
}
