package typings
package awsDashSdkLib.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactDetail extends js.Object {
  /**
    * First line of the contact's address.
    */
  var AddressLine1: js.UndefOr[AddressLine] = js.undefined
  /**
    * Second line of contact's address, if any.
    */
  var AddressLine2: js.UndefOr[AddressLine] = js.undefined
  /**
    * The city of the contact's address.
    */
  var City: js.UndefOr[City] = js.undefined
  /**
    * Indicates whether the contact is a person, company, association, or public organization. If you choose an option other than PERSON, you must enter an organization name, and you can't enable privacy protection for the contact.
    */
  var ContactType: js.UndefOr[ContactType] = js.undefined
  /**
    * Code for the country of the contact's address.
    */
  var CountryCode: js.UndefOr[CountryCode] = js.undefined
  /**
    * Email address of the contact.
    */
  var Email: js.UndefOr[Email] = js.undefined
  /**
    * A list of name-value pairs for parameters required by certain top-level domains.
    */
  var ExtraParams: js.UndefOr[ExtraParamList] = js.undefined
  /**
    * Fax number of the contact. Constraints: Phone number must be specified in the format "+[country dialing code].[number including any area code]". For example, a US phone number might appear as "+1.1234567890".
    */
  var Fax: js.UndefOr[ContactNumber] = js.undefined
  /**
    * First name of contact.
    */
  var FirstName: js.UndefOr[ContactName] = js.undefined
  /**
    * Last name of contact.
    */
  var LastName: js.UndefOr[ContactName] = js.undefined
  /**
    * Name of the organization for contact types other than PERSON.
    */
  var OrganizationName: js.UndefOr[ContactName] = js.undefined
  /**
    * The phone number of the contact. Constraints: Phone number must be specified in the format "+[country dialing code].[number including any area code&gt;]". For example, a US phone number might appear as "+1.1234567890".
    */
  var PhoneNumber: js.UndefOr[ContactNumber] = js.undefined
  /**
    * The state or province of the contact's city.
    */
  var State: js.UndefOr[State] = js.undefined
  /**
    * The zip or postal code of the contact's address.
    */
  var ZipCode: js.UndefOr[ZipCode] = js.undefined
}

object ContactDetail {
  @scala.inline
  def apply(
    AddressLine1: AddressLine = null,
    AddressLine2: AddressLine = null,
    City: City = null,
    ContactType: ContactType = null,
    CountryCode: CountryCode = null,
    Email: Email = null,
    ExtraParams: ExtraParamList = null,
    Fax: ContactNumber = null,
    FirstName: ContactName = null,
    LastName: ContactName = null,
    OrganizationName: ContactName = null,
    PhoneNumber: ContactNumber = null,
    State: State = null,
    ZipCode: ZipCode = null
  ): ContactDetail = {
    val __obj = js.Dynamic.literal()
    if (AddressLine1 != null) __obj.updateDynamic("AddressLine1")(AddressLine1)
    if (AddressLine2 != null) __obj.updateDynamic("AddressLine2")(AddressLine2)
    if (City != null) __obj.updateDynamic("City")(City)
    if (ContactType != null) __obj.updateDynamic("ContactType")(ContactType.asInstanceOf[js.Any])
    if (CountryCode != null) __obj.updateDynamic("CountryCode")(CountryCode.asInstanceOf[js.Any])
    if (Email != null) __obj.updateDynamic("Email")(Email)
    if (ExtraParams != null) __obj.updateDynamic("ExtraParams")(ExtraParams)
    if (Fax != null) __obj.updateDynamic("Fax")(Fax)
    if (FirstName != null) __obj.updateDynamic("FirstName")(FirstName)
    if (LastName != null) __obj.updateDynamic("LastName")(LastName)
    if (OrganizationName != null) __obj.updateDynamic("OrganizationName")(OrganizationName)
    if (PhoneNumber != null) __obj.updateDynamic("PhoneNumber")(PhoneNumber)
    if (State != null) __obj.updateDynamic("State")(State)
    if (ZipCode != null) __obj.updateDynamic("ZipCode")(ZipCode)
    __obj.asInstanceOf[ContactDetail]
  }
}

