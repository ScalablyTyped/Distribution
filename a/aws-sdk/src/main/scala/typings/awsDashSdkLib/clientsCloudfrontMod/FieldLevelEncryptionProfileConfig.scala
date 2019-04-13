package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldLevelEncryptionProfileConfig extends js.Object {
  /**
    * A unique number that ensures that the request can't be replayed.
    */
  var CallerReference: java.lang.String
  /**
    * An optional comment for the field-level encryption profile.
    */
  var Comment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A complex data type of encryption entities for the field-level encryption profile that include the public key ID, provider, and field patterns for specifying which fields to encrypt with this key.
    */
  var EncryptionEntities: awsDashSdkLib.clientsCloudfrontMod.EncryptionEntities
  /**
    * Profile name for the field-level encryption profile.
    */
  var Name: java.lang.String
}

object FieldLevelEncryptionProfileConfig {
  @scala.inline
  def apply(
    CallerReference: java.lang.String,
    EncryptionEntities: EncryptionEntities,
    Name: java.lang.String,
    Comment: java.lang.String = null
  ): FieldLevelEncryptionProfileConfig = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference, EncryptionEntities = EncryptionEntities, Name = Name)
    if (Comment != null) __obj.updateDynamic("Comment")(Comment)
    __obj.asInstanceOf[FieldLevelEncryptionProfileConfig]
  }
}

