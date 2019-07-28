package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDirectoriesResult extends js.Object {
  /**
    * The list of DirectoryDescription objects that were retrieved. It is possible that this list contains less than the number of items specified in the Limit member of the request. This occurs if there are less than the requested number of items left to retrieve, or if the limitations of the operation have been exceeded.
    */
  var DirectoryDescriptions: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryDescriptions] = js.undefined
  /**
    * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to DescribeDirectories to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
}

object DescribeDirectoriesResult {
  @scala.inline
  def apply(DirectoryDescriptions: DirectoryDescriptions = null, NextToken: NextToken = null): DescribeDirectoriesResult = {
    val __obj = js.Dynamic.literal()
    if (DirectoryDescriptions != null) __obj.updateDynamic("DirectoryDescriptions")(DirectoryDescriptions)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeDirectoriesResult]
  }
}

