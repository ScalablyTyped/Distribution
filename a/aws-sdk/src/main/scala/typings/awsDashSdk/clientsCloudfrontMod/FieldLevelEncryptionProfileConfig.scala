package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldLevelEncryptionProfileConfig extends js.Object {
  /**
    * A unique number that ensures that the request can't be replayed.
    */
  var CallerReference: String
  /**
    * An optional comment for the field-level encryption profile.
    */
  var Comment: js.UndefOr[String] = js.undefined
  /**
    * A complex data type of encryption entities for the field-level encryption profile that include the public key ID, provider, and field patterns for specifying which fields to encrypt with this key.
    */
  var EncryptionEntities: typings.awsDashSdk.clientsCloudfrontMod.EncryptionEntities
  /**
    * Profile name for the field-level encryption profile.
    */
  var Name: String
}

object FieldLevelEncryptionProfileConfig {
  @scala.inline
  def apply(
    CallerReference: String,
    EncryptionEntities: EncryptionEntities,
    Name: String,
    Comment: String = null
  ): FieldLevelEncryptionProfileConfig = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference, EncryptionEntities = EncryptionEntities, Name = Name)
    if (Comment != null) __obj.updateDynamic("Comment")(Comment)
    __obj.asInstanceOf[FieldLevelEncryptionProfileConfig]
  }
}

