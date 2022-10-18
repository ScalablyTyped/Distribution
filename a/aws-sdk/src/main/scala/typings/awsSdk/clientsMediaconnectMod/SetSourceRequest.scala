package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetSourceRequest extends StObject {
  
  /**
    * The type of encryption that is used on the content ingested from this source.
    */
  var Decryption: js.UndefOr[Encryption] = js.undefined
  
  /**
    * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * The ARN of the entitlement that allows you to subscribe to this flow. The entitlement is set by the flow originator, and the ARN is generated as part of the originator's flow.
    */
  var EntitlementArn: js.UndefOr[string] = js.undefined
  
  /**
    * The port that the flow will be listening on for incoming content.
    */
  var IngestPort: js.UndefOr[integer] = js.undefined
  
  /**
    * The smoothing max bitrate for RIST, RTP, and RTP-FEC streams.
    */
  var MaxBitrate: js.UndefOr[integer] = js.undefined
  
  /**
    * The maximum latency in milliseconds. This parameter applies only to RIST-based, Zixi-based, and Fujitsu-based streams.
    */
  var MaxLatency: js.UndefOr[integer] = js.undefined
  
  /**
    * The size of the buffer (in milliseconds) to use to sync incoming source data.
    */
  var MaxSyncBuffer: js.UndefOr[integer] = js.undefined
  
  /**
    * The media streams that are associated with the source, and the parameters for those associations.
    */
  var MediaStreamSourceConfigurations: js.UndefOr[listOfMediaStreamSourceConfigurationRequest] = js.undefined
  
  /**
    * The minimum latency in milliseconds for SRT-based streams. In streams that use the SRT protocol, this value that you set on your MediaConnect source or output represents the minimal potential latency of that connection. The latency of the stream is set to the highest number between the sender’s minimum latency and the receiver’s minimum latency.
    */
  var MinLatency: js.UndefOr[integer] = js.undefined
  
  /**
    * The name of the source.
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * The protocol that is used by the source.
    */
  var Protocol: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.Protocol] = js.undefined
  
  /**
    * The port that the flow uses to send outbound requests to initiate connection with the sender.
    */
  var SenderControlPort: js.UndefOr[integer] = js.undefined
  
  /**
    * The IP address that the flow communicates with to initiate connection with the sender.
    */
  var SenderIpAddress: js.UndefOr[string] = js.undefined
  
  /**
    * Source IP or domain name for SRT-caller protocol.
    */
  var SourceListenerAddress: js.UndefOr[string] = js.undefined
  
  /**
    * Source port for SRT-caller protocol.
    */
  var SourceListenerPort: js.UndefOr[integer] = js.undefined
  
  /**
    * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
    */
  var StreamId: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the VPC interface to use for this source.
    */
  var VpcInterfaceName: js.UndefOr[string] = js.undefined
  
  /**
    * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var WhitelistCidr: js.UndefOr[string] = js.undefined
}
object SetSourceRequest {
  
  inline def apply(): SetSourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetSourceRequest]
  }
  
  extension [Self <: SetSourceRequest](x: Self) {
    
    inline def setDecryption(value: Encryption): Self = StObject.set(x, "Decryption", value.asInstanceOf[js.Any])
    
    inline def setDecryptionUndefined: Self = StObject.set(x, "Decryption", js.undefined)
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEntitlementArn(value: string): Self = StObject.set(x, "EntitlementArn", value.asInstanceOf[js.Any])
    
    inline def setEntitlementArnUndefined: Self = StObject.set(x, "EntitlementArn", js.undefined)
    
    inline def setIngestPort(value: integer): Self = StObject.set(x, "IngestPort", value.asInstanceOf[js.Any])
    
    inline def setIngestPortUndefined: Self = StObject.set(x, "IngestPort", js.undefined)
    
    inline def setMaxBitrate(value: integer): Self = StObject.set(x, "MaxBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaxBitrateUndefined: Self = StObject.set(x, "MaxBitrate", js.undefined)
    
    inline def setMaxLatency(value: integer): Self = StObject.set(x, "MaxLatency", value.asInstanceOf[js.Any])
    
    inline def setMaxLatencyUndefined: Self = StObject.set(x, "MaxLatency", js.undefined)
    
    inline def setMaxSyncBuffer(value: integer): Self = StObject.set(x, "MaxSyncBuffer", value.asInstanceOf[js.Any])
    
    inline def setMaxSyncBufferUndefined: Self = StObject.set(x, "MaxSyncBuffer", js.undefined)
    
    inline def setMediaStreamSourceConfigurations(value: listOfMediaStreamSourceConfigurationRequest): Self = StObject.set(x, "MediaStreamSourceConfigurations", value.asInstanceOf[js.Any])
    
    inline def setMediaStreamSourceConfigurationsUndefined: Self = StObject.set(x, "MediaStreamSourceConfigurations", js.undefined)
    
    inline def setMediaStreamSourceConfigurationsVarargs(value: MediaStreamSourceConfigurationRequest*): Self = StObject.set(x, "MediaStreamSourceConfigurations", js.Array(value*))
    
    inline def setMinLatency(value: integer): Self = StObject.set(x, "MinLatency", value.asInstanceOf[js.Any])
    
    inline def setMinLatencyUndefined: Self = StObject.set(x, "MinLatency", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setProtocol(value: Protocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setSenderControlPort(value: integer): Self = StObject.set(x, "SenderControlPort", value.asInstanceOf[js.Any])
    
    inline def setSenderControlPortUndefined: Self = StObject.set(x, "SenderControlPort", js.undefined)
    
    inline def setSenderIpAddress(value: string): Self = StObject.set(x, "SenderIpAddress", value.asInstanceOf[js.Any])
    
    inline def setSenderIpAddressUndefined: Self = StObject.set(x, "SenderIpAddress", js.undefined)
    
    inline def setSourceListenerAddress(value: string): Self = StObject.set(x, "SourceListenerAddress", value.asInstanceOf[js.Any])
    
    inline def setSourceListenerAddressUndefined: Self = StObject.set(x, "SourceListenerAddress", js.undefined)
    
    inline def setSourceListenerPort(value: integer): Self = StObject.set(x, "SourceListenerPort", value.asInstanceOf[js.Any])
    
    inline def setSourceListenerPortUndefined: Self = StObject.set(x, "SourceListenerPort", js.undefined)
    
    inline def setStreamId(value: string): Self = StObject.set(x, "StreamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "StreamId", js.undefined)
    
    inline def setVpcInterfaceName(value: string): Self = StObject.set(x, "VpcInterfaceName", value.asInstanceOf[js.Any])
    
    inline def setVpcInterfaceNameUndefined: Self = StObject.set(x, "VpcInterfaceName", js.undefined)
    
    inline def setWhitelistCidr(value: string): Self = StObject.set(x, "WhitelistCidr", value.asInstanceOf[js.Any])
    
    inline def setWhitelistCidrUndefined: Self = StObject.set(x, "WhitelistCidr", js.undefined)
  }
}
