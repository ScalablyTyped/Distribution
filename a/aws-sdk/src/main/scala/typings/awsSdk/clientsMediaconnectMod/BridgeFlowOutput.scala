package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BridgeFlowOutput extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the cloud flow.
    */
  var FlowArn: string
  
  /**
    * The Amazon Resource Number (ARN) of the flow source.
    */
  var FlowSourceArn: string
  
  /**
    * The name of the bridge's output.
    */
  var Name: string
}
object BridgeFlowOutput {
  
  inline def apply(FlowArn: string, FlowSourceArn: string, Name: string): BridgeFlowOutput = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], FlowSourceArn = FlowSourceArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeFlowOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BridgeFlowOutput] (val x: Self) extends AnyVal {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setFlowSourceArn(value: string): Self = StObject.set(x, "FlowSourceArn", value.asInstanceOf[js.Any])
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
