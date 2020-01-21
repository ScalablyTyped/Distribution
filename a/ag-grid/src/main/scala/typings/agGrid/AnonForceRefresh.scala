package typings.agGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForceRefresh extends js.Object {
  var forceRefresh: js.UndefOr[Boolean] = js.undefined
  var newData: js.UndefOr[Boolean] = js.undefined
  var suppressFlash: js.UndefOr[Boolean] = js.undefined
}

object AnonForceRefresh {
  @scala.inline
  def apply(
    forceRefresh: js.UndefOr[Boolean] = js.undefined,
    newData: js.UndefOr[Boolean] = js.undefined,
    suppressFlash: js.UndefOr[Boolean] = js.undefined
  ): AnonForceRefresh = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceRefresh)) __obj.updateDynamic("forceRefresh")(forceRefresh.asInstanceOf[js.Any])
    if (!js.isUndefined(newData)) __obj.updateDynamic("newData")(newData.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressFlash)) __obj.updateDynamic("suppressFlash")(suppressFlash.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForceRefresh]
  }
}

