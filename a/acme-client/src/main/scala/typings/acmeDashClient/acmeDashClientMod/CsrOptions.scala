package typings.acmeDashClient.acmeDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CsrOptions extends js.Object {
  var altNames: js.UndefOr[js.Array[String]] = js.undefined
  var commonName: js.UndefOr[String] = js.undefined
  var country: js.UndefOr[String] = js.undefined
  var emailAddress: js.UndefOr[String] = js.undefined
  var keySize: js.UndefOr[Double] = js.undefined
  var locality: js.UndefOr[String] = js.undefined
  var organization: js.UndefOr[String] = js.undefined
  var organizationUnit: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object CsrOptions {
  @scala.inline
  def apply(
    altNames: js.Array[String] = null,
    commonName: String = null,
    country: String = null,
    emailAddress: String = null,
    keySize: Int | Double = null,
    locality: String = null,
    organization: String = null,
    organizationUnit: String = null,
    state: String = null
  ): CsrOptions = {
    val __obj = js.Dynamic.literal()
    if (altNames != null) __obj.updateDynamic("altNames")(altNames.asInstanceOf[js.Any])
    if (commonName != null) __obj.updateDynamic("commonName")(commonName.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (keySize != null) __obj.updateDynamic("keySize")(keySize.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (organizationUnit != null) __obj.updateDynamic("organizationUnit")(organizationUnit.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[CsrOptions]
  }
}

