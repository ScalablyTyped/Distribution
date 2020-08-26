package typings.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedKeyUsage extends js.Object {
  /**
    * The name of an Extended Key Usage value.
    */
  var Name: js.UndefOr[ExtendedKeyUsageName] = js.native
  /**
    * An object identifier (OID) for the extension value. OIDs are strings of numbers separated by periods. The following OIDs are defined in RFC 3280 and RFC 5280.     1.3.6.1.5.5.7.3.1 (TLS_WEB_SERVER_AUTHENTICATION)     1.3.6.1.5.5.7.3.2 (TLS_WEB_CLIENT_AUTHENTICATION)     1.3.6.1.5.5.7.3.3 (CODE_SIGNING)     1.3.6.1.5.5.7.3.4 (EMAIL_PROTECTION)     1.3.6.1.5.5.7.3.8 (TIME_STAMPING)     1.3.6.1.5.5.7.3.9 (OCSP_SIGNING)     1.3.6.1.5.5.7.3.5 (IPSEC_END_SYSTEM)     1.3.6.1.5.5.7.3.6 (IPSEC_TUNNEL)     1.3.6.1.5.5.7.3.7 (IPSEC_USER)   
    */
  var OID: js.UndefOr[String] = js.native
}

object ExtendedKeyUsage {
  @scala.inline
  def apply(): ExtendedKeyUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendedKeyUsage]
  }
  @scala.inline
  implicit class ExtendedKeyUsageOps[Self <: ExtendedKeyUsage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: ExtendedKeyUsageName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setOID(value: String): Self = this.set("OID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOID: Self = this.set("OID", js.undefined)
  }
  
}

