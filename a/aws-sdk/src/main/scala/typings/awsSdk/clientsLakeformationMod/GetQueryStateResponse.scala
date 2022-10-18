package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQueryStateResponse extends StObject {
  
  /**
    * An error message when the operation fails.
    */
  var Error: js.UndefOr[ErrorMessageString] = js.undefined
  
  /**
    * The state of a query previously submitted. The possible states are:   PENDING: the query is pending.   WORKUNITS_AVAILABLE: some work units are ready for retrieval and execution.   FINISHED: the query planning finished successfully, and all work units are ready for retrieval and execution.   ERROR: an error occurred with the query, such as an invalid query ID or a backend error.  
    */
  var State: QueryStateString
}
object GetQueryStateResponse {
  
  inline def apply(State: QueryStateString): GetQueryStateResponse = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueryStateResponse]
  }
  
  extension [Self <: GetQueryStateResponse](x: Self) {
    
    inline def setError(value: ErrorMessageString): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    inline def setState(value: QueryStateString): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
