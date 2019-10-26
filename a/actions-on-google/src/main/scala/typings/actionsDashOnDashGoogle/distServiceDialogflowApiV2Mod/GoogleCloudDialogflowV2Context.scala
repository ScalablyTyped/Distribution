package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV2Mod

import typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap
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
  def apply(lifespanCount: Int | Double = null, name: String = null, parameters: ApiClientObjectMap[_] = null): GoogleCloudDialogflowV2Context = {
    val __obj = js.Dynamic.literal()
    if (lifespanCount != null) __obj.updateDynamic("lifespanCount")(lifespanCount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[GoogleCloudDialogflowV2Context]
  }
}

