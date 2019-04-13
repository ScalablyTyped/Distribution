package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  /**
    * The time when the user was created.
    */
  var CreatedTimestamp: js.UndefOr[TimestampType] = js.undefined
  /**
    * The email address of the user.
    */
  var EmailAddress: js.UndefOr[EmailAddressType] = js.undefined
  /**
    * The given name of the user.
    */
  var GivenName: js.UndefOr[UserAttributeValueType] = js.undefined
  /**
    * The ID of the user.
    */
  var Id: js.UndefOr[IdType] = js.undefined
  /**
    * The locale of the user.
    */
  var Locale: js.UndefOr[LocaleType] = js.undefined
  /**
    * The time when the user was modified.
    */
  var ModifiedTimestamp: js.UndefOr[TimestampType] = js.undefined
  /**
    * The ID of the organization.
    */
  var OrganizationId: js.UndefOr[IdType] = js.undefined
  /**
    * The ID of the recycle bin folder.
    */
  var RecycleBinFolderId: js.UndefOr[ResourceIdType] = js.undefined
  /**
    * The ID of the root folder.
    */
  var RootFolderId: js.UndefOr[ResourceIdType] = js.undefined
  /**
    * The status of the user.
    */
  var Status: js.UndefOr[UserStatusType] = js.undefined
  /**
    * The storage for the user.
    */
  var Storage: js.UndefOr[UserStorageMetadata] = js.undefined
  /**
    * The surname of the user.
    */
  var Surname: js.UndefOr[UserAttributeValueType] = js.undefined
  /**
    * The time zone ID of the user.
    */
  var TimeZoneId: js.UndefOr[TimeZoneIdType] = js.undefined
  /**
    * The type of user.
    */
  var Type: js.UndefOr[UserType] = js.undefined
  /**
    * The login name of the user.
    */
  var Username: js.UndefOr[UsernameType] = js.undefined
}

object User {
  @scala.inline
  def apply(
    CreatedTimestamp: TimestampType = null,
    EmailAddress: EmailAddressType = null,
    GivenName: UserAttributeValueType = null,
    Id: IdType = null,
    Locale: LocaleType = null,
    ModifiedTimestamp: TimestampType = null,
    OrganizationId: IdType = null,
    RecycleBinFolderId: ResourceIdType = null,
    RootFolderId: ResourceIdType = null,
    Status: UserStatusType = null,
    Storage: UserStorageMetadata = null,
    Surname: UserAttributeValueType = null,
    TimeZoneId: TimeZoneIdType = null,
    Type: UserType = null,
    Username: UsernameType = null
  ): User = {
    val __obj = js.Dynamic.literal()
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp)
    if (EmailAddress != null) __obj.updateDynamic("EmailAddress")(EmailAddress)
    if (GivenName != null) __obj.updateDynamic("GivenName")(GivenName)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Locale != null) __obj.updateDynamic("Locale")(Locale.asInstanceOf[js.Any])
    if (ModifiedTimestamp != null) __obj.updateDynamic("ModifiedTimestamp")(ModifiedTimestamp)
    if (OrganizationId != null) __obj.updateDynamic("OrganizationId")(OrganizationId)
    if (RecycleBinFolderId != null) __obj.updateDynamic("RecycleBinFolderId")(RecycleBinFolderId)
    if (RootFolderId != null) __obj.updateDynamic("RootFolderId")(RootFolderId)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Storage != null) __obj.updateDynamic("Storage")(Storage)
    if (Surname != null) __obj.updateDynamic("Surname")(Surname)
    if (TimeZoneId != null) __obj.updateDynamic("TimeZoneId")(TimeZoneId)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Username != null) __obj.updateDynamic("Username")(Username)
    __obj.asInstanceOf[User]
  }
}

