package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccountSettingsResponse extends js.Object {
  /**
    * Limits that are related to concurrency and code storage.
    */
  var AccountLimit: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.AccountLimit] = js.native
  /**
    * The number of functions and amount of storage in use.
    */
  var AccountUsage: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.AccountUsage] = js.native
}

object GetAccountSettingsResponse {
  @scala.inline
  def apply(AccountLimit: AccountLimit = null, AccountUsage: AccountUsage = null): GetAccountSettingsResponse = {
    val __obj = js.Dynamic.literal()
    if (AccountLimit != null) __obj.updateDynamic("AccountLimit")(AccountLimit.asInstanceOf[js.Any])
    if (AccountUsage != null) __obj.updateDynamic("AccountUsage")(AccountUsage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccountSettingsResponse]
  }
}

