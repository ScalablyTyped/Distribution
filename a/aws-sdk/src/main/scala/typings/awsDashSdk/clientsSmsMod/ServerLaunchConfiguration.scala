package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerLaunchConfiguration extends js.Object {
  /**
    * If true, a publicly accessible IP address is created when launching the server.
    */
  var associatePublicIpAddress: js.UndefOr[AssociatePublicIpAddress] = js.undefined
  /**
    * Name of the EC2 SSH Key to be used for connecting to the launched server.
    */
  var ec2KeyName: js.UndefOr[EC2KeyName] = js.undefined
  /**
    * Instance type to be used for launching the server.
    */
  var instanceType: js.UndefOr[InstanceType] = js.undefined
  /**
    * Logical ID of the server in the Amazon CloudFormation template.
    */
  var logicalId: js.UndefOr[LogicalId] = js.undefined
  /**
    * Identifier of the security group that applies to the launched server.
    */
  var securityGroup: js.UndefOr[SecurityGroup] = js.undefined
  /**
    * Identifier of the server the launch configuration is associated with.
    */
  var server: js.UndefOr[Server] = js.undefined
  /**
    * Identifier of the subnet the server should be launched into.
    */
  var subnet: js.UndefOr[Subnet] = js.undefined
  /**
    * Location of the user-data script to be executed when launching the server.
    */
  var userData: js.UndefOr[UserData] = js.undefined
  /**
    * Identifier of the VPC the server should be launched into.
    */
  var vpc: js.UndefOr[VPC] = js.undefined
}

object ServerLaunchConfiguration {
  @scala.inline
  def apply(
    associatePublicIpAddress: js.UndefOr[AssociatePublicIpAddress] = js.undefined,
    ec2KeyName: EC2KeyName = null,
    instanceType: InstanceType = null,
    logicalId: LogicalId = null,
    securityGroup: SecurityGroup = null,
    server: Server = null,
    subnet: Subnet = null,
    userData: UserData = null,
    vpc: VPC = null
  ): ServerLaunchConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(associatePublicIpAddress)) __obj.updateDynamic("associatePublicIpAddress")(associatePublicIpAddress)
    if (ec2KeyName != null) __obj.updateDynamic("ec2KeyName")(ec2KeyName)
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType)
    if (logicalId != null) __obj.updateDynamic("logicalId")(logicalId)
    if (securityGroup != null) __obj.updateDynamic("securityGroup")(securityGroup)
    if (server != null) __obj.updateDynamic("server")(server)
    if (subnet != null) __obj.updateDynamic("subnet")(subnet)
    if (userData != null) __obj.updateDynamic("userData")(userData)
    if (vpc != null) __obj.updateDynamic("vpc")(vpc)
    __obj.asInstanceOf[ServerLaunchConfiguration]
  }
}

