package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFieldLevelEncryptionRequest extends js.Object {
  /**
    * Request the ID for the field-level encryption configuration information.
    */
  var Id: String
}

object GetFieldLevelEncryptionRequest {
  @scala.inline
  def apply(Id: String): GetFieldLevelEncryptionRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[GetFieldLevelEncryptionRequest]
  }
}

