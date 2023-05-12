package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcEndpoint extends StObject {
  
  /**
    * The date and time that the endpoint was created.
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * (Interface endpoint) The DNS entries for the endpoint.
    */
  var DnsEntries: js.UndefOr[DnsEntrySet] = js.undefined
  
  /**
    * The DNS options for the endpoint.
    */
  var DnsOptions: js.UndefOr[typings.awsSdk.clientsEc2Mod.DnsOptions] = js.undefined
  
  /**
    * (Interface endpoint) Information about the security groups that are associated with the network interface.
    */
  var Groups: js.UndefOr[GroupIdentifierSet] = js.undefined
  
  /**
    * The IP address type for the endpoint.
    */
  var IpAddressType: js.UndefOr[typings.awsSdk.clientsEc2Mod.IpAddressType] = js.undefined
  
  /**
    * The last error that occurred for endpoint.
    */
  var LastError: js.UndefOr[typings.awsSdk.clientsEc2Mod.LastError] = js.undefined
  
  /**
    * (Interface endpoint) The network interfaces for the endpoint.
    */
  var NetworkInterfaceIds: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that owns the endpoint.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The policy document associated with the endpoint, if applicable.
    */
  var PolicyDocument: js.UndefOr[String] = js.undefined
  
  /**
    * (Interface endpoint) Indicates whether the VPC is associated with a private hosted zone.
    */
  var PrivateDnsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the endpoint is being managed by its service.
    */
  var RequesterManaged: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Gateway endpoint) The IDs of the route tables associated with the endpoint.
    */
  var RouteTableIds: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The name of the service to which the endpoint is associated.
    */
  var ServiceName: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the endpoint.
    */
  var State: js.UndefOr[typings.awsSdk.clientsEc2Mod.State] = js.undefined
  
  /**
    * (Interface endpoint) The subnets for the endpoint.
    */
  var SubnetIds: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The tags assigned to the endpoint.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the endpoint.
    */
  var VpcEndpointId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of endpoint.
    */
  var VpcEndpointType: js.UndefOr[typings.awsSdk.clientsEc2Mod.VpcEndpointType] = js.undefined
  
  /**
    * The ID of the VPC to which the endpoint is associated.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object VpcEndpoint {
  
  inline def apply(): VpcEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpcEndpoint] (val x: Self) extends AnyVal {
    
    inline def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    inline def setDnsEntries(value: DnsEntrySet): Self = StObject.set(x, "DnsEntries", value.asInstanceOf[js.Any])
    
    inline def setDnsEntriesUndefined: Self = StObject.set(x, "DnsEntries", js.undefined)
    
    inline def setDnsEntriesVarargs(value: DnsEntry*): Self = StObject.set(x, "DnsEntries", js.Array(value*))
    
    inline def setDnsOptions(value: DnsOptions): Self = StObject.set(x, "DnsOptions", value.asInstanceOf[js.Any])
    
    inline def setDnsOptionsUndefined: Self = StObject.set(x, "DnsOptions", js.undefined)
    
    inline def setGroups(value: GroupIdentifierSet): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: SecurityGroupIdentifier*): Self = StObject.set(x, "Groups", js.Array(value*))
    
    inline def setIpAddressType(value: IpAddressType): Self = StObject.set(x, "IpAddressType", value.asInstanceOf[js.Any])
    
    inline def setIpAddressTypeUndefined: Self = StObject.set(x, "IpAddressType", js.undefined)
    
    inline def setLastError(value: LastError): Self = StObject.set(x, "LastError", value.asInstanceOf[js.Any])
    
    inline def setLastErrorUndefined: Self = StObject.set(x, "LastError", js.undefined)
    
    inline def setNetworkInterfaceIds(value: ValueStringList): Self = StObject.set(x, "NetworkInterfaceIds", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdsUndefined: Self = StObject.set(x, "NetworkInterfaceIds", js.undefined)
    
    inline def setNetworkInterfaceIdsVarargs(value: String*): Self = StObject.set(x, "NetworkInterfaceIds", js.Array(value*))
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setPolicyDocument(value: String): Self = StObject.set(x, "PolicyDocument", value.asInstanceOf[js.Any])
    
    inline def setPolicyDocumentUndefined: Self = StObject.set(x, "PolicyDocument", js.undefined)
    
    inline def setPrivateDnsEnabled(value: Boolean): Self = StObject.set(x, "PrivateDnsEnabled", value.asInstanceOf[js.Any])
    
    inline def setPrivateDnsEnabledUndefined: Self = StObject.set(x, "PrivateDnsEnabled", js.undefined)
    
    inline def setRequesterManaged(value: Boolean): Self = StObject.set(x, "RequesterManaged", value.asInstanceOf[js.Any])
    
    inline def setRequesterManagedUndefined: Self = StObject.set(x, "RequesterManaged", js.undefined)
    
    inline def setRouteTableIds(value: ValueStringList): Self = StObject.set(x, "RouteTableIds", value.asInstanceOf[js.Any])
    
    inline def setRouteTableIdsUndefined: Self = StObject.set(x, "RouteTableIds", js.undefined)
    
    inline def setRouteTableIdsVarargs(value: String*): Self = StObject.set(x, "RouteTableIds", js.Array(value*))
    
    inline def setServiceName(value: String): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
    
    inline def setState(value: State): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setSubnetIds(value: ValueStringList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcEndpointId(value: String): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointIdUndefined: Self = StObject.set(x, "VpcEndpointId", js.undefined)
    
    inline def setVpcEndpointType(value: VpcEndpointType): Self = StObject.set(x, "VpcEndpointType", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointTypeUndefined: Self = StObject.set(x, "VpcEndpointType", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
