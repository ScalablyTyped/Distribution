package typings.awsSdk.braketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchQuantumTasksResponse extends StObject {
  
  /**
    * A token used for pagination of results, or null if there are no additional results. Use the token value in a subsequent request to continue results where the previous request ended.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * An array of QuantumTaskSummary objects for tasks that match the specified filters.
    */
  var quantumTasks: QuantumTaskSummaryList = js.native
}
object SearchQuantumTasksResponse {
  
  @scala.inline
  def apply(quantumTasks: QuantumTaskSummaryList): SearchQuantumTasksResponse = {
    val __obj = js.Dynamic.literal(quantumTasks = quantumTasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchQuantumTasksResponse]
  }
  
  @scala.inline
  implicit class SearchQuantumTasksResponseMutableBuilder[Self <: SearchQuantumTasksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setQuantumTasks(value: QuantumTaskSummaryList): Self = StObject.set(x, "quantumTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantumTasksVarargs(value: QuantumTaskSummary*): Self = StObject.set(x, "quantumTasks", js.Array(value :_*))
  }
}
