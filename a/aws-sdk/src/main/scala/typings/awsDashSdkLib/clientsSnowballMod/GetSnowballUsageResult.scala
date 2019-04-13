package typings
package awsDashSdkLib.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSnowballUsageResult extends js.Object {
  /**
    * The service limit for number of Snowballs this account can have at once. The default service limit is 1 (one).
    */
  var SnowballLimit: js.UndefOr[Integer] = js.undefined
  /**
    * The number of Snowballs that this account is currently using.
    */
  var SnowballsInUse: js.UndefOr[Integer] = js.undefined
}

object GetSnowballUsageResult {
  @scala.inline
  def apply(
    SnowballLimit: js.UndefOr[Integer] = js.undefined,
    SnowballsInUse: js.UndefOr[Integer] = js.undefined
  ): GetSnowballUsageResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(SnowballLimit)) __obj.updateDynamic("SnowballLimit")(SnowballLimit)
    if (!js.isUndefined(SnowballsInUse)) __obj.updateDynamic("SnowballsInUse")(SnowballsInUse)
    __obj.asInstanceOf[GetSnowballUsageResult]
  }
}

