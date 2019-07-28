package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePublicKeyRequest extends js.Object {
  /**
    * ID of the public key to be updated.
    */
  var Id: String
  /**
    * The value of the ETag header that you received when retrieving the public key to update. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
  /**
    * Request to update public key information.
    */
  var PublicKeyConfig: typings.awsDashSdk.clientsCloudfrontMod.PublicKeyConfig
}

object UpdatePublicKeyRequest {
  @scala.inline
  def apply(Id: String, PublicKeyConfig: PublicKeyConfig, IfMatch: String = null): UpdatePublicKeyRequest = {
    val __obj = js.Dynamic.literal(Id = Id, PublicKeyConfig = PublicKeyConfig)
    if (IfMatch != null) __obj.updateDynamic("IfMatch")(IfMatch)
    __obj.asInstanceOf[UpdatePublicKeyRequest]
  }
}

