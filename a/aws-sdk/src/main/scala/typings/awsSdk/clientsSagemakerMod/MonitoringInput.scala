package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringInput extends StObject {
  
  /**
    * Input object for the batch transform job.
    */
  var BatchTransformInput: js.UndefOr[typings.awsSdk.clientsSagemakerMod.BatchTransformInput] = js.undefined
  
  /**
    * The endpoint for a monitoring job.
    */
  var EndpointInput: js.UndefOr[typings.awsSdk.clientsSagemakerMod.EndpointInput] = js.undefined
}
object MonitoringInput {
  
  inline def apply(): MonitoringInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonitoringInput] (val x: Self) extends AnyVal {
    
    inline def setBatchTransformInput(value: BatchTransformInput): Self = StObject.set(x, "BatchTransformInput", value.asInstanceOf[js.Any])
    
    inline def setBatchTransformInputUndefined: Self = StObject.set(x, "BatchTransformInput", js.undefined)
    
    inline def setEndpointInput(value: EndpointInput): Self = StObject.set(x, "EndpointInput", value.asInstanceOf[js.Any])
    
    inline def setEndpointInputUndefined: Self = StObject.set(x, "EndpointInput", js.undefined)
  }
}
