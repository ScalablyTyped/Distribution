package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePublicKeyRequest extends js.Object {
  /**
    * The ID of the public key you want to remove from CloudFront.
    */
  var Id: java.lang.String
  /**
    * The value of the ETag header that you received when retrieving the public key identity to delete. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[java.lang.String] = js.undefined
}

object DeletePublicKeyRequest {
  @scala.inline
  def apply(Id: java.lang.String, IfMatch: java.lang.String = null): DeletePublicKeyRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
    if (IfMatch != null) __obj.updateDynamic("IfMatch")(IfMatch)
    __obj.asInstanceOf[DeletePublicKeyRequest]
  }
}

