package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFieldLevelEncryptionRequest extends js.Object {
  /**
    * Request the ID for the field-level encryption configuration information.
    */
  var Id: java.lang.String
}

object GetFieldLevelEncryptionRequest {
  @scala.inline
  def apply(Id: java.lang.String): GetFieldLevelEncryptionRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[GetFieldLevelEncryptionRequest]
  }
}

