package typings.actionsOnGoogle.apiV2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2Context extends js.Object {
  var lifespanCount: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parameters: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
}

object GoogleCloudDialogflowV2Context {
  @scala.inline
  def apply(
    lifespanCount: js.UndefOr[Double] = js.undefined,
    name: String = null,
    parameters: ApiClientObjectMap[_] = null
  ): GoogleCloudDialogflowV2Context = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lifespanCount)) __obj.updateDynamic("lifespanCount")(lifespanCount.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudDialogflowV2Context]
  }
}

