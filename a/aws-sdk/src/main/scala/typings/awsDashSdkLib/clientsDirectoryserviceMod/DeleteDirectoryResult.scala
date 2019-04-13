package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDirectoryResult extends js.Object {
  /**
    * The directory identifier.
    */
  var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
}

object DeleteDirectoryResult {
  @scala.inline
  def apply(DirectoryId: DirectoryId = null): DeleteDirectoryResult = {
    val __obj = js.Dynamic.literal()
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId)
    __obj.asInstanceOf[DeleteDirectoryResult]
  }
}

