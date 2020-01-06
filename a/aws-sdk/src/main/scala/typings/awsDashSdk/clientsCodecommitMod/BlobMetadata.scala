package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlobMetadata extends js.Object {
  /**
    * The full ID of the blob.
    */
  var blobId: js.UndefOr[ObjectId] = js.native
  /**
    * The file mode permissions of the blob. File mode permission codes include:    100644 indicates read/write    100755 indicates read/write/execute    160000 indicates a submodule    120000 indicates a symlink  
    */
  var mode: js.UndefOr[Mode] = js.native
  /**
    * The path to the blob and associated file name, if any.
    */
  var path: js.UndefOr[Path] = js.native
}

object BlobMetadata {
  @scala.inline
  def apply(blobId: ObjectId = null, mode: Mode = null, path: Path = null): BlobMetadata = {
    val __obj = js.Dynamic.literal()
    if (blobId != null) __obj.updateDynamic("blobId")(blobId.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlobMetadata]
  }
}

