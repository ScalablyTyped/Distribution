package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  /**
    * The list of EBS volumes that are attached to this instance.
    */
  var EbsVolumes: js.UndefOr[EbsVolumeList] = js.undefined
  /**
    * The unique identifier of the instance in Amazon EC2.
    */
  var Ec2InstanceId: js.UndefOr[InstanceId] = js.undefined
  /**
    * The unique identifier for the instance in Amazon EMR.
    */
  var Id: js.UndefOr[InstanceId] = js.undefined
  /**
    * The unique identifier of the instance fleet to which an EC2 instance belongs.
    */
  var InstanceFleetId: js.UndefOr[typings.awsDashSdk.clientsEmrMod.InstanceFleetId] = js.undefined
  /**
    * The identifier of the instance group to which this instance belongs.
    */
  var InstanceGroupId: js.UndefOr[String] = js.undefined
  /**
    * The EC2 instance type, for example m3.xlarge.
    */
  var InstanceType: js.UndefOr[typings.awsDashSdk.clientsEmrMod.InstanceType] = js.undefined
  /**
    * The instance purchasing option. Valid values are ON_DEMAND or SPOT. 
    */
  var Market: js.UndefOr[MarketType] = js.undefined
  /**
    * The private DNS name of the instance.
    */
  var PrivateDnsName: js.UndefOr[String] = js.undefined
  /**
    * The private IP address of the instance.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
  /**
    * The public DNS name of the instance.
    */
  var PublicDnsName: js.UndefOr[String] = js.undefined
  /**
    * The public IP address of the instance.
    */
  var PublicIpAddress: js.UndefOr[String] = js.undefined
  /**
    * The current status of the instance.
    */
  var Status: js.UndefOr[InstanceStatus] = js.undefined
}

object Instance {
  @scala.inline
  def apply(
    EbsVolumes: EbsVolumeList = null,
    Ec2InstanceId: InstanceId = null,
    Id: InstanceId = null,
    InstanceFleetId: InstanceFleetId = null,
    InstanceGroupId: String = null,
    InstanceType: InstanceType = null,
    Market: MarketType = null,
    PrivateDnsName: String = null,
    PrivateIpAddress: String = null,
    PublicDnsName: String = null,
    PublicIpAddress: String = null,
    Status: InstanceStatus = null
  ): Instance = {
    val __obj = js.Dynamic.literal()
    if (EbsVolumes != null) __obj.updateDynamic("EbsVolumes")(EbsVolumes)
    if (Ec2InstanceId != null) __obj.updateDynamic("Ec2InstanceId")(Ec2InstanceId)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (InstanceFleetId != null) __obj.updateDynamic("InstanceFleetId")(InstanceFleetId)
    if (InstanceGroupId != null) __obj.updateDynamic("InstanceGroupId")(InstanceGroupId)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    if (Market != null) __obj.updateDynamic("Market")(Market.asInstanceOf[js.Any])
    if (PrivateDnsName != null) __obj.updateDynamic("PrivateDnsName")(PrivateDnsName)
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress)
    if (PublicDnsName != null) __obj.updateDynamic("PublicDnsName")(PublicDnsName)
    if (PublicIpAddress != null) __obj.updateDynamic("PublicIpAddress")(PublicIpAddress)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[Instance]
  }
}

