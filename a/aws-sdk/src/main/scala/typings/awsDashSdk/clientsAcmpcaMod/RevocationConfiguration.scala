package typings.awsDashSdk.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevocationConfiguration extends js.Object {
  /**
    * Configuration of the certificate revocation list (CRL), if any, maintained by your private CA.
    */
  var CrlConfiguration: js.UndefOr[typings.awsDashSdk.clientsAcmpcaMod.CrlConfiguration] = js.undefined
}

object RevocationConfiguration {
  @scala.inline
  def apply(CrlConfiguration: CrlConfiguration = null): RevocationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (CrlConfiguration != null) __obj.updateDynamic("CrlConfiguration")(CrlConfiguration)
    __obj.asInstanceOf[RevocationConfiguration]
  }
}

