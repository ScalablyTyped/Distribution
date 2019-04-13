package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPublicKeyConfigResult extends js.Object {
  /**
    * The current version of the public key configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Return the result for the public key configuration.
    */
  var PublicKeyConfig: js.UndefOr[PublicKeyConfig] = js.undefined
}

object GetPublicKeyConfigResult {
  @scala.inline
  def apply(ETag: java.lang.String = null, PublicKeyConfig: PublicKeyConfig = null): GetPublicKeyConfigResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (PublicKeyConfig != null) __obj.updateDynamic("PublicKeyConfig")(PublicKeyConfig)
    __obj.asInstanceOf[GetPublicKeyConfigResult]
  }
}

