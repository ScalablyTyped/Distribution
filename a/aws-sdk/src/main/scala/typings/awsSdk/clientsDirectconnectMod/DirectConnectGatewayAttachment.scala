package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectConnectGatewayAttachment extends StObject {
  
  /**
    * The state of the attachment. The following are the possible values:    attaching: The initial state after a virtual interface is created using the Direct Connect gateway.    attached: The Direct Connect gateway and virtual interface are attached and ready to pass traffic.    detaching: The initial state after calling DeleteVirtualInterface.    detached: The virtual interface is detached from the Direct Connect gateway. Traffic flow between the Direct Connect gateway and virtual interface is stopped.  
    */
  var attachmentState: js.UndefOr[DirectConnectGatewayAttachmentState] = js.undefined
  
  /**
    * The type of attachment.
    */
  var attachmentType: js.UndefOr[DirectConnectGatewayAttachmentType] = js.undefined
  
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined
  
  /**
    * The error message if the state of an object failed to advance.
    */
  var stateChangeError: js.UndefOr[StateChangeError] = js.undefined
  
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that owns the virtual interface.
    */
  var virtualInterfaceOwnerAccount: js.UndefOr[OwnerAccount] = js.undefined
  
  /**
    * The Amazon Web Services Region where the virtual interface is located.
    */
  var virtualInterfaceRegion: js.UndefOr[VirtualInterfaceRegion] = js.undefined
}
object DirectConnectGatewayAttachment {
  
  inline def apply(): DirectConnectGatewayAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectConnectGatewayAttachment]
  }
  
  extension [Self <: DirectConnectGatewayAttachment](x: Self) {
    
    inline def setAttachmentState(value: DirectConnectGatewayAttachmentState): Self = StObject.set(x, "attachmentState", value.asInstanceOf[js.Any])
    
    inline def setAttachmentStateUndefined: Self = StObject.set(x, "attachmentState", js.undefined)
    
    inline def setAttachmentType(value: DirectConnectGatewayAttachmentType): Self = StObject.set(x, "attachmentType", value.asInstanceOf[js.Any])
    
    inline def setAttachmentTypeUndefined: Self = StObject.set(x, "attachmentType", js.undefined)
    
    inline def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = StObject.set(x, "directConnectGatewayId", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectGatewayIdUndefined: Self = StObject.set(x, "directConnectGatewayId", js.undefined)
    
    inline def setStateChangeError(value: StateChangeError): Self = StObject.set(x, "stateChangeError", value.asInstanceOf[js.Any])
    
    inline def setStateChangeErrorUndefined: Self = StObject.set(x, "stateChangeError", js.undefined)
    
    inline def setVirtualInterfaceId(value: VirtualInterfaceId): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setVirtualInterfaceIdUndefined: Self = StObject.set(x, "virtualInterfaceId", js.undefined)
    
    inline def setVirtualInterfaceOwnerAccount(value: OwnerAccount): Self = StObject.set(x, "virtualInterfaceOwnerAccount", value.asInstanceOf[js.Any])
    
    inline def setVirtualInterfaceOwnerAccountUndefined: Self = StObject.set(x, "virtualInterfaceOwnerAccount", js.undefined)
    
    inline def setVirtualInterfaceRegion(value: VirtualInterfaceRegion): Self = StObject.set(x, "virtualInterfaceRegion", value.asInstanceOf[js.Any])
    
    inline def setVirtualInterfaceRegionUndefined: Self = StObject.set(x, "virtualInterfaceRegion", js.undefined)
  }
}
