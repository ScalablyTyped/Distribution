package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HyperParameterSpecification extends js.Object {
  /**
    * The default value for this hyperparameter. If a default value is specified, a hyperparameter cannot be required.
    */
  var DefaultValue: js.UndefOr[ParameterValue] = js.undefined
  /**
    * A brief description of the hyperparameter.
    */
  var Description: js.UndefOr[EntityDescription] = js.undefined
  /**
    * Indicates whether this hyperparameter is required.
    */
  var IsRequired: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether this hyperparameter is tunable in a hyperparameter tuning job.
    */
  var IsTunable: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of this hyperparameter. The name must be unique.
    */
  var Name: ParameterName
  /**
    * The allowed range for this hyperparameter.
    */
  var Range: js.UndefOr[ParameterRange] = js.undefined
  /**
    * The type of this hyperparameter. The valid types are Integer, Continuous, Categorical, and FreeText.
    */
  var Type: ParameterType
}

object HyperParameterSpecification {
  @scala.inline
  def apply(
    Name: ParameterName,
    Type: ParameterType,
    DefaultValue: ParameterValue = null,
    Description: EntityDescription = null,
    IsRequired: js.UndefOr[scala.Boolean] = js.undefined,
    IsTunable: js.UndefOr[scala.Boolean] = js.undefined,
    Range: ParameterRange = null
  ): HyperParameterSpecification = {
    val __obj = js.Dynamic.literal(Name = Name, Type = Type.asInstanceOf[js.Any])
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(IsRequired)) __obj.updateDynamic("IsRequired")(IsRequired)
    if (!js.isUndefined(IsTunable)) __obj.updateDynamic("IsTunable")(IsTunable)
    if (Range != null) __obj.updateDynamic("Range")(Range)
    __obj.asInstanceOf[HyperParameterSpecification]
  }
}

