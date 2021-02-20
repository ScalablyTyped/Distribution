package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxSender Class */
@js.native
trait FaxSender extends StObject {
  
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
  
  /** Load default sender */
  def LoadDefaultSender(): Unit = js.native
  
  /** Sender's name */
  var Name: String = js.native
  
  /** Sender's office location */
  var OfficeLocation: String = js.native
  
  /** Sender's office phone */
  var OfficePhone: String = js.native
  
  /** Save default sender */
  def SaveDefaultSender(): Unit = js.native
  
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
  implicit class FaxSenderMutableBuilder[Self <: FaxSender] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingCode(value: String): Self = StObject.set(x, "BillingCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompany(value: String): Self = StObject.set(x, "Company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepartment(value: String): Self = StObject.set(x, "Department", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFAXCOMEXLibDotFaxSender_typekey(value: FaxSender): Self = StObject.set(x, "FAXCOMEXLib.FaxSender_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaxNumber(value: String): Self = StObject.set(x, "FaxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomePhone(value: String): Self = StObject.set(x, "HomePhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadDefaultSender(value: () => Unit): Self = StObject.set(x, "LoadDefaultSender", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeLocation(value: String): Self = StObject.set(x, "OfficeLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficePhone(value: String): Self = StObject.set(x, "OfficePhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveDefaultSender(value: () => Unit): Self = StObject.set(x, "SaveDefaultSender", js.Any.fromFunction0(value))
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetAddress(value: String): Self = StObject.set(x, "StreetAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSID(value: String): Self = StObject.set(x, "TSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZipCode(value: String): Self = StObject.set(x, "ZipCode", value.asInstanceOf[js.Any])
  }
}
