package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcConfigurationUpdate extends js.Object {
  /**
    * Describes updates to the array of SecurityGroup IDs used by the VPC configuration.
    */
  var SecurityGroupIdUpdates: js.UndefOr[SecurityGroupIds] = js.native
  /**
    * Describes updates to the array of Subnet IDs used by the VPC configuration.
    */
  var SubnetIdUpdates: js.UndefOr[SubnetIds] = js.native
  /**
    * Describes an update to the ID of the VPC configuration.
    */
  var VpcConfigurationId: Id = js.native
}

object VpcConfigurationUpdate {
  @scala.inline
  def apply(
    VpcConfigurationId: Id,
    SecurityGroupIdUpdates: SecurityGroupIds = null,
    SubnetIdUpdates: SubnetIds = null
  ): VpcConfigurationUpdate = {
    val __obj = js.Dynamic.literal(VpcConfigurationId = VpcConfigurationId.asInstanceOf[js.Any])
    if (SecurityGroupIdUpdates != null) __obj.updateDynamic("SecurityGroupIdUpdates")(SecurityGroupIdUpdates.asInstanceOf[js.Any])
    if (SubnetIdUpdates != null) __obj.updateDynamic("SubnetIdUpdates")(SubnetIdUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfigurationUpdate]
  }
}

