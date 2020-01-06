package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryConnectSettings extends js.Object {
  /**
    * A list of one or more IP addresses of DNS servers or domain controllers in the on-premises directory.
    */
  var CustomerDnsIps: DnsIpAddrs = js.native
  /**
    * The user name of an account in the on-premises directory that is used to connect to the directory. This account must have the following permissions:   Read users and groups   Create computer objects   Join computers to the domain  
    */
  var CustomerUserName: UserName = js.native
  /**
    * A list of subnet identifiers in the VPC in which the AD Connector is created.
    */
  var SubnetIds: typings.awsDashSdk.clientsDirectoryserviceMod.SubnetIds = js.native
  /**
    * The identifier of the VPC in which the AD Connector is created.
    */
  var VpcId: typings.awsDashSdk.clientsDirectoryserviceMod.VpcId = js.native
}

object DirectoryConnectSettings {
  @scala.inline
  def apply(CustomerDnsIps: DnsIpAddrs, CustomerUserName: UserName, SubnetIds: SubnetIds, VpcId: VpcId): DirectoryConnectSettings = {
    val __obj = js.Dynamic.literal(CustomerDnsIps = CustomerDnsIps.asInstanceOf[js.Any], CustomerUserName = CustomerUserName.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectoryConnectSettings]
  }
}

