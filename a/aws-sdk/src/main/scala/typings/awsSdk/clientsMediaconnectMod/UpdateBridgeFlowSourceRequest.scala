package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBridgeFlowSourceRequest extends StObject {
  
  /**
    * The ARN of the cloud flow to use as a source of this bridge.
    */
  var FlowArn: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the VPC interface attachment to use for this source.
    */
  var FlowVpcInterfaceAttachment: js.UndefOr[VpcInterfaceAttachment] = js.undefined
}
object UpdateBridgeFlowSourceRequest {
  
  inline def apply(): UpdateBridgeFlowSourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBridgeFlowSourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateBridgeFlowSourceRequest] (val x: Self) extends AnyVal {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setFlowArnUndefined: Self = StObject.set(x, "FlowArn", js.undefined)
    
    inline def setFlowVpcInterfaceAttachment(value: VpcInterfaceAttachment): Self = StObject.set(x, "FlowVpcInterfaceAttachment", value.asInstanceOf[js.Any])
    
    inline def setFlowVpcInterfaceAttachmentUndefined: Self = StObject.set(x, "FlowVpcInterfaceAttachment", js.undefined)
  }
}
