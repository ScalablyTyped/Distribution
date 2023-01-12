package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitGatewayConnectRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Connect attachment options.
    */
  var Options: CreateTransitGatewayConnectRequestOptions
  
  /**
    * The tags to apply to the Connect attachment.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  
  /**
    * The ID of the transit gateway attachment. You can specify a VPC attachment or Amazon Web Services Direct Connect attachment.
    */
  var TransportTransitGatewayAttachmentId: TransitGatewayAttachmentId
}
object CreateTransitGatewayConnectRequest {
  
  inline def apply(
    Options: CreateTransitGatewayConnectRequestOptions,
    TransportTransitGatewayAttachmentId: TransitGatewayAttachmentId
  ): CreateTransitGatewayConnectRequest = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], TransportTransitGatewayAttachmentId = TransportTransitGatewayAttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransitGatewayConnectRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTransitGatewayConnectRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setOptions(value: CreateTransitGatewayConnectRequestOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
    
    inline def setTransportTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = StObject.set(x, "TransportTransitGatewayAttachmentId", value.asInstanceOf[js.Any])
  }
}
