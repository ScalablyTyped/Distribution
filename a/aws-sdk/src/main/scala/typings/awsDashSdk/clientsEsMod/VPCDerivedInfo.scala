package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VPCDerivedInfo extends js.Object {
  /**
    * The availability zones for the Elasticsearch domain. Exists only if the domain was created with VPCOptions.
    */
  var AvailabilityZones: js.UndefOr[StringList] = js.undefined
  /**
    * Specifies the security groups for VPC endpoint.
    */
  var SecurityGroupIds: js.UndefOr[StringList] = js.undefined
  /**
    * Specifies the subnets for VPC endpoint.
    */
  var SubnetIds: js.UndefOr[StringList] = js.undefined
  /**
    * The VPC Id for the Elasticsearch domain. Exists only if the domain was created with VPCOptions.
    */
  var VPCId: js.UndefOr[String] = js.undefined
}

object VPCDerivedInfo {
  @scala.inline
  def apply(
    AvailabilityZones: StringList = null,
    SecurityGroupIds: StringList = null,
    SubnetIds: StringList = null,
    VPCId: String = null
  ): VPCDerivedInfo = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds)
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds)
    if (VPCId != null) __obj.updateDynamic("VPCId")(VPCId)
    __obj.asInstanceOf[VPCDerivedInfo]
  }
}

