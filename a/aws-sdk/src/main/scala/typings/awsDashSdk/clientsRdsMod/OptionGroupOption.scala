package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionGroupOption extends js.Object {
  /**
    * If the option requires a port, specifies the default port for the option.
    */
  var DefaultPort: js.UndefOr[IntegerOptional] = js.native
  /**
    * The description of the option.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The name of the engine that this option can be applied to.
    */
  var EngineName: js.UndefOr[String] = js.native
  /**
    * Indicates the major engine version that the option is available for.
    */
  var MajorEngineVersion: js.UndefOr[String] = js.native
  /**
    * The minimum required engine version for the option to be applied.
    */
  var MinimumRequiredMinorEngineVersion: js.UndefOr[String] = js.native
  /**
    * The name of the option.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The option settings that are available (and the default value) for each option in an option group.
    */
  var OptionGroupOptionSettings: js.UndefOr[OptionGroupOptionSettingsList] = js.native
  /**
    * The versions that are available for the option.
    */
  var OptionGroupOptionVersions: js.UndefOr[OptionGroupOptionVersionsList] = js.native
  /**
    * The options that conflict with this option.
    */
  var OptionsConflictsWith: js.UndefOr[typings.awsDashSdk.clientsRdsMod.OptionsConflictsWith] = js.native
  /**
    * The options that are prerequisites for this option.
    */
  var OptionsDependedOn: js.UndefOr[typings.awsDashSdk.clientsRdsMod.OptionsDependedOn] = js.native
  /**
    * Permanent options can never be removed from an option group. An option group containing a permanent option can't be removed from a DB instance.
    */
  var Permanent: js.UndefOr[Boolean] = js.native
  /**
    * Persistent options can't be removed from an option group while DB instances are associated with the option group. If you disassociate all DB instances from the option group, your can remove the persistent option from the option group.
    */
  var Persistent: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether the option requires a port.
    */
  var PortRequired: js.UndefOr[Boolean] = js.native
  /**
    * If true, you must enable the Auto Minor Version Upgrade setting for your DB instance before you can use this option. You can enable Auto Minor Version Upgrade when you first create your DB instance, or by modifying your DB instance later. 
    */
  var RequiresAutoMinorEngineVersionUpgrade: js.UndefOr[Boolean] = js.native
  /**
    * If true, you can change the option to an earlier version of the option. This only applies to options that have different versions available. 
    */
  var SupportsOptionVersionDowngrade: js.UndefOr[BooleanOptional] = js.native
  /**
    * If true, you can only use this option with a DB instance that is in a VPC. 
    */
  var VpcOnly: js.UndefOr[Boolean] = js.native
}

object OptionGroupOption {
  @scala.inline
  def apply(
    DefaultPort: Int | scala.Double = null,
    Description: String = null,
    EngineName: String = null,
    MajorEngineVersion: String = null,
    MinimumRequiredMinorEngineVersion: String = null,
    Name: String = null,
    OptionGroupOptionSettings: OptionGroupOptionSettingsList = null,
    OptionGroupOptionVersions: OptionGroupOptionVersionsList = null,
    OptionsConflictsWith: OptionsConflictsWith = null,
    OptionsDependedOn: OptionsDependedOn = null,
    Permanent: js.UndefOr[scala.Boolean] = js.undefined,
    Persistent: js.UndefOr[scala.Boolean] = js.undefined,
    PortRequired: js.UndefOr[scala.Boolean] = js.undefined,
    RequiresAutoMinorEngineVersionUpgrade: js.UndefOr[scala.Boolean] = js.undefined,
    SupportsOptionVersionDowngrade: js.UndefOr[scala.Boolean] = js.undefined,
    VpcOnly: js.UndefOr[scala.Boolean] = js.undefined
  ): OptionGroupOption = {
    val __obj = js.Dynamic.literal()
    if (DefaultPort != null) __obj.updateDynamic("DefaultPort")(DefaultPort.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (EngineName != null) __obj.updateDynamic("EngineName")(EngineName.asInstanceOf[js.Any])
    if (MajorEngineVersion != null) __obj.updateDynamic("MajorEngineVersion")(MajorEngineVersion.asInstanceOf[js.Any])
    if (MinimumRequiredMinorEngineVersion != null) __obj.updateDynamic("MinimumRequiredMinorEngineVersion")(MinimumRequiredMinorEngineVersion.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OptionGroupOptionSettings != null) __obj.updateDynamic("OptionGroupOptionSettings")(OptionGroupOptionSettings.asInstanceOf[js.Any])
    if (OptionGroupOptionVersions != null) __obj.updateDynamic("OptionGroupOptionVersions")(OptionGroupOptionVersions.asInstanceOf[js.Any])
    if (OptionsConflictsWith != null) __obj.updateDynamic("OptionsConflictsWith")(OptionsConflictsWith.asInstanceOf[js.Any])
    if (OptionsDependedOn != null) __obj.updateDynamic("OptionsDependedOn")(OptionsDependedOn.asInstanceOf[js.Any])
    if (!js.isUndefined(Permanent)) __obj.updateDynamic("Permanent")(Permanent.asInstanceOf[js.Any])
    if (!js.isUndefined(Persistent)) __obj.updateDynamic("Persistent")(Persistent.asInstanceOf[js.Any])
    if (!js.isUndefined(PortRequired)) __obj.updateDynamic("PortRequired")(PortRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(RequiresAutoMinorEngineVersionUpgrade)) __obj.updateDynamic("RequiresAutoMinorEngineVersionUpgrade")(RequiresAutoMinorEngineVersionUpgrade.asInstanceOf[js.Any])
    if (!js.isUndefined(SupportsOptionVersionDowngrade)) __obj.updateDynamic("SupportsOptionVersionDowngrade")(SupportsOptionVersionDowngrade.asInstanceOf[js.Any])
    if (!js.isUndefined(VpcOnly)) __obj.updateDynamic("VpcOnly")(VpcOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionGroupOption]
  }
}

