package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExecutionsOutput extends StObject {
  
  /**
    * The list of matching executions.
    */
  var executions: ExecutionList
  
  /**
    * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
    */
  var nextToken: js.UndefOr[ListExecutionsPageToken] = js.undefined
}
object ListExecutionsOutput {
  
  inline def apply(executions: ExecutionList): ListExecutionsOutput = {
    val __obj = js.Dynamic.literal(executions = executions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListExecutionsOutput]
  }
  
  extension [Self <: ListExecutionsOutput](x: Self) {
    
    inline def setExecutions(value: ExecutionList): Self = StObject.set(x, "executions", value.asInstanceOf[js.Any])
    
    inline def setExecutionsVarargs(value: ExecutionListItem*): Self = StObject.set(x, "executions", js.Array(value*))
    
    inline def setNextToken(value: ListExecutionsPageToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
