package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccountSubscriptionRequest extends StObject {
  
  /**
    * The name of your Amazon QuickSight account. This name is unique over all of Amazon Web Services, and it appears only when users sign in. You can't change AccountName value after the Amazon QuickSight account is created.
    */
  var AccountName: String
  
  /**
    * The name of your Active Directory. This field is required if ACTIVE_DIRECTORY is the selected authentication method of the new Amazon QuickSight account.
    */
  var ActiveDirectoryName: js.UndefOr[String] = js.undefined
  
  /**
    * The admin group associated with your Active Directory. This field is required if ACTIVE_DIRECTORY is the selected authentication method of the new Amazon QuickSight account. For more information about using Active Directory in Amazon QuickSight, see Using Active Directory with Amazon QuickSight Enterprise Edition in the Amazon QuickSight User Guide.
    */
  var AdminGroup: js.UndefOr[GroupsList] = js.undefined
  
  /**
    * The method that you want to use to authenticate your Amazon QuickSight account. Currently, the valid values for this parameter are IAM_AND_QUICKSIGHT, IAM_ONLY, and ACTIVE_DIRECTORY. If you choose ACTIVE_DIRECTORY, provide an ActiveDirectoryName and an AdminGroup associated with your Active Directory.
    */
  var AuthenticationMethod: AuthenticationMethodOption
  
  /**
    * The author group associated with your Active Directory. For more information about using Active Directory in Amazon QuickSight, see Using Active Directory with Amazon QuickSight Enterprise Edition in the Amazon QuickSight User Guide.
    */
  var AuthorGroup: js.UndefOr[GroupsList] = js.undefined
  
  /**
    * The Amazon Web Services account ID of the account that you're using to create your Amazon QuickSight account.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * A 10-digit phone number for the author of the Amazon QuickSight account to use for future communications. This field is required if ENTERPPRISE_AND_Q is the selected edition of the new Amazon QuickSight account.
    */
  var ContactNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Active Directory that is associated with your Amazon QuickSight account.
    */
  var DirectoryId: js.UndefOr[String] = js.undefined
  
  /**
    * The edition of Amazon QuickSight that you want your account to have. Currently, you can choose from ENTERPRISE or ENTERPRISE_AND_Q. If you choose ENTERPRISE_AND_Q, the following parameters are required:    FirstName     LastName     EmailAddress     ContactNumber   
    */
  var Edition: typings.awsSdk.clientsQuicksightMod.Edition
  
  /**
    * The email address of the author of the Amazon QuickSight account to use for future communications. This field is required if ENTERPPRISE_AND_Q is the selected edition of the new Amazon QuickSight account.
    */
  var EmailAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The first name of the author of the Amazon QuickSight account to use for future communications. This field is required if ENTERPPRISE_AND_Q is the selected edition of the new Amazon QuickSight account.
    */
  var FirstName: js.UndefOr[String] = js.undefined
  
  /**
    * The last name of the author of the Amazon QuickSight account to use for future communications. This field is required if ENTERPPRISE_AND_Q is the selected edition of the new Amazon QuickSight account.
    */
  var LastName: js.UndefOr[String] = js.undefined
  
  /**
    * The email address that you want Amazon QuickSight to send notifications to regarding your Amazon QuickSight account or Amazon QuickSight subscription.
    */
  var NotificationEmail: String
  
  /**
    * The reader group associated with your Active Direcrtory. For more information about using Active Directory in Amazon QuickSight, see Using Active Directory with Amazon QuickSight Enterprise Edition in the Amazon QuickSight User Guide.
    */
  var ReaderGroup: js.UndefOr[GroupsList] = js.undefined
  
  /**
    * The realm of the Active Directory that is associated with your Amazon QuickSight account. This field is required if ACTIVE_DIRECTORY is the selected authentication method of the new Amazon QuickSight account.
    */
  var Realm: js.UndefOr[String] = js.undefined
}
object CreateAccountSubscriptionRequest {
  
  inline def apply(
    AccountName: String,
    AuthenticationMethod: AuthenticationMethodOption,
    AwsAccountId: AwsAccountId,
    Edition: Edition,
    NotificationEmail: String
  ): CreateAccountSubscriptionRequest = {
    val __obj = js.Dynamic.literal(AccountName = AccountName.asInstanceOf[js.Any], AuthenticationMethod = AuthenticationMethod.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Edition = Edition.asInstanceOf[js.Any], NotificationEmail = NotificationEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccountSubscriptionRequest]
  }
  
  extension [Self <: CreateAccountSubscriptionRequest](x: Self) {
    
    inline def setAccountName(value: String): Self = StObject.set(x, "AccountName", value.asInstanceOf[js.Any])
    
    inline def setActiveDirectoryName(value: String): Self = StObject.set(x, "ActiveDirectoryName", value.asInstanceOf[js.Any])
    
    inline def setActiveDirectoryNameUndefined: Self = StObject.set(x, "ActiveDirectoryName", js.undefined)
    
    inline def setAdminGroup(value: GroupsList): Self = StObject.set(x, "AdminGroup", value.asInstanceOf[js.Any])
    
    inline def setAdminGroupUndefined: Self = StObject.set(x, "AdminGroup", js.undefined)
    
    inline def setAdminGroupVarargs(value: String*): Self = StObject.set(x, "AdminGroup", js.Array(value*))
    
    inline def setAuthenticationMethod(value: AuthenticationMethodOption): Self = StObject.set(x, "AuthenticationMethod", value.asInstanceOf[js.Any])
    
    inline def setAuthorGroup(value: GroupsList): Self = StObject.set(x, "AuthorGroup", value.asInstanceOf[js.Any])
    
    inline def setAuthorGroupUndefined: Self = StObject.set(x, "AuthorGroup", js.undefined)
    
    inline def setAuthorGroupVarargs(value: String*): Self = StObject.set(x, "AuthorGroup", js.Array(value*))
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setContactNumber(value: String): Self = StObject.set(x, "ContactNumber", value.asInstanceOf[js.Any])
    
    inline def setContactNumberUndefined: Self = StObject.set(x, "ContactNumber", js.undefined)
    
    inline def setDirectoryId(value: String): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    inline def setEdition(value: Edition): Self = StObject.set(x, "Edition", value.asInstanceOf[js.Any])
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "EmailAddress", js.undefined)
    
    inline def setFirstName(value: String): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "FirstName", js.undefined)
    
    inline def setLastName(value: String): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameUndefined: Self = StObject.set(x, "LastName", js.undefined)
    
    inline def setNotificationEmail(value: String): Self = StObject.set(x, "NotificationEmail", value.asInstanceOf[js.Any])
    
    inline def setReaderGroup(value: GroupsList): Self = StObject.set(x, "ReaderGroup", value.asInstanceOf[js.Any])
    
    inline def setReaderGroupUndefined: Self = StObject.set(x, "ReaderGroup", js.undefined)
    
    inline def setReaderGroupVarargs(value: String*): Self = StObject.set(x, "ReaderGroup", js.Array(value*))
    
    inline def setRealm(value: String): Self = StObject.set(x, "Realm", value.asInstanceOf[js.Any])
    
    inline def setRealmUndefined: Self = StObject.set(x, "Realm", js.undefined)
  }
}
