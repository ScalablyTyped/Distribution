package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsNetworkFirewallFirewallDetails extends StObject {
  
  /**
    * Whether the firewall is protected from deletion. If set to true, then the firewall cannot be deleted.
    */
  var DeleteProtection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A description of the firewall.
    */
  var Description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN of the firewall.
    */
  var FirewallArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the firewall.
    */
  var FirewallId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A descriptive name of the firewall.
    */
  var FirewallName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN of the firewall policy.
    */
  var FirewallPolicyArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether the firewall is protected from a change to the firewall policy. If set to true, you cannot associate a different policy with the firewall.
    */
  var FirewallPolicyChangeProtection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the firewall is protected from a change to the subnet associations. If set to true, you cannot map different subnets to the firewall.
    */
  var SubnetChangeProtection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The public subnets that Network Firewall uses for the firewall. Each subnet must belong to a different Availability Zone.
    */
  var SubnetMappings: js.UndefOr[AwsNetworkFirewallFirewallSubnetMappingsList] = js.undefined
  
  /**
    * The identifier of the VPC where the firewall is used.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsNetworkFirewallFirewallDetails {
  
  inline def apply(): AwsNetworkFirewallFirewallDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsNetworkFirewallFirewallDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsNetworkFirewallFirewallDetails] (val x: Self) extends AnyVal {
    
    inline def setDeleteProtection(value: Boolean): Self = StObject.set(x, "DeleteProtection", value.asInstanceOf[js.Any])
    
    inline def setDeleteProtectionUndefined: Self = StObject.set(x, "DeleteProtection", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFirewallArn(value: NonEmptyString): Self = StObject.set(x, "FirewallArn", value.asInstanceOf[js.Any])
    
    inline def setFirewallArnUndefined: Self = StObject.set(x, "FirewallArn", js.undefined)
    
    inline def setFirewallId(value: NonEmptyString): Self = StObject.set(x, "FirewallId", value.asInstanceOf[js.Any])
    
    inline def setFirewallIdUndefined: Self = StObject.set(x, "FirewallId", js.undefined)
    
    inline def setFirewallName(value: NonEmptyString): Self = StObject.set(x, "FirewallName", value.asInstanceOf[js.Any])
    
    inline def setFirewallNameUndefined: Self = StObject.set(x, "FirewallName", js.undefined)
    
    inline def setFirewallPolicyArn(value: NonEmptyString): Self = StObject.set(x, "FirewallPolicyArn", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyArnUndefined: Self = StObject.set(x, "FirewallPolicyArn", js.undefined)
    
    inline def setFirewallPolicyChangeProtection(value: Boolean): Self = StObject.set(x, "FirewallPolicyChangeProtection", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyChangeProtectionUndefined: Self = StObject.set(x, "FirewallPolicyChangeProtection", js.undefined)
    
    inline def setSubnetChangeProtection(value: Boolean): Self = StObject.set(x, "SubnetChangeProtection", value.asInstanceOf[js.Any])
    
    inline def setSubnetChangeProtectionUndefined: Self = StObject.set(x, "SubnetChangeProtection", js.undefined)
    
    inline def setSubnetMappings(value: AwsNetworkFirewallFirewallSubnetMappingsList): Self = StObject.set(x, "SubnetMappings", value.asInstanceOf[js.Any])
    
    inline def setSubnetMappingsUndefined: Self = StObject.set(x, "SubnetMappings", js.undefined)
    
    inline def setSubnetMappingsVarargs(value: AwsNetworkFirewallFirewallSubnetMappingsDetails*): Self = StObject.set(x, "SubnetMappings", js.Array(value*))
    
    inline def setVpcId(value: NonEmptyString): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
