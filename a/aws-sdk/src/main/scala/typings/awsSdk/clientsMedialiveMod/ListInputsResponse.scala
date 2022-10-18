package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInputsResponse extends StObject {
  
  var Inputs: js.UndefOr[listOfInput] = js.undefined
  
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListInputsResponse {
  
  inline def apply(): ListInputsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInputsResponse]
  }
  
  extension [Self <: ListInputsResponse](x: Self) {
    
    inline def setInputs(value: listOfInput): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "Inputs", js.undefined)
    
    inline def setInputsVarargs(value: Input*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
