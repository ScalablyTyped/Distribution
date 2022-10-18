package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataQualityJobInput extends StObject {
  
  var EndpointInput: typings.awsSdk.clientsSagemakerMod.EndpointInput
}
object DataQualityJobInput {
  
  inline def apply(EndpointInput: EndpointInput): DataQualityJobInput = {
    val __obj = js.Dynamic.literal(EndpointInput = EndpointInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataQualityJobInput]
  }
  
  extension [Self <: DataQualityJobInput](x: Self) {
    
    inline def setEndpointInput(value: EndpointInput): Self = StObject.set(x, "EndpointInput", value.asInstanceOf[js.Any])
  }
}
