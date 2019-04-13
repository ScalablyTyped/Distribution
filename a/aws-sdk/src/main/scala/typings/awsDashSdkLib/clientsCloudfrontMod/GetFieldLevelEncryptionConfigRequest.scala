package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFieldLevelEncryptionConfigRequest extends js.Object {
  /**
    * Request the ID for the field-level encryption configuration information.
    */
  var Id: java.lang.String
}

object GetFieldLevelEncryptionConfigRequest {
  @scala.inline
  def apply(Id: java.lang.String): GetFieldLevelEncryptionConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[GetFieldLevelEncryptionConfigRequest]
  }
}

