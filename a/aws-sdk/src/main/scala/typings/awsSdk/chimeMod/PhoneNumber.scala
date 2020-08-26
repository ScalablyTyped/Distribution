package typings.awsSdk.chimeMod

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
  var CallingName: js.UndefOr[typings.awsSdk.chimeMod.CallingName] = js.native
  /**
    * The outbound calling name status.
    */
  var CallingNameStatus: js.UndefOr[typings.awsSdk.chimeMod.CallingNameStatus] = js.native
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
  var E164PhoneNumber: js.UndefOr[typings.awsSdk.chimeMod.E164PhoneNumber] = js.native
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
  def apply(): PhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneNumber]
  }
  @scala.inline
  implicit class PhoneNumberOps[Self <: PhoneNumber] (val x: Self) extends AnyVal {
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
    def setAssociationsVarargs(value: PhoneNumberAssociation*): Self = this.set("Associations", js.Array(value :_*))
    @scala.inline
    def setAssociations(value: PhoneNumberAssociationList): Self = this.set("Associations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociations: Self = this.set("Associations", js.undefined)
    @scala.inline
    def setCallingName(value: CallingName): Self = this.set("CallingName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallingName: Self = this.set("CallingName", js.undefined)
    @scala.inline
    def setCallingNameStatus(value: CallingNameStatus): Self = this.set("CallingNameStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallingNameStatus: Self = this.set("CallingNameStatus", js.undefined)
    @scala.inline
    def setCapabilities(value: PhoneNumberCapabilities): Self = this.set("Capabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapabilities: Self = this.set("Capabilities", js.undefined)
    @scala.inline
    def setCreatedTimestamp(value: Iso8601Timestamp): Self = this.set("CreatedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("CreatedTimestamp", js.undefined)
    @scala.inline
    def setDeletionTimestamp(value: Iso8601Timestamp): Self = this.set("DeletionTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletionTimestamp: Self = this.set("DeletionTimestamp", js.undefined)
    @scala.inline
    def setE164PhoneNumber(value: E164PhoneNumber): Self = this.set("E164PhoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteE164PhoneNumber: Self = this.set("E164PhoneNumber", js.undefined)
    @scala.inline
    def setPhoneNumberId(value: String): Self = this.set("PhoneNumberId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumberId: Self = this.set("PhoneNumberId", js.undefined)
    @scala.inline
    def setProductType(value: PhoneNumberProductType): Self = this.set("ProductType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductType: Self = this.set("ProductType", js.undefined)
    @scala.inline
    def setStatus(value: PhoneNumberStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setType(value: PhoneNumberType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    @scala.inline
    def setUpdatedTimestamp(value: Iso8601Timestamp): Self = this.set("UpdatedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedTimestamp: Self = this.set("UpdatedTimestamp", js.undefined)
  }
  
}

