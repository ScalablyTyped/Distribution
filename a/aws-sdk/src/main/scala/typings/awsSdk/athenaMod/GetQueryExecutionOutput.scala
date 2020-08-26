package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQueryExecutionOutput extends js.Object {
  /**
    * Information about the query execution.
    */
  var QueryExecution: js.UndefOr[typings.awsSdk.athenaMod.QueryExecution] = js.native
}

object GetQueryExecutionOutput {
  @scala.inline
  def apply(): GetQueryExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQueryExecutionOutput]
  }
  @scala.inline
  implicit class GetQueryExecutionOutputOps[Self <: GetQueryExecutionOutput] (val x: Self) extends AnyVal {
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
    def setQueryExecution(value: QueryExecution): Self = this.set("QueryExecution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryExecution: Self = this.set("QueryExecution", js.undefined)
  }
  
}

