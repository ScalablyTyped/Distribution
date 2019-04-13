package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionGroupOptionSetting extends js.Object {
  /**
    * Indicates the acceptable values for the option group option.
    */
  var AllowedValues: js.UndefOr[String] = js.undefined
  /**
    * The DB engine specific parameter type for the option group option.
    */
  var ApplyType: js.UndefOr[String] = js.undefined
  /**
    * The default value for the option group option.
    */
  var DefaultValue: js.UndefOr[String] = js.undefined
  /**
    * Boolean value where true indicates that this option group option can be changed from the default value.
    */
  var IsModifiable: js.UndefOr[Boolean] = js.undefined
  /**
    * Boolean value where true indicates that a value must be specified for this option setting of the option group option.
    */
  var IsRequired: js.UndefOr[Boolean] = js.undefined
  /**
    * The minimum DB engine version required for the corresponding allowed value for this option setting.
    */
  var MinimumEngineVersionPerAllowedValue: js.UndefOr[MinimumEngineVersionPerAllowedValueList] = js.undefined
  /**
    * The description of the option group option.
    */
  var SettingDescription: js.UndefOr[String] = js.undefined
  /**
    * The name of the option group option.
    */
  var SettingName: js.UndefOr[String] = js.undefined
}

object OptionGroupOptionSetting {
  @scala.inline
  def apply(
    AllowedValues: String = null,
    ApplyType: String = null,
    DefaultValue: String = null,
    IsModifiable: js.UndefOr[Boolean] = js.undefined,
    IsRequired: js.UndefOr[Boolean] = js.undefined,
    MinimumEngineVersionPerAllowedValue: MinimumEngineVersionPerAllowedValueList = null,
    SettingDescription: String = null,
    SettingName: String = null
  ): OptionGroupOptionSetting = {
    val __obj = js.Dynamic.literal()
    if (AllowedValues != null) __obj.updateDynamic("AllowedValues")(AllowedValues)
    if (ApplyType != null) __obj.updateDynamic("ApplyType")(ApplyType)
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue)
    if (!js.isUndefined(IsModifiable)) __obj.updateDynamic("IsModifiable")(IsModifiable)
    if (!js.isUndefined(IsRequired)) __obj.updateDynamic("IsRequired")(IsRequired)
    if (MinimumEngineVersionPerAllowedValue != null) __obj.updateDynamic("MinimumEngineVersionPerAllowedValue")(MinimumEngineVersionPerAllowedValue)
    if (SettingDescription != null) __obj.updateDynamic("SettingDescription")(SettingDescription)
    if (SettingName != null) __obj.updateDynamic("SettingName")(SettingName)
    __obj.asInstanceOf[OptionGroupOptionSetting]
  }
}

