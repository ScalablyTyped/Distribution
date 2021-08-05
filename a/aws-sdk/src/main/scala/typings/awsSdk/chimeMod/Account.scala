package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: String
  
  /**
    * The Amazon Chime account type. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide.
    */
  var AccountType: js.UndefOr[typings.awsSdk.chimeMod.AccountType] = js.undefined
  
  /**
    * The AWS account ID.
    */
  var AwsAccountId: String
  
  /**
    * The Amazon Chime account creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
  
  /**
    * The default license for the Amazon Chime account.
    */
  var DefaultLicense: js.UndefOr[License] = js.undefined
  
  /**
    * The Amazon Chime account name.
    */
  var Name: String
  
  /**
    * The sign-in delegate groups associated with the account.
    */
  var SigninDelegateGroups: js.UndefOr[SigninDelegateGroupList] = js.undefined
  
  /**
    * Supported licenses for the Amazon Chime account.
    */
  var SupportedLicenses: js.UndefOr[LicenseList] = js.undefined
}
object Account {
  
  inline def apply(AccountId: String, AwsAccountId: String, Name: String): Account = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  
  extension [Self <: Account](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountType(value: AccountType): Self = StObject.set(x, "AccountType", value.asInstanceOf[js.Any])
    
    inline def setAccountTypeUndefined: Self = StObject.set(x, "AccountType", js.undefined)
    
    inline def setAwsAccountId(value: String): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setDefaultLicense(value: License): Self = StObject.set(x, "DefaultLicense", value.asInstanceOf[js.Any])
    
    inline def setDefaultLicenseUndefined: Self = StObject.set(x, "DefaultLicense", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSigninDelegateGroups(value: SigninDelegateGroupList): Self = StObject.set(x, "SigninDelegateGroups", value.asInstanceOf[js.Any])
    
    inline def setSigninDelegateGroupsUndefined: Self = StObject.set(x, "SigninDelegateGroups", js.undefined)
    
    inline def setSigninDelegateGroupsVarargs(value: SigninDelegateGroup*): Self = StObject.set(x, "SigninDelegateGroups", js.Array(value :_*))
    
    inline def setSupportedLicenses(value: LicenseList): Self = StObject.set(x, "SupportedLicenses", value.asInstanceOf[js.Any])
    
    inline def setSupportedLicensesUndefined: Self = StObject.set(x, "SupportedLicenses", js.undefined)
    
    inline def setSupportedLicensesVarargs(value: License*): Self = StObject.set(x, "SupportedLicenses", js.Array(value :_*))
  }
}
