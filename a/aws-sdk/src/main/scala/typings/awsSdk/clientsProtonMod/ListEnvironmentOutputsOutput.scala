package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEnvironmentOutputsOutput extends StObject {
  
  /**
    * A token that indicates the location of the next environment output in the array of environment outputs, after the current requested list of environment outputs.
    */
  var nextToken: js.UndefOr[EmptyNextToken] = js.undefined
  
  /**
    * An array of environment outputs with detail data.
    */
  var outputs: OutputsList
}
object ListEnvironmentOutputsOutput {
  
  inline def apply(outputs: OutputsList): ListEnvironmentOutputsOutput = {
    val __obj = js.Dynamic.literal(outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEnvironmentOutputsOutput]
  }
  
  extension [Self <: ListEnvironmentOutputsOutput](x: Self) {
    
    inline def setNextToken(value: EmptyNextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOutputs(value: OutputsList): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: Output*): Self = StObject.set(x, "outputs", js.Array(value*))
  }
}
