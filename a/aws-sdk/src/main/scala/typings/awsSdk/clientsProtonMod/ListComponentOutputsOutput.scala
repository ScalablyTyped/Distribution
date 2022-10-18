package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListComponentOutputsOutput extends StObject {
  
  /**
    * A token that indicates the location of the next output in the array of outputs, after the list of outputs that was previously requested.
    */
  var nextToken: js.UndefOr[EmptyNextToken] = js.undefined
  
  /**
    * An array of component Infrastructure as Code (IaC) outputs.
    */
  var outputs: OutputsList
}
object ListComponentOutputsOutput {
  
  inline def apply(outputs: OutputsList): ListComponentOutputsOutput = {
    val __obj = js.Dynamic.literal(outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListComponentOutputsOutput]
  }
  
  extension [Self <: ListComponentOutputsOutput](x: Self) {
    
    inline def setNextToken(value: EmptyNextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOutputs(value: OutputsList): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: Output*): Self = StObject.set(x, "outputs", js.Array(value*))
  }
}
