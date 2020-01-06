package typings.awsDashSdk.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Address extends js.Object {
  /**
    * The unique ID for an address.
    */
  var AddressId: js.UndefOr[typings.awsDashSdk.clientsSnowballMod.AddressId] = js.native
  /**
    * The city in an address that a Snowball is to be delivered to.
    */
  var City: js.UndefOr[String] = js.native
  /**
    * The name of the company to receive a Snowball at an address.
    */
  var Company: js.UndefOr[String] = js.native
  /**
    * The country in an address that a Snowball is to be delivered to.
    */
  var Country: js.UndefOr[String] = js.native
  /**
    * If the address you are creating is a primary address, then set this option to true. This field is not supported in most regions.
    */
  var IsRestricted: js.UndefOr[Boolean] = js.native
  /**
    * This field is no longer used and the value is ignored.
    */
  var Landmark: js.UndefOr[String] = js.native
  /**
    * The name of a person to receive a Snowball at an address.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The phone number associated with an address that a Snowball is to be delivered to.
    */
  var PhoneNumber: js.UndefOr[String] = js.native
  /**
    * The postal code in an address that a Snowball is to be delivered to.
    */
  var PostalCode: js.UndefOr[String] = js.native
  /**
    * This field is no longer used and the value is ignored.
    */
  var PrefectureOrDistrict: js.UndefOr[String] = js.native
  /**
    * The state or province in an address that a Snowball is to be delivered to.
    */
  var StateOrProvince: js.UndefOr[String] = js.native
  /**
    * The first line in a street address that a Snowball is to be delivered to.
    */
  var Street1: js.UndefOr[String] = js.native
  /**
    * The second line in a street address that a Snowball is to be delivered to.
    */
  var Street2: js.UndefOr[String] = js.native
  /**
    * The third line in a street address that a Snowball is to be delivered to.
    */
  var Street3: js.UndefOr[String] = js.native
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
    if (AddressId != null) __obj.updateDynamic("AddressId")(AddressId.asInstanceOf[js.Any])
    if (City != null) __obj.updateDynamic("City")(City.asInstanceOf[js.Any])
    if (Company != null) __obj.updateDynamic("Company")(Company.asInstanceOf[js.Any])
    if (Country != null) __obj.updateDynamic("Country")(Country.asInstanceOf[js.Any])
    if (!js.isUndefined(IsRestricted)) __obj.updateDynamic("IsRestricted")(IsRestricted.asInstanceOf[js.Any])
    if (Landmark != null) __obj.updateDynamic("Landmark")(Landmark.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (PhoneNumber != null) __obj.updateDynamic("PhoneNumber")(PhoneNumber.asInstanceOf[js.Any])
    if (PostalCode != null) __obj.updateDynamic("PostalCode")(PostalCode.asInstanceOf[js.Any])
    if (PrefectureOrDistrict != null) __obj.updateDynamic("PrefectureOrDistrict")(PrefectureOrDistrict.asInstanceOf[js.Any])
    if (StateOrProvince != null) __obj.updateDynamic("StateOrProvince")(StateOrProvince.asInstanceOf[js.Any])
    if (Street1 != null) __obj.updateDynamic("Street1")(Street1.asInstanceOf[js.Any])
    if (Street2 != null) __obj.updateDynamic("Street2")(Street2.asInstanceOf[js.Any])
    if (Street3 != null) __obj.updateDynamic("Street3")(Street3.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

