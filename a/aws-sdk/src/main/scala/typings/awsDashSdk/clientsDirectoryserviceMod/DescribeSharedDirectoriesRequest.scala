package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSharedDirectoriesRequest extends js.Object {
  /**
    * The number of shared directories to return in the response object.
    */
  var Limit: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.Limit] = js.undefined
  /**
    * The DescribeSharedDirectoriesResult.NextToken value from a previous call to DescribeSharedDirectories. Pass null if this is the first call. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
  /**
    * Returns the identifier of the directory in the directory owner account. 
    */
  var OwnerDirectoryId: DirectoryId
  /**
    * A list of identifiers of all shared directories in your account. 
    */
  var SharedDirectoryIds: js.UndefOr[DirectoryIds] = js.undefined
}

object DescribeSharedDirectoriesRequest {
  @scala.inline
  def apply(
    OwnerDirectoryId: DirectoryId,
    Limit: js.UndefOr[Limit] = js.undefined,
    NextToken: NextToken = null,
    SharedDirectoryIds: DirectoryIds = null
  ): DescribeSharedDirectoriesRequest = {
    val __obj = js.Dynamic.literal(OwnerDirectoryId = OwnerDirectoryId)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SharedDirectoryIds != null) __obj.updateDynamic("SharedDirectoryIds")(SharedDirectoryIds)
    __obj.asInstanceOf[DescribeSharedDirectoriesRequest]
  }
}

