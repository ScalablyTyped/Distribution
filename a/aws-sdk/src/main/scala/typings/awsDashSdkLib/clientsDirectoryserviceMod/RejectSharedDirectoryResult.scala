package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RejectSharedDirectoryResult extends js.Object {
  /**
    * Identifier of the shared directory in the directory consumer account.
    */
  var SharedDirectoryId: js.UndefOr[DirectoryId] = js.undefined
}

object RejectSharedDirectoryResult {
  @scala.inline
  def apply(SharedDirectoryId: DirectoryId = null): RejectSharedDirectoryResult = {
    val __obj = js.Dynamic.literal()
    if (SharedDirectoryId != null) __obj.updateDynamic("SharedDirectoryId")(SharedDirectoryId)
    __obj.asInstanceOf[RejectSharedDirectoryResult]
  }
}

