package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFieldLevelEncryptionProfileConfigRequest extends js.Object {
  /**
    * Get the ID for the field-level encryption profile configuration information.
    */
  var Id: java.lang.String
}

object GetFieldLevelEncryptionProfileConfigRequest {
  @scala.inline
  def apply(Id: java.lang.String): GetFieldLevelEncryptionProfileConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[GetFieldLevelEncryptionProfileConfigRequest]
  }
}

