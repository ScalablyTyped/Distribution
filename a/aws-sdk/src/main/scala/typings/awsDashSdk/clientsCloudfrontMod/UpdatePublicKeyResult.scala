package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePublicKeyResult extends js.Object {
  /**
    * The current version of the update public key result. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.undefined
  /**
    * Return the results of updating the public key.
    */
  var PublicKey: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.PublicKey] = js.undefined
}

object UpdatePublicKeyResult {
  @scala.inline
  def apply(ETag: String = null, PublicKey: PublicKey = null): UpdatePublicKeyResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (PublicKey != null) __obj.updateDynamic("PublicKey")(PublicKey)
    __obj.asInstanceOf[UpdatePublicKeyResult]
  }
}

