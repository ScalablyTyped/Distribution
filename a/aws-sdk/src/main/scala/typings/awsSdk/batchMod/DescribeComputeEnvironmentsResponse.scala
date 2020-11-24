package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeComputeEnvironmentsResponse extends js.Object {
  
  /**
    * The list of compute environments.
    */
  var computeEnvironments: js.UndefOr[ComputeEnvironmentDetailList] = js.native
  
  /**
    * The nextToken value to include in a future DescribeComputeEnvironments request. When the results of a DescribeJobDefinitions request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object DescribeComputeEnvironmentsResponse {
  
  @scala.inline
  def apply(): DescribeComputeEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComputeEnvironmentsResponse]
  }
  
  @scala.inline
  implicit class DescribeComputeEnvironmentsResponseOps[Self <: DescribeComputeEnvironmentsResponse] (val x: Self) extends AnyVal {
    
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
    def setComputeEnvironmentsVarargs(value: ComputeEnvironmentDetail*): Self = this.set("computeEnvironments", js.Array(value :_*))
    
    @scala.inline
    def setComputeEnvironments(value: ComputeEnvironmentDetailList): Self = this.set("computeEnvironments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputeEnvironments: Self = this.set("computeEnvironments", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
