package typings.awsDashSdk.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetShippingLabelInput extends js.Object {
  var APIVersion: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.APIVersion] = js.native
  var city: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.city] = js.native
  var company: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.company] = js.native
  var country: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.country] = js.native
  var jobIds: JobIdList = js.native
  var name: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.name] = js.native
  var phoneNumber: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.phoneNumber] = js.native
  var postalCode: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.postalCode] = js.native
  var stateOrProvince: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.stateOrProvince] = js.native
  var street1: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.street1] = js.native
  var street2: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.street2] = js.native
  var street3: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.street3] = js.native
}

object GetShippingLabelInput {
  @scala.inline
  def apply(
    jobIds: JobIdList,
    APIVersion: APIVersion = null,
    city: city = null,
    company: company = null,
    country: country = null,
    name: name = null,
    phoneNumber: phoneNumber = null,
    postalCode: postalCode = null,
    stateOrProvince: stateOrProvince = null,
    street1: street1 = null,
    street2: street2 = null,
    street3: street3 = null
  ): GetShippingLabelInput = {
    val __obj = js.Dynamic.literal(jobIds = jobIds.asInstanceOf[js.Any])
    if (APIVersion != null) __obj.updateDynamic("APIVersion")(APIVersion.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (company != null) __obj.updateDynamic("company")(company.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (stateOrProvince != null) __obj.updateDynamic("stateOrProvince")(stateOrProvince.asInstanceOf[js.Any])
    if (street1 != null) __obj.updateDynamic("street1")(street1.asInstanceOf[js.Any])
    if (street2 != null) __obj.updateDynamic("street2")(street2.asInstanceOf[js.Any])
    if (street3 != null) __obj.updateDynamic("street3")(street3.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetShippingLabelInput]
  }
}

