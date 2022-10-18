package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetAttributes extends StObject {
  
  /**
    * The ID of the agent that is installed on the EC2 instance where the finding is generated.
    */
  var agentId: js.UndefOr[AgentId] = js.undefined
  
  /**
    * The ID of the Amazon Machine Image (AMI) that is installed on the EC2 instance where the finding is generated.
    */
  var amiId: js.UndefOr[AmiId] = js.undefined
  
  /**
    * The Auto Scaling group of the EC2 instance where the finding is generated.
    */
  var autoScalingGroup: js.UndefOr[AutoScalingGroup] = js.undefined
  
  /**
    * The hostname of the EC2 instance where the finding is generated.
    */
  var hostname: js.UndefOr[Hostname] = js.undefined
  
  /**
    * The list of IP v4 addresses of the EC2 instance where the finding is generated.
    */
  var ipv4Addresses: js.UndefOr[Ipv4AddressList] = js.undefined
  
  /**
    * An array of the network interfaces interacting with the EC2 instance where the finding is generated.
    */
  var networkInterfaces: js.UndefOr[NetworkInterfaces] = js.undefined
  
  /**
    * The schema version of this data type.
    */
  var schemaVersion: NumericVersion
  
  /**
    * The tags related to the EC2 instance where the finding is generated.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object AssetAttributes {
  
  inline def apply(schemaVersion: NumericVersion): AssetAttributes = {
    val __obj = js.Dynamic.literal(schemaVersion = schemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetAttributes]
  }
  
  extension [Self <: AssetAttributes](x: Self) {
    
    inline def setAgentId(value: AgentId): Self = StObject.set(x, "agentId", value.asInstanceOf[js.Any])
    
    inline def setAgentIdUndefined: Self = StObject.set(x, "agentId", js.undefined)
    
    inline def setAmiId(value: AmiId): Self = StObject.set(x, "amiId", value.asInstanceOf[js.Any])
    
    inline def setAmiIdUndefined: Self = StObject.set(x, "amiId", js.undefined)
    
    inline def setAutoScalingGroup(value: AutoScalingGroup): Self = StObject.set(x, "autoScalingGroup", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingGroupUndefined: Self = StObject.set(x, "autoScalingGroup", js.undefined)
    
    inline def setHostname(value: Hostname): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setIpv4Addresses(value: Ipv4AddressList): Self = StObject.set(x, "ipv4Addresses", value.asInstanceOf[js.Any])
    
    inline def setIpv4AddressesUndefined: Self = StObject.set(x, "ipv4Addresses", js.undefined)
    
    inline def setIpv4AddressesVarargs(value: Ipv4Address*): Self = StObject.set(x, "ipv4Addresses", js.Array(value*))
    
    inline def setNetworkInterfaces(value: NetworkInterfaces): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
    
    inline def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = StObject.set(x, "networkInterfaces", js.Array(value*))
    
    inline def setSchemaVersion(value: NumericVersion): Self = StObject.set(x, "schemaVersion", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
