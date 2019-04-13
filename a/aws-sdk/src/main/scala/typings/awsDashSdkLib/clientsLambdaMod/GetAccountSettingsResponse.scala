package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccountSettingsResponse extends js.Object {
  /**
    * Limits that are related to concurrency and code storage.
    */
  var AccountLimit: js.UndefOr[AccountLimit] = js.undefined
  /**
    * The number of functions and amount of storage in use.
    */
  var AccountUsage: js.UndefOr[AccountUsage] = js.undefined
}

object GetAccountSettingsResponse {
  @scala.inline
  def apply(AccountLimit: AccountLimit = null, AccountUsage: AccountUsage = null): GetAccountSettingsResponse = {
    val __obj = js.Dynamic.literal()
    if (AccountLimit != null) __obj.updateDynamic("AccountLimit")(AccountLimit)
    if (AccountUsage != null) __obj.updateDynamic("AccountUsage")(AccountUsage)
    __obj.asInstanceOf[GetAccountSettingsResponse]
  }
}

