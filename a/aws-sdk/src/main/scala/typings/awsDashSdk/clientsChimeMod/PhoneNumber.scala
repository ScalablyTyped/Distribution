package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneNumber extends js.Object {
  /**
    * The phone number associations.
    */
  var Associations: js.UndefOr[PhoneNumberAssociationList] = js.native
  /**
    * The outbound calling name associated with the phone number.
    */
  var CallingName: js.UndefOr[typings.awsDashSdk.clientsChimeMod.CallingName] = js.native
  /**
    * The outbound calling name status.
    */
  var CallingNameStatus: js.UndefOr[typings.awsDashSdk.clientsChimeMod.CallingNameStatus] = js.native
  /**
    * The phone number capabilities.
    */
  var Capabilities: js.UndefOr[PhoneNumberCapabilities] = js.native
  /**
    * The phone number creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
  /**
    * The deleted phone number timestamp, in ISO 8601 format.
    */
  var DeletionTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
  /**
    * The phone number, in E.164 format.
    */
  var E164PhoneNumber: js.UndefOr[typings.awsDashSdk.clientsChimeMod.E164PhoneNumber] = js.native
  /**
    * The phone number ID.
    */
  var PhoneNumberId: js.UndefOr[String] = js.native
  /**
    * The phone number product type.
    */
  var ProductType: js.UndefOr[PhoneNumberProductType] = js.native
  /**
    * The phone number status.
    */
  var Status: js.UndefOr[PhoneNumberStatus] = js.native
  /**
    * The phone number type.
    */
  var Type: js.UndefOr[PhoneNumberType] = js.native
  /**
    * The updated phone number timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
}

object PhoneNumber {
  @scala.inline
  def apply(
    Associations: PhoneNumberAssociationList = null,
    CallingName: CallingName = null,
    CallingNameStatus: CallingNameStatus = null,
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
    if (Associations != null) __obj.updateDynamic("Associations")(Associations.asInstanceOf[js.Any])
    if (CallingName != null) __obj.updateDynamic("CallingName")(CallingName.asInstanceOf[js.Any])
    if (CallingNameStatus != null) __obj.updateDynamic("CallingNameStatus")(CallingNameStatus.asInstanceOf[js.Any])
    if (Capabilities != null) __obj.updateDynamic("Capabilities")(Capabilities.asInstanceOf[js.Any])
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp.asInstanceOf[js.Any])
    if (DeletionTimestamp != null) __obj.updateDynamic("DeletionTimestamp")(DeletionTimestamp.asInstanceOf[js.Any])
    if (E164PhoneNumber != null) __obj.updateDynamic("E164PhoneNumber")(E164PhoneNumber.asInstanceOf[js.Any])
    if (PhoneNumberId != null) __obj.updateDynamic("PhoneNumberId")(PhoneNumberId.asInstanceOf[js.Any])
    if (ProductType != null) __obj.updateDynamic("ProductType")(ProductType.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (UpdatedTimestamp != null) __obj.updateDynamic("UpdatedTimestamp")(UpdatedTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumber]
  }
}

