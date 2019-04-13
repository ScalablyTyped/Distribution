package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnshareDirectoryResult extends js.Object {
  /**
    * Identifier of the directory stored in the directory consumer account that is to be unshared from the specified directory (DirectoryId).
    */
  var SharedDirectoryId: js.UndefOr[DirectoryId] = js.undefined
}

object UnshareDirectoryResult {
  @scala.inline
  def apply(SharedDirectoryId: DirectoryId = null): UnshareDirectoryResult = {
    val __obj = js.Dynamic.literal()
    if (SharedDirectoryId != null) __obj.updateDynamic("SharedDirectoryId")(SharedDirectoryId)
    __obj.asInstanceOf[UnshareDirectoryResult]
  }
}

