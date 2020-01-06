package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectSharedDirectoryResult extends js.Object {
  /**
    * Identifier of the shared directory in the directory consumer account.
    */
  var SharedDirectoryId: js.UndefOr[DirectoryId] = js.native
}

object RejectSharedDirectoryResult {
  @scala.inline
  def apply(SharedDirectoryId: DirectoryId = null): RejectSharedDirectoryResult = {
    val __obj = js.Dynamic.literal()
    if (SharedDirectoryId != null) __obj.updateDynamic("SharedDirectoryId")(SharedDirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectSharedDirectoryResult]
  }
}

