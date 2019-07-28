package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionKey extends js.Object {
  /**
    * The ID used to identify the key. For an AWS KMS key, this is the key ID or key ARN.
    */
  var id: EncryptionKeyId
  /**
    * The type of encryption key, such as an AWS Key Management Service (AWS KMS) key. When creating or updating a pipeline, the value must be set to 'KMS'.
    */
  var `type`: EncryptionKeyType
}

object EncryptionKey {
  @scala.inline
  def apply(id: EncryptionKeyId, `type`: EncryptionKeyType): EncryptionKey = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionKey]
  }
}

