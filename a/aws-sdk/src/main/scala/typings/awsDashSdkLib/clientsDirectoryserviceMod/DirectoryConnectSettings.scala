package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryConnectSettings extends js.Object {
  /**
    * A list of one or more IP addresses of DNS servers or domain controllers in the on-premises directory.
    */
  var CustomerDnsIps: DnsIpAddrs
  /**
    * The user name of an account in the on-premises directory that is used to connect to the directory. This account must have the following permissions:   Read users and groups   Create computer objects   Join computers to the domain  
    */
  var CustomerUserName: UserName
  /**
    * A list of subnet identifiers in the VPC in which the AD Connector is created.
    */
  var SubnetIds: awsDashSdkLib.clientsDirectoryserviceMod.SubnetIds
  /**
    * The identifier of the VPC in which the AD Connector is created.
    */
  var VpcId: awsDashSdkLib.clientsDirectoryserviceMod.VpcId
}

object DirectoryConnectSettings {
  @scala.inline
  def apply(CustomerDnsIps: DnsIpAddrs, CustomerUserName: UserName, SubnetIds: SubnetIds, VpcId: VpcId): DirectoryConnectSettings = {
    val __obj = js.Dynamic.literal(CustomerDnsIps = CustomerDnsIps, CustomerUserName = CustomerUserName, SubnetIds = SubnetIds, VpcId = VpcId)
  
    __obj.asInstanceOf[DirectoryConnectSettings]
  }
}

