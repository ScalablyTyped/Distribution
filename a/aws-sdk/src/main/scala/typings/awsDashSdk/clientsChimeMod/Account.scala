package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: String = js.native
  /**
    * The Amazon Chime account type. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide.
    */
  var AccountType: js.UndefOr[typings.awsDashSdk.clientsChimeMod.AccountType] = js.native
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
    * Supported licenses for the Amazon Chime account.
    */
  var SupportedLicenses: js.UndefOr[LicenseList] = js.native
}

object Account {
  @scala.inline
  def apply(
    AccountId: String,
    AwsAccountId: String,
    Name: String,
    AccountType: AccountType = null,
    CreatedTimestamp: Iso8601Timestamp = null,
    DefaultLicense: License = null,
    SupportedLicenses: LicenseList = null
  ): Account = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (AccountType != null) __obj.updateDynamic("AccountType")(AccountType.asInstanceOf[js.Any])
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp.asInstanceOf[js.Any])
    if (DefaultLicense != null) __obj.updateDynamic("DefaultLicense")(DefaultLicense.asInstanceOf[js.Any])
    if (SupportedLicenses != null) __obj.updateDynamic("SupportedLicenses")(SupportedLicenses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
}

