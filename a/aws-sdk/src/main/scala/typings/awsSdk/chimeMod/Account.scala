package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Account extends js.Object {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: String = js.native
  
  /**
    * The Amazon Chime account type. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide.
    */
  var AccountType: js.UndefOr[typings.awsSdk.chimeMod.AccountType] = js.native
  
  /**
    * The AWS account ID.
    */
  var AwsAccountId: String = js.native
  
  /**
    * The Amazon Chime account creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
  
  /**
    * The default license for the Amazon Chime account.
    */
  var DefaultLicense: js.UndefOr[License] = js.native
  
  /**
    * The Amazon Chime account name.
    */
  var Name: String = js.native
  
  /**
    * The sign-in delegate groups associated with the account.
    */
  var SigninDelegateGroups: js.UndefOr[SigninDelegateGroupList] = js.native
  
  /**
    * Supported licenses for the Amazon Chime account.
    */
  var SupportedLicenses: js.UndefOr[LicenseList] = js.native
}
object Account {
  
  @scala.inline
  def apply(AccountId: String, AwsAccountId: String, Name: String): Account = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountId(value: String): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountId(value: String): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountType(value: AccountType): Self = this.set("AccountType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountType: Self = this.set("AccountType", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: Iso8601Timestamp): Self = this.set("CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setDefaultLicense(value: License): Self = this.set("DefaultLicense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLicense: Self = this.set("DefaultLicense", js.undefined)
    
    @scala.inline
    def setSigninDelegateGroupsVarargs(value: SigninDelegateGroup*): Self = this.set("SigninDelegateGroups", js.Array(value :_*))
    
    @scala.inline
    def setSigninDelegateGroups(value: SigninDelegateGroupList): Self = this.set("SigninDelegateGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigninDelegateGroups: Self = this.set("SigninDelegateGroups", js.undefined)
    
    @scala.inline
    def setSupportedLicensesVarargs(value: License*): Self = this.set("SupportedLicenses", js.Array(value :_*))
    
    @scala.inline
    def setSupportedLicenses(value: LicenseList): Self = this.set("SupportedLicenses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedLicenses: Self = this.set("SupportedLicenses", js.undefined)
  }
}
