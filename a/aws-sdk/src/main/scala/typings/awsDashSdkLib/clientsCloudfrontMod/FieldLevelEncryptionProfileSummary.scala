package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldLevelEncryptionProfileSummary extends js.Object {
  /**
    * An optional comment for the field-level encryption profile summary.
    */
  var Comment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A complex data type of encryption entities for the field-level encryption profile that include the public key ID, provider, and field patterns for specifying which fields to encrypt with this key.
    */
  var EncryptionEntities: awsDashSdkLib.clientsCloudfrontMod.EncryptionEntities
  /**
    * ID for the field-level encryption profile summary.
    */
  var Id: java.lang.String
  /**
    * The time when the the field-level encryption profile summary was last updated.
    */
  var LastModifiedTime: timestamp
  /**
    * Name for the field-level encryption profile summary.
    */
  var Name: java.lang.String
}

object FieldLevelEncryptionProfileSummary {
  @scala.inline
  def apply(
    EncryptionEntities: EncryptionEntities,
    Id: java.lang.String,
    LastModifiedTime: timestamp,
    Name: java.lang.String,
    Comment: java.lang.String = null
  ): FieldLevelEncryptionProfileSummary = {
    val __obj = js.Dynamic.literal(EncryptionEntities = EncryptionEntities, Id = Id, LastModifiedTime = LastModifiedTime, Name = Name)
    if (Comment != null) __obj.updateDynamic("Comment")(Comment)
    __obj.asInstanceOf[FieldLevelEncryptionProfileSummary]
  }
}

