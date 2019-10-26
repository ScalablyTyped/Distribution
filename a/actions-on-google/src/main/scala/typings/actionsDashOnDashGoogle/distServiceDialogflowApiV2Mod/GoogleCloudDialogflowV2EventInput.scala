package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV2Mod

import typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2EventInput extends js.Object {
  var languageCode: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parameters: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
}

object GoogleCloudDialogflowV2EventInput {
  @scala.inline
  def apply(languageCode: String = null, name: String = null, parameters: ApiClientObjectMap[_] = null): GoogleCloudDialogflowV2EventInput = {
    val __obj = js.Dynamic.literal()
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[GoogleCloudDialogflowV2EventInput]
  }
}

