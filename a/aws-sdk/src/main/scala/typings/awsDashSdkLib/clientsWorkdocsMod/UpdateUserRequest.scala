package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * The given name of the user.
    */
  var GivenName: js.UndefOr[UserAttributeValueType] = js.undefined
  /**
    * Boolean value to determine whether the user is granted Poweruser privileges.
    */
  var GrantPoweruserPrivileges: js.UndefOr[BooleanEnumType] = js.undefined
  /**
    * The locale of the user.
    */
  var Locale: js.UndefOr[LocaleType] = js.undefined
  /**
    * The amount of storage for the user.
    */
  var StorageRule: js.UndefOr[StorageRuleType] = js.undefined
  /**
    * The surname of the user.
    */
  var Surname: js.UndefOr[UserAttributeValueType] = js.undefined
  /**
    * The time zone ID of the user.
    */
  var TimeZoneId: js.UndefOr[TimeZoneIdType] = js.undefined
  /**
    * The type of the user.
    */
  var Type: js.UndefOr[UserType] = js.undefined
  /**
    * The ID of the user.
    */
  var UserId: IdType
}

object UpdateUserRequest {
  @scala.inline
  def apply(
    UserId: IdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    GivenName: UserAttributeValueType = null,
    GrantPoweruserPrivileges: BooleanEnumType = null,
    Locale: LocaleType = null,
    StorageRule: StorageRuleType = null,
    Surname: UserAttributeValueType = null,
    TimeZoneId: TimeZoneIdType = null,
    Type: UserType = null
  ): UpdateUserRequest = {
    val __obj = js.Dynamic.literal(UserId = UserId)
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    if (GivenName != null) __obj.updateDynamic("GivenName")(GivenName)
    if (GrantPoweruserPrivileges != null) __obj.updateDynamic("GrantPoweruserPrivileges")(GrantPoweruserPrivileges.asInstanceOf[js.Any])
    if (Locale != null) __obj.updateDynamic("Locale")(Locale.asInstanceOf[js.Any])
    if (StorageRule != null) __obj.updateDynamic("StorageRule")(StorageRule)
    if (Surname != null) __obj.updateDynamic("Surname")(Surname)
    if (TimeZoneId != null) __obj.updateDynamic("TimeZoneId")(TimeZoneId)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserRequest]
  }
}

