package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFieldLevelEncryptionConfigRequest extends js.Object {
  /**
    * The request to create a new field-level encryption configuration.
    */
  var FieldLevelEncryptionConfig: typings.awsDashSdk.clientsCloudfrontMod.FieldLevelEncryptionConfig
}

object CreateFieldLevelEncryptionConfigRequest {
  @scala.inline
  def apply(FieldLevelEncryptionConfig: FieldLevelEncryptionConfig): CreateFieldLevelEncryptionConfigRequest = {
    val __obj = js.Dynamic.literal(FieldLevelEncryptionConfig = FieldLevelEncryptionConfig)
  
    __obj.asInstanceOf[CreateFieldLevelEncryptionConfigRequest]
  }
}

