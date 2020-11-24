package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resource extends js.Object {
  
  /**
    * Notification that trying to move a channel to another Stasis application failed.
    */
  def addListener(
    event: ApplicationMoveFailedEventType,
    callback: js.Function2[/* event */ ApplicationMoveFailed, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Notification that another WebSocket has taken over for an application. An application may only be subscribed to by a single WebSocket at a time. If multiple WebSockets attempt to subscribe
    * to the same application, the newer WebSocket wins, and the older one receives this event.
    */
  def addListener(event: ApplicationReplacedEventType, callback: js.Function1[/* event */ Event, Unit]): Unit = js.native
  /**
    * Notification that an attended transfer has occurred.
    */
  def addListener(
    event: BridgeAttendedTransferEventType,
    callback: js.Function2[/* event */ BridgeAttendedTransfer, /* instances */ BridgeAttendedTransfer, Unit]
  ): Unit = js.native
  /**
    * Notification that a blind transfer has occurred.
    */
  def addListener(
    event: BridgeBlindTransferEventType,
    callback: js.Function2[/* event */ BridgeBlindTransfer, /* instances */ BridgeBlindTransfer, Unit]
  ): Unit = js.native
  /**
    * Notification that a bridge has been created.
    */
  def addListener(
    event: BridgeCreatedEventType,
    callback: js.Function2[/* event */ BridgeCreated, /* bridge */ Bridge, Unit]
  ): Unit = js.native
  /**
    * Notification that a bridge has been destroyed.
    */
  def addListener(
    event: BridgeDestroyedEventType,
    callback: js.Function2[/* event */ BridgeDestroyed, /* bridge */ Bridge, Unit]
  ): Unit = js.native
  /**
    * Notification that one bridge has merged into another.
    */
  def addListener(
    event: BridgeMergedEventType,
    callback: js.Function2[/* event */ BridgeMerged, /* bridge */ Bridge, Unit]
  ): Unit = js.native
  /**
    * Notification that the source of video in a bridge has changed.
    */
  def addListener(
    event: BridgeVideoSourceChangedEventType,
    callback: js.Function2[/* event */ BridgeVideoSourceChanged, /* bridge */ Bridge, Unit]
  ): Unit = js.native
  /**
    * Channel changed Caller ID.
    */
  def addListener(
    event: ChannelCallerIdEventType,
    callback: js.Function2[/* event */ ChannelCallerId, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Channel changed Connected Line.
    */
  def addListener(
    event: ChannelConnectedLineEventType,
    callback: js.Function2[/* event */ ChannelConnectedLine, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Notification that a channel has been created.
    */
  def addListener(
    event: ChannelCreatedEventType,
    callback: js.Function2[/* event */ ChannelCreated, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Notification that a channel has been destroyed.
    */
  def addListener(
    event: ChannelDestroyedEventType,
    callback: js.Function2[/* event */ ChannelDestroyed, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Channel changed location in the dialplan.
    */
  def addListener(
    event: ChannelDialplanEventType,
    callback: js.Function2[/* event */ ChannelDialplan, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * DTMF received on a channel. This event is sent when the DTMF ends. There is no notification about the start of DTMF.
    */
  def addListener(
    event: ChannelDtmfReceivedEventType,
    callback: js.Function2[/* event */ ChannelDtmfReceived, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Notification that a channel has entered a bridge.
    */
  def addListener(
    event: ChannelEnteredBridgeEventType,
    callback: js.Function2[/* event */ ChannelEnteredBridge, /* instances */ ChannelEnteredBridge, Unit]
  ): Unit = js.native
  /**
    * A hangup was requested on the channel.
    */
  def addListener(
    event: ChannelHangupRequestEventType,
    callback: js.Function2[/* event */ ChannelHangupRequest, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * A channel initiated a media hold.
    */
  def addListener(
    event: ChannelHoldEventType,
    callback: js.Function2[/* event */ ChannelHold, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Notification that a channel has left a bridge.
    */
  def addListener(
    event: ChannelLeftBridgeEventType,
    callback: js.Function2[/* event */ ChannelLeftBridge, /* instances */ ChannelLeftBridge, Unit]
  ): Unit = js.native
  /**
    * Notification of a channels state change.
    */
  def addListener(
    event: ChannelStateChangeEventType,
    callback: js.Function2[/* event */ ChannelStateChange, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Talking is no longer detected on the channel.
    */
  def addListener(
    event: ChannelTalkingFinishedEventType,
    callback: js.Function2[/* event */ ChannelTalkingFinished, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Talking was detected on the channel.
    */
  def addListener(
    event: ChannelTalkingStartedEventType,
    callback: js.Function2[/* event */ ChannelTalkingStarted, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * A channel initiated a media unhold.
    */
  def addListener(
    event: ChannelUnholdEventType,
    callback: js.Function2[/* event */ ChannelUnhold, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * User-generated event with additional user-defined fields in the object.
    */
  def addListener(
    event: ChannelUsereventEventType,
    callback: js.Function2[/* event */ ChannelUserevent, /* instances */ ChannelUserevent, Unit]
  ): Unit = js.native
  /**
    * Channel variable changed.
    */
  def addListener(
    event: ChannelVarsetEventType,
    callback: js.Function2[/* event */ ChannelVarset, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Detailed information about a contact on an endpoint.
    */
  def addListener(
    event: ContactInfoEventType,
    callback: js.Function2[/* event */ ContactInfo, /* instances */ ContactInfo, Unit]
  ): Unit = js.native
  /**
    * The state of a contact on an endpoint has changed.
    */
  def addListener(
    event: ContactStatusChangeEventType,
    callback: js.Function2[/* event */ ContactStatusChange, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  /**
    * Notification that a device state has changed.
    */
  def addListener(
    event: DeviceStateChangedEventType,
    callback: js.Function2[/* event */ DeviceStateChanged, /* devicestate */ DeviceState, Unit]
  ): Unit = js.native
  /**
    * Dialing state has changed.
    */
  def addListener(event: DialEventType, callback: js.Function2[/* event */ Dial, /* channel */ Channel, Unit]): Unit = js.native
  /**
    * Endpoint state changed.
    */
  def addListener(
    event: EndpointStateChangeEventType,
    callback: js.Function2[/* event */ EndpointStateChange, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  /**
    * Base type for asynchronous events from Asterisk.
    */
  def addListener(event: EventEventType, callback: js.Function2[/* event */ Event, /* instances */ Event, Unit]): Unit = js.native
  /**
    * Base type for errors and events.
    */
  def addListener(
    event: MessageEventType,
    callback: js.Function2[/* event */ Message, /* instances */ Message, Unit]
  ): Unit = js.native
  /**
    * Error event sent when required params are missing.
    */
  def addListener(
    event: MissingParamsEventType,
    callback: js.Function2[/* event */ MissingParams, /* instances */ MissingParams, Unit]
  ): Unit = js.native
  /**
    * Detailed information about a remote peer that communicates with Asterisk.
    */
  def addListener(event: PeerEventType, callback: js.Function2[/* event */ Peer, /* instances */ Peer, Unit]): Unit = js.native
  /**
    * The state of a peer associated with an endpoint has changed.
    */
  def addListener(
    event: PeerStatusChangeEventType,
    callback: js.Function2[/* event */ PeerStatusChange, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  /**
    * Event showing the continuation of a media playback operation from one media URI to the next in the list.
    */
  def addListener(
    event: PlaybackContinuingEventType,
    callback: js.Function2[/* event */ PlaybackContinuing, /* playback */ Playback, Unit]
  ): Unit = js.native
  /**
    * Event showing the completion of a media playback operation.
    */
  def addListener(
    event: PlaybackFinishedEventType,
    callback: js.Function2[/* event */ PlaybackFinished, /* playback */ Playback, Unit]
  ): Unit = js.native
  /**
    * Event showing the start of a media playback operation.
    */
  def addListener(
    event: PlaybackStartedEventType,
    callback: js.Function2[/* event */ PlaybackStarted, /* playback */ Playback, Unit]
  ): Unit = js.native
  /**
    * Event showing failure of a recording operation.
    */
  def addListener(
    event: RecordingFailedEventType,
    callback: js.Function2[/* event */ RecordingFailed, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  /**
    * Event showing the completion of a recording operation.
    */
  def addListener(
    event: RecordingFinishedEventType,
    callback: js.Function2[/* event */ RecordingFinished, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  /**
    * Event showing the start of a recording operation.
    */
  def addListener(
    event: RecordingStartedEventType,
    callback: js.Function2[/* event */ RecordingStarted, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  /**
    * Notification that a channel has left a Stasis application.
    */
  def addListener(
    event: StasisEndEventType,
    callback: js.Function2[/* event */ StasisEnd, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Notification that a channel has entered a Stasis application.
    */
  def addListener(
    event: StasisStartEventType,
    callback: js.Function2[/* event */ StasisStart, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * A text message was received from an endpoint.
    */
  def addListener(
    event: TextMessageReceivedEventType,
    callback: js.Function2[/* event */ TextMessageReceived, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  
  /**
    * Notification that trying to move a channel to another Stasis application failed.
    */
  def on(
    event: ApplicationMoveFailedEventType,
    callback: js.Function2[/* event */ ApplicationMoveFailed, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Notification that another WebSocket has taken over for an application. An application may only be subscribed to by a single WebSocket at a time. If multiple WebSockets attempt to subscribe
    * to the same application, the newer WebSocket wins, and the older one receives this event.
    */
  def on(event: ApplicationReplacedEventType, callback: js.Function1[/* event */ Event, Unit]): Unit = js.native
  /**
    * Notification that an attended transfer has occurred.
    */
  def on(
    event: BridgeAttendedTransferEventType,
    callback: js.Function2[/* event */ BridgeAttendedTransfer, /* instances */ BridgeAttendedTransfer, Unit]
  ): Unit = js.native
  /**
    * Notification that a blind transfer has occurred.
    */
  def on(
    event: BridgeBlindTransferEventType,
    callback: js.Function2[/* event */ BridgeBlindTransfer, /* instances */ BridgeBlindTransfer, Unit]
  ): Unit = js.native
  /**
    * Notification that a bridge has been created.
    */
  def on(
    event: BridgeCreatedEventType,
    callback: js.Function2[/* event */ BridgeCreated, /* bridge */ Bridge, Unit]
  ): Unit = js.native
  /**
    * Notification that a bridge has been destroyed.
    */
  def on(
    event: BridgeDestroyedEventType,
    callback: js.Function2[/* event */ BridgeDestroyed, /* bridge */ Bridge, Unit]
  ): Unit = js.native
  /**
    * Notification that one bridge has merged into another.
    */
  def on(
    event: BridgeMergedEventType,
    callback: js.Function2[/* event */ BridgeMerged, /* bridge */ Bridge, Unit]
  ): Unit = js.native
  /**
    * Notification that the source of video in a bridge has changed.
    */
  def on(
    event: BridgeVideoSourceChangedEventType,
    callback: js.Function2[/* event */ BridgeVideoSourceChanged, /* bridge */ Bridge, Unit]
  ): Unit = js.native
  /**
    * Channel changed Caller ID.
    */
  def on(
    event: ChannelCallerIdEventType,
    callback: js.Function2[/* event */ ChannelCallerId, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Channel changed Connected Line.
    */
  def on(
    event: ChannelConnectedLineEventType,
    callback: js.Function2[/* event */ ChannelConnectedLine, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Notification that a channel has been created.
    */
  def on(
    event: ChannelCreatedEventType,
    callback: js.Function2[/* event */ ChannelCreated, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Notification that a channel has been destroyed.
    */
  def on(
    event: ChannelDestroyedEventType,
    callback: js.Function2[/* event */ ChannelDestroyed, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Channel changed location in the dialplan.
    */
  def on(
    event: ChannelDialplanEventType,
    callback: js.Function2[/* event */ ChannelDialplan, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * DTMF received on a channel. This event is sent when the DTMF ends. There is no notification about the start of DTMF.
    */
  def on(
    event: ChannelDtmfReceivedEventType,
    callback: js.Function2[/* event */ ChannelDtmfReceived, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Notification that a channel has entered a bridge.
    */
  def on(
    event: ChannelEnteredBridgeEventType,
    callback: js.Function2[/* event */ ChannelEnteredBridge, /* instances */ ChannelEnteredBridge, Unit]
  ): Unit = js.native
  /**
    * A hangup was requested on the channel.
    */
  def on(
    event: ChannelHangupRequestEventType,
    callback: js.Function2[/* event */ ChannelHangupRequest, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * A channel initiated a media hold.
    */
  def on(
    event: ChannelHoldEventType,
    callback: js.Function2[/* event */ ChannelHold, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Notification that a channel has left a bridge.
    */
  def on(
    event: ChannelLeftBridgeEventType,
    callback: js.Function2[/* event */ ChannelLeftBridge, /* instances */ ChannelLeftBridge, Unit]
  ): Unit = js.native
  /**
    * Notification of a channels state change.
    */
  def on(
    event: ChannelStateChangeEventType,
    callback: js.Function2[/* event */ ChannelStateChange, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Talking is no longer detected on the channel.
    */
  def on(
    event: ChannelTalkingFinishedEventType,
    callback: js.Function2[/* event */ ChannelTalkingFinished, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Talking was detected on the channel.
    */
  def on(
    event: ChannelTalkingStartedEventType,
    callback: js.Function2[/* event */ ChannelTalkingStarted, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * A channel initiated a media unhold.
    */
  def on(
    event: ChannelUnholdEventType,
    callback: js.Function2[/* event */ ChannelUnhold, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * User-generated event with additional user-defined fields in the object.
    */
  def on(
    event: ChannelUsereventEventType,
    callback: js.Function2[/* event */ ChannelUserevent, /* instances */ ChannelUserevent, Unit]
  ): Unit = js.native
  /**
    * Channel variable changed.
    */
  def on(
    event: ChannelVarsetEventType,
    callback: js.Function2[/* event */ ChannelVarset, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Detailed information about a contact on an endpoint.
    */
  def on(
    event: ContactInfoEventType,
    callback: js.Function2[/* event */ ContactInfo, /* instances */ ContactInfo, Unit]
  ): Unit = js.native
  /**
    * The state of a contact on an endpoint has changed.
    */
  def on(
    event: ContactStatusChangeEventType,
    callback: js.Function2[/* event */ ContactStatusChange, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  /**
    * Notification that a device state has changed.
    */
  def on(
    event: DeviceStateChangedEventType,
    callback: js.Function2[/* event */ DeviceStateChanged, /* devicestate */ DeviceState, Unit]
  ): Unit = js.native
  /**
    * Dialing state has changed.
    */
  def on(event: DialEventType, callback: js.Function2[/* event */ Dial, /* channel */ Channel, Unit]): Unit = js.native
  /**
    * Endpoint state changed.
    */
  def on(
    event: EndpointStateChangeEventType,
    callback: js.Function2[/* event */ EndpointStateChange, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  /**
    * Base type for asynchronous events from Asterisk.
    */
  def on(event: EventEventType, callback: js.Function2[/* event */ Event, /* instances */ Event, Unit]): Unit = js.native
  /**
    * Base type for errors and events.
    */
  def on(
    event: MessageEventType,
    callback: js.Function2[/* event */ Message, /* instances */ Message, Unit]
  ): Unit = js.native
  /**
    * Error event sent when required params are missing.
    */
  def on(
    event: MissingParamsEventType,
    callback: js.Function2[/* event */ MissingParams, /* instances */ MissingParams, Unit]
  ): Unit = js.native
  /**
    * Detailed information about a remote peer that communicates with Asterisk.
    */
  def on(event: PeerEventType, callback: js.Function2[/* event */ Peer, /* instances */ Peer, Unit]): Unit = js.native
  /**
    * The state of a peer associated with an endpoint has changed.
    */
  def on(
    event: PeerStatusChangeEventType,
    callback: js.Function2[/* event */ PeerStatusChange, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  /**
    * Event showing the continuation of a media playback operation from one media URI to the next in the list.
    */
  def on(
    event: PlaybackContinuingEventType,
    callback: js.Function2[/* event */ PlaybackContinuing, /* playback */ Playback, Unit]
  ): Unit = js.native
  /**
    * Event showing the completion of a media playback operation.
    */
  def on(
    event: PlaybackFinishedEventType,
    callback: js.Function2[/* event */ PlaybackFinished, /* playback */ Playback, Unit]
  ): Unit = js.native
  /**
    * Event showing the start of a media playback operation.
    */
  def on(
    event: PlaybackStartedEventType,
    callback: js.Function2[/* event */ PlaybackStarted, /* playback */ Playback, Unit]
  ): Unit = js.native
  /**
    * Event showing failure of a recording operation.
    */
  def on(
    event: RecordingFailedEventType,
    callback: js.Function2[/* event */ RecordingFailed, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  /**
    * Event showing the completion of a recording operation.
    */
  def on(
    event: RecordingFinishedEventType,
    callback: js.Function2[/* event */ RecordingFinished, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  /**
    * Event showing the start of a recording operation.
    */
  def on(
    event: RecordingStartedEventType,
    callback: js.Function2[/* event */ RecordingStarted, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  /**
    * Notification that a channel has left a Stasis application.
    */
  def on(
    event: StasisEndEventType,
    callback: js.Function2[/* event */ StasisEnd, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Notification that a channel has entered a Stasis application.
    */
  def on(
    event: StasisStartEventType,
    callback: js.Function2[/* event */ StasisStart, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * A text message was received from an endpoint.
    */
  def on(
    event: TextMessageReceivedEventType,
    callback: js.Function2[/* event */ TextMessageReceived, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  
  /**
    * Notification that trying to move a channel to another Stasis application failed.
    */
  def once(
    event: ApplicationMoveFailedEventType,
    callback: js.Function2[/* event */ ApplicationMoveFailed, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Notification that another WebSocket has taken over for an application. An application may only be subscribed to by a single WebSocket at a time. If multiple WebSockets attempt to subscribe
    * to the same application, the newer WebSocket wins, and the older one receives this event.
    */
  def once(event: ApplicationReplacedEventType, callback: js.Function1[/* event */ Event, Unit]): Unit = js.native
  /**
    * Notification that an attended transfer has occurred.
    */
  def once(
    event: BridgeAttendedTransferEventType,
    callback: js.Function2[/* event */ BridgeAttendedTransfer, /* instances */ BridgeAttendedTransfer, Unit]
  ): Unit = js.native
  /**
    * Notification that a blind transfer has occurred.
    */
  def once(
    event: BridgeBlindTransferEventType,
    callback: js.Function2[/* event */ BridgeBlindTransfer, /* instances */ BridgeBlindTransfer, Unit]
  ): Unit = js.native
  /**
    * Notification that a bridge has been created.
    */
  def once(
    event: BridgeCreatedEventType,
    callback: js.Function2[/* event */ BridgeCreated, /* bridge */ Bridge, Unit]
  ): Unit = js.native
  /**
    * Notification that a bridge has been destroyed.
    */
  def once(
    event: BridgeDestroyedEventType,
    callback: js.Function2[/* event */ BridgeDestroyed, /* bridge */ Bridge, Unit]
  ): Unit = js.native
  /**
    * Notification that one bridge has merged into another.
    */
  def once(
    event: BridgeMergedEventType,
    callback: js.Function2[/* event */ BridgeMerged, /* bridge */ Bridge, Unit]
  ): Unit = js.native
  /**
    * Notification that the source of video in a bridge has changed.
    */
  def once(
    event: BridgeVideoSourceChangedEventType,
    callback: js.Function2[/* event */ BridgeVideoSourceChanged, /* bridge */ Bridge, Unit]
  ): Unit = js.native
  /**
    * Channel changed Caller ID.
    */
  def once(
    event: ChannelCallerIdEventType,
    callback: js.Function2[/* event */ ChannelCallerId, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Channel changed Connected Line.
    */
  def once(
    event: ChannelConnectedLineEventType,
    callback: js.Function2[/* event */ ChannelConnectedLine, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Notification that a channel has been created.
    */
  def once(
    event: ChannelCreatedEventType,
    callback: js.Function2[/* event */ ChannelCreated, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Notification that a channel has been destroyed.
    */
  def once(
    event: ChannelDestroyedEventType,
    callback: js.Function2[/* event */ ChannelDestroyed, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Channel changed location in the dialplan.
    */
  def once(
    event: ChannelDialplanEventType,
    callback: js.Function2[/* event */ ChannelDialplan, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * DTMF received on a channel. This event is sent when the DTMF ends. There is no notification about the start of DTMF.
    */
  def once(
    event: ChannelDtmfReceivedEventType,
    callback: js.Function2[/* event */ ChannelDtmfReceived, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Notification that a channel has entered a bridge.
    */
  def once(
    event: ChannelEnteredBridgeEventType,
    callback: js.Function2[/* event */ ChannelEnteredBridge, /* instances */ ChannelEnteredBridge, Unit]
  ): Unit = js.native
  /**
    * A hangup was requested on the channel.
    */
  def once(
    event: ChannelHangupRequestEventType,
    callback: js.Function2[/* event */ ChannelHangupRequest, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * A channel initiated a media hold.
    */
  def once(
    event: ChannelHoldEventType,
    callback: js.Function2[/* event */ ChannelHold, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Notification that a channel has left a bridge.
    */
  def once(
    event: ChannelLeftBridgeEventType,
    callback: js.Function2[/* event */ ChannelLeftBridge, /* instances */ ChannelLeftBridge, Unit]
  ): Unit = js.native
  /**
    * Notification of a channels state change.
    */
  def once(
    event: ChannelStateChangeEventType,
    callback: js.Function2[/* event */ ChannelStateChange, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Talking is no longer detected on the channel.
    */
  def once(
    event: ChannelTalkingFinishedEventType,
    callback: js.Function2[/* event */ ChannelTalkingFinished, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Talking was detected on the channel.
    */
  def once(
    event: ChannelTalkingStartedEventType,
    callback: js.Function2[/* event */ ChannelTalkingStarted, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * A channel initiated a media unhold.
    */
  def once(
    event: ChannelUnholdEventType,
    callback: js.Function2[/* event */ ChannelUnhold, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * User-generated event with additional user-defined fields in the object.
    */
  def once(
    event: ChannelUsereventEventType,
    callback: js.Function2[/* event */ ChannelUserevent, /* instances */ ChannelUserevent, Unit]
  ): Unit = js.native
  /**
    * Channel variable changed.
    */
  def once(
    event: ChannelVarsetEventType,
    callback: js.Function2[/* event */ ChannelVarset, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Detailed information about a contact on an endpoint.
    */
  def once(
    event: ContactInfoEventType,
    callback: js.Function2[/* event */ ContactInfo, /* instances */ ContactInfo, Unit]
  ): Unit = js.native
  /**
    * The state of a contact on an endpoint has changed.
    */
  def once(
    event: ContactStatusChangeEventType,
    callback: js.Function2[/* event */ ContactStatusChange, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  /**
    * Notification that a device state has changed.
    */
  def once(
    event: DeviceStateChangedEventType,
    callback: js.Function2[/* event */ DeviceStateChanged, /* devicestate */ DeviceState, Unit]
  ): Unit = js.native
  /**
    * Dialing state has changed.
    */
  def once(event: DialEventType, callback: js.Function2[/* event */ Dial, /* channel */ Channel, Unit]): Unit = js.native
  /**
    * Endpoint state changed.
    */
  def once(
    event: EndpointStateChangeEventType,
    callback: js.Function2[/* event */ EndpointStateChange, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  /**
    * Base type for asynchronous events from Asterisk.
    */
  def once(event: EventEventType, callback: js.Function2[/* event */ Event, /* instances */ Event, Unit]): Unit = js.native
  /**
    * Base type for errors and events.
    */
  def once(
    event: MessageEventType,
    callback: js.Function2[/* event */ Message, /* instances */ Message, Unit]
  ): Unit = js.native
  /**
    * Error event sent when required params are missing.
    */
  def once(
    event: MissingParamsEventType,
    callback: js.Function2[/* event */ MissingParams, /* instances */ MissingParams, Unit]
  ): Unit = js.native
  /**
    * Detailed information about a remote peer that communicates with Asterisk.
    */
  def once(event: PeerEventType, callback: js.Function2[/* event */ Peer, /* instances */ Peer, Unit]): Unit = js.native
  /**
    * The state of a peer associated with an endpoint has changed.
    */
  def once(
    event: PeerStatusChangeEventType,
    callback: js.Function2[/* event */ PeerStatusChange, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  /**
    * Event showing the continuation of a media playback operation from one media URI to the next in the list.
    */
  def once(
    event: PlaybackContinuingEventType,
    callback: js.Function2[/* event */ PlaybackContinuing, /* playback */ Playback, Unit]
  ): Unit = js.native
  /**
    * Event showing the completion of a media playback operation.
    */
  def once(
    event: PlaybackFinishedEventType,
    callback: js.Function2[/* event */ PlaybackFinished, /* playback */ Playback, Unit]
  ): Unit = js.native
  /**
    * Event showing the start of a media playback operation.
    */
  def once(
    event: PlaybackStartedEventType,
    callback: js.Function2[/* event */ PlaybackStarted, /* playback */ Playback, Unit]
  ): Unit = js.native
  /**
    * Event showing failure of a recording operation.
    */
  def once(
    event: RecordingFailedEventType,
    callback: js.Function2[/* event */ RecordingFailed, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  /**
    * Event showing the completion of a recording operation.
    */
  def once(
    event: RecordingFinishedEventType,
    callback: js.Function2[/* event */ RecordingFinished, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  /**
    * Event showing the start of a recording operation.
    */
  def once(
    event: RecordingStartedEventType,
    callback: js.Function2[/* event */ RecordingStarted, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  /**
    * Notification that a channel has left a Stasis application.
    */
  def once(
    event: StasisEndEventType,
    callback: js.Function2[/* event */ StasisEnd, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * Notification that a channel has entered a Stasis application.
    */
  def once(
    event: StasisStartEventType,
    callback: js.Function2[/* event */ StasisStart, /* channel */ Channel, Unit]
  ): Unit = js.native
  /**
    * A text message was received from an endpoint.
    */
  def once(
    event: TextMessageReceivedEventType,
    callback: js.Function2[/* event */ TextMessageReceived, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  
  /**
    *  Removes all listeners, or those of the specified event type.
    *  @param [event] - The event type.
    */
  def removeAllListeners(): Unit = js.native
  def removeAllListeners(event: AnyEventType): Unit = js.native
  
  /**
    *  Removes the event listener for the specified event type.
    *  @param event - The event type.
    *  @param handler - The event listener function.
    */
  def removeListener(event: AnyEventType, handler: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
}
