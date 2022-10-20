package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelExplainabilityJobInput extends StObject {
  
  /**
    * Input object for the batch transform job.
    */
  var BatchTransformInput: js.UndefOr[typings.awsSdk.clientsSagemakerMod.BatchTransformInput] = js.undefined
  
  var EndpointInput: js.UndefOr[typings.awsSdk.clientsSagemakerMod.EndpointInput] = js.undefined
}
object ModelExplainabilityJobInput {
  
  inline def apply(): ModelExplainabilityJobInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelExplainabilityJobInput]
  }
  
  extension [Self <: ModelExplainabilityJobInput](x: Self) {
    
    inline def setBatchTransformInput(value: BatchTransformInput): Self = StObject.set(x, "BatchTransformInput", value.asInstanceOf[js.Any])
    
    inline def setBatchTransformInputUndefined: Self = StObject.set(x, "BatchTransformInput", js.undefined)
    
    inline def setEndpointInput(value: EndpointInput): Self = StObject.set(x, "EndpointInput", value.asInstanceOf[js.Any])
    
    inline def setEndpointInputUndefined: Self = StObject.set(x, "EndpointInput", js.undefined)
  }
}
