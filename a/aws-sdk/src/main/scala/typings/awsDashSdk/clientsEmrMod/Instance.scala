package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /**
    * The list of EBS volumes that are attached to this instance.
    */
  var EbsVolumes: js.UndefOr[EbsVolumeList] = js.native
  /**
    * The unique identifier of the instance in Amazon EC2.
    */
  var Ec2InstanceId: js.UndefOr[InstanceId] = js.native
  /**
    * The unique identifier for the instance in Amazon EMR.
    */
  var Id: js.UndefOr[InstanceId] = js.native
  /**
    * The unique identifier of the instance fleet to which an EC2 instance belongs.
    */
  var InstanceFleetId: js.UndefOr[typings.awsDashSdk.clientsEmrMod.InstanceFleetId] = js.native
  /**
    * The identifier of the instance group to which this instance belongs.
    */
  var InstanceGroupId: js.UndefOr[String] = js.native
  /**
    * The EC2 instance type, for example m3.xlarge.
    */
  var InstanceType: js.UndefOr[typings.awsDashSdk.clientsEmrMod.InstanceType] = js.native
  /**
    * The instance purchasing option. Valid values are ON_DEMAND or SPOT. 
    */
  var Market: js.UndefOr[MarketType] = js.native
  /**
    * The private DNS name of the instance.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  /**
    * The private IP address of the instance.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
  /**
    * The public DNS name of the instance.
    */
  var PublicDnsName: js.UndefOr[String] = js.native
  /**
    * The public IP address of the instance.
    */
  var PublicIpAddress: js.UndefOr[String] = js.native
  /**
    * The current status of the instance.
    */
  var Status: js.UndefOr[InstanceStatus] = js.native
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
    if (EbsVolumes != null) __obj.updateDynamic("EbsVolumes")(EbsVolumes.asInstanceOf[js.Any])
    if (Ec2InstanceId != null) __obj.updateDynamic("Ec2InstanceId")(Ec2InstanceId.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (InstanceFleetId != null) __obj.updateDynamic("InstanceFleetId")(InstanceFleetId.asInstanceOf[js.Any])
    if (InstanceGroupId != null) __obj.updateDynamic("InstanceGroupId")(InstanceGroupId.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (Market != null) __obj.updateDynamic("Market")(Market.asInstanceOf[js.Any])
    if (PrivateDnsName != null) __obj.updateDynamic("PrivateDnsName")(PrivateDnsName.asInstanceOf[js.Any])
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress.asInstanceOf[js.Any])
    if (PublicDnsName != null) __obj.updateDynamic("PublicDnsName")(PublicDnsName.asInstanceOf[js.Any])
    if (PublicIpAddress != null) __obj.updateDynamic("PublicIpAddress")(PublicIpAddress.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

