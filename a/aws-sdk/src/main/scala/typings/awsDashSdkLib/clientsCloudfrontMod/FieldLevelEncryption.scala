package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldLevelEncryption extends js.Object {
  /**
    * A complex data type that includes the profile configurations specified for field-level encryption. 
    */
  var FieldLevelEncryptionConfig: awsDashSdkLib.clientsCloudfrontMod.FieldLevelEncryptionConfig
  /**
    * The configuration ID for a field-level encryption configuration which includes a set of profiles that specify certain selected data fields to be encrypted by specific public keys.
    */
  var Id: java.lang.String
  /**
    * The last time the field-level encryption configuration was changed. 
    */
  var LastModifiedTime: timestamp
}

object FieldLevelEncryption {
  @scala.inline
  def apply(
    FieldLevelEncryptionConfig: FieldLevelEncryptionConfig,
    Id: java.lang.String,
    LastModifiedTime: timestamp
  ): FieldLevelEncryption = {
    val __obj = js.Dynamic.literal(FieldLevelEncryptionConfig = FieldLevelEncryptionConfig, Id = Id, LastModifiedTime = LastModifiedTime)
  
    __obj.asInstanceOf[FieldLevelEncryption]
  }
}

