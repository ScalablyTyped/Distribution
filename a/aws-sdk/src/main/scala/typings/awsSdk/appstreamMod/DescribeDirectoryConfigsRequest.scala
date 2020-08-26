package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDirectoryConfigsRequest extends js.Object {
  /**
    * The directory names.
    */
  var DirectoryNames: js.UndefOr[DirectoryNameList] = js.native
  /**
    * The maximum size of each page of results.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeDirectoryConfigsRequest {
  @scala.inline
  def apply(): DescribeDirectoryConfigsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDirectoryConfigsRequest]
  }
  @scala.inline
  implicit class DescribeDirectoryConfigsRequestOps[Self <: DescribeDirectoryConfigsRequest] (val x: Self) extends AnyVal {
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
    def setDirectoryNamesVarargs(value: DirectoryName*): Self = this.set("DirectoryNames", js.Array(value :_*))
    @scala.inline
    def setDirectoryNames(value: DirectoryNameList): Self = this.set("DirectoryNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryNames: Self = this.set("DirectoryNames", js.undefined)
    @scala.inline
    def setMaxResults(value: Integer): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

