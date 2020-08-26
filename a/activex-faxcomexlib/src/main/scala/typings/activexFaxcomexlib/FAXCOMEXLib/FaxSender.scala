package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxSender Class */
@js.native
trait FaxSender extends js.Object {
  /** Sender's billing code */
  var BillingCode: String = js.native
  /** City */
  var City: String = js.native
  /** Sender's company */
  var Company: String = js.native
  /** Sender's country or region */
  var Country: String = js.native
  /** Sender's department */
  var Department: String = js.native
  /** Sender's e-mail address */
  var Email: String = js.native
  @JSName("FAXCOMEXLib.FaxSender_typekey")
  var FAXCOMEXLibDotFaxSender_typekey: FaxSender = js.native
  /** Sender's fax number */
  var FaxNumber: String = js.native
  /** Sender's home phone */
  var HomePhone: String = js.native
  /** Sender's name */
  var Name: String = js.native
  /** Sender's office location */
  var OfficeLocation: String = js.native
  /** Sender's office phone */
  var OfficePhone: String = js.native
  /** Sender's state */
  var State: String = js.native
  /** Sender's street address */
  var StreetAddress: String = js.native
  /** Transmitting Station ID */
  var TSID: String = js.native
  /** Sender's title */
  var Title: String = js.native
  /** Sender's zip code */
  var ZipCode: String = js.native
  /** Load default sender */
  def LoadDefaultSender(): Unit = js.native
  /** Save default sender */
  def SaveDefaultSender(): Unit = js.native
}

object FaxSender {
  @scala.inline
  def apply(
    BillingCode: String,
    City: String,
    Company: String,
    Country: String,
    Department: String,
    Email: String,
    FAXCOMEXLibDotFaxSender_typekey: FaxSender,
    FaxNumber: String,
    HomePhone: String,
    LoadDefaultSender: () => Unit,
    Name: String,
    OfficeLocation: String,
    OfficePhone: String,
    SaveDefaultSender: () => Unit,
    State: String,
    StreetAddress: String,
    TSID: String,
    Title: String,
    ZipCode: String
  ): FaxSender = {
    val __obj = js.Dynamic.literal(BillingCode = BillingCode.asInstanceOf[js.Any], City = City.asInstanceOf[js.Any], Company = Company.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], Department = Department.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], FaxNumber = FaxNumber.asInstanceOf[js.Any], HomePhone = HomePhone.asInstanceOf[js.Any], LoadDefaultSender = js.Any.fromFunction0(LoadDefaultSender), Name = Name.asInstanceOf[js.Any], OfficeLocation = OfficeLocation.asInstanceOf[js.Any], OfficePhone = OfficePhone.asInstanceOf[js.Any], SaveDefaultSender = js.Any.fromFunction0(SaveDefaultSender), State = State.asInstanceOf[js.Any], StreetAddress = StreetAddress.asInstanceOf[js.Any], TSID = TSID.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], ZipCode = ZipCode.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxSender_typekey")(FAXCOMEXLibDotFaxSender_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxSender]
  }
  @scala.inline
  implicit class FaxSenderOps[Self <: FaxSender] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBillingCode(value: String): Self = this.set("BillingCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setCity(value: String): Self = this.set("City", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompany(value: String): Self = this.set("Company", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: String): Self = this.set("Country", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepartment(value: String): Self = this.set("Department", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("Email", value.asInstanceOf[js.Any])
    @scala.inline
    def setFAXCOMEXLibDotFaxSender_typekey(value: FaxSender): Self = this.set("FAXCOMEXLib.FaxSender_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setFaxNumber(value: String): Self = this.set("FaxNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setHomePhone(value: String): Self = this.set("HomePhone", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadDefaultSender(value: () => Unit): Self = this.set("LoadDefaultSender", js.Any.fromFunction0(value))
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficeLocation(value: String): Self = this.set("OfficeLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficePhone(value: String): Self = this.set("OfficePhone", value.asInstanceOf[js.Any])
    @scala.inline
    def setSaveDefaultSender(value: () => Unit): Self = this.set("SaveDefaultSender", js.Any.fromFunction0(value))
    @scala.inline
    def setState(value: String): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreetAddress(value: String): Self = this.set("StreetAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setTSID(value: String): Self = this.set("TSID", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    @scala.inline
    def setZipCode(value: String): Self = this.set("ZipCode", value.asInstanceOf[js.Any])
  }
  
}

