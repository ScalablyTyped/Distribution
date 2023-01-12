package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transport extends StObject {
  
  /**
    * The range of IP addresses that should be allowed to initiate output requests to this flow. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var CidrAllowList: js.UndefOr[listOfString] = js.undefined
  
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
    * The minimum latency in milliseconds for SRT-based streams. In streams that use the SRT protocol, this value that you set on your MediaConnect source or output represents the minimal potential latency of that connection. The latency of the stream is set to the highest number between the sender’s minimum latency and the receiver’s minimum latency.
    */
  var MinLatency: js.UndefOr[integer] = js.undefined
  
  /**
    * The protocol that is used by the source or output.
    */
  var Protocol: typings.awsSdk.clientsMediaconnectMod.Protocol
  
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
}
object Transport {
  
  inline def apply(Protocol: Protocol): Transport = {
    val __obj = js.Dynamic.literal(Protocol = Protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transport] (val x: Self) extends AnyVal {
    
    inline def setCidrAllowList(value: listOfString): Self = StObject.set(x, "CidrAllowList", value.asInstanceOf[js.Any])
    
    inline def setCidrAllowListUndefined: Self = StObject.set(x, "CidrAllowList", js.undefined)
    
    inline def setCidrAllowListVarargs(value: string*): Self = StObject.set(x, "CidrAllowList", js.Array(value*))
    
    inline def setMaxBitrate(value: integer): Self = StObject.set(x, "MaxBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaxBitrateUndefined: Self = StObject.set(x, "MaxBitrate", js.undefined)
    
    inline def setMaxLatency(value: integer): Self = StObject.set(x, "MaxLatency", value.asInstanceOf[js.Any])
    
    inline def setMaxLatencyUndefined: Self = StObject.set(x, "MaxLatency", js.undefined)
    
    inline def setMaxSyncBuffer(value: integer): Self = StObject.set(x, "MaxSyncBuffer", value.asInstanceOf[js.Any])
    
    inline def setMaxSyncBufferUndefined: Self = StObject.set(x, "MaxSyncBuffer", js.undefined)
    
    inline def setMinLatency(value: integer): Self = StObject.set(x, "MinLatency", value.asInstanceOf[js.Any])
    
    inline def setMinLatencyUndefined: Self = StObject.set(x, "MinLatency", js.undefined)
    
    inline def setProtocol(value: Protocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setRemoteId(value: string): Self = StObject.set(x, "RemoteId", value.asInstanceOf[js.Any])
    
    inline def setRemoteIdUndefined: Self = StObject.set(x, "RemoteId", js.undefined)
    
    inline def setSenderControlPort(value: integer): Self = StObject.set(x, "SenderControlPort", value.asInstanceOf[js.Any])
    
    inline def setSenderControlPortUndefined: Self = StObject.set(x, "SenderControlPort", js.undefined)
    
    inline def setSenderIpAddress(value: string): Self = StObject.set(x, "SenderIpAddress", value.asInstanceOf[js.Any])
    
    inline def setSenderIpAddressUndefined: Self = StObject.set(x, "SenderIpAddress", js.undefined)
    
    inline def setSmoothingLatency(value: integer): Self = StObject.set(x, "SmoothingLatency", value.asInstanceOf[js.Any])
    
    inline def setSmoothingLatencyUndefined: Self = StObject.set(x, "SmoothingLatency", js.undefined)
    
    inline def setSourceListenerAddress(value: string): Self = StObject.set(x, "SourceListenerAddress", value.asInstanceOf[js.Any])
    
    inline def setSourceListenerAddressUndefined: Self = StObject.set(x, "SourceListenerAddress", js.undefined)
    
    inline def setSourceListenerPort(value: integer): Self = StObject.set(x, "SourceListenerPort", value.asInstanceOf[js.Any])
    
    inline def setSourceListenerPortUndefined: Self = StObject.set(x, "SourceListenerPort", js.undefined)
    
    inline def setStreamId(value: string): Self = StObject.set(x, "StreamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "StreamId", js.undefined)
  }
}
