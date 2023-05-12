package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGatewayBridgeSourceRequest extends StObject {
  
  /**
    * The ARN of the bridge feeding this flow.
    */
  var BridgeArn: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the VPC interface attachment to use for this bridge source.
    */
  var VpcInterfaceAttachment: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.VpcInterfaceAttachment] = js.undefined
}
object UpdateGatewayBridgeSourceRequest {
  
  inline def apply(): UpdateGatewayBridgeSourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGatewayBridgeSourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateGatewayBridgeSourceRequest] (val x: Self) extends AnyVal {
    
    inline def setBridgeArn(value: string): Self = StObject.set(x, "BridgeArn", value.asInstanceOf[js.Any])
    
    inline def setBridgeArnUndefined: Self = StObject.set(x, "BridgeArn", js.undefined)
    
    inline def setVpcInterfaceAttachment(value: VpcInterfaceAttachment): Self = StObject.set(x, "VpcInterfaceAttachment", value.asInstanceOf[js.Any])
    
    inline def setVpcInterfaceAttachmentUndefined: Self = StObject.set(x, "VpcInterfaceAttachment", js.undefined)
  }
}
