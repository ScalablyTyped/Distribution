package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Organization extends js.Object {
  /**
    * Autonomous system number of the internet provider of the remote IP address.
    */
  var Asn: js.UndefOr[String] = js.native
  /**
    * Organization that registered this ASN.
    */
  var AsnOrg: js.UndefOr[String] = js.native
  /**
    * ISP information for the internet provider.
    */
  var Isp: js.UndefOr[String] = js.native
  /**
    * Name of the internet provider.
    */
  var Org: js.UndefOr[String] = js.native
}

object Organization {
  @scala.inline
  def apply(Asn: String = null, AsnOrg: String = null, Isp: String = null, Org: String = null): Organization = {
    val __obj = js.Dynamic.literal()
    if (Asn != null) __obj.updateDynamic("Asn")(Asn.asInstanceOf[js.Any])
    if (AsnOrg != null) __obj.updateDynamic("AsnOrg")(AsnOrg.asInstanceOf[js.Any])
    if (Isp != null) __obj.updateDynamic("Isp")(Isp.asInstanceOf[js.Any])
    if (Org != null) __obj.updateDynamic("Org")(Org.asInstanceOf[js.Any])
    __obj.asInstanceOf[Organization]
  }
}

