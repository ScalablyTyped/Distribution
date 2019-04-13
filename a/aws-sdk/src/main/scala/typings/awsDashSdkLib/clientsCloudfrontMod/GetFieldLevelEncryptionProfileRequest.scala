package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFieldLevelEncryptionProfileRequest extends js.Object {
  /**
    * Get the ID for the field-level encryption profile information.
    */
  var Id: java.lang.String
}

object GetFieldLevelEncryptionProfileRequest {
  @scala.inline
  def apply(Id: java.lang.String): GetFieldLevelEncryptionProfileRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[GetFieldLevelEncryptionProfileRequest]
  }
}

