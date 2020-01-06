package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldLevelEncryptionProfileSummary extends js.Object {
  /**
    * An optional comment for the field-level encryption profile summary.
    */
  var Comment: js.UndefOr[String] = js.native
  /**
    * A complex data type of encryption entities for the field-level encryption profile that include the public key ID, provider, and field patterns for specifying which fields to encrypt with this key.
    */
  var EncryptionEntities: typings.awsDashSdk.clientsCloudfrontMod.EncryptionEntities = js.native
  /**
    * ID for the field-level encryption profile summary.
    */
  var Id: String = js.native
  /**
    * The time when the the field-level encryption profile summary was last updated.
    */
  var LastModifiedTime: timestamp = js.native
  /**
    * Name for the field-level encryption profile summary.
    */
  var Name: String = js.native
}

object FieldLevelEncryptionProfileSummary {
  @scala.inline
  def apply(
    EncryptionEntities: EncryptionEntities,
    Id: String,
    LastModifiedTime: timestamp,
    Name: String,
    Comment: String = null
  ): FieldLevelEncryptionProfileSummary = {
    val __obj = js.Dynamic.literal(EncryptionEntities = EncryptionEntities.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLevelEncryptionProfileSummary]
  }
}

