package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataQualityJobInput extends StObject {
  
  /**
    * Input object for the batch transform job.
    */
  var BatchTransformInput: js.UndefOr[typings.awsSdk.clientsSagemakerMod.BatchTransformInput] = js.undefined
  
  var EndpointInput: js.UndefOr[typings.awsSdk.clientsSagemakerMod.EndpointInput] = js.undefined
}
object DataQualityJobInput {
  
  inline def apply(): DataQualityJobInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataQualityJobInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataQualityJobInput] (val x: Self) extends AnyVal {
    
    inline def setBatchTransformInput(value: BatchTransformInput): Self = StObject.set(x, "BatchTransformInput", value.asInstanceOf[js.Any])
    
    inline def setBatchTransformInputUndefined: Self = StObject.set(x, "BatchTransformInput", js.undefined)
    
    inline def setEndpointInput(value: EndpointInput): Self = StObject.set(x, "EndpointInput", value.asInstanceOf[js.Any])
    
    inline def setEndpointInputUndefined: Self = StObject.set(x, "EndpointInput", js.undefined)
  }
}
