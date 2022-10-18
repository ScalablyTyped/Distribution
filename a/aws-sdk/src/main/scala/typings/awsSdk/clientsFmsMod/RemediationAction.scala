package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemediationAction extends StObject {
  
  /**
    * A description of a remediation action.
    */
  var Description: js.UndefOr[LengthBoundedString] = js.undefined
  
  /**
    * Information about the AssociateRouteTable action in the Amazon EC2 API.
    */
  var EC2AssociateRouteTableAction: js.UndefOr[typings.awsSdk.clientsFmsMod.EC2AssociateRouteTableAction] = js.undefined
  
  /**
    * Information about the CopyRouteTable action in the Amazon EC2 API.
    */
  var EC2CopyRouteTableAction: js.UndefOr[typings.awsSdk.clientsFmsMod.EC2CopyRouteTableAction] = js.undefined
  
  /**
    * Information about the CreateRoute action in the Amazon EC2 API.
    */
  var EC2CreateRouteAction: js.UndefOr[typings.awsSdk.clientsFmsMod.EC2CreateRouteAction] = js.undefined
  
  /**
    * Information about the CreateRouteTable action in the Amazon EC2 API.
    */
  var EC2CreateRouteTableAction: js.UndefOr[typings.awsSdk.clientsFmsMod.EC2CreateRouteTableAction] = js.undefined
  
  /**
    * Information about the DeleteRoute action in the Amazon EC2 API.
    */
  var EC2DeleteRouteAction: js.UndefOr[typings.awsSdk.clientsFmsMod.EC2DeleteRouteAction] = js.undefined
  
  /**
    * Information about the ReplaceRoute action in the Amazon EC2 API.
    */
  var EC2ReplaceRouteAction: js.UndefOr[typings.awsSdk.clientsFmsMod.EC2ReplaceRouteAction] = js.undefined
  
  /**
    * Information about the ReplaceRouteTableAssociation action in the Amazon EC2 API.
    */
  var EC2ReplaceRouteTableAssociationAction: js.UndefOr[typings.awsSdk.clientsFmsMod.EC2ReplaceRouteTableAssociationAction] = js.undefined
  
  /**
    * The remedial action to take when updating a firewall configuration.
    */
  var FMSPolicyUpdateFirewallCreationConfigAction: js.UndefOr[typings.awsSdk.clientsFmsMod.FMSPolicyUpdateFirewallCreationConfigAction] = js.undefined
}
object RemediationAction {
  
  inline def apply(): RemediationAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemediationAction]
  }
  
  extension [Self <: RemediationAction](x: Self) {
    
    inline def setDescription(value: LengthBoundedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEC2AssociateRouteTableAction(value: EC2AssociateRouteTableAction): Self = StObject.set(x, "EC2AssociateRouteTableAction", value.asInstanceOf[js.Any])
    
    inline def setEC2AssociateRouteTableActionUndefined: Self = StObject.set(x, "EC2AssociateRouteTableAction", js.undefined)
    
    inline def setEC2CopyRouteTableAction(value: EC2CopyRouteTableAction): Self = StObject.set(x, "EC2CopyRouteTableAction", value.asInstanceOf[js.Any])
    
    inline def setEC2CopyRouteTableActionUndefined: Self = StObject.set(x, "EC2CopyRouteTableAction", js.undefined)
    
    inline def setEC2CreateRouteAction(value: EC2CreateRouteAction): Self = StObject.set(x, "EC2CreateRouteAction", value.asInstanceOf[js.Any])
    
    inline def setEC2CreateRouteActionUndefined: Self = StObject.set(x, "EC2CreateRouteAction", js.undefined)
    
    inline def setEC2CreateRouteTableAction(value: EC2CreateRouteTableAction): Self = StObject.set(x, "EC2CreateRouteTableAction", value.asInstanceOf[js.Any])
    
    inline def setEC2CreateRouteTableActionUndefined: Self = StObject.set(x, "EC2CreateRouteTableAction", js.undefined)
    
    inline def setEC2DeleteRouteAction(value: EC2DeleteRouteAction): Self = StObject.set(x, "EC2DeleteRouteAction", value.asInstanceOf[js.Any])
    
    inline def setEC2DeleteRouteActionUndefined: Self = StObject.set(x, "EC2DeleteRouteAction", js.undefined)
    
    inline def setEC2ReplaceRouteAction(value: EC2ReplaceRouteAction): Self = StObject.set(x, "EC2ReplaceRouteAction", value.asInstanceOf[js.Any])
    
    inline def setEC2ReplaceRouteActionUndefined: Self = StObject.set(x, "EC2ReplaceRouteAction", js.undefined)
    
    inline def setEC2ReplaceRouteTableAssociationAction(value: EC2ReplaceRouteTableAssociationAction): Self = StObject.set(x, "EC2ReplaceRouteTableAssociationAction", value.asInstanceOf[js.Any])
    
    inline def setEC2ReplaceRouteTableAssociationActionUndefined: Self = StObject.set(x, "EC2ReplaceRouteTableAssociationAction", js.undefined)
    
    inline def setFMSPolicyUpdateFirewallCreationConfigAction(value: FMSPolicyUpdateFirewallCreationConfigAction): Self = StObject.set(x, "FMSPolicyUpdateFirewallCreationConfigAction", value.asInstanceOf[js.Any])
    
    inline def setFMSPolicyUpdateFirewallCreationConfigActionUndefined: Self = StObject.set(x, "FMSPolicyUpdateFirewallCreationConfigAction", js.undefined)
  }
}
