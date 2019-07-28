package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterDeclaration extends js.Object {
  /**
    * The default value of the parameter.
    */
  var DefaultValue: js.UndefOr[ParameterValue] = js.undefined
  /**
    * The description that is associate with the parameter.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Description] = js.undefined
  /**
    * Flag that indicates whether the parameter value is shown as plain text in logs and in the AWS Management Console.
    */
  var NoEcho: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.NoEcho] = js.undefined
  /**
    * The criteria that AWS CloudFormation uses to validate parameter values.
    */
  var ParameterConstraints: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.ParameterConstraints] = js.undefined
  /**
    * The name that is associated with the parameter.
    */
  var ParameterKey: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.ParameterKey] = js.undefined
  /**
    * The type of parameter.
    */
  var ParameterType: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.ParameterType] = js.undefined
}

object ParameterDeclaration {
  @scala.inline
  def apply(
    DefaultValue: ParameterValue = null,
    Description: Description = null,
    NoEcho: js.UndefOr[NoEcho] = js.undefined,
    ParameterConstraints: ParameterConstraints = null,
    ParameterKey: ParameterKey = null,
    ParameterType: ParameterType = null
  ): ParameterDeclaration = {
    val __obj = js.Dynamic.literal()
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(NoEcho)) __obj.updateDynamic("NoEcho")(NoEcho)
    if (ParameterConstraints != null) __obj.updateDynamic("ParameterConstraints")(ParameterConstraints)
    if (ParameterKey != null) __obj.updateDynamic("ParameterKey")(ParameterKey)
    if (ParameterType != null) __obj.updateDynamic("ParameterType")(ParameterType)
    __obj.asInstanceOf[ParameterDeclaration]
  }
}

