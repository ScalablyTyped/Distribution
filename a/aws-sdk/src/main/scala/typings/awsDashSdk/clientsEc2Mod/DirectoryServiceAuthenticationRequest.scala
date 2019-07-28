package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryServiceAuthenticationRequest extends js.Object {
  /**
    * The ID of the Active Directory to be used for authentication.
    */
  var DirectoryId: js.UndefOr[String] = js.undefined
}

object DirectoryServiceAuthenticationRequest {
  @scala.inline
  def apply(DirectoryId: String = null): DirectoryServiceAuthenticationRequest = {
    val __obj = js.Dynamic.literal()
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId)
    __obj.asInstanceOf[DirectoryServiceAuthenticationRequest]
  }
}

