package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLogPatternsResponse extends js.Object {
  /**
    * The list of log patterns.
    */
  var LogPatterns: js.UndefOr[LogPatternList] = js.native
  /**
    * The token used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: js.UndefOr[typings.awsSdk.applicationinsightsMod.ResourceGroupName] = js.native
}

object ListLogPatternsResponse {
  @scala.inline
  def apply(): ListLogPatternsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLogPatternsResponse]
  }
  @scala.inline
  implicit class ListLogPatternsResponseOps[Self <: ListLogPatternsResponse] (val x: Self) extends AnyVal {
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
    def setLogPatternsVarargs(value: LogPattern*): Self = this.set("LogPatterns", js.Array(value :_*))
    @scala.inline
    def setLogPatterns(value: LogPatternList): Self = this.set("LogPatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogPatterns: Self = this.set("LogPatterns", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setResourceGroupName(value: ResourceGroupName): Self = this.set("ResourceGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceGroupName: Self = this.set("ResourceGroupName", js.undefined)
  }
  
}

