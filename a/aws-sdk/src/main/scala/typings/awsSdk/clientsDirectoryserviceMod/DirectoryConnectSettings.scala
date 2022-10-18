package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectoryConnectSettings extends StObject {
  
  /**
    * A list of one or more IP addresses of DNS servers or domain controllers in your self-managed directory.
    */
  var CustomerDnsIps: DnsIpAddrs
  
  /**
    * The user name of an account in your self-managed directory that is used to connect to the directory. This account must have the following permissions:   Read users and groups   Create computer objects   Join computers to the domain  
    */
  var CustomerUserName: UserName
  
  /**
    * A list of subnet identifiers in the VPC in which the AD Connector is created.
    */
  var SubnetIds: typings.awsSdk.clientsDirectoryserviceMod.SubnetIds
  
  /**
    * The identifier of the VPC in which the AD Connector is created.
    */
  var VpcId: typings.awsSdk.clientsDirectoryserviceMod.VpcId
}
object DirectoryConnectSettings {
  
  inline def apply(CustomerDnsIps: DnsIpAddrs, CustomerUserName: UserName, SubnetIds: SubnetIds, VpcId: VpcId): DirectoryConnectSettings = {
    val __obj = js.Dynamic.literal(CustomerDnsIps = CustomerDnsIps.asInstanceOf[js.Any], CustomerUserName = CustomerUserName.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryConnectSettings]
  }
  
  extension [Self <: DirectoryConnectSettings](x: Self) {
    
    inline def setCustomerDnsIps(value: DnsIpAddrs): Self = StObject.set(x, "CustomerDnsIps", value.asInstanceOf[js.Any])
    
    inline def setCustomerDnsIpsVarargs(value: IpAddr*): Self = StObject.set(x, "CustomerDnsIps", js.Array(value*))
    
    inline def setCustomerUserName(value: UserName): Self = StObject.set(x, "CustomerUserName", value.asInstanceOf[js.Any])
    
    inline def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
