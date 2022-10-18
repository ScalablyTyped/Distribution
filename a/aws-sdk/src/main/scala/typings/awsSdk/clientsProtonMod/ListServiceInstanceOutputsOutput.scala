package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceInstanceOutputsOutput extends StObject {
  
  /**
    * A token that indicates the location of the next output in the array of outputs, after the current requested list of outputs.
    */
  var nextToken: js.UndefOr[EmptyNextToken] = js.undefined
  
  /**
    * An array of service instance Infrastructure as Code (IaC) outputs.
    */
  var outputs: OutputsList
}
object ListServiceInstanceOutputsOutput {
  
  inline def apply(outputs: OutputsList): ListServiceInstanceOutputsOutput = {
    val __obj = js.Dynamic.literal(outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServiceInstanceOutputsOutput]
  }
  
  extension [Self <: ListServiceInstanceOutputsOutput](x: Self) {
    
    inline def setNextToken(value: EmptyNextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOutputs(value: OutputsList): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: Output*): Self = StObject.set(x, "outputs", js.Array(value*))
  }
}
