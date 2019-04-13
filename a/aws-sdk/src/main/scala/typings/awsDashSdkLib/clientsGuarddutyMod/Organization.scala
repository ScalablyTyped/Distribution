package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Organization extends js.Object {
  /**
    * Autonomous system number of the internet provider of the remote IP address.
    */
  var Asn: js.UndefOr[__string] = js.undefined
  /**
    * Organization that registered this ASN.
    */
  var AsnOrg: js.UndefOr[__string] = js.undefined
  /**
    * ISP information for the internet provider.
    */
  var Isp: js.UndefOr[__string] = js.undefined
  /**
    * Name of the internet provider.
    */
  var Org: js.UndefOr[__string] = js.undefined
}

object Organization {
  @scala.inline
  def apply(Asn: __string = null, AsnOrg: __string = null, Isp: __string = null, Org: __string = null): Organization = {
    val __obj = js.Dynamic.literal()
    if (Asn != null) __obj.updateDynamic("Asn")(Asn)
    if (AsnOrg != null) __obj.updateDynamic("AsnOrg")(AsnOrg)
    if (Isp != null) __obj.updateDynamic("Isp")(Isp)
    if (Org != null) __obj.updateDynamic("Org")(Org)
    __obj.asInstanceOf[Organization]
  }
}

