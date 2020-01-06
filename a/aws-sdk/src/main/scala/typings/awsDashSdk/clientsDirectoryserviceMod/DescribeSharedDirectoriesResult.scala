package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSharedDirectoriesResult extends js.Object {
  /**
    * If not null, token that indicates that more results are available. Pass this value for the NextToken parameter in a subsequent call to DescribeSharedDirectories to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.NextToken] = js.native
  /**
    * A list of all shared directories in your account.
    */
  var SharedDirectories: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.SharedDirectories] = js.native
}

object DescribeSharedDirectoriesResult {
  @scala.inline
  def apply(NextToken: NextToken = null, SharedDirectories: SharedDirectories = null): DescribeSharedDirectoriesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SharedDirectories != null) __obj.updateDynamic("SharedDirectories")(SharedDirectories.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSharedDirectoriesResult]
  }
}

