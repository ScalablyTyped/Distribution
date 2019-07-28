package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportClientVpnClientCertificateRevocationListResult extends js.Object {
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var Return: js.UndefOr[Boolean] = js.undefined
}

object ImportClientVpnClientCertificateRevocationListResult {
  @scala.inline
  def apply(Return: js.UndefOr[Boolean] = js.undefined): ImportClientVpnClientCertificateRevocationListResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Return)) __obj.updateDynamic("Return")(Return)
    __obj.asInstanceOf[ImportClientVpnClientCertificateRevocationListResult]
  }
}

