package typings.awsSdk.augmentedairuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartHumanLoopRequest extends StObject {
  
  /**
    * Attributes of the specified data. Use DataAttributes to specify if your data is free of personally identifiable information and/or free of adult content.
    */
  var DataAttributes: js.UndefOr[HumanLoopDataAttributes] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the flow definition associated with this human loop.
    */
  var FlowDefinitionArn: typings.awsSdk.augmentedairuntimeMod.FlowDefinitionArn
  
  /**
    * An object that contains information about the human loop.
    */
  var HumanLoopInput: typings.awsSdk.augmentedairuntimeMod.HumanLoopInput
  
  /**
    * The name of the human loop.
    */
  var HumanLoopName: typings.awsSdk.augmentedairuntimeMod.HumanLoopName
}
object StartHumanLoopRequest {
  
  inline def apply(FlowDefinitionArn: FlowDefinitionArn, HumanLoopInput: HumanLoopInput, HumanLoopName: HumanLoopName): StartHumanLoopRequest = {
    val __obj = js.Dynamic.literal(FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any], HumanLoopInput = HumanLoopInput.asInstanceOf[js.Any], HumanLoopName = HumanLoopName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartHumanLoopRequest]
  }
  
  extension [Self <: StartHumanLoopRequest](x: Self) {
    
    inline def setDataAttributes(value: HumanLoopDataAttributes): Self = StObject.set(x, "DataAttributes", value.asInstanceOf[js.Any])
    
    inline def setDataAttributesUndefined: Self = StObject.set(x, "DataAttributes", js.undefined)
    
    inline def setFlowDefinitionArn(value: FlowDefinitionArn): Self = StObject.set(x, "FlowDefinitionArn", value.asInstanceOf[js.Any])
    
    inline def setHumanLoopInput(value: HumanLoopInput): Self = StObject.set(x, "HumanLoopInput", value.asInstanceOf[js.Any])
    
    inline def setHumanLoopName(value: HumanLoopName): Self = StObject.set(x, "HumanLoopName", value.asInstanceOf[js.Any])
  }
}
