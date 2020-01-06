package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterMetadata extends js.Object {
  /**
    * A parameter name can include only the following letters and symbols. a-zA-Z0-9_.-
    */
  var AllowedPattern: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AllowedPattern] = js.native
  /**
    * Description of the parameter actions.
    */
  var Description: js.UndefOr[ParameterDescription] = js.native
  /**
    * The ID of the query key used for this parameter.
    */
  var KeyId: js.UndefOr[ParameterKeyId] = js.native
  /**
    * Date the parameter was last changed or updated.
    */
  var LastModifiedDate: js.UndefOr[DateTime] = js.native
  /**
    * Amazon Resource Name (ARN) of the AWS user who last changed the parameter.
    */
  var LastModifiedUser: js.UndefOr[String] = js.native
  /**
    * The parameter name.
    */
  var Name: js.UndefOr[PSParameterName] = js.native
  /**
    * A list of policies associated with a parameter.
    */
  var Policies: js.UndefOr[ParameterPolicyList] = js.native
  /**
    * The parameter tier.
    */
  var Tier: js.UndefOr[ParameterTier] = js.native
  /**
    * The type of parameter. Valid parameter types include the following: String, String list, Secure string.
    */
  var Type: js.UndefOr[ParameterType] = js.native
  /**
    * The parameter version.
    */
  var Version: js.UndefOr[PSParameterVersion] = js.native
}

object ParameterMetadata {
  @scala.inline
  def apply(
    AllowedPattern: AllowedPattern = null,
    Description: ParameterDescription = null,
    KeyId: ParameterKeyId = null,
    LastModifiedDate: DateTime = null,
    LastModifiedUser: String = null,
    Name: PSParameterName = null,
    Policies: ParameterPolicyList = null,
    Tier: ParameterTier = null,
    Type: ParameterType = null,
    Version: Int | Double = null
  ): ParameterMetadata = {
    val __obj = js.Dynamic.literal()
    if (AllowedPattern != null) __obj.updateDynamic("AllowedPattern")(AllowedPattern.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (LastModifiedUser != null) __obj.updateDynamic("LastModifiedUser")(LastModifiedUser.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Policies != null) __obj.updateDynamic("Policies")(Policies.asInstanceOf[js.Any])
    if (Tier != null) __obj.updateDynamic("Tier")(Tier.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterMetadata]
  }
}

