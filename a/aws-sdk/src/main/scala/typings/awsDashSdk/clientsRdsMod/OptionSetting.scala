package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionSetting extends js.Object {
  /**
    * The allowed values of the option setting.
    */
  var AllowedValues: js.UndefOr[String] = js.undefined
  /**
    * The DB engine specific parameter type.
    */
  var ApplyType: js.UndefOr[String] = js.undefined
  /**
    * The data type of the option setting.
    */
  var DataType: js.UndefOr[String] = js.undefined
  /**
    * The default value of the option setting.
    */
  var DefaultValue: js.UndefOr[String] = js.undefined
  /**
    * The description of the option setting.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * Indicates if the option setting is part of a collection.
    */
  var IsCollection: js.UndefOr[Boolean] = js.undefined
  /**
    * A Boolean value that, when true, indicates the option setting can be modified from the default.
    */
  var IsModifiable: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the option that has settings that you can set.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The current value of the option setting.
    */
  var Value: js.UndefOr[String] = js.undefined
}

object OptionSetting {
  @scala.inline
  def apply(
    AllowedValues: String = null,
    ApplyType: String = null,
    DataType: String = null,
    DefaultValue: String = null,
    Description: String = null,
    IsCollection: js.UndefOr[Boolean] = js.undefined,
    IsModifiable: js.UndefOr[Boolean] = js.undefined,
    Name: String = null,
    Value: String = null
  ): OptionSetting = {
    val __obj = js.Dynamic.literal()
    if (AllowedValues != null) __obj.updateDynamic("AllowedValues")(AllowedValues)
    if (ApplyType != null) __obj.updateDynamic("ApplyType")(ApplyType)
    if (DataType != null) __obj.updateDynamic("DataType")(DataType)
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(IsCollection)) __obj.updateDynamic("IsCollection")(IsCollection)
    if (!js.isUndefined(IsModifiable)) __obj.updateDynamic("IsModifiable")(IsModifiable)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[OptionSetting]
  }
}

