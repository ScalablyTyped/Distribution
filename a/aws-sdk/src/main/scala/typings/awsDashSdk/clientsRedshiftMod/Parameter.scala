package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameter extends js.Object {
  /**
    * The valid range of values for the parameter.
    */
  var AllowedValues: js.UndefOr[String] = js.native
  /**
    * Specifies how to apply the WLM configuration parameter. Some properties can be applied dynamically, while other properties require that any associated clusters be rebooted for the configuration changes to be applied. For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
    */
  var ApplyType: js.UndefOr[ParameterApplyType] = js.native
  /**
    * The data type of the parameter.
    */
  var DataType: js.UndefOr[String] = js.native
  /**
    * A description of the parameter.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * If true, the parameter can be modified. Some parameters have security or operational implications that prevent them from being changed. 
    */
  var IsModifiable: js.UndefOr[Boolean] = js.native
  /**
    * The earliest engine version to which the parameter can apply.
    */
  var MinimumEngineVersion: js.UndefOr[String] = js.native
  /**
    * The name of the parameter.
    */
  var ParameterName: js.UndefOr[String] = js.native
  /**
    * The value of the parameter.
    */
  var ParameterValue: js.UndefOr[String] = js.native
  /**
    * The source of the parameter value, such as "engine-default" or "user".
    */
  var Source: js.UndefOr[String] = js.native
}

object Parameter {
  @scala.inline
  def apply(
    AllowedValues: String = null,
    ApplyType: ParameterApplyType = null,
    DataType: String = null,
    Description: String = null,
    IsModifiable: js.UndefOr[scala.Boolean] = js.undefined,
    MinimumEngineVersion: String = null,
    ParameterName: String = null,
    ParameterValue: String = null,
    Source: String = null
  ): Parameter = {
    val __obj = js.Dynamic.literal()
    if (AllowedValues != null) __obj.updateDynamic("AllowedValues")(AllowedValues.asInstanceOf[js.Any])
    if (ApplyType != null) __obj.updateDynamic("ApplyType")(ApplyType.asInstanceOf[js.Any])
    if (DataType != null) __obj.updateDynamic("DataType")(DataType.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(IsModifiable)) __obj.updateDynamic("IsModifiable")(IsModifiable.asInstanceOf[js.Any])
    if (MinimumEngineVersion != null) __obj.updateDynamic("MinimumEngineVersion")(MinimumEngineVersion.asInstanceOf[js.Any])
    if (ParameterName != null) __obj.updateDynamic("ParameterName")(ParameterName.asInstanceOf[js.Any])
    if (ParameterValue != null) __obj.updateDynamic("ParameterValue")(ParameterValue.asInstanceOf[js.Any])
    if (Source != null) __obj.updateDynamic("Source")(Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameter]
  }
}

