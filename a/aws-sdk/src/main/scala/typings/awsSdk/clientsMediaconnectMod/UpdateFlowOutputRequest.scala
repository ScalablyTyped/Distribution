package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFlowOutputRequest extends StObject {
  
  /**
    * The range of IP addresses that should be allowed to initiate output requests to this flow. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var CidrAllowList: js.UndefOr[listOfString] = js.undefined
  
  /**
    * A description of the output. This description appears only on the AWS Elemental MediaConnect console and will not be seen by the end user.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * The IP address where you want to send the output.
    */
  var Destination: js.UndefOr[string] = js.undefined
  
  /**
    * The type of key used for the encryption. If no keyType is provided, the service will use the default setting (static-key). Allowable encryption types: static-key.
    */
  var Encryption: js.UndefOr[UpdateEncryption] = js.undefined
  
  /**
    * The flow that is associated with the output that you want to update.
    */
  var FlowArn: string
  
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
    * The ARN of the output that you want to update.
    */
  var OutputArn: string
  
  /**
    * The port to use when content is distributed to this output.
    */
  var Port: js.UndefOr[integer] = js.undefined
  
  /**
    * The protocol to use for the output.
    */
  var Protocol: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.Protocol] = js.undefined
  
  /**
    * The remote ID for the Zixi-pull stream.
    */
  var RemoteId: js.UndefOr[string] = js.undefined
  
  /**
    * The port that the flow uses to send outbound requests to initiate connection with the sender.
    */
  var SenderControlPort: js.UndefOr[integer] = js.undefined
  
  /**
    * The IP address that the flow communicates with to initiate connection with the sender.
    */
  var SenderIpAddress: js.UndefOr[string] = js.undefined
  
  /**
    * The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
    */
  var SmoothingLatency: js.UndefOr[integer] = js.undefined
  
  /**
    * The stream ID that you want to use for this transport. This parameter applies only to Zixi and SRT caller-based streams.
    */
  var StreamId: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the VPC interface attachment to use for this output.
    */
  var VpcInterfaceAttachment: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.VpcInterfaceAttachment] = js.undefined
}
object UpdateFlowOutputRequest {
  
  inline def apply(FlowArn: string, OutputArn: string): UpdateFlowOutputRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], OutputArn = OutputArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowOutputRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFlowOutputRequest] (val x: Self) extends AnyVal {
    
    inline def setCidrAllowList(value: listOfString): Self = StObject.set(x, "CidrAllowList", value.asInstanceOf[js.Any])
    
    inline def setCidrAllowListUndefined: Self = StObject.set(x, "CidrAllowList", js.undefined)
    
    inline def setCidrAllowListVarargs(value: string*): Self = StObject.set(x, "CidrAllowList", js.Array(value*))
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDestination(value: string): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setEncryption(value: UpdateEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setMaxLatency(value: integer): Self = StObject.set(x, "MaxLatency", value.asInstanceOf[js.Any])
    
    inline def setMaxLatencyUndefined: Self = StObject.set(x, "MaxLatency", js.undefined)
    
    inline def setMediaStreamOutputConfigurations(value: listOfMediaStreamOutputConfigurationRequest): Self = StObject.set(x, "MediaStreamOutputConfigurations", value.asInstanceOf[js.Any])
    
    inline def setMediaStreamOutputConfigurationsUndefined: Self = StObject.set(x, "MediaStreamOutputConfigurations", js.undefined)
    
    inline def setMediaStreamOutputConfigurationsVarargs(value: MediaStreamOutputConfigurationRequest*): Self = StObject.set(x, "MediaStreamOutputConfigurations", js.Array(value*))
    
    inline def setMinLatency(value: integer): Self = StObject.set(x, "MinLatency", value.asInstanceOf[js.Any])
    
    inline def setMinLatencyUndefined: Self = StObject.set(x, "MinLatency", js.undefined)
    
    inline def setOutputArn(value: string): Self = StObject.set(x, "OutputArn", value.asInstanceOf[js.Any])
    
    inline def setPort(value: integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setProtocol(value: Protocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setRemoteId(value: string): Self = StObject.set(x, "RemoteId", value.asInstanceOf[js.Any])
    
    inline def setRemoteIdUndefined: Self = StObject.set(x, "RemoteId", js.undefined)
    
    inline def setSenderControlPort(value: integer): Self = StObject.set(x, "SenderControlPort", value.asInstanceOf[js.Any])
    
    inline def setSenderControlPortUndefined: Self = StObject.set(x, "SenderControlPort", js.undefined)
    
    inline def setSenderIpAddress(value: string): Self = StObject.set(x, "SenderIpAddress", value.asInstanceOf[js.Any])
    
    inline def setSenderIpAddressUndefined: Self = StObject.set(x, "SenderIpAddress", js.undefined)
    
    inline def setSmoothingLatency(value: integer): Self = StObject.set(x, "SmoothingLatency", value.asInstanceOf[js.Any])
    
    inline def setSmoothingLatencyUndefined: Self = StObject.set(x, "SmoothingLatency", js.undefined)
    
    inline def setStreamId(value: string): Self = StObject.set(x, "StreamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "StreamId", js.undefined)
    
    inline def setVpcInterfaceAttachment(value: VpcInterfaceAttachment): Self = StObject.set(x, "VpcInterfaceAttachment", value.asInstanceOf[js.Any])
    
    inline def setVpcInterfaceAttachmentUndefined: Self = StObject.set(x, "VpcInterfaceAttachment", js.undefined)
  }
}
