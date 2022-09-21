package typings.ariClient.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ariClient.ariClientStrings.APILoadError
import typings.ariClient.ariClientStrings.ApplicationReplaced
import typings.ariClient.ariClientStrings.WebSocketConnected
import typings.ariClient.ariClientStrings.WebSocketMaxRetries
import typings.ariClient.ariClientStrings.WebSocketReconnecting
import typings.ariClient.ariClientStrings.pong
import typings.ariClient.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def connect(baseUrl: String, user: String, pass: String): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(baseUrl.asInstanceOf[js.Any], user.asInstanceOf[js.Any], pass.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
inline def connect(
  baseUrl: String,
  user: String,
  pass: String,
  callback: js.Function2[/* err */ js.Error, /* client */ Client, Unit]
): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(baseUrl.asInstanceOf[js.Any], user.asInstanceOf[js.Any], pass.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]

type APILoadErrorEventType = APILoadError

type AnyEventType = WebSocketConnectedEventType | WebSocketReconnectingEventType | WebSocketMaxRetriesEventType | PongEventType | APILoadErrorEventType | EventsEventType | MessageEventType | MissingParamsEventType | EventEventType | ContactInfoEventType | PeerEventType | DeviceStateChangedEventType | PlaybackStartedEventType | PlaybackContinuingEventType | PlaybackFinishedEventType | RecordingStartedEventType | RecordingFinishedEventType | RecordingFailedEventType | ApplicationMoveFailedEventType | ApplicationReplacedEventType | BridgeCreatedEventType | BridgeDestroyedEventType | BridgeMergedEventType | BridgeVideoSourceChangedEventType | BridgeBlindTransferEventType | BridgeAttendedTransferEventType | ChannelCreatedEventType | ChannelDestroyedEventType | ChannelEnteredBridgeEventType | ChannelLeftBridgeEventType | ChannelStateChangeEventType | ChannelDtmfReceivedEventType | ChannelDialplanEventType | ChannelCallerIdEventType | ChannelUsereventEventType | ChannelHangupRequestEventType | ChannelVarsetEventType | ChannelHoldEventType | ChannelUnholdEventType | ChannelTalkingStartedEventType | ChannelTalkingFinishedEventType | ContactStatusChangeEventType | PeerStatusChangeEventType | EndpointStateChangeEventType | DialEventType | StasisEndEventType | StasisStartEventType | TextMessageReceivedEventType | ChannelConnectedLineEventType

type ApplicationMoveFailedEventType = typings.ariClient.ariClientStrings.ApplicationMoveFailed

type ApplicationReplacedEventType = ApplicationReplaced

type BridgeAttendedTransferEventType = typings.ariClient.ariClientStrings.BridgeAttendedTransfer

type BridgeBlindTransferEventType = typings.ariClient.ariClientStrings.BridgeBlindTransfer

type BridgeCreatedEventType = typings.ariClient.ariClientStrings.BridgeCreated

type BridgeDestroyedEventType = typings.ariClient.ariClientStrings.BridgeDestroyed

type BridgeMergedEventType = typings.ariClient.ariClientStrings.BridgeMerged

type BridgeVideoSourceChangedEventType = typings.ariClient.ariClientStrings.BridgeVideoSourceChanged

type ChannelCallerIdEventType = typings.ariClient.ariClientStrings.ChannelCallerId

type ChannelConnectedLineEventType = typings.ariClient.ariClientStrings.ChannelConnectedLine

type ChannelCreatedEventType = typings.ariClient.ariClientStrings.ChannelCreated

type ChannelDestroyedEventType = typings.ariClient.ariClientStrings.ChannelDestroyed

type ChannelDialplanEventType = typings.ariClient.ariClientStrings.ChannelDialplan

type ChannelDtmfReceivedEventType = typings.ariClient.ariClientStrings.ChannelDtmfReceived

type ChannelEnteredBridgeEventType = typings.ariClient.ariClientStrings.ChannelEnteredBridge

type ChannelHangupRequestEventType = typings.ariClient.ariClientStrings.ChannelHangupRequest

type ChannelHoldEventType = typings.ariClient.ariClientStrings.ChannelHold

type ChannelLeftBridgeEventType = typings.ariClient.ariClientStrings.ChannelLeftBridge

type ChannelStateChangeEventType = typings.ariClient.ariClientStrings.ChannelStateChange

type ChannelTalkingFinishedEventType = typings.ariClient.ariClientStrings.ChannelTalkingFinished

type ChannelTalkingStartedEventType = typings.ariClient.ariClientStrings.ChannelTalkingStarted

type ChannelUnholdEventType = typings.ariClient.ariClientStrings.ChannelUnhold

type ChannelUsereventEventType = typings.ariClient.ariClientStrings.ChannelUserevent

type ChannelVarsetEventType = typings.ariClient.ariClientStrings.ChannelVarset

type ContactInfoEventType = typings.ariClient.ariClientStrings.ContactInfo

type ContactStatusChangeEventType = typings.ariClient.ariClientStrings.ContactStatusChange

type Containers = StringDictionary[Any]

type DeviceStateChangedEventType = typings.ariClient.ariClientStrings.DeviceStateChanged

type DialEventType = typings.ariClient.ariClientStrings.Dial

type EndpointStateChangeEventType = typings.ariClient.ariClientStrings.EndpointStateChange

type EventEventType = typings.ariClient.ariClientStrings.Event

type EventsEventType = typings.ariClient.ariClientStrings.Events

type IndexableObject = StringDictionary[Any]

type MessageEventType = typings.ariClient.ariClientStrings.Message

type MissingParamsEventType = typings.ariClient.ariClientStrings.MissingParams

type PeerEventType = typings.ariClient.ariClientStrings.Peer

type PeerStatusChangeEventType = typings.ariClient.ariClientStrings.PeerStatusChange

type PlaybackContinuingEventType = typings.ariClient.ariClientStrings.PlaybackContinuing

type PlaybackFinishedEventType = typings.ariClient.ariClientStrings.PlaybackFinished

type PlaybackStartedEventType = typings.ariClient.ariClientStrings.PlaybackStarted

type PongEventType = pong

type RecordingFailedEventType = typings.ariClient.ariClientStrings.RecordingFailed

type RecordingFinishedEventType = typings.ariClient.ariClientStrings.RecordingFinished

type RecordingStartedEventType = typings.ariClient.ariClientStrings.RecordingStarted

type StasisEndEventType = typings.ariClient.ariClientStrings.StasisEnd

type StasisStartEventType = typings.ariClient.ariClientStrings.StasisStart

type TextMessageReceivedEventType = typings.ariClient.ariClientStrings.TextMessageReceived

type WebSocketConnectedEventType = WebSocketConnected

type WebSocketMaxRetriesEventType = WebSocketMaxRetries

type WebSocketReconnectingEventType = WebSocketReconnecting
