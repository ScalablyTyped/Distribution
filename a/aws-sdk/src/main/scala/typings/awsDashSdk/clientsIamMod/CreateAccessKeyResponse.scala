package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccessKeyResponse extends js.Object {
  /**
    * A structure with details about the access key.
    */
  var AccessKey: typings.awsDashSdk.clientsIamMod.AccessKey = js.native
}

object CreateAccessKeyResponse {
  @scala.inline
  def apply(AccessKey: AccessKey): CreateAccessKeyResponse = {
    val __obj = js.Dynamic.literal(AccessKey = AccessKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateAccessKeyResponse]
  }
}

