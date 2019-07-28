package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeHsmResponse extends js.Object {
  /**
    * The Availability Zone that the HSM is in.
    */
  var AvailabilityZone: js.UndefOr[AZ] = js.undefined
  /**
    * The identifier of the elastic network interface (ENI) attached to the HSM.
    */
  var EniId: js.UndefOr[typings.awsDashSdk.clientsCloudhsmMod.EniId] = js.undefined
  /**
    * The IP address assigned to the HSM's ENI.
    */
  var EniIp: js.UndefOr[IpAddress] = js.undefined
  /**
    * The ARN of the HSM.
    */
  var HsmArn: js.UndefOr[typings.awsDashSdk.clientsCloudhsmMod.HsmArn] = js.undefined
  /**
    * The HSM model type.
    */
  var HsmType: js.UndefOr[String] = js.undefined
  /**
    * The ARN of the IAM role assigned to the HSM.
    */
  var IamRoleArn: js.UndefOr[typings.awsDashSdk.clientsCloudhsmMod.IamRoleArn] = js.undefined
  /**
    * The list of partitions on the HSM.
    */
  var Partitions: js.UndefOr[PartitionList] = js.undefined
  /**
    * The serial number of the HSM.
    */
  var SerialNumber: js.UndefOr[HsmSerialNumber] = js.undefined
  /**
    * The date and time that the server certificate was last updated.
    */
  var ServerCertLastUpdated: js.UndefOr[Timestamp] = js.undefined
  /**
    * The URI of the certificate server.
    */
  var ServerCertUri: js.UndefOr[String] = js.undefined
  /**
    * The HSM software version.
    */
  var SoftwareVersion: js.UndefOr[String] = js.undefined
  /**
    * The date and time that the SSH key was last updated.
    */
  var SshKeyLastUpdated: js.UndefOr[Timestamp] = js.undefined
  /**
    * The public SSH key.
    */
  var SshPublicKey: js.UndefOr[SshKey] = js.undefined
  /**
    * The status of the HSM.
    */
  var Status: js.UndefOr[HsmStatus] = js.undefined
  /**
    * Contains additional information about the status of the HSM.
    */
  var StatusDetails: js.UndefOr[String] = js.undefined
  /**
    * The identifier of the subnet that the HSM is in.
    */
  var SubnetId: js.UndefOr[typings.awsDashSdk.clientsCloudhsmMod.SubnetId] = js.undefined
  /**
    * The subscription end date.
    */
  var SubscriptionEndDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The subscription start date.
    */
  var SubscriptionStartDate: js.UndefOr[Timestamp] = js.undefined
  var SubscriptionType: js.UndefOr[typings.awsDashSdk.clientsCloudhsmMod.SubscriptionType] = js.undefined
  /**
    * The name of the HSM vendor.
    */
  var VendorName: js.UndefOr[String] = js.undefined
  /**
    * The identifier of the VPC that the HSM is in.
    */
  var VpcId: js.UndefOr[typings.awsDashSdk.clientsCloudhsmMod.VpcId] = js.undefined
}

object DescribeHsmResponse {
  @scala.inline
  def apply(
    AvailabilityZone: AZ = null,
    EniId: EniId = null,
    EniIp: IpAddress = null,
    HsmArn: HsmArn = null,
    HsmType: String = null,
    IamRoleArn: IamRoleArn = null,
    Partitions: PartitionList = null,
    SerialNumber: HsmSerialNumber = null,
    ServerCertLastUpdated: Timestamp = null,
    ServerCertUri: String = null,
    SoftwareVersion: String = null,
    SshKeyLastUpdated: Timestamp = null,
    SshPublicKey: SshKey = null,
    Status: HsmStatus = null,
    StatusDetails: String = null,
    SubnetId: SubnetId = null,
    SubscriptionEndDate: Timestamp = null,
    SubscriptionStartDate: Timestamp = null,
    SubscriptionType: SubscriptionType = null,
    VendorName: String = null,
    VpcId: VpcId = null
  ): DescribeHsmResponse = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (EniId != null) __obj.updateDynamic("EniId")(EniId)
    if (EniIp != null) __obj.updateDynamic("EniIp")(EniIp)
    if (HsmArn != null) __obj.updateDynamic("HsmArn")(HsmArn)
    if (HsmType != null) __obj.updateDynamic("HsmType")(HsmType)
    if (IamRoleArn != null) __obj.updateDynamic("IamRoleArn")(IamRoleArn)
    if (Partitions != null) __obj.updateDynamic("Partitions")(Partitions)
    if (SerialNumber != null) __obj.updateDynamic("SerialNumber")(SerialNumber)
    if (ServerCertLastUpdated != null) __obj.updateDynamic("ServerCertLastUpdated")(ServerCertLastUpdated)
    if (ServerCertUri != null) __obj.updateDynamic("ServerCertUri")(ServerCertUri)
    if (SoftwareVersion != null) __obj.updateDynamic("SoftwareVersion")(SoftwareVersion)
    if (SshKeyLastUpdated != null) __obj.updateDynamic("SshKeyLastUpdated")(SshKeyLastUpdated)
    if (SshPublicKey != null) __obj.updateDynamic("SshPublicKey")(SshPublicKey)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusDetails != null) __obj.updateDynamic("StatusDetails")(StatusDetails)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    if (SubscriptionEndDate != null) __obj.updateDynamic("SubscriptionEndDate")(SubscriptionEndDate)
    if (SubscriptionStartDate != null) __obj.updateDynamic("SubscriptionStartDate")(SubscriptionStartDate)
    if (SubscriptionType != null) __obj.updateDynamic("SubscriptionType")(SubscriptionType.asInstanceOf[js.Any])
    if (VendorName != null) __obj.updateDynamic("VendorName")(VendorName)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[DescribeHsmResponse]
  }
}

