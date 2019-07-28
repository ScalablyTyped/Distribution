package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFieldLevelEncryptionProfileRequest extends js.Object {
  /**
    * Request the ID of the profile you want to delete from CloudFront.
    */
  var Id: String
  /**
    * The value of the ETag header that you received when retrieving the profile to delete. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
}

object DeleteFieldLevelEncryptionProfileRequest {
  @scala.inline
  def apply(Id: String, IfMatch: String = null): DeleteFieldLevelEncryptionProfileRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
    if (IfMatch != null) __obj.updateDynamic("IfMatch")(IfMatch)
    __obj.asInstanceOf[DeleteFieldLevelEncryptionProfileRequest]
  }
}

