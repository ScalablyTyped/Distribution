package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneNumber extends js.Object {
  /**
    * The phone number associations.
    */
  var Associations: js.UndefOr[PhoneNumberAssociationList] = js.undefined
  /**
    * The phone number capabilities.
    */
  var Capabilities: js.UndefOr[PhoneNumberCapabilities] = js.undefined
  /**
    * The phone number creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
  /**
    * The deleted phone number timestamp, in ISO 8601 format.
    */
  var DeletionTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
  /**
    * The phone number, in E.164 format.
    */
  var E164PhoneNumber: js.UndefOr[typings.awsDashSdk.clientsChimeMod.E164PhoneNumber] = js.undefined
  /**
    * The phone number ID.
    */
  var PhoneNumberId: js.UndefOr[String] = js.undefined
  /**
    * The phone number product type.
    */
  var ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined
  /**
    * The phone number status.
    */
  var Status: js.UndefOr[PhoneNumberStatus] = js.undefined
  /**
    * The phone number type.
    */
  var Type: js.UndefOr[PhoneNumberType] = js.undefined
  /**
    * The updated phone number timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
}

object PhoneNumber {
  @scala.inline
  def apply(
    Associations: PhoneNumberAssociationList = null,
    Capabilities: PhoneNumberCapabilities = null,
    CreatedTimestamp: Iso8601Timestamp = null,
    DeletionTimestamp: Iso8601Timestamp = null,
    E164PhoneNumber: E164PhoneNumber = null,
    PhoneNumberId: String = null,
    ProductType: PhoneNumberProductType = null,
    Status: PhoneNumberStatus = null,
    Type: PhoneNumberType = null,
    UpdatedTimestamp: Iso8601Timestamp = null
  ): PhoneNumber = {
    val __obj = js.Dynamic.literal()
    if (Associations != null) __obj.updateDynamic("Associations")(Associations)
    if (Capabilities != null) __obj.updateDynamic("Capabilities")(Capabilities)
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp)
    if (DeletionTimestamp != null) __obj.updateDynamic("DeletionTimestamp")(DeletionTimestamp)
    if (E164PhoneNumber != null) __obj.updateDynamic("E164PhoneNumber")(E164PhoneNumber)
    if (PhoneNumberId != null) __obj.updateDynamic("PhoneNumberId")(PhoneNumberId)
    if (ProductType != null) __obj.updateDynamic("ProductType")(ProductType.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (UpdatedTimestamp != null) __obj.updateDynamic("UpdatedTimestamp")(UpdatedTimestamp)
    __obj.asInstanceOf[PhoneNumber]
  }
}

