package typings.awsDashSdk.clientsRdsMod

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
  def apply(AccountQuotaName: String = null, Max: Int | scala.Double = null, Used: Int | scala.Double = null): AccountQuota = {
    val __obj = js.Dynamic.literal()
    if (AccountQuotaName != null) __obj.updateDynamic("AccountQuotaName")(AccountQuotaName)
    if (Max != null) __obj.updateDynamic("Max")(Max.asInstanceOf[js.Any])
    if (Used != null) __obj.updateDynamic("Used")(Used.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountQuota]
  }
}

