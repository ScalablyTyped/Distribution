package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMultiplexProgramsResponse extends StObject {
  
  /**
    * List of multiplex programs.
    */
  var MultiplexPrograms: js.UndefOr[listOfMultiplexProgramSummary] = js.undefined
  
  /**
    * Token for the next ListMultiplexProgram request.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListMultiplexProgramsResponse {
  
  inline def apply(): ListMultiplexProgramsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMultiplexProgramsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMultiplexProgramsResponse] (val x: Self) extends AnyVal {
    
    inline def setMultiplexPrograms(value: listOfMultiplexProgramSummary): Self = StObject.set(x, "MultiplexPrograms", value.asInstanceOf[js.Any])
    
    inline def setMultiplexProgramsUndefined: Self = StObject.set(x, "MultiplexPrograms", js.undefined)
    
    inline def setMultiplexProgramsVarargs(value: MultiplexProgramSummary*): Self = StObject.set(x, "MultiplexPrograms", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
