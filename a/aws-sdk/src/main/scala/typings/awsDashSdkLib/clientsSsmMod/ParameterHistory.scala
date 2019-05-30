package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterHistory extends js.Object {
  /**
    * Parameter names can include the following letters and symbols. a-zA-Z0-9_.-
    */
  var AllowedPattern: js.UndefOr[AllowedPattern] = js.undefined
  /**
    * Information about the parameter.
    */
  var Description: js.UndefOr[ParameterDescription] = js.undefined
  /**
    * The ID of the query key used for this parameter.
    */
  var KeyId: js.UndefOr[ParameterKeyId] = js.undefined
  /**
    * Labels assigned to the parameter version.
    */
  var Labels: js.UndefOr[ParameterLabelList] = js.undefined
  /**
    * Date the parameter was last changed or updated.
    */
  var LastModifiedDate: js.UndefOr[DateTime] = js.undefined
  /**
    * Amazon Resource Name (ARN) of the AWS user who last changed the parameter.
    */
  var LastModifiedUser: js.UndefOr[String] = js.undefined
  /**
    * The name of the parameter.
    */
  var Name: js.UndefOr[PSParameterName] = js.undefined
  /**
    * Information about the policies assigned to a parameter.  Working with Parameter Policies in the AWS Systems Manager User Guide.
    */
  var Policies: js.UndefOr[ParameterPolicyList] = js.undefined
  /**
    * The parameter tier.
    */
  var Tier: js.UndefOr[ParameterTier] = js.undefined
  /**
    * The type of parameter used.
    */
  var Type: js.UndefOr[ParameterType] = js.undefined
  /**
    * The parameter value.
    */
  var Value: js.UndefOr[PSParameterValue] = js.undefined
  /**
    * The parameter version.
    */
  var Version: js.UndefOr[PSParameterVersion] = js.undefined
}

object ParameterHistory {
  @scala.inline
  def apply(
    AllowedPattern: AllowedPattern = null,
    Description: ParameterDescription = null,
    KeyId: ParameterKeyId = null,
    Labels: ParameterLabelList = null,
    LastModifiedDate: DateTime = null,
    LastModifiedUser: String = null,
    Name: PSParameterName = null,
    Policies: ParameterPolicyList = null,
    Tier: ParameterTier = null,
    Type: ParameterType = null,
    Value: PSParameterValue = null,
    Version: js.UndefOr[PSParameterVersion] = js.undefined
  ): ParameterHistory = {
    val __obj = js.Dynamic.literal()
    if (AllowedPattern != null) __obj.updateDynamic("AllowedPattern")(AllowedPattern)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId)
    if (Labels != null) __obj.updateDynamic("Labels")(Labels)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (LastModifiedUser != null) __obj.updateDynamic("LastModifiedUser")(LastModifiedUser)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Policies != null) __obj.updateDynamic("Policies")(Policies)
    if (Tier != null) __obj.updateDynamic("Tier")(Tier.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value)
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[ParameterHistory]
  }
}

