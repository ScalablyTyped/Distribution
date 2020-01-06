package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSEKMS extends js.Object {
  /**
    * Specifies the ID of the AWS Key Management Service (AWS KMS) symmetric customer managed customer master key (CMK) to use for encrypting inventory reports.
    */
  var KeyId: SSEKMSKeyId = js.native
}

object SSEKMS {
  @scala.inline
  def apply(KeyId: SSEKMSKeyId): SSEKMS = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SSEKMS]
  }
}

