package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringInput extends StObject {
  
  /**
    * The endpoint for a monitoring job.
    */
  var EndpointInput: typings.awsSdk.clientsSagemakerMod.EndpointInput
}
object MonitoringInput {
  
  inline def apply(EndpointInput: EndpointInput): MonitoringInput = {
    val __obj = js.Dynamic.literal(EndpointInput = EndpointInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringInput]
  }
  
  extension [Self <: MonitoringInput](x: Self) {
    
    inline def setEndpointInput(value: EndpointInput): Self = StObject.set(x, "EndpointInput", value.asInstanceOf[js.Any])
  }
}
