package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDirectoryResult extends js.Object {
  /**
    * The identifier of the directory that was created.
    */
  var DirectoryId: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId] = js.undefined
}

object CreateDirectoryResult {
  @scala.inline
  def apply(DirectoryId: DirectoryId = null): CreateDirectoryResult = {
    val __obj = js.Dynamic.literal()
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId)
    __obj.asInstanceOf[CreateDirectoryResult]
  }
}

