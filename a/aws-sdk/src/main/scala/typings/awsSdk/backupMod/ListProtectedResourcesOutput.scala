package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProtectedResourcesOutput extends js.Object {
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * An array of resources successfully backed up by AWS Backup including the time the resource was saved, an Amazon Resource Name (ARN) of the resource, and a resource type.
    */
  var Results: js.UndefOr[ProtectedResourcesList] = js.native
}

object ListProtectedResourcesOutput {
  @scala.inline
  def apply(): ListProtectedResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProtectedResourcesOutput]
  }
  @scala.inline
  implicit class ListProtectedResourcesOutputOps[Self <: ListProtectedResourcesOutput] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setResultsVarargs(value: ProtectedResource*): Self = this.set("Results", js.Array(value :_*))
    @scala.inline
    def setResults(value: ProtectedResourcesList): Self = this.set("Results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("Results", js.undefined)
  }
  
}

