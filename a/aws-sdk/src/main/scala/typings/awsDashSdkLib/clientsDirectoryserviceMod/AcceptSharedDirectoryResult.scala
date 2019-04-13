package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptSharedDirectoryResult extends js.Object {
  /**
    * The shared directory in the directory consumer account.
    */
  var SharedDirectory: js.UndefOr[SharedDirectory] = js.undefined
}

object AcceptSharedDirectoryResult {
  @scala.inline
  def apply(SharedDirectory: SharedDirectory = null): AcceptSharedDirectoryResult = {
    val __obj = js.Dynamic.literal()
    if (SharedDirectory != null) __obj.updateDynamic("SharedDirectory")(SharedDirectory)
    __obj.asInstanceOf[AcceptSharedDirectoryResult]
  }
}

