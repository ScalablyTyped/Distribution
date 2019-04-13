package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserMetadata extends js.Object {
  /**
    * The email address of the user.
    */
  var EmailAddress: js.UndefOr[EmailAddressType] = js.undefined
  /**
    * The given name of the user before a rename operation.
    */
  var GivenName: js.UndefOr[UserAttributeValueType] = js.undefined
  /**
    * The ID of the user.
    */
  var Id: js.UndefOr[IdType] = js.undefined
  /**
    * The surname of the user.
    */
  var Surname: js.UndefOr[UserAttributeValueType] = js.undefined
  /**
    * The name of the user.
    */
  var Username: js.UndefOr[UsernameType] = js.undefined
}

object UserMetadata {
  @scala.inline
  def apply(
    EmailAddress: EmailAddressType = null,
    GivenName: UserAttributeValueType = null,
    Id: IdType = null,
    Surname: UserAttributeValueType = null,
    Username: UsernameType = null
  ): UserMetadata = {
    val __obj = js.Dynamic.literal()
    if (EmailAddress != null) __obj.updateDynamic("EmailAddress")(EmailAddress)
    if (GivenName != null) __obj.updateDynamic("GivenName")(GivenName)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Surname != null) __obj.updateDynamic("Surname")(Surname)
    if (Username != null) __obj.updateDynamic("Username")(Username)
    __obj.asInstanceOf[UserMetadata]
  }
}

