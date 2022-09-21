package typings.awsSdk.braketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchQuantumTasksResponse extends StObject {
  
  /**
    * A token used for pagination of results, or null if there are no additional results. Use the token value in a subsequent request to continue results where the previous request ended.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * An array of QuantumTaskSummary objects for tasks that match the specified filters.
    */
  var quantumTasks: QuantumTaskSummaryList
}
object SearchQuantumTasksResponse {
  
  inline def apply(quantumTasks: QuantumTaskSummaryList): SearchQuantumTasksResponse = {
    val __obj = js.Dynamic.literal(quantumTasks = quantumTasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchQuantumTasksResponse]
  }
  
  extension [Self <: SearchQuantumTasksResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setQuantumTasks(value: QuantumTaskSummaryList): Self = StObject.set(x, "quantumTasks", value.asInstanceOf[js.Any])
    
    inline def setQuantumTasksVarargs(value: QuantumTaskSummary*): Self = StObject.set(x, "quantumTasks", js.Array(value*))
  }
}
