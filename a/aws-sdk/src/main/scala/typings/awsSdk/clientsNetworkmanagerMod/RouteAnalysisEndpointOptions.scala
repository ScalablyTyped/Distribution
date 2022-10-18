package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteAnalysisEndpointOptions extends StObject {
  
  /**
    * The IP address.
    */
  var IpAddress: js.UndefOr[IPAddress] = js.undefined
  
  /**
    * The ARN of the transit gateway.
    */
  var TransitGatewayArn: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.TransitGatewayArn] = js.undefined
  
  /**
    * The ARN of the transit gateway attachment.
    */
  var TransitGatewayAttachmentArn: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.TransitGatewayAttachmentArn] = js.undefined
}
object RouteAnalysisEndpointOptions {
  
  inline def apply(): RouteAnalysisEndpointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteAnalysisEndpointOptions]
  }
  
  extension [Self <: RouteAnalysisEndpointOptions](x: Self) {
    
    inline def setIpAddress(value: IPAddress): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    inline def setTransitGatewayArn(value: TransitGatewayArn): Self = StObject.set(x, "TransitGatewayArn", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayArnUndefined: Self = StObject.set(x, "TransitGatewayArn", js.undefined)
    
    inline def setTransitGatewayAttachmentArn(value: TransitGatewayAttachmentArn): Self = StObject.set(x, "TransitGatewayAttachmentArn", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayAttachmentArnUndefined: Self = StObject.set(x, "TransitGatewayAttachmentArn", js.undefined)
  }
}
