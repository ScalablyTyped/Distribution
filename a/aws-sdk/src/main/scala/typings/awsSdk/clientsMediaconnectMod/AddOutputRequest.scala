package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddOutputRequest extends StObject {
  
  /**
    * The range of IP addresses that should be allowed to initiate output requests to this flow. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var CidrAllowList: js.UndefOr[listOfString] = js.undefined
  
  /**
    * A description of the output. This description appears only on the AWS Elemental MediaConnect console and will not be seen by the end user.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * The IP address from which video will be sent to output destinations.
    */
  var Destination: js.UndefOr[string] = js.undefined
  
  /**
    * The type of key used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
    */
  var Encryption: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.Encryption] = js.undefined
  
  /**
    * The maximum latency in milliseconds. This parameter applies only to RIST-based, Zixi-based, and Fujitsu-based streams.
    */
  var MaxLatency: js.UndefOr[integer] = js.undefined
  
  /**
    * The media streams that are associated with the output, and the parameters for those associations.
    */
  var MediaStreamOutputConfigurations: js.UndefOr[listOfMediaStreamOutputConfigurationRequest] = js.undefined
  
  /**
    * The minimum latency in milliseconds for SRT-based streams. In streams that use the SRT protocol, this value that you set on your MediaConnect source or output represents the minimal potential latency of that connection. The latency of the stream is set to the highest number between the sender’s minimum latency and the receiver’s minimum latency.
    */
  var MinLatency: js.UndefOr[integer] = js.undefined
  
  /**
    * The name of the output. This value must be unique within the current flow.
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * The port to use when content is distributed to this output.
    */
  var Port: js.UndefOr[integer] = js.undefined
  
  /**
    * The protocol to use for the output.
    */
  var Protocol: typings.awsSdk.clientsMediaconnectMod.Protocol
  
  /**
    * The remote ID for the Zixi-pull output stream.
    */
  var RemoteId: js.UndefOr[string] = js.undefined
  
  /**
    * The port that the flow uses to send outbound requests to initiate connection with the sender.
    */
  var SenderControlPort: js.UndefOr[integer] = js.undefined
  
  /**
    * The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
    */
  var SmoothingLatency: js.UndefOr[integer] = js.undefined
  
  /**
    * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
    */
  var StreamId: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the VPC interface attachment to use for this output.
    */
  var VpcInterfaceAttachment: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.VpcInterfaceAttachment] = js.undefined
}
object AddOutputRequest {
  
  inline def apply(Protocol: Protocol): AddOutputRequest = {
    val __obj = js.Dynamic.literal(Protocol = Protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOutputRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddOutputRequest] (val x: Self) extends AnyVal {
    
    inline def setCidrAllowList(value: listOfString): Self = StObject.set(x, "CidrAllowList", value.asInstanceOf[js.Any])
    
    inline def setCidrAllowListUndefined: Self = StObject.set(x, "CidrAllowList", js.undefined)
    
    inline def setCidrAllowListVarargs(value: string*): Self = StObject.set(x, "CidrAllowList", js.Array(value*))
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDestination(value: string): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setEncryption(value: Encryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    inline def setMaxLatency(value: integer): Self = StObject.set(x, "MaxLatency", value.asInstanceOf[js.Any])
    
    inline def setMaxLatencyUndefined: Self = StObject.set(x, "MaxLatency", js.undefined)
    
    inline def setMediaStreamOutputConfigurations(value: listOfMediaStreamOutputConfigurationRequest): Self = StObject.set(x, "MediaStreamOutputConfigurations", value.asInstanceOf[js.Any])
    
    inline def setMediaStreamOutputConfigurationsUndefined: Self = StObject.set(x, "MediaStreamOutputConfigurations", js.undefined)
    
    inline def setMediaStreamOutputConfigurationsVarargs(value: MediaStreamOutputConfigurationRequest*): Self = StObject.set(x, "MediaStreamOutputConfigurations", js.Array(value*))
    
    inline def setMinLatency(value: integer): Self = StObject.set(x, "MinLatency", value.asInstanceOf[js.Any])
    
    inline def setMinLatencyUndefined: Self = StObject.set(x, "MinLatency", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPort(value: integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setProtocol(value: Protocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setRemoteId(value: string): Self = StObject.set(x, "RemoteId", value.asInstanceOf[js.Any])
    
    inline def setRemoteIdUndefined: Self = StObject.set(x, "RemoteId", js.undefined)
    
    inline def setSenderControlPort(value: integer): Self = StObject.set(x, "SenderControlPort", value.asInstanceOf[js.Any])
    
    inline def setSenderControlPortUndefined: Self = StObject.set(x, "SenderControlPort", js.undefined)
    
    inline def setSmoothingLatency(value: integer): Self = StObject.set(x, "SmoothingLatency", value.asInstanceOf[js.Any])
    
    inline def setSmoothingLatencyUndefined: Self = StObject.set(x, "SmoothingLatency", js.undefined)
    
    inline def setStreamId(value: string): Self = StObject.set(x, "StreamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "StreamId", js.undefined)
    
    inline def setVpcInterfaceAttachment(value: VpcInterfaceAttachment): Self = StObject.set(x, "VpcInterfaceAttachment", value.asInstanceOf[js.Any])
    
    inline def setVpcInterfaceAttachmentUndefined: Self = StObject.set(x, "VpcInterfaceAttachment", js.undefined)
  }
}
