package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceInformation extends js.Object {
  /**
    * The activation ID created by Systems Manager when the server or VM was registered.
    */
  var ActivationId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.ActivationId] = js.undefined
  /**
    * The version of SSM Agent running on your Linux instance. 
    */
  var AgentVersion: js.UndefOr[Version] = js.undefined
  /**
    * Information about the association.
    */
  var AssociationOverview: js.UndefOr[InstanceAggregatedAssociationOverview] = js.undefined
  /**
    * The status of the association.
    */
  var AssociationStatus: js.UndefOr[StatusName] = js.undefined
  /**
    * The fully qualified host name of the managed instance.
    */
  var ComputerName: js.UndefOr[typings.awsDashSdk.clientsSsmMod.ComputerName] = js.undefined
  /**
    * The IP address of the managed instance.
    */
  var IPAddress: js.UndefOr[typings.awsDashSdk.clientsSsmMod.IPAddress] = js.undefined
  /**
    * The Amazon Identity and Access Management (IAM) role assigned to the on-premises Systems Manager managed instances. This call does not return the IAM role for Amazon EC2 instances. 
    */
  var IamRole: js.UndefOr[typings.awsDashSdk.clientsSsmMod.IamRole] = js.undefined
  /**
    * The instance ID. 
    */
  var InstanceId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.InstanceId] = js.undefined
  /**
    * Indicates whether the latest version of SSM Agent is running on your Linux Managed Instance. This field does not indicate whether or not the latest version is installed on Windows managed instances, because some older versions of Windows Server use the EC2Config service to process SSM requests.
    */
  var IsLatestVersion: js.UndefOr[Boolean] = js.undefined
  /**
    * The date the association was last run.
    */
  var LastAssociationExecutionDate: js.UndefOr[DateTime] = js.undefined
  /**
    * The date and time when agent last pinged Systems Manager service. 
    */
  var LastPingDateTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The last date the association was successfully run.
    */
  var LastSuccessfulAssociationExecutionDate: js.UndefOr[DateTime] = js.undefined
  /**
    * The name of the managed instance.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * Connection status of SSM Agent. 
    */
  var PingStatus: js.UndefOr[typings.awsDashSdk.clientsSsmMod.PingStatus] = js.undefined
  /**
    * The name of the operating system platform running on your instance. 
    */
  var PlatformName: js.UndefOr[String] = js.undefined
  /**
    * The operating system platform type. 
    */
  var PlatformType: js.UndefOr[typings.awsDashSdk.clientsSsmMod.PlatformType] = js.undefined
  /**
    * The version of the OS platform running on your instance. 
    */
  var PlatformVersion: js.UndefOr[String] = js.undefined
  /**
    * The date the server or VM was registered with AWS as a managed instance.
    */
  var RegistrationDate: js.UndefOr[DateTime] = js.undefined
  /**
    * The type of instance. Instances are either EC2 instances or managed instances. 
    */
  var ResourceType: js.UndefOr[typings.awsDashSdk.clientsSsmMod.ResourceType] = js.undefined
}

object InstanceInformation {
  @scala.inline
  def apply(
    ActivationId: ActivationId = null,
    AgentVersion: Version = null,
    AssociationOverview: InstanceAggregatedAssociationOverview = null,
    AssociationStatus: StatusName = null,
    ComputerName: ComputerName = null,
    IPAddress: IPAddress = null,
    IamRole: IamRole = null,
    InstanceId: InstanceId = null,
    IsLatestVersion: js.UndefOr[Boolean] = js.undefined,
    LastAssociationExecutionDate: DateTime = null,
    LastPingDateTime: DateTime = null,
    LastSuccessfulAssociationExecutionDate: DateTime = null,
    Name: String = null,
    PingStatus: PingStatus = null,
    PlatformName: String = null,
    PlatformType: PlatformType = null,
    PlatformVersion: String = null,
    RegistrationDate: DateTime = null,
    ResourceType: ResourceType = null
  ): InstanceInformation = {
    val __obj = js.Dynamic.literal()
    if (ActivationId != null) __obj.updateDynamic("ActivationId")(ActivationId)
    if (AgentVersion != null) __obj.updateDynamic("AgentVersion")(AgentVersion)
    if (AssociationOverview != null) __obj.updateDynamic("AssociationOverview")(AssociationOverview)
    if (AssociationStatus != null) __obj.updateDynamic("AssociationStatus")(AssociationStatus)
    if (ComputerName != null) __obj.updateDynamic("ComputerName")(ComputerName)
    if (IPAddress != null) __obj.updateDynamic("IPAddress")(IPAddress)
    if (IamRole != null) __obj.updateDynamic("IamRole")(IamRole)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (!js.isUndefined(IsLatestVersion)) __obj.updateDynamic("IsLatestVersion")(IsLatestVersion)
    if (LastAssociationExecutionDate != null) __obj.updateDynamic("LastAssociationExecutionDate")(LastAssociationExecutionDate)
    if (LastPingDateTime != null) __obj.updateDynamic("LastPingDateTime")(LastPingDateTime)
    if (LastSuccessfulAssociationExecutionDate != null) __obj.updateDynamic("LastSuccessfulAssociationExecutionDate")(LastSuccessfulAssociationExecutionDate)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (PingStatus != null) __obj.updateDynamic("PingStatus")(PingStatus.asInstanceOf[js.Any])
    if (PlatformName != null) __obj.updateDynamic("PlatformName")(PlatformName)
    if (PlatformType != null) __obj.updateDynamic("PlatformType")(PlatformType.asInstanceOf[js.Any])
    if (PlatformVersion != null) __obj.updateDynamic("PlatformVersion")(PlatformVersion)
    if (RegistrationDate != null) __obj.updateDynamic("RegistrationDate")(RegistrationDate)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceInformation]
  }
}

