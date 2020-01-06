package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionSetting extends js.Object {
  /**
    * The allowed values of the option setting.
    */
  var AllowedValues: js.UndefOr[String] = js.native
  /**
    * The DB engine specific parameter type.
    */
  var ApplyType: js.UndefOr[String] = js.native
  /**
    * The data type of the option setting.
    */
  var DataType: js.UndefOr[String] = js.native
  /**
    * The default value of the option setting.
    */
  var DefaultValue: js.UndefOr[String] = js.native
  /**
    * The description of the option setting.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Indicates if the option setting is part of a collection.
    */
  var IsCollection: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean value that, when true, indicates the option setting can be modified from the default.
    */
  var IsModifiable: js.UndefOr[Boolean] = js.native
  /**
    * The name of the option that has settings that you can set.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The current value of the option setting.
    */
  var Value: js.UndefOr[String] = js.native
}

object OptionSetting {
  @scala.inline
  def apply(
    AllowedValues: String = null,
    ApplyType: String = null,
    DataType: String = null,
    DefaultValue: String = null,
    Description: String = null,
    IsCollection: js.UndefOr[scala.Boolean] = js.undefined,
    IsModifiable: js.UndefOr[scala.Boolean] = js.undefined,
    Name: String = null,
    Value: String = null
  ): OptionSetting = {
    val __obj = js.Dynamic.literal()
    if (AllowedValues != null) __obj.updateDynamic("AllowedValues")(AllowedValues.asInstanceOf[js.Any])
    if (ApplyType != null) __obj.updateDynamic("ApplyType")(ApplyType.asInstanceOf[js.Any])
    if (DataType != null) __obj.updateDynamic("DataType")(DataType.asInstanceOf[js.Any])
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(IsCollection)) __obj.updateDynamic("IsCollection")(IsCollection.asInstanceOf[js.Any])
    if (!js.isUndefined(IsModifiable)) __obj.updateDynamic("IsModifiable")(IsModifiable.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionSetting]
  }
}

