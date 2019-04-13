package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * The email address of the user.
    */
  var EmailAddress: js.UndefOr[EmailAddressType] = js.undefined
  /**
    * The given name of the user.
    */
  var GivenName: UserAttributeValueType
  /**
    * The ID of the organization.
    */
  var OrganizationId: js.UndefOr[IdType] = js.undefined
  /**
    * The password of the user.
    */
  var Password: PasswordType
  /**
    * The amount of storage for the user.
    */
  var StorageRule: js.UndefOr[StorageRuleType] = js.undefined
  /**
    * The surname of the user.
    */
  var Surname: UserAttributeValueType
  /**
    * The time zone ID of the user.
    */
  var TimeZoneId: js.UndefOr[TimeZoneIdType] = js.undefined
  /**
    * The login name of the user.
    */
  var Username: UsernameType
}

object CreateUserRequest {
  @scala.inline
  def apply(
    GivenName: UserAttributeValueType,
    Password: PasswordType,
    Surname: UserAttributeValueType,
    Username: UsernameType,
    AuthenticationToken: AuthenticationHeaderType = null,
    EmailAddress: EmailAddressType = null,
    OrganizationId: IdType = null,
    StorageRule: StorageRuleType = null,
    TimeZoneId: TimeZoneIdType = null
  ): CreateUserRequest = {
    val __obj = js.Dynamic.literal(GivenName = GivenName, Password = Password, Surname = Surname, Username = Username)
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    if (EmailAddress != null) __obj.updateDynamic("EmailAddress")(EmailAddress)
    if (OrganizationId != null) __obj.updateDynamic("OrganizationId")(OrganizationId)
    if (StorageRule != null) __obj.updateDynamic("StorageRule")(StorageRule)
    if (TimeZoneId != null) __obj.updateDynamic("TimeZoneId")(TimeZoneId)
    __obj.asInstanceOf[CreateUserRequest]
  }
}

