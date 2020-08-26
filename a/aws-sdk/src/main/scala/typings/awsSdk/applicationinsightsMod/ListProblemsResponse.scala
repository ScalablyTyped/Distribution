package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProblemsResponse extends js.Object {
  /**
    * The token used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The list of problems. 
    */
  var ProblemList: js.UndefOr[typings.awsSdk.applicationinsightsMod.ProblemList] = js.native
}

object ListProblemsResponse {
  @scala.inline
  def apply(): ListProblemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProblemsResponse]
  }
  @scala.inline
  implicit class ListProblemsResponseOps[Self <: ListProblemsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setProblemListVarargs(value: Problem*): Self = this.set("ProblemList", js.Array(value :_*))
    @scala.inline
    def setProblemList(value: ProblemList): Self = this.set("ProblemList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProblemList: Self = this.set("ProblemList", js.undefined)
  }
  
}

