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
  def apply(
    DirectoryNames: DirectoryNameList = null,
    MaxResults: Int | Double = null,
    NextToken: String = null
  ): DescribeDirectoryConfigsRequest = {
    val __obj = js.Dynamic.literal()
    if (DirectoryNames != null) __obj.updateDynamic("DirectoryNames")(DirectoryNames.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDirectoryConfigsRequest]
  }
}

