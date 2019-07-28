package typings.agDashGrid.distLibRenderingRowRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshViewParams extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var newData: js.UndefOr[Boolean] = js.undefined
  var newPage: js.UndefOr[Boolean] = js.undefined
  var onlyBody: js.UndefOr[Boolean] = js.undefined
  var recycleRows: js.UndefOr[Boolean] = js.undefined
  var suppressKeepFocus: js.UndefOr[Boolean] = js.undefined
}

object RefreshViewParams {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    newData: js.UndefOr[Boolean] = js.undefined,
    newPage: js.UndefOr[Boolean] = js.undefined,
    onlyBody: js.UndefOr[Boolean] = js.undefined,
    recycleRows: js.UndefOr[Boolean] = js.undefined,
    suppressKeepFocus: js.UndefOr[Boolean] = js.undefined
  ): RefreshViewParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (!js.isUndefined(newData)) __obj.updateDynamic("newData")(newData)
    if (!js.isUndefined(newPage)) __obj.updateDynamic("newPage")(newPage)
    if (!js.isUndefined(onlyBody)) __obj.updateDynamic("onlyBody")(onlyBody)
    if (!js.isUndefined(recycleRows)) __obj.updateDynamic("recycleRows")(recycleRows)
    if (!js.isUndefined(suppressKeepFocus)) __obj.updateDynamic("suppressKeepFocus")(suppressKeepFocus)
    __obj.asInstanceOf[RefreshViewParams]
  }
}

