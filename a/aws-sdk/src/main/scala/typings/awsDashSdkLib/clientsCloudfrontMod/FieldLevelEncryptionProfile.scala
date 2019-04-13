package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldLevelEncryptionProfile extends js.Object {
  /**
    * A complex data type that includes the profile name and the encryption entities for the field-level encryption profile.
    */
  var FieldLevelEncryptionProfileConfig: awsDashSdkLib.clientsCloudfrontMod.FieldLevelEncryptionProfileConfig
  /**
    * The ID for a field-level encryption profile configuration which includes a set of profiles that specify certain selected data fields to be encrypted by specific public keys.
    */
  var Id: java.lang.String
  /**
    * The last time the field-level encryption profile was updated.
    */
  var LastModifiedTime: timestamp
}

object FieldLevelEncryptionProfile {
  @scala.inline
  def apply(
    FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig,
    Id: java.lang.String,
    LastModifiedTime: timestamp
  ): FieldLevelEncryptionProfile = {
    val __obj = js.Dynamic.literal(FieldLevelEncryptionProfileConfig = FieldLevelEncryptionProfileConfig, Id = Id, LastModifiedTime = LastModifiedTime)
  
    __obj.asInstanceOf[FieldLevelEncryptionProfile]
  }
}

