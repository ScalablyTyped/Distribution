package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceViolation extends StObject {
  
  /**
    * Violation detail for an EC2 instance.
    */
  var AwsEc2InstanceViolation: js.UndefOr[typings.awsSdk.clientsFmsMod.AwsEc2InstanceViolation] = js.undefined
  
  /**
    * Violation detail for a network interface.
    */
  var AwsEc2NetworkInterfaceViolation: js.UndefOr[typings.awsSdk.clientsFmsMod.AwsEc2NetworkInterfaceViolation] = js.undefined
  
  /**
    * Violation detail for security groups.
    */
  var AwsVPCSecurityGroupViolation: js.UndefOr[typings.awsSdk.clientsFmsMod.AwsVPCSecurityGroupViolation] = js.undefined
  
  /**
    * Violation detail for a DNS Firewall policy that indicates that a rule group that Firewall Manager tried to associate with a VPC is already associated with the VPC and can't be associated again. 
    */
  var DnsDuplicateRuleGroupViolation: js.UndefOr[typings.awsSdk.clientsFmsMod.DnsDuplicateRuleGroupViolation] = js.undefined
  
  /**
    * Violation detail for a DNS Firewall policy that indicates that the VPC reached the limit for associated DNS Firewall rule groups. Firewall Manager tried to associate another rule group with the VPC and failed. 
    */
  var DnsRuleGroupLimitExceededViolation: js.UndefOr[typings.awsSdk.clientsFmsMod.DnsRuleGroupLimitExceededViolation] = js.undefined
  
  /**
    * Violation detail for a DNS Firewall policy that indicates that a rule group that Firewall Manager tried to associate with a VPC has the same priority as a rule group that's already associated. 
    */
  var DnsRuleGroupPriorityConflictViolation: js.UndefOr[typings.awsSdk.clientsFmsMod.DnsRuleGroupPriorityConflictViolation] = js.undefined
  
  /**
    * Contains details about the firewall subnet that violates the policy scope.
    */
  var FirewallSubnetIsOutOfScopeViolation: js.UndefOr[typings.awsSdk.clientsFmsMod.FirewallSubnetIsOutOfScopeViolation] = js.undefined
  
  /**
    * The violation details for a third-party firewall's VPC endpoint subnet that was deleted.
    */
  var FirewallSubnetMissingVPCEndpointViolation: js.UndefOr[typings.awsSdk.clientsFmsMod.FirewallSubnetMissingVPCEndpointViolation] = js.undefined
  
  var NetworkFirewallBlackHoleRouteDetectedViolation: js.UndefOr[typings.awsSdk.clientsFmsMod.NetworkFirewallBlackHoleRouteDetectedViolation] = js.undefined
  
  /**
    * Violation detail for the subnet for which internet traffic hasn't been inspected.
    */
  var NetworkFirewallInternetTrafficNotInspectedViolation: js.UndefOr[typings.awsSdk.clientsFmsMod.NetworkFirewallInternetTrafficNotInspectedViolation] = js.undefined
  
  /**
    * The route configuration is invalid.
    */
  var NetworkFirewallInvalidRouteConfigurationViolation: js.UndefOr[typings.awsSdk.clientsFmsMod.NetworkFirewallInvalidRouteConfigurationViolation] = js.undefined
  
  /**
    * Violation detail for an Network Firewall policy that indicates that a subnet is not associated with the expected Firewall Manager managed route table. 
    */
  var NetworkFirewallMissingExpectedRTViolation: js.UndefOr[typings.awsSdk.clientsFmsMod.NetworkFirewallMissingExpectedRTViolation] = js.undefined
  
  /**
    * Expected routes are missing from Network Firewall.
    */
  var NetworkFirewallMissingExpectedRoutesViolation: js.UndefOr[typings.awsSdk.clientsFmsMod.NetworkFirewallMissingExpectedRoutesViolation] = js.undefined
  
  /**
    * Violation detail for an Network Firewall policy that indicates that a subnet has no Firewall Manager managed firewall in its VPC. 
    */
  var NetworkFirewallMissingFirewallViolation: js.UndefOr[typings.awsSdk.clientsFmsMod.NetworkFirewallMissingFirewallViolation] = js.undefined
  
  /**
    * Violation detail for an Network Firewall policy that indicates that an Availability Zone is missing the expected Firewall Manager managed subnet.
    */
  var NetworkFirewallMissingSubnetViolation: js.UndefOr[typings.awsSdk.clientsFmsMod.NetworkFirewallMissingSubnetViolation] = js.undefined
  
  /**
    * Violation detail for an Network Firewall policy that indicates that a firewall policy in an individual account has been modified in a way that makes it noncompliant. For example, the individual account owner might have deleted a rule group, changed the priority of a stateless rule group, or changed a policy default action.
    */
  var NetworkFirewallPolicyModifiedViolation: js.UndefOr[typings.awsSdk.clientsFmsMod.NetworkFirewallPolicyModifiedViolation] = js.undefined
  
  /**
    * There's an unexpected firewall route.
    */
  var NetworkFirewallUnexpectedFirewallRoutesViolation: js.UndefOr[typings.awsSdk.clientsFmsMod.NetworkFirewallUnexpectedFirewallRoutesViolation] = js.undefined
  
  /**
    * There's an unexpected gateway route.
    */
  var NetworkFirewallUnexpectedGatewayRoutesViolation: js.UndefOr[typings.awsSdk.clientsFmsMod.NetworkFirewallUnexpectedGatewayRoutesViolation] = js.undefined
  
  /**
    * A list of possible remediation action lists. Each individual possible remediation action is a list of individual remediation actions.
    */
  var PossibleRemediationActions: js.UndefOr[typings.awsSdk.clientsFmsMod.PossibleRemediationActions] = js.undefined
  
  /**
    * Contains details about the route endpoint that violates the policy scope.
    */
  var RouteHasOutOfScopeEndpointViolation: js.UndefOr[typings.awsSdk.clientsFmsMod.RouteHasOutOfScopeEndpointViolation] = js.undefined
  
  /**
    * The violation details for a third-party firewall that has the Firewall Manager managed route table that was associated with the third-party firewall has been deleted.
    */
  var ThirdPartyFirewallMissingExpectedRouteTableViolation: js.UndefOr[
    typings.awsSdk.clientsFmsMod.ThirdPartyFirewallMissingExpectedRouteTableViolation
  ] = js.undefined
  
  /**
    * The violation details for a third-party firewall that's been deleted.
    */
  var ThirdPartyFirewallMissingFirewallViolation: js.UndefOr[typings.awsSdk.clientsFmsMod.ThirdPartyFirewallMissingFirewallViolation] = js.undefined
  
  /**
    * The violation details for a third-party firewall's subnet that's been deleted.
    */
  var ThirdPartyFirewallMissingSubnetViolation: js.UndefOr[typings.awsSdk.clientsFmsMod.ThirdPartyFirewallMissingSubnetViolation] = js.undefined
}
object ResourceViolation {
  
  inline def apply(): ResourceViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceViolation]
  }
  
  extension [Self <: ResourceViolation](x: Self) {
    
    inline def setAwsEc2InstanceViolation(value: AwsEc2InstanceViolation): Self = StObject.set(x, "AwsEc2InstanceViolation", value.asInstanceOf[js.Any])
    
    inline def setAwsEc2InstanceViolationUndefined: Self = StObject.set(x, "AwsEc2InstanceViolation", js.undefined)
    
    inline def setAwsEc2NetworkInterfaceViolation(value: AwsEc2NetworkInterfaceViolation): Self = StObject.set(x, "AwsEc2NetworkInterfaceViolation", value.asInstanceOf[js.Any])
    
    inline def setAwsEc2NetworkInterfaceViolationUndefined: Self = StObject.set(x, "AwsEc2NetworkInterfaceViolation", js.undefined)
    
    inline def setAwsVPCSecurityGroupViolation(value: AwsVPCSecurityGroupViolation): Self = StObject.set(x, "AwsVPCSecurityGroupViolation", value.asInstanceOf[js.Any])
    
    inline def setAwsVPCSecurityGroupViolationUndefined: Self = StObject.set(x, "AwsVPCSecurityGroupViolation", js.undefined)
    
    inline def setDnsDuplicateRuleGroupViolation(value: DnsDuplicateRuleGroupViolation): Self = StObject.set(x, "DnsDuplicateRuleGroupViolation", value.asInstanceOf[js.Any])
    
    inline def setDnsDuplicateRuleGroupViolationUndefined: Self = StObject.set(x, "DnsDuplicateRuleGroupViolation", js.undefined)
    
    inline def setDnsRuleGroupLimitExceededViolation(value: DnsRuleGroupLimitExceededViolation): Self = StObject.set(x, "DnsRuleGroupLimitExceededViolation", value.asInstanceOf[js.Any])
    
    inline def setDnsRuleGroupLimitExceededViolationUndefined: Self = StObject.set(x, "DnsRuleGroupLimitExceededViolation", js.undefined)
    
    inline def setDnsRuleGroupPriorityConflictViolation(value: DnsRuleGroupPriorityConflictViolation): Self = StObject.set(x, "DnsRuleGroupPriorityConflictViolation", value.asInstanceOf[js.Any])
    
    inline def setDnsRuleGroupPriorityConflictViolationUndefined: Self = StObject.set(x, "DnsRuleGroupPriorityConflictViolation", js.undefined)
    
    inline def setFirewallSubnetIsOutOfScopeViolation(value: FirewallSubnetIsOutOfScopeViolation): Self = StObject.set(x, "FirewallSubnetIsOutOfScopeViolation", value.asInstanceOf[js.Any])
    
    inline def setFirewallSubnetIsOutOfScopeViolationUndefined: Self = StObject.set(x, "FirewallSubnetIsOutOfScopeViolation", js.undefined)
    
    inline def setFirewallSubnetMissingVPCEndpointViolation(value: FirewallSubnetMissingVPCEndpointViolation): Self = StObject.set(x, "FirewallSubnetMissingVPCEndpointViolation", value.asInstanceOf[js.Any])
    
    inline def setFirewallSubnetMissingVPCEndpointViolationUndefined: Self = StObject.set(x, "FirewallSubnetMissingVPCEndpointViolation", js.undefined)
    
    inline def setNetworkFirewallBlackHoleRouteDetectedViolation(value: NetworkFirewallBlackHoleRouteDetectedViolation): Self = StObject.set(x, "NetworkFirewallBlackHoleRouteDetectedViolation", value.asInstanceOf[js.Any])
    
    inline def setNetworkFirewallBlackHoleRouteDetectedViolationUndefined: Self = StObject.set(x, "NetworkFirewallBlackHoleRouteDetectedViolation", js.undefined)
    
    inline def setNetworkFirewallInternetTrafficNotInspectedViolation(value: NetworkFirewallInternetTrafficNotInspectedViolation): Self = StObject.set(x, "NetworkFirewallInternetTrafficNotInspectedViolation", value.asInstanceOf[js.Any])
    
    inline def setNetworkFirewallInternetTrafficNotInspectedViolationUndefined: Self = StObject.set(x, "NetworkFirewallInternetTrafficNotInspectedViolation", js.undefined)
    
    inline def setNetworkFirewallInvalidRouteConfigurationViolation(value: NetworkFirewallInvalidRouteConfigurationViolation): Self = StObject.set(x, "NetworkFirewallInvalidRouteConfigurationViolation", value.asInstanceOf[js.Any])
    
    inline def setNetworkFirewallInvalidRouteConfigurationViolationUndefined: Self = StObject.set(x, "NetworkFirewallInvalidRouteConfigurationViolation", js.undefined)
    
    inline def setNetworkFirewallMissingExpectedRTViolation(value: NetworkFirewallMissingExpectedRTViolation): Self = StObject.set(x, "NetworkFirewallMissingExpectedRTViolation", value.asInstanceOf[js.Any])
    
    inline def setNetworkFirewallMissingExpectedRTViolationUndefined: Self = StObject.set(x, "NetworkFirewallMissingExpectedRTViolation", js.undefined)
    
    inline def setNetworkFirewallMissingExpectedRoutesViolation(value: NetworkFirewallMissingExpectedRoutesViolation): Self = StObject.set(x, "NetworkFirewallMissingExpectedRoutesViolation", value.asInstanceOf[js.Any])
    
    inline def setNetworkFirewallMissingExpectedRoutesViolationUndefined: Self = StObject.set(x, "NetworkFirewallMissingExpectedRoutesViolation", js.undefined)
    
    inline def setNetworkFirewallMissingFirewallViolation(value: NetworkFirewallMissingFirewallViolation): Self = StObject.set(x, "NetworkFirewallMissingFirewallViolation", value.asInstanceOf[js.Any])
    
    inline def setNetworkFirewallMissingFirewallViolationUndefined: Self = StObject.set(x, "NetworkFirewallMissingFirewallViolation", js.undefined)
    
    inline def setNetworkFirewallMissingSubnetViolation(value: NetworkFirewallMissingSubnetViolation): Self = StObject.set(x, "NetworkFirewallMissingSubnetViolation", value.asInstanceOf[js.Any])
    
    inline def setNetworkFirewallMissingSubnetViolationUndefined: Self = StObject.set(x, "NetworkFirewallMissingSubnetViolation", js.undefined)
    
    inline def setNetworkFirewallPolicyModifiedViolation(value: NetworkFirewallPolicyModifiedViolation): Self = StObject.set(x, "NetworkFirewallPolicyModifiedViolation", value.asInstanceOf[js.Any])
    
    inline def setNetworkFirewallPolicyModifiedViolationUndefined: Self = StObject.set(x, "NetworkFirewallPolicyModifiedViolation", js.undefined)
    
    inline def setNetworkFirewallUnexpectedFirewallRoutesViolation(value: NetworkFirewallUnexpectedFirewallRoutesViolation): Self = StObject.set(x, "NetworkFirewallUnexpectedFirewallRoutesViolation", value.asInstanceOf[js.Any])
    
    inline def setNetworkFirewallUnexpectedFirewallRoutesViolationUndefined: Self = StObject.set(x, "NetworkFirewallUnexpectedFirewallRoutesViolation", js.undefined)
    
    inline def setNetworkFirewallUnexpectedGatewayRoutesViolation(value: NetworkFirewallUnexpectedGatewayRoutesViolation): Self = StObject.set(x, "NetworkFirewallUnexpectedGatewayRoutesViolation", value.asInstanceOf[js.Any])
    
    inline def setNetworkFirewallUnexpectedGatewayRoutesViolationUndefined: Self = StObject.set(x, "NetworkFirewallUnexpectedGatewayRoutesViolation", js.undefined)
    
    inline def setPossibleRemediationActions(value: PossibleRemediationActions): Self = StObject.set(x, "PossibleRemediationActions", value.asInstanceOf[js.Any])
    
    inline def setPossibleRemediationActionsUndefined: Self = StObject.set(x, "PossibleRemediationActions", js.undefined)
    
    inline def setRouteHasOutOfScopeEndpointViolation(value: RouteHasOutOfScopeEndpointViolation): Self = StObject.set(x, "RouteHasOutOfScopeEndpointViolation", value.asInstanceOf[js.Any])
    
    inline def setRouteHasOutOfScopeEndpointViolationUndefined: Self = StObject.set(x, "RouteHasOutOfScopeEndpointViolation", js.undefined)
    
    inline def setThirdPartyFirewallMissingExpectedRouteTableViolation(value: ThirdPartyFirewallMissingExpectedRouteTableViolation): Self = StObject.set(x, "ThirdPartyFirewallMissingExpectedRouteTableViolation", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyFirewallMissingExpectedRouteTableViolationUndefined: Self = StObject.set(x, "ThirdPartyFirewallMissingExpectedRouteTableViolation", js.undefined)
    
    inline def setThirdPartyFirewallMissingFirewallViolation(value: ThirdPartyFirewallMissingFirewallViolation): Self = StObject.set(x, "ThirdPartyFirewallMissingFirewallViolation", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyFirewallMissingFirewallViolationUndefined: Self = StObject.set(x, "ThirdPartyFirewallMissingFirewallViolation", js.undefined)
    
    inline def setThirdPartyFirewallMissingSubnetViolation(value: ThirdPartyFirewallMissingSubnetViolation): Self = StObject.set(x, "ThirdPartyFirewallMissingSubnetViolation", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyFirewallMissingSubnetViolationUndefined: Self = StObject.set(x, "ThirdPartyFirewallMissingSubnetViolation", js.undefined)
  }
}
