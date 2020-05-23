package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxSender Class */
trait FaxSender extends js.Object {
  /** Sender's billing code */
  var BillingCode: String
  /** City */
  var City: String
  /** Sender's company */
  var Company: String
  /** Sender's country or region */
  var Country: String
  /** Sender's department */
  var Department: String
  /** Sender's e-mail address */
  var Email: String
  @JSName("FAXCOMEXLib.FaxSender_typekey")
  var FAXCOMEXLibDotFaxSender_typekey: FaxSender
  /** Sender's fax number */
  var FaxNumber: String
  /** Sender's home phone */
  var HomePhone: String
  /** Sender's name */
  var Name: String
  /** Sender's office location */
  var OfficeLocation: String
  /** Sender's office phone */
  var OfficePhone: String
  /** Sender's state */
  var State: String
  /** Sender's street address */
  var StreetAddress: String
  /** Transmitting Station ID */
  var TSID: String
  /** Sender's title */
  var Title: String
  /** Sender's zip code */
  var ZipCode: String
  /** Load default sender */
  def LoadDefaultSender(): Unit
  /** Save default sender */
  def SaveDefaultSender(): Unit
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
}

