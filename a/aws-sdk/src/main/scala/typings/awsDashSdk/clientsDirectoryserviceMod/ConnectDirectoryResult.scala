package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectDirectoryResult extends js.Object {
  /**
    * The identifier of the new directory.
    */
  var DirectoryId: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId] = js.undefined
}

object ConnectDirectoryResult {
  @scala.inline
  def apply(DirectoryId: DirectoryId = null): ConnectDirectoryResult = {
    val __obj = js.Dynamic.literal()
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId)
    __obj.asInstanceOf[ConnectDirectoryResult]
  }
}

