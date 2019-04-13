package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFieldLevelEncryptionProfileRequest extends js.Object {
  /**
    * The request to create a field-level encryption profile.
    */
  var FieldLevelEncryptionProfileConfig: awsDashSdkLib.clientsCloudfrontMod.FieldLevelEncryptionProfileConfig
}

object CreateFieldLevelEncryptionProfileRequest {
  @scala.inline
  def apply(FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig): CreateFieldLevelEncryptionProfileRequest = {
    val __obj = js.Dynamic.literal(FieldLevelEncryptionProfileConfig = FieldLevelEncryptionProfileConfig)
  
    __obj.asInstanceOf[CreateFieldLevelEncryptionProfileRequest]
  }
}

