package typings.agGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForceRefresh extends js.Object {
  var forceRefresh: js.UndefOr[Boolean] = js.undefined
  var newData: js.UndefOr[Boolean] = js.undefined
  var suppressFlash: js.UndefOr[Boolean] = js.undefined
}

object ForceRefresh {
  @scala.inline
  def apply(
    forceRefresh: js.UndefOr[Boolean] = js.undefined,
    newData: js.UndefOr[Boolean] = js.undefined,
    suppressFlash: js.UndefOr[Boolean] = js.undefined
  ): ForceRefresh = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceRefresh)) __obj.updateDynamic("forceRefresh")(forceRefresh.get.asInstanceOf[js.Any])
    if (!js.isUndefined(newData)) __obj.updateDynamic("newData")(newData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressFlash)) __obj.updateDynamic("suppressFlash")(suppressFlash.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceRefresh]
  }
}

