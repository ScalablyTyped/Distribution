package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePublicKeyResult extends js.Object {
  /**
    * The current version of the public key. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * The fully qualified URI of the new public key resource just created. For example: https://cloudfront.amazonaws.com/2010-11-01/cloudfront-public-key/EDFDVBD632BHDS5.
    */
  var Location: js.UndefOr[String] = js.native
  /**
    * Returned when you add a public key.
    */
  var PublicKey: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.PublicKey] = js.native
}

object CreatePublicKeyResult {
  @scala.inline
  def apply(ETag: String = null, Location: String = null, PublicKey: PublicKey = null): CreatePublicKeyResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (Location != null) __obj.updateDynamic("Location")(Location.asInstanceOf[js.Any])
    if (PublicKey != null) __obj.updateDynamic("PublicKey")(PublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePublicKeyResult]
  }
}

