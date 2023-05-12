package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BridgeFlowSource extends StObject {
  
  /**
    * The ARN of the cloud flow used as a source of this bridge.
    */
  var FlowArn: string
  
  /**
    * The name of the VPC interface attachment to use for this source.
    */
  var FlowVpcInterfaceAttachment: js.UndefOr[VpcInterfaceAttachment] = js.undefined
  
  /**
    * The name of the flow source.
    */
  var Name: string
  
  /**
    * The Amazon Resource Number (ARN) of the output.
    */
  var OutputArn: js.UndefOr[string] = js.undefined
}
object BridgeFlowSource {
  
  inline def apply(FlowArn: string, Name: string): BridgeFlowSource = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeFlowSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BridgeFlowSource] (val x: Self) extends AnyVal {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setFlowVpcInterfaceAttachment(value: VpcInterfaceAttachment): Self = StObject.set(x, "FlowVpcInterfaceAttachment", value.asInstanceOf[js.Any])
    
    inline def setFlowVpcInterfaceAttachmentUndefined: Self = StObject.set(x, "FlowVpcInterfaceAttachment", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutputArn(value: string): Self = StObject.set(x, "OutputArn", value.asInstanceOf[js.Any])
    
    inline def setOutputArnUndefined: Self = StObject.set(x, "OutputArn", js.undefined)
  }
}
