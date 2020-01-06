package typings.awsDashSdk.clientsKinesisvideosignalingchannelsMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped 'TURN' | string */ @js.native
trait KinesisVideoSignalingChannels extends js.Object {
  var config: ConfigBase with ClientConfiguration = js.native
  /**
    * Gets the Interactive Connectivity Establishment (ICE) server configuration information, including URIs, username, and password which can be used to configure the WebRTC connection. The ICE component uses this configuration information to setup the WebRTC connection, including authenticating with the Traversal Using Relays around NAT (TURN) relay server.  TURN is a protocol that is used to improve the connectivity of peer-to-peer applications. By providing a cloud-based relay service, TURN ensures that a connection can be established even when one or more peers are incapable of a direct peer-to-peer connection. For more information, see A REST API For Access To TURN Services.  You can invoke this API to establish a fallback mechanism in case either of the peers is unable to establish a direct peer-to-peer connection over a signaling channel. You must specify either a signaling channel ARN or the client ID in order to invoke this API.
    */
  def getIceServerConfig(): Request[GetIceServerConfigResponse, AWSError] = js.native
  def getIceServerConfig(callback: js.Function2[/* err */ AWSError, /* data */ GetIceServerConfigResponse, Unit]): Request[GetIceServerConfigResponse, AWSError] = js.native
  /**
    * Gets the Interactive Connectivity Establishment (ICE) server configuration information, including URIs, username, and password which can be used to configure the WebRTC connection. The ICE component uses this configuration information to setup the WebRTC connection, including authenticating with the Traversal Using Relays around NAT (TURN) relay server.  TURN is a protocol that is used to improve the connectivity of peer-to-peer applications. By providing a cloud-based relay service, TURN ensures that a connection can be established even when one or more peers are incapable of a direct peer-to-peer connection. For more information, see A REST API For Access To TURN Services.  You can invoke this API to establish a fallback mechanism in case either of the peers is unable to establish a direct peer-to-peer connection over a signaling channel. You must specify either a signaling channel ARN or the client ID in order to invoke this API.
    */
  def getIceServerConfig(params: GetIceServerConfigRequest): Request[GetIceServerConfigResponse, AWSError] = js.native
  def getIceServerConfig(
    params: GetIceServerConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIceServerConfigResponse, Unit]
  ): Request[GetIceServerConfigResponse, AWSError] = js.native
  /**
    * This API allows you to connect WebRTC-enabled devices with Alexa display devices. When invoked, it sends the Alexa Session Description Protocol (SDP) offer to the master peer. The offer is delivered as soon as the master is connected to the specified signaling channel. This API returns the SDP answer from the connected master. If the master is not connected to the signaling channel, redelivery requests are made until the message expires.
    */
  def sendAlexaOfferToMaster(): Request[SendAlexaOfferToMasterResponse, AWSError] = js.native
  def sendAlexaOfferToMaster(callback: js.Function2[/* err */ AWSError, /* data */ SendAlexaOfferToMasterResponse, Unit]): Request[SendAlexaOfferToMasterResponse, AWSError] = js.native
  /**
    * This API allows you to connect WebRTC-enabled devices with Alexa display devices. When invoked, it sends the Alexa Session Description Protocol (SDP) offer to the master peer. The offer is delivered as soon as the master is connected to the specified signaling channel. This API returns the SDP answer from the connected master. If the master is not connected to the signaling channel, redelivery requests are made until the message expires.
    */
  def sendAlexaOfferToMaster(params: SendAlexaOfferToMasterRequest): Request[SendAlexaOfferToMasterResponse, AWSError] = js.native
  def sendAlexaOfferToMaster(
    params: SendAlexaOfferToMasterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendAlexaOfferToMasterResponse, Unit]
  ): Request[SendAlexaOfferToMasterResponse, AWSError] = js.native
}

