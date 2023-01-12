package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminGetUserResponse extends StObject {
  
  /**
    * Indicates that the status is enabled.
    */
  var Enabled: js.UndefOr[BooleanType] = js.undefined
  
  /**
    *  This response parameter is no longer supported. It provides information only about SMS MFA configurations. It doesn't provide information about time-based one-time password (TOTP) software token MFA configurations. To look up information about either type of MFA configuration, use UserMFASettingList instead.
    */
  var MFAOptions: js.UndefOr[MFAOptionListType] = js.undefined
  
  /**
    * The user's preferred MFA setting.
    */
  var PreferredMfaSetting: js.UndefOr[StringType] = js.undefined
  
  /**
    * An array of name-value pairs representing user attributes.
    */
  var UserAttributes: js.UndefOr[AttributeListType] = js.undefined
  
  /**
    * The date the user was created.
    */
  var UserCreateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date the user was last modified.
    */
  var UserLastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The MFA options that are activated for the user. The possible values in this list are SMS_MFA and SOFTWARE_TOKEN_MFA.
    */
  var UserMFASettingList: js.UndefOr[UserMFASettingListType] = js.undefined
  
  /**
    * The user status. Can be one of the following:   UNCONFIRMED - User has been created but not confirmed.   CONFIRMED - User has been confirmed.   ARCHIVED - User is no longer active.   UNKNOWN - User status isn't known.   RESET_REQUIRED - User is confirmed, but the user must request a code and reset their password before they can sign in.   FORCE_CHANGE_PASSWORD - The user is confirmed and the user can sign in using a temporary password, but on first sign-in, the user must change their password to a new value before doing anything else.   
    */
  var UserStatus: js.UndefOr[UserStatusType] = js.undefined
  
  /**
    * The user name of the user about whom you're receiving information.
    */
  var Username: UsernameType
}
object AdminGetUserResponse {
  
  inline def apply(Username: UsernameType): AdminGetUserResponse = {
    val __obj = js.Dynamic.literal(Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminGetUserResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdminGetUserResponse] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: BooleanType): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setMFAOptions(value: MFAOptionListType): Self = StObject.set(x, "MFAOptions", value.asInstanceOf[js.Any])
    
    inline def setMFAOptionsUndefined: Self = StObject.set(x, "MFAOptions", js.undefined)
    
    inline def setMFAOptionsVarargs(value: MFAOptionType*): Self = StObject.set(x, "MFAOptions", js.Array(value*))
    
    inline def setPreferredMfaSetting(value: StringType): Self = StObject.set(x, "PreferredMfaSetting", value.asInstanceOf[js.Any])
    
    inline def setPreferredMfaSettingUndefined: Self = StObject.set(x, "PreferredMfaSetting", js.undefined)
    
    inline def setUserAttributes(value: AttributeListType): Self = StObject.set(x, "UserAttributes", value.asInstanceOf[js.Any])
    
    inline def setUserAttributesUndefined: Self = StObject.set(x, "UserAttributes", js.undefined)
    
    inline def setUserAttributesVarargs(value: AttributeType*): Self = StObject.set(x, "UserAttributes", js.Array(value*))
    
    inline def setUserCreateDate(value: js.Date): Self = StObject.set(x, "UserCreateDate", value.asInstanceOf[js.Any])
    
    inline def setUserCreateDateUndefined: Self = StObject.set(x, "UserCreateDate", js.undefined)
    
    inline def setUserLastModifiedDate(value: js.Date): Self = StObject.set(x, "UserLastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setUserLastModifiedDateUndefined: Self = StObject.set(x, "UserLastModifiedDate", js.undefined)
    
    inline def setUserMFASettingList(value: UserMFASettingListType): Self = StObject.set(x, "UserMFASettingList", value.asInstanceOf[js.Any])
    
    inline def setUserMFASettingListUndefined: Self = StObject.set(x, "UserMFASettingList", js.undefined)
    
    inline def setUserMFASettingListVarargs(value: StringType*): Self = StObject.set(x, "UserMFASettingList", js.Array(value*))
    
    inline def setUserStatus(value: UserStatusType): Self = StObject.set(x, "UserStatus", value.asInstanceOf[js.Any])
    
    inline def setUserStatusUndefined: Self = StObject.set(x, "UserStatus", js.undefined)
    
    inline def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
