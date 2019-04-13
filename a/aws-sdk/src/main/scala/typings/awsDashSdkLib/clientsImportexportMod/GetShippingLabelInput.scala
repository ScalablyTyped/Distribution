package typings
package awsDashSdkLib.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetShippingLabelInput extends js.Object {
  var APIVersion: js.UndefOr[APIVersion] = js.undefined
  var city: js.UndefOr[city] = js.undefined
  var company: js.UndefOr[company] = js.undefined
  var country: js.UndefOr[country] = js.undefined
  var jobIds: JobIdList
  var name: js.UndefOr[name] = js.undefined
  var phoneNumber: js.UndefOr[phoneNumber] = js.undefined
  var postalCode: js.UndefOr[postalCode] = js.undefined
  var stateOrProvince: js.UndefOr[stateOrProvince] = js.undefined
  var street1: js.UndefOr[street1] = js.undefined
  var street2: js.UndefOr[street2] = js.undefined
  var street3: js.UndefOr[street3] = js.undefined
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
    val __obj = js.Dynamic.literal(jobIds = jobIds)
    if (APIVersion != null) __obj.updateDynamic("APIVersion")(APIVersion)
    if (city != null) __obj.updateDynamic("city")(city)
    if (company != null) __obj.updateDynamic("company")(company)
    if (country != null) __obj.updateDynamic("country")(country)
    if (name != null) __obj.updateDynamic("name")(name)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    if (stateOrProvince != null) __obj.updateDynamic("stateOrProvince")(stateOrProvince)
    if (street1 != null) __obj.updateDynamic("street1")(street1)
    if (street2 != null) __obj.updateDynamic("street2")(street2)
    if (street3 != null) __obj.updateDynamic("street3")(street3)
    __obj.asInstanceOf[GetShippingLabelInput]
  }
}

