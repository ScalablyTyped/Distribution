package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateKeysAndCertificateRequest extends js.Object {
  /**
    * Specifies whether the certificate is active.
    */
  var setAsActive: js.UndefOr[SetAsActive] = js.undefined
}

object CreateKeysAndCertificateRequest {
  @scala.inline
  def apply(setAsActive: js.UndefOr[scala.Boolean] = js.undefined): CreateKeysAndCertificateRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(setAsActive)) __obj.updateDynamic("setAsActive")(setAsActive)
    __obj.asInstanceOf[CreateKeysAndCertificateRequest]
  }
}

