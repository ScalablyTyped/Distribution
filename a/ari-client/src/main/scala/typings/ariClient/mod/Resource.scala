package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resource extends js.Object {
  def addListener(
    event: ApplicationMoveFailedEventType,
    callback: js.Function2[/* event */ ApplicationMoveFailed, /* channel */ Channel, Unit]
  ): Unit = js.native
  def addListener(event: ApplicationReplacedEventType, callback: js.Function1[/* event */ Event, Unit]): Unit = js.native
  def addListener(
    event: BridgeAttendedTransferEventType,
    callback: js.Function2[/* event */ BridgeAttendedTransfer, /* instances */ BridgeAttendedTransfer, Unit]
  ): Unit = js.native
  def addListener(
    event: BridgeBlindTransferEventType,
    callback: js.Function2[/* event */ BridgeBlindTransfer, /* instances */ BridgeBlindTransfer, Unit]
  ): Unit = js.native
  def addListener(
    event: BridgeCreatedEventType,
    callback: js.Function2[/* event */ BridgeCreated, /* bridge */ Bridge, Unit]
  ): Unit = js.native
  def addListener(
    event: BridgeDestroyedEventType,
    callback: js.Function2[/* event */ BridgeDestroyed, /* bridge */ Bridge, Unit]
  ): Unit = js.native
  def addListener(
    event: BridgeMergedEventType,
    callback: js.Function2[/* event */ BridgeMerged, /* bridge */ Bridge, Unit]
  ): Unit = js.native
  def addListener(
    event: BridgeVideoSourceChangedEventType,
    callback: js.Function2[/* event */ BridgeVideoSourceChanged, /* bridge */ Bridge, Unit]
  ): Unit = js.native
  def addListener(
    event: ChannelCallerIdEventType,
    callback: js.Function2[/* event */ ChannelCallerId, /* channel */ Channel, Unit]
  ): Unit = js.native
  def addListener(
    event: ChannelConnectedLineEventType,
    callback: js.Function2[/* event */ ChannelConnectedLine, /* channel */ Channel, Unit]
  ): Unit = js.native
  def addListener(
    event: ChannelCreatedEventType,
    callback: js.Function2[/* event */ ChannelCreated, /* channel */ Channel, Unit]
  ): Unit = js.native
  def addListener(
    event: ChannelDestroyedEventType,
    callback: js.Function2[/* event */ ChannelDestroyed, /* channel */ Channel, Unit]
  ): Unit = js.native
  def addListener(
    event: ChannelDialplanEventType,
    callback: js.Function2[/* event */ ChannelDialplan, /* channel */ Channel, Unit]
  ): Unit = js.native
  def addListener(
    event: ChannelDtmfReceivedEventType,
    callback: js.Function2[/* event */ ChannelDtmfReceived, /* channel */ Channel, Unit]
  ): Unit = js.native
  def addListener(
    event: ChannelEnteredBridgeEventType,
    callback: js.Function2[/* event */ ChannelEnteredBridge, /* instances */ ChannelEnteredBridge, Unit]
  ): Unit = js.native
  def addListener(
    event: ChannelHangupRequestEventType,
    callback: js.Function2[/* event */ ChannelHangupRequest, /* channel */ Channel, Unit]
  ): Unit = js.native
  def addListener(
    event: ChannelHoldEventType,
    callback: js.Function2[/* event */ ChannelHold, /* channel */ Channel, Unit]
  ): Unit = js.native
  def addListener(
    event: ChannelLeftBridgeEventType,
    callback: js.Function2[/* event */ ChannelLeftBridge, /* instances */ ChannelLeftBridge, Unit]
  ): Unit = js.native
  def addListener(
    event: ChannelStateChangeEventType,
    callback: js.Function2[/* event */ ChannelStateChange, /* channel */ Channel, Unit]
  ): Unit = js.native
  def addListener(
    event: ChannelTalkingFinishedEventType,
    callback: js.Function2[/* event */ ChannelTalkingFinished, /* channel */ Channel, Unit]
  ): Unit = js.native
  def addListener(
    event: ChannelTalkingStartedEventType,
    callback: js.Function2[/* event */ ChannelTalkingStarted, /* channel */ Channel, Unit]
  ): Unit = js.native
  def addListener(
    event: ChannelUnholdEventType,
    callback: js.Function2[/* event */ ChannelUnhold, /* channel */ Channel, Unit]
  ): Unit = js.native
  def addListener(
    event: ChannelUsereventEventType,
    callback: js.Function2[/* event */ ChannelUserevent, /* instances */ ChannelUserevent, Unit]
  ): Unit = js.native
  def addListener(
    event: ChannelVarsetEventType,
    callback: js.Function2[/* event */ ChannelVarset, /* channel */ Channel, Unit]
  ): Unit = js.native
  def addListener(
    event: ContactInfoEventType,
    callback: js.Function2[/* event */ ContactInfo, /* instances */ ContactInfo, Unit]
  ): Unit = js.native
  def addListener(
    event: ContactStatusChangeEventType,
    callback: js.Function2[/* event */ ContactStatusChange, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  def addListener(
    event: DeviceStateChangedEventType,
    callback: js.Function2[/* event */ DeviceStateChanged, /* devicestate */ DeviceState, Unit]
  ): Unit = js.native
  def addListener(event: DialEventType, callback: js.Function2[/* event */ Dial, /* channel */ Channel, Unit]): Unit = js.native
  def addListener(
    event: EndpointStateChangeEventType,
    callback: js.Function2[/* event */ EndpointStateChange, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  def addListener(event: EventEventType, callback: js.Function2[/* event */ Event, /* instances */ Event, Unit]): Unit = js.native
  def addListener(
    event: MessageEventType,
    callback: js.Function2[/* event */ Message, /* instances */ Message, Unit]
  ): Unit = js.native
  def addListener(
    event: MissingParamsEventType,
    callback: js.Function2[/* event */ MissingParams, /* instances */ MissingParams, Unit]
  ): Unit = js.native
  def addListener(event: PeerEventType, callback: js.Function2[/* event */ Peer, /* instances */ Peer, Unit]): Unit = js.native
  def addListener(
    event: PeerStatusChangeEventType,
    callback: js.Function2[/* event */ PeerStatusChange, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  def addListener(
    event: PlaybackContinuingEventType,
    callback: js.Function2[/* event */ PlaybackContinuing, /* playback */ Playback, Unit]
  ): Unit = js.native
  def addListener(
    event: PlaybackFinishedEventType,
    callback: js.Function2[/* event */ PlaybackFinished, /* playback */ Playback, Unit]
  ): Unit = js.native
  def addListener(
    event: PlaybackStartedEventType,
    callback: js.Function2[/* event */ PlaybackStarted, /* playback */ Playback, Unit]
  ): Unit = js.native
  def addListener(
    event: RecordingFailedEventType,
    callback: js.Function2[/* event */ RecordingFailed, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  def addListener(
    event: RecordingFinishedEventType,
    callback: js.Function2[/* event */ RecordingFinished, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  def addListener(
    event: RecordingStartedEventType,
    callback: js.Function2[/* event */ RecordingStarted, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  def addListener(
    event: StasisEndEventType,
    callback: js.Function2[/* event */ StasisEnd, /* channel */ Channel, Unit]
  ): Unit = js.native
  def addListener(
    event: StasisStartEventType,
    callback: js.Function2[/* event */ StasisStart, /* channel */ Channel, Unit]
  ): Unit = js.native
  def addListener(
    event: TextMessageReceivedEventType,
    callback: js.Function2[/* event */ TextMessageReceived, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  def on(
    event: ApplicationMoveFailedEventType,
    callback: js.Function2[/* event */ ApplicationMoveFailed, /* channel */ Channel, Unit]
  ): Unit = js.native
  def on(event: ApplicationReplacedEventType, callback: js.Function1[/* event */ Event, Unit]): Unit = js.native
  def on(
    event: BridgeAttendedTransferEventType,
    callback: js.Function2[/* event */ BridgeAttendedTransfer, /* instances */ BridgeAttendedTransfer, Unit]
  ): Unit = js.native
  def on(
    event: BridgeBlindTransferEventType,
    callback: js.Function2[/* event */ BridgeBlindTransfer, /* instances */ BridgeBlindTransfer, Unit]
  ): Unit = js.native
  def on(
    event: BridgeCreatedEventType,
    callback: js.Function2[/* event */ BridgeCreated, /* bridge */ Bridge, Unit]
  ): Unit = js.native
  def on(
    event: BridgeDestroyedEventType,
    callback: js.Function2[/* event */ BridgeDestroyed, /* bridge */ Bridge, Unit]
  ): Unit = js.native
  def on(
    event: BridgeMergedEventType,
    callback: js.Function2[/* event */ BridgeMerged, /* bridge */ Bridge, Unit]
  ): Unit = js.native
  def on(
    event: BridgeVideoSourceChangedEventType,
    callback: js.Function2[/* event */ BridgeVideoSourceChanged, /* bridge */ Bridge, Unit]
  ): Unit = js.native
  def on(
    event: ChannelCallerIdEventType,
    callback: js.Function2[/* event */ ChannelCallerId, /* channel */ Channel, Unit]
  ): Unit = js.native
  def on(
    event: ChannelConnectedLineEventType,
    callback: js.Function2[/* event */ ChannelConnectedLine, /* channel */ Channel, Unit]
  ): Unit = js.native
  def on(
    event: ChannelCreatedEventType,
    callback: js.Function2[/* event */ ChannelCreated, /* channel */ Channel, Unit]
  ): Unit = js.native
  def on(
    event: ChannelDestroyedEventType,
    callback: js.Function2[/* event */ ChannelDestroyed, /* channel */ Channel, Unit]
  ): Unit = js.native
  def on(
    event: ChannelDialplanEventType,
    callback: js.Function2[/* event */ ChannelDialplan, /* channel */ Channel, Unit]
  ): Unit = js.native
  def on(
    event: ChannelDtmfReceivedEventType,
    callback: js.Function2[/* event */ ChannelDtmfReceived, /* channel */ Channel, Unit]
  ): Unit = js.native
  def on(
    event: ChannelEnteredBridgeEventType,
    callback: js.Function2[/* event */ ChannelEnteredBridge, /* instances */ ChannelEnteredBridge, Unit]
  ): Unit = js.native
  def on(
    event: ChannelHangupRequestEventType,
    callback: js.Function2[/* event */ ChannelHangupRequest, /* channel */ Channel, Unit]
  ): Unit = js.native
  def on(
    event: ChannelHoldEventType,
    callback: js.Function2[/* event */ ChannelHold, /* channel */ Channel, Unit]
  ): Unit = js.native
  def on(
    event: ChannelLeftBridgeEventType,
    callback: js.Function2[/* event */ ChannelLeftBridge, /* instances */ ChannelLeftBridge, Unit]
  ): Unit = js.native
  def on(
    event: ChannelStateChangeEventType,
    callback: js.Function2[/* event */ ChannelStateChange, /* channel */ Channel, Unit]
  ): Unit = js.native
  def on(
    event: ChannelTalkingFinishedEventType,
    callback: js.Function2[/* event */ ChannelTalkingFinished, /* channel */ Channel, Unit]
  ): Unit = js.native
  def on(
    event: ChannelTalkingStartedEventType,
    callback: js.Function2[/* event */ ChannelTalkingStarted, /* channel */ Channel, Unit]
  ): Unit = js.native
  def on(
    event: ChannelUnholdEventType,
    callback: js.Function2[/* event */ ChannelUnhold, /* channel */ Channel, Unit]
  ): Unit = js.native
  def on(
    event: ChannelUsereventEventType,
    callback: js.Function2[/* event */ ChannelUserevent, /* instances */ ChannelUserevent, Unit]
  ): Unit = js.native
  def on(
    event: ChannelVarsetEventType,
    callback: js.Function2[/* event */ ChannelVarset, /* channel */ Channel, Unit]
  ): Unit = js.native
  def on(
    event: ContactInfoEventType,
    callback: js.Function2[/* event */ ContactInfo, /* instances */ ContactInfo, Unit]
  ): Unit = js.native
  def on(
    event: ContactStatusChangeEventType,
    callback: js.Function2[/* event */ ContactStatusChange, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  def on(
    event: DeviceStateChangedEventType,
    callback: js.Function2[/* event */ DeviceStateChanged, /* devicestate */ DeviceState, Unit]
  ): Unit = js.native
  def on(event: DialEventType, callback: js.Function2[/* event */ Dial, /* channel */ Channel, Unit]): Unit = js.native
  def on(
    event: EndpointStateChangeEventType,
    callback: js.Function2[/* event */ EndpointStateChange, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  def on(event: EventEventType, callback: js.Function2[/* event */ Event, /* instances */ Event, Unit]): Unit = js.native
  def on(
    event: MessageEventType,
    callback: js.Function2[/* event */ Message, /* instances */ Message, Unit]
  ): Unit = js.native
  def on(
    event: MissingParamsEventType,
    callback: js.Function2[/* event */ MissingParams, /* instances */ MissingParams, Unit]
  ): Unit = js.native
  def on(event: PeerEventType, callback: js.Function2[/* event */ Peer, /* instances */ Peer, Unit]): Unit = js.native
  def on(
    event: PeerStatusChangeEventType,
    callback: js.Function2[/* event */ PeerStatusChange, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  def on(
    event: PlaybackContinuingEventType,
    callback: js.Function2[/* event */ PlaybackContinuing, /* playback */ Playback, Unit]
  ): Unit = js.native
  def on(
    event: PlaybackFinishedEventType,
    callback: js.Function2[/* event */ PlaybackFinished, /* playback */ Playback, Unit]
  ): Unit = js.native
  def on(
    event: PlaybackStartedEventType,
    callback: js.Function2[/* event */ PlaybackStarted, /* playback */ Playback, Unit]
  ): Unit = js.native
  def on(
    event: RecordingFailedEventType,
    callback: js.Function2[/* event */ RecordingFailed, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  def on(
    event: RecordingFinishedEventType,
    callback: js.Function2[/* event */ RecordingFinished, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  def on(
    event: RecordingStartedEventType,
    callback: js.Function2[/* event */ RecordingStarted, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  def on(
    event: StasisEndEventType,
    callback: js.Function2[/* event */ StasisEnd, /* channel */ Channel, Unit]
  ): Unit = js.native
  def on(
    event: StasisStartEventType,
    callback: js.Function2[/* event */ StasisStart, /* channel */ Channel, Unit]
  ): Unit = js.native
  def on(
    event: TextMessageReceivedEventType,
    callback: js.Function2[/* event */ TextMessageReceived, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  def once(
    event: ApplicationMoveFailedEventType,
    callback: js.Function2[/* event */ ApplicationMoveFailed, /* channel */ Channel, Unit]
  ): Unit = js.native
  def once(event: ApplicationReplacedEventType, callback: js.Function1[/* event */ Event, Unit]): Unit = js.native
  def once(
    event: BridgeAttendedTransferEventType,
    callback: js.Function2[/* event */ BridgeAttendedTransfer, /* instances */ BridgeAttendedTransfer, Unit]
  ): Unit = js.native
  def once(
    event: BridgeBlindTransferEventType,
    callback: js.Function2[/* event */ BridgeBlindTransfer, /* instances */ BridgeBlindTransfer, Unit]
  ): Unit = js.native
  def once(
    event: BridgeCreatedEventType,
    callback: js.Function2[/* event */ BridgeCreated, /* bridge */ Bridge, Unit]
  ): Unit = js.native
  def once(
    event: BridgeDestroyedEventType,
    callback: js.Function2[/* event */ BridgeDestroyed, /* bridge */ Bridge, Unit]
  ): Unit = js.native
  def once(
    event: BridgeMergedEventType,
    callback: js.Function2[/* event */ BridgeMerged, /* bridge */ Bridge, Unit]
  ): Unit = js.native
  def once(
    event: BridgeVideoSourceChangedEventType,
    callback: js.Function2[/* event */ BridgeVideoSourceChanged, /* bridge */ Bridge, Unit]
  ): Unit = js.native
  def once(
    event: ChannelCallerIdEventType,
    callback: js.Function2[/* event */ ChannelCallerId, /* channel */ Channel, Unit]
  ): Unit = js.native
  def once(
    event: ChannelConnectedLineEventType,
    callback: js.Function2[/* event */ ChannelConnectedLine, /* channel */ Channel, Unit]
  ): Unit = js.native
  def once(
    event: ChannelCreatedEventType,
    callback: js.Function2[/* event */ ChannelCreated, /* channel */ Channel, Unit]
  ): Unit = js.native
  def once(
    event: ChannelDestroyedEventType,
    callback: js.Function2[/* event */ ChannelDestroyed, /* channel */ Channel, Unit]
  ): Unit = js.native
  def once(
    event: ChannelDialplanEventType,
    callback: js.Function2[/* event */ ChannelDialplan, /* channel */ Channel, Unit]
  ): Unit = js.native
  def once(
    event: ChannelDtmfReceivedEventType,
    callback: js.Function2[/* event */ ChannelDtmfReceived, /* channel */ Channel, Unit]
  ): Unit = js.native
  def once(
    event: ChannelEnteredBridgeEventType,
    callback: js.Function2[/* event */ ChannelEnteredBridge, /* instances */ ChannelEnteredBridge, Unit]
  ): Unit = js.native
  def once(
    event: ChannelHangupRequestEventType,
    callback: js.Function2[/* event */ ChannelHangupRequest, /* channel */ Channel, Unit]
  ): Unit = js.native
  def once(
    event: ChannelHoldEventType,
    callback: js.Function2[/* event */ ChannelHold, /* channel */ Channel, Unit]
  ): Unit = js.native
  def once(
    event: ChannelLeftBridgeEventType,
    callback: js.Function2[/* event */ ChannelLeftBridge, /* instances */ ChannelLeftBridge, Unit]
  ): Unit = js.native
  def once(
    event: ChannelStateChangeEventType,
    callback: js.Function2[/* event */ ChannelStateChange, /* channel */ Channel, Unit]
  ): Unit = js.native
  def once(
    event: ChannelTalkingFinishedEventType,
    callback: js.Function2[/* event */ ChannelTalkingFinished, /* channel */ Channel, Unit]
  ): Unit = js.native
  def once(
    event: ChannelTalkingStartedEventType,
    callback: js.Function2[/* event */ ChannelTalkingStarted, /* channel */ Channel, Unit]
  ): Unit = js.native
  def once(
    event: ChannelUnholdEventType,
    callback: js.Function2[/* event */ ChannelUnhold, /* channel */ Channel, Unit]
  ): Unit = js.native
  def once(
    event: ChannelUsereventEventType,
    callback: js.Function2[/* event */ ChannelUserevent, /* instances */ ChannelUserevent, Unit]
  ): Unit = js.native
  def once(
    event: ChannelVarsetEventType,
    callback: js.Function2[/* event */ ChannelVarset, /* channel */ Channel, Unit]
  ): Unit = js.native
  def once(
    event: ContactInfoEventType,
    callback: js.Function2[/* event */ ContactInfo, /* instances */ ContactInfo, Unit]
  ): Unit = js.native
  def once(
    event: ContactStatusChangeEventType,
    callback: js.Function2[/* event */ ContactStatusChange, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  def once(
    event: DeviceStateChangedEventType,
    callback: js.Function2[/* event */ DeviceStateChanged, /* devicestate */ DeviceState, Unit]
  ): Unit = js.native
  def once(event: DialEventType, callback: js.Function2[/* event */ Dial, /* channel */ Channel, Unit]): Unit = js.native
  def once(
    event: EndpointStateChangeEventType,
    callback: js.Function2[/* event */ EndpointStateChange, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  def once(event: EventEventType, callback: js.Function2[/* event */ Event, /* instances */ Event, Unit]): Unit = js.native
  def once(
    event: MessageEventType,
    callback: js.Function2[/* event */ Message, /* instances */ Message, Unit]
  ): Unit = js.native
  def once(
    event: MissingParamsEventType,
    callback: js.Function2[/* event */ MissingParams, /* instances */ MissingParams, Unit]
  ): Unit = js.native
  def once(event: PeerEventType, callback: js.Function2[/* event */ Peer, /* instances */ Peer, Unit]): Unit = js.native
  def once(
    event: PeerStatusChangeEventType,
    callback: js.Function2[/* event */ PeerStatusChange, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  def once(
    event: PlaybackContinuingEventType,
    callback: js.Function2[/* event */ PlaybackContinuing, /* playback */ Playback, Unit]
  ): Unit = js.native
  def once(
    event: PlaybackFinishedEventType,
    callback: js.Function2[/* event */ PlaybackFinished, /* playback */ Playback, Unit]
  ): Unit = js.native
  def once(
    event: PlaybackStartedEventType,
    callback: js.Function2[/* event */ PlaybackStarted, /* playback */ Playback, Unit]
  ): Unit = js.native
  def once(
    event: RecordingFailedEventType,
    callback: js.Function2[/* event */ RecordingFailed, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  def once(
    event: RecordingFinishedEventType,
    callback: js.Function2[/* event */ RecordingFinished, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  def once(
    event: RecordingStartedEventType,
    callback: js.Function2[/* event */ RecordingStarted, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  def once(
    event: StasisEndEventType,
    callback: js.Function2[/* event */ StasisEnd, /* channel */ Channel, Unit]
  ): Unit = js.native
  def once(
    event: StasisStartEventType,
    callback: js.Function2[/* event */ StasisStart, /* channel */ Channel, Unit]
  ): Unit = js.native
  def once(
    event: TextMessageReceivedEventType,
    callback: js.Function2[/* event */ TextMessageReceived, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  def removeAllListeners(): Unit = js.native
  def removeAllListeners(event: AnyEventType): Unit = js.native
  def removeListener(event: AnyEventType, handler: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
}

