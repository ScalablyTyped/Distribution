package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFieldLevelEncryptionProfileConfigRequest extends js.Object {
  /**
    * Get the ID for the field-level encryption profile configuration information.
    */
  var Id: String
}

object GetFieldLevelEncryptionProfileConfigRequest {
  @scala.inline
  def apply(Id: String): GetFieldLevelEncryptionProfileConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[GetFieldLevelEncryptionProfileConfigRequest]
  }
}

