package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryServiceAuthentication extends js.Object {
  /**
    * The ID of the Active Directory used for authentication.
    */
  var DirectoryId: js.UndefOr[String] = js.undefined
}

object DirectoryServiceAuthentication {
  @scala.inline
  def apply(DirectoryId: String = null): DirectoryServiceAuthentication = {
    val __obj = js.Dynamic.literal()
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId)
    __obj.asInstanceOf[DirectoryServiceAuthentication]
  }
}

