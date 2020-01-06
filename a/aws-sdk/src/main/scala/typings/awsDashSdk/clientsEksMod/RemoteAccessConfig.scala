package typings.awsDashSdk.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteAccessConfig extends js.Object {
  /**
    * The Amazon EC2 SSH key that provides access for SSH communication with the worker nodes in the managed node group. For more information, see Amazon EC2 Key Pairs in the Amazon Elastic Compute Cloud User Guide for Linux Instances.
    */
  var ec2SshKey: js.UndefOr[String] = js.native
  /**
    * The security groups that are allowed SSH access (port 22) to the worker nodes. If you specify an Amazon EC2 SSH key but do not specify a source security group when you create a managed node group, then port 22 on the worker nodes is opened to the internet (0.0.0.0/0). For more information, see Security Groups for Your VPC in the Amazon Virtual Private Cloud User Guide.
    */
  var sourceSecurityGroups: js.UndefOr[StringList] = js.native
}

object RemoteAccessConfig {
  @scala.inline
  def apply(ec2SshKey: String = null, sourceSecurityGroups: StringList = null): RemoteAccessConfig = {
    val __obj = js.Dynamic.literal()
    if (ec2SshKey != null) __obj.updateDynamic("ec2SshKey")(ec2SshKey.asInstanceOf[js.Any])
    if (sourceSecurityGroups != null) __obj.updateDynamic("sourceSecurityGroups")(sourceSecurityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteAccessConfig]
  }
}

