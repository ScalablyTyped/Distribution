package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionConfiguration extends js.Object {
  /**
    * A list of DBSecurityGroupMembership name strings used for this option.
    */
  var DBSecurityGroupMemberships: js.UndefOr[DBSecurityGroupNameList] = js.undefined
  /**
    * The configuration of options to include in a group.
    */
  var OptionName: String
  /**
    * The option settings to include in an option group.
    */
  var OptionSettings: js.UndefOr[OptionSettingsList] = js.undefined
  /**
    * The version for the option.
    */
  var OptionVersion: js.UndefOr[String] = js.undefined
  /**
    * The optional port for the option.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * A list of VpcSecurityGroupMembership name strings used for this option.
    */
  var VpcSecurityGroupMemberships: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
}

object OptionConfiguration {
  @scala.inline
  def apply(
    OptionName: String,
    DBSecurityGroupMemberships: DBSecurityGroupNameList = null,
    OptionSettings: OptionSettingsList = null,
    OptionVersion: String = null,
    Port: Int | scala.Double = null,
    VpcSecurityGroupMemberships: VpcSecurityGroupIdList = null
  ): OptionConfiguration = {
    val __obj = js.Dynamic.literal(OptionName = OptionName)
    if (DBSecurityGroupMemberships != null) __obj.updateDynamic("DBSecurityGroupMemberships")(DBSecurityGroupMemberships)
    if (OptionSettings != null) __obj.updateDynamic("OptionSettings")(OptionSettings)
    if (OptionVersion != null) __obj.updateDynamic("OptionVersion")(OptionVersion)
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (VpcSecurityGroupMemberships != null) __obj.updateDynamic("VpcSecurityGroupMemberships")(VpcSecurityGroupMemberships)
    __obj.asInstanceOf[OptionConfiguration]
  }
}

