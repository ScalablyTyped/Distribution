package typings.agDashGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForceRefresh extends js.Object {
  var forceRefresh: js.UndefOr[Boolean] = js.undefined
  var newData: js.UndefOr[Boolean] = js.undefined
  var suppressFlash: js.UndefOr[Boolean] = js.undefined
}

object Anon_ForceRefresh {
  @scala.inline
  def apply(
    forceRefresh: js.UndefOr[Boolean] = js.undefined,
    newData: js.UndefOr[Boolean] = js.undefined,
    suppressFlash: js.UndefOr[Boolean] = js.undefined
  ): Anon_ForceRefresh = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceRefresh)) __obj.updateDynamic("forceRefresh")(forceRefresh)
    if (!js.isUndefined(newData)) __obj.updateDynamic("newData")(newData)
    if (!js.isUndefined(suppressFlash)) __obj.updateDynamic("suppressFlash")(suppressFlash)
    __obj.asInstanceOf[Anon_ForceRefresh]
  }
}

