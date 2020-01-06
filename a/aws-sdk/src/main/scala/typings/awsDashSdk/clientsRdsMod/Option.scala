package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Option extends js.Object {
  /**
    * If the option requires access to a port, then this DB security group allows access to the port.
    */
  var DBSecurityGroupMemberships: js.UndefOr[DBSecurityGroupMembershipList] = js.native
  /**
    * The description of the option.
    */
  var OptionDescription: js.UndefOr[String] = js.native
  /**
    * The name of the option.
    */
  var OptionName: js.UndefOr[String] = js.native
  /**
    * The option settings for this option.
    */
  var OptionSettings: js.UndefOr[OptionSettingConfigurationList] = js.native
  /**
    * The version of the option.
    */
  var OptionVersion: js.UndefOr[String] = js.native
  /**
    * Indicate if this option is permanent.
    */
  var Permanent: js.UndefOr[Boolean] = js.native
  /**
    * Indicate if this option is persistent.
    */
  var Persistent: js.UndefOr[Boolean] = js.native
  /**
    * If required, the port configured for this option to use.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  /**
    * If the option requires access to a port, then this VPC security group allows access to the port.
    */
  var VpcSecurityGroupMemberships: js.UndefOr[VpcSecurityGroupMembershipList] = js.native
}

object Option {
  @scala.inline
  def apply(
    DBSecurityGroupMemberships: DBSecurityGroupMembershipList = null,
    OptionDescription: String = null,
    OptionName: String = null,
    OptionSettings: OptionSettingConfigurationList = null,
    OptionVersion: String = null,
    Permanent: js.UndefOr[scala.Boolean] = js.undefined,
    Persistent: js.UndefOr[scala.Boolean] = js.undefined,
    Port: Int | scala.Double = null,
    VpcSecurityGroupMemberships: VpcSecurityGroupMembershipList = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (DBSecurityGroupMemberships != null) __obj.updateDynamic("DBSecurityGroupMemberships")(DBSecurityGroupMemberships.asInstanceOf[js.Any])
    if (OptionDescription != null) __obj.updateDynamic("OptionDescription")(OptionDescription.asInstanceOf[js.Any])
    if (OptionName != null) __obj.updateDynamic("OptionName")(OptionName.asInstanceOf[js.Any])
    if (OptionSettings != null) __obj.updateDynamic("OptionSettings")(OptionSettings.asInstanceOf[js.Any])
    if (OptionVersion != null) __obj.updateDynamic("OptionVersion")(OptionVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(Permanent)) __obj.updateDynamic("Permanent")(Permanent.asInstanceOf[js.Any])
    if (!js.isUndefined(Persistent)) __obj.updateDynamic("Persistent")(Persistent.asInstanceOf[js.Any])
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (VpcSecurityGroupMemberships != null) __obj.updateDynamic("VpcSecurityGroupMemberships")(VpcSecurityGroupMemberships.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

