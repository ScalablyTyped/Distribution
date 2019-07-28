package typings.awsDashSdk.clientsAcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedKeyUsage extends js.Object {
  /**
    * The name of an Extended Key Usage value.
    */
  var Name: js.UndefOr[ExtendedKeyUsageName] = js.undefined
  /**
    * An object identifier (OID) for the extension value. OIDs are strings of numbers separated by periods. The following OIDs are defined in RFC 3280 and RFC 5280.     1.3.6.1.5.5.7.3.1 (TLS_WEB_SERVER_AUTHENTICATION)     1.3.6.1.5.5.7.3.2 (TLS_WEB_CLIENT_AUTHENTICATION)     1.3.6.1.5.5.7.3.3 (CODE_SIGNING)     1.3.6.1.5.5.7.3.4 (EMAIL_PROTECTION)     1.3.6.1.5.5.7.3.8 (TIME_STAMPING)     1.3.6.1.5.5.7.3.9 (OCSP_SIGNING)     1.3.6.1.5.5.7.3.5 (IPSEC_END_SYSTEM)     1.3.6.1.5.5.7.3.6 (IPSEC_TUNNEL)     1.3.6.1.5.5.7.3.7 (IPSEC_USER)   
    */
  var OID: js.UndefOr[String] = js.undefined
}

object ExtendedKeyUsage {
  @scala.inline
  def apply(Name: ExtendedKeyUsageName = null, OID: String = null): ExtendedKeyUsage = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OID != null) __obj.updateDynamic("OID")(OID)
    __obj.asInstanceOf[ExtendedKeyUsage]
  }
}

