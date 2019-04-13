package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFieldLevelEncryptionConfigRequest extends js.Object {
  /**
    * The ID of the configuration you want to delete from CloudFront.
    */
  var Id: java.lang.String
  /**
    * The value of the ETag header that you received when retrieving the configuration identity to delete. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[java.lang.String] = js.undefined
}

object DeleteFieldLevelEncryptionConfigRequest {
  @scala.inline
  def apply(Id: java.lang.String, IfMatch: java.lang.String = null): DeleteFieldLevelEncryptionConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
    if (IfMatch != null) __obj.updateDynamic("IfMatch")(IfMatch)
    __obj.asInstanceOf[DeleteFieldLevelEncryptionConfigRequest]
  }
}

