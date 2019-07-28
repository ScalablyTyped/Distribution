package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisioningArtifactParameter extends js.Object {
  /**
    * The default value.
    */
  var DefaultValue: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.DefaultValue] = js.undefined
  /**
    * The description of the parameter.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Description] = js.undefined
  /**
    * If this value is true, the value for this parameter is obfuscated from view when the parameter is retrieved. This parameter is used to hide sensitive information.
    */
  var IsNoEcho: js.UndefOr[NoEcho] = js.undefined
  /**
    * Constraints that the administrator has put on a parameter.
    */
  var ParameterConstraints: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ParameterConstraints] = js.undefined
  /**
    * The parameter key.
    */
  var ParameterKey: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ParameterKey] = js.undefined
  /**
    * The parameter type.
    */
  var ParameterType: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ParameterType] = js.undefined
}

object ProvisioningArtifactParameter {
  @scala.inline
  def apply(
    DefaultValue: DefaultValue = null,
    Description: Description = null,
    IsNoEcho: js.UndefOr[NoEcho] = js.undefined,
    ParameterConstraints: ParameterConstraints = null,
    ParameterKey: ParameterKey = null,
    ParameterType: ParameterType = null
  ): ProvisioningArtifactParameter = {
    val __obj = js.Dynamic.literal()
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(IsNoEcho)) __obj.updateDynamic("IsNoEcho")(IsNoEcho)
    if (ParameterConstraints != null) __obj.updateDynamic("ParameterConstraints")(ParameterConstraints)
    if (ParameterKey != null) __obj.updateDynamic("ParameterKey")(ParameterKey)
    if (ParameterType != null) __obj.updateDynamic("ParameterType")(ParameterType)
    __obj.asInstanceOf[ProvisioningArtifactParameter]
  }
}

