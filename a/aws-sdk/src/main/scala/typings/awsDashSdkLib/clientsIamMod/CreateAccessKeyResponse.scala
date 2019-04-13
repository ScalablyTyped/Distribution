package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAccessKeyResponse extends js.Object {
  /**
    * A structure with details about the access key.
    */
  var AccessKey: awsDashSdkLib.clientsIamMod.AccessKey
}

object CreateAccessKeyResponse {
  @scala.inline
  def apply(AccessKey: AccessKey): CreateAccessKeyResponse = {
    val __obj = js.Dynamic.literal(AccessKey = AccessKey)
  
    __obj.asInstanceOf[CreateAccessKeyResponse]
  }
}

