package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeComputeEnvironmentsRequest extends js.Object {
  /**
    * A list of up to 100 compute environment names or full Amazon Resource Name (ARN) entries.
    */
  var computeEnvironments: js.UndefOr[StringList] = js.native
  /**
    * The maximum number of cluster results returned by DescribeComputeEnvironments in paginated output. When this parameter is used, DescribeComputeEnvironments only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another DescribeComputeEnvironments request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then DescribeComputeEnvironments returns up to 100 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  /**
    * The nextToken value returned from a previous paginated DescribeComputeEnvironments request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[String] = js.native
}

object DescribeComputeEnvironmentsRequest {
  @scala.inline
  def apply(): DescribeComputeEnvironmentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComputeEnvironmentsRequest]
  }
  @scala.inline
  implicit class DescribeComputeEnvironmentsRequestOps[Self <: DescribeComputeEnvironmentsRequest] (val x: Self) extends AnyVal {
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
    def setComputeEnvironmentsVarargs(value: String*): Self = this.set("computeEnvironments", js.Array(value :_*))
    @scala.inline
    def setComputeEnvironments(value: StringList): Self = this.set("computeEnvironments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputeEnvironments: Self = this.set("computeEnvironments", js.undefined)
    @scala.inline
    def setMaxResults(value: Integer): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

