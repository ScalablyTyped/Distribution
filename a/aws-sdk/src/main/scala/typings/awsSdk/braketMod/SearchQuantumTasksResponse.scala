package typings.awsSdk.braketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchQuantumTasksResponse extends js.Object {
  
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
  implicit class SearchQuantumTasksResponseOps[Self <: SearchQuantumTasksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQuantumTasksVarargs(value: QuantumTaskSummary*): Self = this.set("quantumTasks", js.Array(value :_*))
    
    @scala.inline
    def setQuantumTasks(value: QuantumTaskSummaryList): Self = this.set("quantumTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
