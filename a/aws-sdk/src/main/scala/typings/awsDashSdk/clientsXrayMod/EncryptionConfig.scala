package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionConfig extends js.Object {
  /**
    * The ID of the customer master key (CMK) used for encryption, if applicable.
    */
  var KeyId: js.UndefOr[String] = js.undefined
  /**
    * The encryption status. While the status is UPDATING, X-Ray may encrypt data with a combination of the new and old settings.
    */
  var Status: js.UndefOr[EncryptionStatus] = js.undefined
  /**
    * The type of encryption. Set to KMS for encryption with CMKs. Set to NONE for default encryption.
    */
  var Type: js.UndefOr[EncryptionType] = js.undefined
}

object EncryptionConfig {
  @scala.inline
  def apply(KeyId: String = null, Status: EncryptionStatus = null, Type: EncryptionType = null): EncryptionConfig = {
    val __obj = js.Dynamic.literal()
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionConfig]
  }
}

