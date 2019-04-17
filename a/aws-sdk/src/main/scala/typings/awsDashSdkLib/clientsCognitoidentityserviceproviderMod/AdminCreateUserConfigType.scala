package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminCreateUserConfigType extends js.Object {
  /**
    * Set to True if only the administrator is allowed to create user profiles. Set to False if users can sign themselves up via an app.
    */
  var AllowAdminCreateUserOnly: js.UndefOr[BooleanType] = js.undefined
  /**
    * The message template to be used for the welcome message to new users. See also Customizing User Invitation Messages.
    */
  var InviteMessageTemplate: js.UndefOr[MessageTemplateType] = js.undefined
  /**
    * The user account expiration limit, in days, after which the account is no longer usable. To reset the account after that time limit, you must call AdminCreateUser again, specifying "RESEND" for the MessageAction parameter. The default value for this parameter is 7.   If you set a value for TemporaryPasswordValidityDays in PasswordPolicy, that value will be used and UnusedAccountValidityDays will be deprecated for that user pool.  
    */
  var UnusedAccountValidityDays: js.UndefOr[AdminCreateUserUnusedAccountValidityDaysType] = js.undefined
}

object AdminCreateUserConfigType {
  @scala.inline
  def apply(
    AllowAdminCreateUserOnly: js.UndefOr[BooleanType] = js.undefined,
    InviteMessageTemplate: MessageTemplateType = null,
    UnusedAccountValidityDays: js.UndefOr[AdminCreateUserUnusedAccountValidityDaysType] = js.undefined
  ): AdminCreateUserConfigType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowAdminCreateUserOnly)) __obj.updateDynamic("AllowAdminCreateUserOnly")(AllowAdminCreateUserOnly)
    if (InviteMessageTemplate != null) __obj.updateDynamic("InviteMessageTemplate")(InviteMessageTemplate)
    if (!js.isUndefined(UnusedAccountValidityDays)) __obj.updateDynamic("UnusedAccountValidityDays")(UnusedAccountValidityDays)
    __obj.asInstanceOf[AdminCreateUserConfigType]
  }
}

