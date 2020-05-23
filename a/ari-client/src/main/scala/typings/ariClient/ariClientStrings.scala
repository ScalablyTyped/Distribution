package typings.ariClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ariClientStrings {
  @js.native
  sealed trait APILoadError extends js.Object
  
  @js.native
  sealed trait ApplicationMoveFailed extends js.Object
  
  @js.native
  sealed trait ApplicationReplaced extends js.Object
  
  @js.native
  sealed trait BridgeAttendedTransfer extends js.Object
  
  @js.native
  sealed trait BridgeBlindTransfer extends js.Object
  
  @js.native
  sealed trait BridgeCreated extends js.Object
  
  @js.native
  sealed trait BridgeDestroyed extends js.Object
  
  @js.native
  sealed trait BridgeMerged extends js.Object
  
  @js.native
  sealed trait BridgeVideoSourceChanged extends js.Object
  
  @js.native
  sealed trait ChannelCallerId extends js.Object
  
  @js.native
  sealed trait ChannelConnectedLine extends js.Object
  
  @js.native
  sealed trait ChannelCreated extends js.Object
  
  @js.native
  sealed trait ChannelDestroyed extends js.Object
  
  @js.native
  sealed trait ChannelDialplan extends js.Object
  
  @js.native
  sealed trait ChannelDtmfReceived extends js.Object
  
  @js.native
  sealed trait ChannelEnteredBridge extends js.Object
  
  @js.native
  sealed trait ChannelHangupRequest extends js.Object
  
  @js.native
  sealed trait ChannelHold extends js.Object
  
  @js.native
  sealed trait ChannelLeftBridge extends js.Object
  
  @js.native
  sealed trait ChannelStateChange extends js.Object
  
  @js.native
  sealed trait ChannelTalkingFinished extends js.Object
  
  @js.native
  sealed trait ChannelTalkingStarted extends js.Object
  
  @js.native
  sealed trait ChannelUnhold extends js.Object
  
  @js.native
  sealed trait ChannelUserevent extends js.Object
  
  @js.native
  sealed trait ChannelVarset extends js.Object
  
  @js.native
  sealed trait ContactInfo extends js.Object
  
  @js.native
  sealed trait ContactStatusChange extends js.Object
  
  @js.native
  sealed trait DeviceStateChanged extends js.Object
  
  @js.native
  sealed trait Dial extends js.Object
  
  @js.native
  sealed trait EndpointStateChange extends js.Object
  
  @js.native
  sealed trait Event extends js.Object
  
  @js.native
  sealed trait Events extends js.Object
  
  @js.native
  sealed trait Message extends js.Object
  
  @js.native
  sealed trait MissingParams extends js.Object
  
  @js.native
  sealed trait Peer extends js.Object
  
  @js.native
  sealed trait PeerStatusChange extends js.Object
  
  @js.native
  sealed trait PlaybackContinuing extends js.Object
  
  @js.native
  sealed trait PlaybackFinished extends js.Object
  
  @js.native
  sealed trait PlaybackStarted extends js.Object
  
  @js.native
  sealed trait RecordingFailed extends js.Object
  
  @js.native
  sealed trait RecordingFinished extends js.Object
  
  @js.native
  sealed trait RecordingStarted extends js.Object
  
  @js.native
  sealed trait StasisEnd extends js.Object
  
  @js.native
  sealed trait StasisStart extends js.Object
  
  @js.native
  sealed trait TextMessageReceived extends js.Object
  
  @scala.inline
  def APILoadError: APILoadError = "APILoadError".asInstanceOf[APILoadError]
  @scala.inline
  def ApplicationMoveFailed: ApplicationMoveFailed = "ApplicationMoveFailed".asInstanceOf[ApplicationMoveFailed]
  @scala.inline
  def ApplicationReplaced: ApplicationReplaced = "ApplicationReplaced".asInstanceOf[ApplicationReplaced]
  @scala.inline
  def BridgeAttendedTransfer: BridgeAttendedTransfer = "BridgeAttendedTransfer".asInstanceOf[BridgeAttendedTransfer]
  @scala.inline
  def BridgeBlindTransfer: BridgeBlindTransfer = "BridgeBlindTransfer".asInstanceOf[BridgeBlindTransfer]
  @scala.inline
  def BridgeCreated: BridgeCreated = "BridgeCreated".asInstanceOf[BridgeCreated]
  @scala.inline
  def BridgeDestroyed: BridgeDestroyed = "BridgeDestroyed".asInstanceOf[BridgeDestroyed]
  @scala.inline
  def BridgeMerged: BridgeMerged = "BridgeMerged".asInstanceOf[BridgeMerged]
  @scala.inline
  def BridgeVideoSourceChanged: BridgeVideoSourceChanged = "BridgeVideoSourceChanged".asInstanceOf[BridgeVideoSourceChanged]
  @scala.inline
  def ChannelCallerId: ChannelCallerId = "ChannelCallerId".asInstanceOf[ChannelCallerId]
  @scala.inline
  def ChannelConnectedLine: ChannelConnectedLine = "ChannelConnectedLine".asInstanceOf[ChannelConnectedLine]
  @scala.inline
  def ChannelCreated: ChannelCreated = "ChannelCreated".asInstanceOf[ChannelCreated]
  @scala.inline
  def ChannelDestroyed: ChannelDestroyed = "ChannelDestroyed".asInstanceOf[ChannelDestroyed]
  @scala.inline
  def ChannelDialplan: ChannelDialplan = "ChannelDialplan".asInstanceOf[ChannelDialplan]
  @scala.inline
  def ChannelDtmfReceived: ChannelDtmfReceived = "ChannelDtmfReceived".asInstanceOf[ChannelDtmfReceived]
  @scala.inline
  def ChannelEnteredBridge: ChannelEnteredBridge = "ChannelEnteredBridge".asInstanceOf[ChannelEnteredBridge]
  @scala.inline
  def ChannelHangupRequest: ChannelHangupRequest = "ChannelHangupRequest".asInstanceOf[ChannelHangupRequest]
  @scala.inline
  def ChannelHold: ChannelHold = "ChannelHold".asInstanceOf[ChannelHold]
  @scala.inline
  def ChannelLeftBridge: ChannelLeftBridge = "ChannelLeftBridge".asInstanceOf[ChannelLeftBridge]
  @scala.inline
  def ChannelStateChange: ChannelStateChange = "ChannelStateChange".asInstanceOf[ChannelStateChange]
  @scala.inline
  def ChannelTalkingFinished: ChannelTalkingFinished = "ChannelTalkingFinished".asInstanceOf[ChannelTalkingFinished]
  @scala.inline
  def ChannelTalkingStarted: ChannelTalkingStarted = "ChannelTalkingStarted".asInstanceOf[ChannelTalkingStarted]
  @scala.inline
  def ChannelUnhold: ChannelUnhold = "ChannelUnhold".asInstanceOf[ChannelUnhold]
  @scala.inline
  def ChannelUserevent: ChannelUserevent = "ChannelUserevent".asInstanceOf[ChannelUserevent]
  @scala.inline
  def ChannelVarset: ChannelVarset = "ChannelVarset".asInstanceOf[ChannelVarset]
  @scala.inline
  def ContactInfo: ContactInfo = "ContactInfo".asInstanceOf[ContactInfo]
  @scala.inline
  def ContactStatusChange: ContactStatusChange = "ContactStatusChange".asInstanceOf[ContactStatusChange]
  @scala.inline
  def DeviceStateChanged: DeviceStateChanged = "DeviceStateChanged".asInstanceOf[DeviceStateChanged]
  @scala.inline
  def Dial: Dial = "Dial".asInstanceOf[Dial]
  @scala.inline
  def EndpointStateChange: EndpointStateChange = "EndpointStateChange".asInstanceOf[EndpointStateChange]
  @scala.inline
  def Event: Event = "Event".asInstanceOf[Event]
  @scala.inline
  def Events: Events = "Events".asInstanceOf[Events]
  @scala.inline
  def Message: Message = "Message".asInstanceOf[Message]
  @scala.inline
  def MissingParams: MissingParams = "MissingParams".asInstanceOf[MissingParams]
  @scala.inline
  def Peer: Peer = "Peer".asInstanceOf[Peer]
  @scala.inline
  def PeerStatusChange: PeerStatusChange = "PeerStatusChange".asInstanceOf[PeerStatusChange]
  @scala.inline
  def PlaybackContinuing: PlaybackContinuing = "PlaybackContinuing".asInstanceOf[PlaybackContinuing]
  @scala.inline
  def PlaybackFinished: PlaybackFinished = "PlaybackFinished".asInstanceOf[PlaybackFinished]
  @scala.inline
  def PlaybackStarted: PlaybackStarted = "PlaybackStarted".asInstanceOf[PlaybackStarted]
  @scala.inline
  def RecordingFailed: RecordingFailed = "RecordingFailed".asInstanceOf[RecordingFailed]
  @scala.inline
  def RecordingFinished: RecordingFinished = "RecordingFinished".asInstanceOf[RecordingFinished]
  @scala.inline
  def RecordingStarted: RecordingStarted = "RecordingStarted".asInstanceOf[RecordingStarted]
  @scala.inline
  def StasisEnd: StasisEnd = "StasisEnd".asInstanceOf[StasisEnd]
  @scala.inline
  def StasisStart: StasisStart = "StasisStart".asInstanceOf[StasisStart]
  @scala.inline
  def TextMessageReceived: TextMessageReceived = "TextMessageReceived".asInstanceOf[TextMessageReceived]
}

