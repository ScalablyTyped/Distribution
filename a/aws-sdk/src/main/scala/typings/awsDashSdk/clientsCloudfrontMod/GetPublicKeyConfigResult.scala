package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPublicKeyConfigResult extends js.Object {
  /**
    * The current version of the public key configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.undefined
  /**
    * Return the result for the public key configuration.
    */
  var PublicKeyConfig: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.PublicKeyConfig] = js.undefined
}

object GetPublicKeyConfigResult {
  @scala.inline
  def apply(ETag: String = null, PublicKeyConfig: PublicKeyConfig = null): GetPublicKeyConfigResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (PublicKeyConfig != null) __obj.updateDynamic("PublicKeyConfig")(PublicKeyConfig)
    __obj.asInstanceOf[GetPublicKeyConfigResult]
  }
}

