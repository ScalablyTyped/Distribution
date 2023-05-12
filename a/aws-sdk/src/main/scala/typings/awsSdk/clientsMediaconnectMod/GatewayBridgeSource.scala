package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayBridgeSource extends StObject {
  
  /**
    * The ARN of the bridge feeding this flow.
    */
  var BridgeArn: string
  
  /**
    * The name of the VPC interface attachment to use for this bridge source.
    */
  var VpcInterfaceAttachment: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.VpcInterfaceAttachment] = js.undefined
}
object GatewayBridgeSource {
  
  inline def apply(BridgeArn: string): GatewayBridgeSource = {
    val __obj = js.Dynamic.literal(BridgeArn = BridgeArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayBridgeSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GatewayBridgeSource] (val x: Self) extends AnyVal {
    
    inline def setBridgeArn(value: string): Self = StObject.set(x, "BridgeArn", value.asInstanceOf[js.Any])
    
    inline def setVpcInterfaceAttachment(value: VpcInterfaceAttachment): Self = StObject.set(x, "VpcInterfaceAttachment", value.asInstanceOf[js.Any])
    
    inline def setVpcInterfaceAttachmentUndefined: Self = StObject.set(x, "VpcInterfaceAttachment", js.undefined)
  }
}
