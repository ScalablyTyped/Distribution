package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCloudFrontOriginAccessIdentityRequest extends js.Object {
  /**
    * The origin access identity's ID.
    */
  var Id: java.lang.String
  /**
    * The value of the ETag header you received from a previous GET or PUT request. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[java.lang.String] = js.undefined
}

object DeleteCloudFrontOriginAccessIdentityRequest {
  @scala.inline
  def apply(Id: java.lang.String, IfMatch: java.lang.String = null): DeleteCloudFrontOriginAccessIdentityRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
    if (IfMatch != null) __obj.updateDynamic("IfMatch")(IfMatch)
    __obj.asInstanceOf[DeleteCloudFrontOriginAccessIdentityRequest]
  }
}

