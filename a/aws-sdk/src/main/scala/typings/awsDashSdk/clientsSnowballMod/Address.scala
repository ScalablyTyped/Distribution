package typings.awsDashSdk.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  /**
    * The unique ID for an address.
    */
  var AddressId: js.UndefOr[typings.awsDashSdk.clientsSnowballMod.AddressId] = js.undefined
  /**
    * The city in an address that a Snowball is to be delivered to.
    */
  var City: js.UndefOr[String] = js.undefined
  /**
    * The name of the company to receive a Snowball at an address.
    */
  var Company: js.UndefOr[String] = js.undefined
  /**
    * The country in an address that a Snowball is to be delivered to.
    */
  var Country: js.UndefOr[String] = js.undefined
  /**
    * If the address you are creating is a primary address, then set this option to true. This field is not supported in most regions.
    */
  var IsRestricted: js.UndefOr[Boolean] = js.undefined
  /**
    * This field is no longer used and the value is ignored.
    */
  var Landmark: js.UndefOr[String] = js.undefined
  /**
    * The name of a person to receive a Snowball at an address.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The phone number associated with an address that a Snowball is to be delivered to.
    */
  var PhoneNumber: js.UndefOr[String] = js.undefined
  /**
    * The postal code in an address that a Snowball is to be delivered to.
    */
  var PostalCode: js.UndefOr[String] = js.undefined
  /**
    * This field is no longer used and the value is ignored.
    */
  var PrefectureOrDistrict: js.UndefOr[String] = js.undefined
  /**
    * The state or province in an address that a Snowball is to be delivered to.
    */
  var StateOrProvince: js.UndefOr[String] = js.undefined
  /**
    * The first line in a street address that a Snowball is to be delivered to.
    */
  var Street1: js.UndefOr[String] = js.undefined
  /**
    * The second line in a street address that a Snowball is to be delivered to.
    */
  var Street2: js.UndefOr[String] = js.undefined
  /**
    * The third line in a street address that a Snowball is to be delivered to.
    */
  var Street3: js.UndefOr[String] = js.undefined
}

object Address {
  @scala.inline
  def apply(
    AddressId: AddressId = null,
    City: String = null,
    Company: String = null,
    Country: String = null,
    IsRestricted: js.UndefOr[scala.Boolean] = js.undefined,
    Landmark: String = null,
    Name: String = null,
    PhoneNumber: String = null,
    PostalCode: String = null,
    PrefectureOrDistrict: String = null,
    StateOrProvince: String = null,
    Street1: String = null,
    Street2: String = null,
    Street3: String = null
  ): Address = {
    val __obj = js.Dynamic.literal()
    if (AddressId != null) __obj.updateDynamic("AddressId")(AddressId)
    if (City != null) __obj.updateDynamic("City")(City)
    if (Company != null) __obj.updateDynamic("Company")(Company)
    if (Country != null) __obj.updateDynamic("Country")(Country)
    if (!js.isUndefined(IsRestricted)) __obj.updateDynamic("IsRestricted")(IsRestricted)
    if (Landmark != null) __obj.updateDynamic("Landmark")(Landmark)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (PhoneNumber != null) __obj.updateDynamic("PhoneNumber")(PhoneNumber)
    if (PostalCode != null) __obj.updateDynamic("PostalCode")(PostalCode)
    if (PrefectureOrDistrict != null) __obj.updateDynamic("PrefectureOrDistrict")(PrefectureOrDistrict)
    if (StateOrProvince != null) __obj.updateDynamic("StateOrProvince")(StateOrProvince)
    if (Street1 != null) __obj.updateDynamic("Street1")(Street1)
    if (Street2 != null) __obj.updateDynamic("Street2")(Street2)
    if (Street3 != null) __obj.updateDynamic("Street3")(Street3)
    __obj.asInstanceOf[Address]
  }
}

