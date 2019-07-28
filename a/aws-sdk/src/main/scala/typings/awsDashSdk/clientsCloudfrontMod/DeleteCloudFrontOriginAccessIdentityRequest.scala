package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCloudFrontOriginAccessIdentityRequest extends js.Object {
  /**
    * The origin access identity's ID.
    */
  var Id: String
  /**
    * The value of the ETag header you received from a previous GET or PUT request. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
}

object DeleteCloudFrontOriginAccessIdentityRequest {
  @scala.inline
  def apply(Id: String, IfMatch: String = null): DeleteCloudFrontOriginAccessIdentityRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
    if (IfMatch != null) __obj.updateDynamic("IfMatch")(IfMatch)
    __obj.asInstanceOf[DeleteCloudFrontOriginAccessIdentityRequest]
  }
}

