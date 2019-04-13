package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountQuota extends js.Object {
  /**
    * The name of the Amazon RDS quota for this AWS account.
    */
  var AccountQuotaName: js.UndefOr[String] = js.undefined
  /**
    * The maximum allowed value for the quota.
    */
  var Max: js.UndefOr[Long] = js.undefined
  /**
    * The amount currently used toward the quota maximum.
    */
  var Used: js.UndefOr[Long] = js.undefined
}

object AccountQuota {
  @scala.inline
  def apply(
    AccountQuotaName: String = null,
    Max: js.UndefOr[Long] = js.undefined,
    Used: js.UndefOr[Long] = js.undefined
  ): AccountQuota = {
    val __obj = js.Dynamic.literal()
    if (AccountQuotaName != null) __obj.updateDynamic("AccountQuotaName")(AccountQuotaName)
    if (!js.isUndefined(Max)) __obj.updateDynamic("Max")(Max)
    if (!js.isUndefined(Used)) __obj.updateDynamic("Used")(Used)
    __obj.asInstanceOf[AccountQuota]
  }
}

