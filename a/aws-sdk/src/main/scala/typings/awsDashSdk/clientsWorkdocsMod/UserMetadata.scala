package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserMetadata extends js.Object {
  /**
    * The email address of the user.
    */
  var EmailAddress: js.UndefOr[EmailAddressType] = js.native
  /**
    * The given name of the user before a rename operation.
    */
  var GivenName: js.UndefOr[UserAttributeValueType] = js.native
  /**
    * The ID of the user.
    */
  var Id: js.UndefOr[IdType] = js.native
  /**
    * The surname of the user.
    */
  var Surname: js.UndefOr[UserAttributeValueType] = js.native
  /**
    * The name of the user.
    */
  var Username: js.UndefOr[UsernameType] = js.native
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
    if (EmailAddress != null) __obj.updateDynamic("EmailAddress")(EmailAddress.asInstanceOf[js.Any])
    if (GivenName != null) __obj.updateDynamic("GivenName")(GivenName.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Surname != null) __obj.updateDynamic("Surname")(Surname.asInstanceOf[js.Any])
    if (Username != null) __obj.updateDynamic("Username")(Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserMetadata]
  }
}

