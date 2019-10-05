package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameter extends js.Object {
  /**
    * The valid range of values for the parameter.
    */
  var AllowedValues: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether a change to the parameter is applied immediately or requires a reboot for the change to be applied. You can force a reboot or wait until the next maintenance window's reboot. For more information, see Rebooting a Cluster.
    */
  var ChangeType: js.UndefOr[typings.awsDashSdk.clientsElasticacheMod.ChangeType] = js.undefined
  /**
    * The valid data type for the parameter.
    */
  var DataType: js.UndefOr[String] = js.undefined
  /**
    * A description of the parameter.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether (true) or not (false) the parameter can be modified. Some parameters have security or operational implications that prevent them from being changed.
    */
  var IsModifiable: js.UndefOr[Boolean] = js.undefined
  /**
    * The earliest cache engine version to which the parameter can apply.
    */
  var MinimumEngineVersion: js.UndefOr[String] = js.undefined
  /**
    * The name of the parameter.
    */
  var ParameterName: js.UndefOr[String] = js.undefined
  /**
    * The value of the parameter.
    */
  var ParameterValue: js.UndefOr[String] = js.undefined
  /**
    * The source of the parameter.
    */
  var Source: js.UndefOr[String] = js.undefined
}

object Parameter {
  @scala.inline
  def apply(
    AllowedValues: String = null,
    ChangeType: ChangeType = null,
    DataType: String = null,
    Description: String = null,
    IsModifiable: js.UndefOr[scala.Boolean] = js.undefined,
    MinimumEngineVersion: String = null,
    ParameterName: String = null,
    ParameterValue: String = null,
    Source: String = null
  ): Parameter = {
    val __obj = js.Dynamic.literal()
    if (AllowedValues != null) __obj.updateDynamic("AllowedValues")(AllowedValues)
    if (ChangeType != null) __obj.updateDynamic("ChangeType")(ChangeType.asInstanceOf[js.Any])
    if (DataType != null) __obj.updateDynamic("DataType")(DataType)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(IsModifiable)) __obj.updateDynamic("IsModifiable")(IsModifiable)
    if (MinimumEngineVersion != null) __obj.updateDynamic("MinimumEngineVersion")(MinimumEngineVersion)
    if (ParameterName != null) __obj.updateDynamic("ParameterName")(ParameterName)
    if (ParameterValue != null) __obj.updateDynamic("ParameterValue")(ParameterValue)
    if (Source != null) __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[Parameter]
  }
}

