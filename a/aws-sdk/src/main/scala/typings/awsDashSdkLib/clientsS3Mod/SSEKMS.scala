package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSEKMS extends js.Object {
  /**
    * Specifies the ID of the AWS Key Management Service (KMS) master encryption key to use for encrypting Inventory reports.
    */
  var KeyId: SSEKMSKeyId
}

object SSEKMS {
  @scala.inline
  def apply(KeyId: SSEKMSKeyId): SSEKMS = {
    val __obj = js.Dynamic.literal(KeyId = KeyId)
  
    __obj.asInstanceOf[SSEKMS]
  }
}

