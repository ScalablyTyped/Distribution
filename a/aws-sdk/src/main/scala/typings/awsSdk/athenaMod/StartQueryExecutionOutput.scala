package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartQueryExecutionOutput extends js.Object {
  
  /**
    * The unique ID of the query that ran as a result of this request.
    */
  var QueryExecutionId: js.UndefOr[typings.awsSdk.athenaMod.QueryExecutionId] = js.native
}
object StartQueryExecutionOutput {
  
  @scala.inline
  def apply(): StartQueryExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartQueryExecutionOutput]
  }
  
  @scala.inline
  implicit class StartQueryExecutionOutputOps[Self <: StartQueryExecutionOutput] (val x: Self) extends AnyVal {
    
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
    def setQueryExecutionId(value: QueryExecutionId): Self = this.set("QueryExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryExecutionId: Self = this.set("QueryExecutionId", js.undefined)
  }
}
