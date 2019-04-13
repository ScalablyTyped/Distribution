package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareDirectoryResult extends js.Object {
  /**
    * Identifier of the directory that is stored in the directory consumer account that is shared from the specified directory (DirectoryId).
    */
  var SharedDirectoryId: js.UndefOr[DirectoryId] = js.undefined
}

object ShareDirectoryResult {
  @scala.inline
  def apply(SharedDirectoryId: DirectoryId = null): ShareDirectoryResult = {
    val __obj = js.Dynamic.literal()
    if (SharedDirectoryId != null) __obj.updateDynamic("SharedDirectoryId")(SharedDirectoryId)
    __obj.asInstanceOf[ShareDirectoryResult]
  }
}

