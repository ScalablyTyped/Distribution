package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connection extends StObject {
  
  /**
    * The Direct Connect endpoint on which the physical connection terminates.
    */
  var awsDevice: js.UndefOr[AwsDevice] = js.undefined
  
  /**
    * The Direct Connect endpoint that terminates the physical connection.
    */
  var awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.undefined
  
  /**
    * The Direct Connect endpoint that terminates the logical connection. This device might be different than the device that terminates the physical connection.
    */
  var awsLogicalDeviceId: js.UndefOr[AwsLogicalDeviceId] = js.undefined
  
  /**
    * The bandwidth of the connection.
    */
  var bandwidth: js.UndefOr[Bandwidth] = js.undefined
  
  /**
    * The ID of the connection.
    */
  var connectionId: js.UndefOr[ConnectionId] = js.undefined
  
  /**
    * The name of the connection.
    */
  var connectionName: js.UndefOr[ConnectionName] = js.undefined
  
  /**
    * The state of the connection. The following are the possible values:    ordering: The initial state of a hosted connection provisioned on an interconnect. The connection stays in the ordering state until the owner of the hosted connection confirms or declines the connection order.    requested: The initial state of a standard connection. The connection stays in the requested state until the Letter of Authorization (LOA) is sent to the customer.    pending: The connection has been approved and is being initialized.    available: The network link is up and the connection is ready for use.    down: The network link is down.    deleting: The connection is being deleted.    deleted: The connection has been deleted.    rejected: A hosted connection in the ordering state enters the rejected state if it is deleted by the customer.    unknown: The state of the connection is not available.  
    */
  var connectionState: js.UndefOr[ConnectionState] = js.undefined
  
  /**
    * The MAC Security (MACsec) connection encryption mode. The valid values are no_encrypt, should_encrypt, and must_encrypt.
    */
  var encryptionMode: js.UndefOr[EncryptionMode] = js.undefined
  
  /**
    * Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
    */
  var hasLogicalRedundancy: js.UndefOr[HasLogicalRedundancy] = js.undefined
  
  /**
    * Indicates whether jumbo frames (9001 MTU) are supported.
    */
  var jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.undefined
  
  /**
    * The ID of the LAG.
    */
  var lagId: js.UndefOr[LagId] = js.undefined
  
  /**
    * The time of the most recent call to DescribeLoa for this connection.
    */
  var loaIssueTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The location of the connection.
    */
  var location: js.UndefOr[LocationCode] = js.undefined
  
  /**
    * Indicates whether the connection supports MAC Security (MACsec).
    */
  var macSecCapable: js.UndefOr[MacSecCapable] = js.undefined
  
  /**
    * The MAC Security (MACsec) security keys associated with the connection.
    */
  var macSecKeys: js.UndefOr[MacSecKeyList] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that owns the connection.
    */
  var ownerAccount: js.UndefOr[OwnerAccount] = js.undefined
  
  /**
    * The name of the Direct Connect service provider associated with the connection.
    */
  var partnerName: js.UndefOr[PartnerName] = js.undefined
  
  /**
    * The MAC Security (MACsec) port link status of the connection. The valid values are Encryption Up, which means that there is an active Connection Key Name, or Encryption Down.
    */
  var portEncryptionStatus: js.UndefOr[PortEncryptionStatus] = js.undefined
  
  /**
    * The name of the service provider associated with the connection.
    */
  var providerName: js.UndefOr[ProviderName] = js.undefined
  
  /**
    * The Amazon Web Services Region where the connection is located.
    */
  var region: js.UndefOr[Region] = js.undefined
  
  /**
    * The tags associated with the connection.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the VLAN.
    */
  var vlan: js.UndefOr[VLAN] = js.undefined
}
object Connection {
  
  inline def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  
  extension [Self <: Connection](x: Self) {
    
    inline def setAwsDevice(value: AwsDevice): Self = StObject.set(x, "awsDevice", value.asInstanceOf[js.Any])
    
    inline def setAwsDeviceUndefined: Self = StObject.set(x, "awsDevice", js.undefined)
    
    inline def setAwsDeviceV2(value: AwsDeviceV2): Self = StObject.set(x, "awsDeviceV2", value.asInstanceOf[js.Any])
    
    inline def setAwsDeviceV2Undefined: Self = StObject.set(x, "awsDeviceV2", js.undefined)
    
    inline def setAwsLogicalDeviceId(value: AwsLogicalDeviceId): Self = StObject.set(x, "awsLogicalDeviceId", value.asInstanceOf[js.Any])
    
    inline def setAwsLogicalDeviceIdUndefined: Self = StObject.set(x, "awsLogicalDeviceId", js.undefined)
    
    inline def setBandwidth(value: Bandwidth): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    inline def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    inline def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
    
    inline def setConnectionName(value: ConnectionName): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
    
    inline def setConnectionNameUndefined: Self = StObject.set(x, "connectionName", js.undefined)
    
    inline def setConnectionState(value: ConnectionState): Self = StObject.set(x, "connectionState", value.asInstanceOf[js.Any])
    
    inline def setConnectionStateUndefined: Self = StObject.set(x, "connectionState", js.undefined)
    
    inline def setEncryptionMode(value: EncryptionMode): Self = StObject.set(x, "encryptionMode", value.asInstanceOf[js.Any])
    
    inline def setEncryptionModeUndefined: Self = StObject.set(x, "encryptionMode", js.undefined)
    
    inline def setHasLogicalRedundancy(value: HasLogicalRedundancy): Self = StObject.set(x, "hasLogicalRedundancy", value.asInstanceOf[js.Any])
    
    inline def setHasLogicalRedundancyUndefined: Self = StObject.set(x, "hasLogicalRedundancy", js.undefined)
    
    inline def setJumboFrameCapable(value: JumboFrameCapable): Self = StObject.set(x, "jumboFrameCapable", value.asInstanceOf[js.Any])
    
    inline def setJumboFrameCapableUndefined: Self = StObject.set(x, "jumboFrameCapable", js.undefined)
    
    inline def setLagId(value: LagId): Self = StObject.set(x, "lagId", value.asInstanceOf[js.Any])
    
    inline def setLagIdUndefined: Self = StObject.set(x, "lagId", js.undefined)
    
    inline def setLoaIssueTime(value: js.Date): Self = StObject.set(x, "loaIssueTime", value.asInstanceOf[js.Any])
    
    inline def setLoaIssueTimeUndefined: Self = StObject.set(x, "loaIssueTime", js.undefined)
    
    inline def setLocation(value: LocationCode): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMacSecCapable(value: MacSecCapable): Self = StObject.set(x, "macSecCapable", value.asInstanceOf[js.Any])
    
    inline def setMacSecCapableUndefined: Self = StObject.set(x, "macSecCapable", js.undefined)
    
    inline def setMacSecKeys(value: MacSecKeyList): Self = StObject.set(x, "macSecKeys", value.asInstanceOf[js.Any])
    
    inline def setMacSecKeysUndefined: Self = StObject.set(x, "macSecKeys", js.undefined)
    
    inline def setMacSecKeysVarargs(value: MacSecKey*): Self = StObject.set(x, "macSecKeys", js.Array(value*))
    
    inline def setOwnerAccount(value: OwnerAccount): Self = StObject.set(x, "ownerAccount", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountUndefined: Self = StObject.set(x, "ownerAccount", js.undefined)
    
    inline def setPartnerName(value: PartnerName): Self = StObject.set(x, "partnerName", value.asInstanceOf[js.Any])
    
    inline def setPartnerNameUndefined: Self = StObject.set(x, "partnerName", js.undefined)
    
    inline def setPortEncryptionStatus(value: PortEncryptionStatus): Self = StObject.set(x, "portEncryptionStatus", value.asInstanceOf[js.Any])
    
    inline def setPortEncryptionStatusUndefined: Self = StObject.set(x, "portEncryptionStatus", js.undefined)
    
    inline def setProviderName(value: ProviderName): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
    
    inline def setProviderNameUndefined: Self = StObject.set(x, "providerName", js.undefined)
    
    inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setVlan(value: VLAN): Self = StObject.set(x, "vlan", value.asInstanceOf[js.Any])
    
    inline def setVlanUndefined: Self = StObject.set(x, "vlan", js.undefined)
  }
}
