package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshCacheInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the file share you want to refresh.
    */
  var FileShareARN: typings.awsDashSdk.clientsStoragegatewayMod.FileShareARN
  /**
    * A comma-separated list of the paths of folders to refresh in the cache. The default is ["/"]. The default refreshes objects and folders at the root of the Amazon S3 bucket. If Recursive is set to "true", the entire S3 bucket that the file share has access to is refreshed.
    */
  var FolderList: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.FolderList] = js.undefined
  /**
    * A value that specifies whether to recursively refresh folders in the cache. The refresh includes folders that were in the cache the last time the gateway listed the folder's contents. If this value set to "true", each folder that is listed in FolderList is recursively updated. Otherwise, subfolders listed in FolderList are not refreshed. Only objects that are in folders listed directly under FolderList are found and used for the update. The default is "true".
    */
  var Recursive: js.UndefOr[Boolean] = js.undefined
}

object RefreshCacheInput {
  @scala.inline
  def apply(
    FileShareARN: FileShareARN,
    FolderList: FolderList = null,
    Recursive: js.UndefOr[scala.Boolean] = js.undefined
  ): RefreshCacheInput = {
    val __obj = js.Dynamic.literal(FileShareARN = FileShareARN)
    if (FolderList != null) __obj.updateDynamic("FolderList")(FolderList)
    if (!js.isUndefined(Recursive)) __obj.updateDynamic("Recursive")(Recursive)
    __obj.asInstanceOf[RefreshCacheInput]
  }
}

