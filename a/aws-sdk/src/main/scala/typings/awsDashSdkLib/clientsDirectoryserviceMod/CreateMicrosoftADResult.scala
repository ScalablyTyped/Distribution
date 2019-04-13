package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMicrosoftADResult extends js.Object {
  /**
    * The identifier of the directory that was created.
    */
  var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
}

object CreateMicrosoftADResult {
  @scala.inline
  def apply(DirectoryId: DirectoryId = null): CreateMicrosoftADResult = {
    val __obj = js.Dynamic.literal()
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId)
    __obj.asInstanceOf[CreateMicrosoftADResult]
  }
}

