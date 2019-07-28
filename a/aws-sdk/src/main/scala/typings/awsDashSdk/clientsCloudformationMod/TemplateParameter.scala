package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateParameter extends js.Object {
  /**
    * The default value associated with the parameter.
    */
  var DefaultValue: js.UndefOr[ParameterValue] = js.undefined
  /**
    * User defined description associated with the parameter.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Description] = js.undefined
  /**
    * Flag indicating whether the parameter should be displayed as plain text in logs and UIs.
    */
  var NoEcho: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.NoEcho] = js.undefined
  /**
    * The name associated with the parameter.
    */
  var ParameterKey: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.ParameterKey] = js.undefined
}

object TemplateParameter {
  @scala.inline
  def apply(
    DefaultValue: ParameterValue = null,
    Description: Description = null,
    NoEcho: js.UndefOr[NoEcho] = js.undefined,
    ParameterKey: ParameterKey = null
  ): TemplateParameter = {
    val __obj = js.Dynamic.literal()
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(NoEcho)) __obj.updateDynamic("NoEcho")(NoEcho)
    if (ParameterKey != null) __obj.updateDynamic("ParameterKey")(ParameterKey)
    __obj.asInstanceOf[TemplateParameter]
  }
}

