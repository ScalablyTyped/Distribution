package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  /**
    * If the option requires access to a port, then this DB security group allows access to the port.
    */
  var DBSecurityGroupMemberships: js.UndefOr[DBSecurityGroupMembershipList] = js.undefined
  /**
    * The description of the option.
    */
  var OptionDescription: js.UndefOr[String] = js.undefined
  /**
    * The name of the option.
    */
  var OptionName: js.UndefOr[String] = js.undefined
  /**
    * The option settings for this option.
    */
  var OptionSettings: js.UndefOr[OptionSettingConfigurationList] = js.undefined
  /**
    * The version of the option.
    */
  var OptionVersion: js.UndefOr[String] = js.undefined
  /**
    * Indicate if this option is permanent.
    */
  var Permanent: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicate if this option is persistent.
    */
  var Persistent: js.UndefOr[Boolean] = js.undefined
  /**
    * If required, the port configured for this option to use.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * If the option requires access to a port, then this VPC security group allows access to the port.
    */
  var VpcSecurityGroupMemberships: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    DBSecurityGroupMemberships: DBSecurityGroupMembershipList = null,
    OptionDescription: String = null,
    OptionName: String = null,
    OptionSettings: OptionSettingConfigurationList = null,
    OptionVersion: String = null,
    Permanent: js.UndefOr[Boolean] = js.undefined,
    Persistent: js.UndefOr[Boolean] = js.undefined,
    Port: js.UndefOr[IntegerOptional] = js.undefined,
    VpcSecurityGroupMemberships: VpcSecurityGroupMembershipList = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (DBSecurityGroupMemberships != null) __obj.updateDynamic("DBSecurityGroupMemberships")(DBSecurityGroupMemberships)
    if (OptionDescription != null) __obj.updateDynamic("OptionDescription")(OptionDescription)
    if (OptionName != null) __obj.updateDynamic("OptionName")(OptionName)
    if (OptionSettings != null) __obj.updateDynamic("OptionSettings")(OptionSettings)
    if (OptionVersion != null) __obj.updateDynamic("OptionVersion")(OptionVersion)
    if (!js.isUndefined(Permanent)) __obj.updateDynamic("Permanent")(Permanent)
    if (!js.isUndefined(Persistent)) __obj.updateDynamic("Persistent")(Persistent)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    if (VpcSecurityGroupMemberships != null) __obj.updateDynamic("VpcSecurityGroupMemberships")(VpcSecurityGroupMemberships)
    __obj.asInstanceOf[Option]
  }
}

