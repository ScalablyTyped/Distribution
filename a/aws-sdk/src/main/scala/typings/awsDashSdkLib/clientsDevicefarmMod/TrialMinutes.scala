package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrialMinutes extends js.Object {
  /**
    * The number of free trial minutes remaining in the account.
    */
  var remaining: js.UndefOr[Double] = js.undefined
  /**
    * The total number of free trial minutes that the account started with.
    */
  var total: js.UndefOr[Double] = js.undefined
}

object TrialMinutes {
  @scala.inline
  def apply(remaining: js.UndefOr[Double] = js.undefined, total: js.UndefOr[Double] = js.undefined): TrialMinutes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(remaining)) __obj.updateDynamic("remaining")(remaining)
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[TrialMinutes]
  }
}

