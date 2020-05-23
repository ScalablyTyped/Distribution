package typings.ariClient.mod

import typings.ariClient.anon.AppArgsSnoopId
import typings.ariClient.anon.AppString
import typings.ariClient.anon.Before
import typings.ariClient.anon.DirectionString
import typings.ariClient.anon.Encapsulation
import typings.ariClient.anon.EndpointString
import typings.ariClient.anon.Extension
import typings.ariClient.anon.Format
import typings.ariClient.anon.Formats
import typings.ariClient.anon.Label
import typings.ariClient.anon.MohClassString
import typings.ariClient.anon.Offsetms
import typings.ariClient.anon.PlaybackId
import typings.ariClient.anon.ReasonString
import typings.ariClient.anon.Timeout
import typings.ariClient.anon.Value
import typings.ariClient.anon.Whisper
import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends Resource {
  var accountcode: String = js.native
  var caller: CallerID = js.native
  var channelvars: js.UndefOr[IndexableObject] = js.native
  var connected: CallerID = js.native
  var creationtime: Date = js.native
  var dialplan: DialplanCEP = js.native
  /* Properties */
  var id: String = js.native
  var language: String = js.native
  var name: String = js.native
  var state: String = js.native
  def answer(): js.Promise[Unit] = js.native
  def answer(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def continueInDialplan(): js.Promise[Unit] = js.native
  def continueInDialplan(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def continueInDialplan(params: Label): js.Promise[Unit] = js.native
  def continueInDialplan(params: Label, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def create(params: Formats): js.Promise[Channel] = js.native
  def create(params: Formats, callback: js.Function2[/* err */ Error, /* channel */ this.type, Unit]): Unit = js.native
  def dial(): js.Promise[Unit] = js.native
  def dial(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def dial(params: Timeout): js.Promise[Unit] = js.native
  def dial(params: Timeout, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def externalMedia(params: Encapsulation): js.Promise[Channel] = js.native
  def externalMedia(params: Encapsulation, callback: js.Function2[/* err */ Error, /* channel */ this.type, Unit]): Unit = js.native
  def get(): js.Promise[Channel] = js.native
  def get(callback: js.Function2[/* err */ Error, /* channel */ this.type, Unit]): Unit = js.native
  def getChannelVar(params: typings.ariClient.anon.Variable): js.Promise[Variable] = js.native
  def getChannelVar(
    params: typings.ariClient.anon.Variable,
    callback: js.Function2[/* err */ Error, /* variable */ Variable, Unit]
  ): Unit = js.native
  def hangup(): js.Promise[Unit] = js.native
  def hangup(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def hangup(params: ReasonString): js.Promise[Unit] = js.native
  def hangup(params: ReasonString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def hold(): js.Promise[Unit] = js.native
  def hold(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def list(): js.Promise[js.Array[Channel]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ Error, /* channels */ js.Array[this.type], Unit]): Unit = js.native
  def move(params: AppString): js.Promise[Unit] = js.native
  def move(params: AppString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def mute(): js.Promise[Unit] = js.native
  def mute(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def mute(params: DirectionString): js.Promise[Unit] = js.native
  def mute(params: DirectionString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def originate(params: Extension): js.Promise[Channel] = js.native
  def originate(params: Extension, callback: js.Function2[/* err */ Error, /* channel */ this.type, Unit]): Unit = js.native
  def originateWithId(params: Extension): js.Promise[Channel] = js.native
  def originateWithId(params: Extension, callback: js.Function2[/* err */ Error, /* channel */ this.type, Unit]): Unit = js.native
  def play(params: Offsetms, playback: Playback): js.Promise[Playback] = js.native
  def play(
    params: Offsetms,
    playback: Playback,
    callback: js.Function2[/* err */ Error, /* playback */ Playback, Unit]
  ): Unit = js.native
  def playWithId(params: PlaybackId): js.Promise[Playback] = js.native
  def playWithId(params: PlaybackId, callback: js.Function2[/* err */ Error, /* playback */ Playback, Unit]): Unit = js.native
  def record(params: Format, recording: LiveRecording): js.Promise[LiveRecording] = js.native
  def record(
    params: Format,
    recording: LiveRecording,
    callback: js.Function2[/* err */ Error, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  def redirect(params: EndpointString): js.Promise[Unit] = js.native
  def redirect(params: EndpointString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def ring(): js.Promise[Unit] = js.native
  def ring(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def ringStop(): js.Promise[Unit] = js.native
  def ringStop(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def rtpstatistics(): js.Promise[RTPstat] = js.native
  def rtpstatistics(callback: js.Function2[/* err */ Error, /* rtpstat */ RTPstat, Unit]): Unit = js.native
  def sendDTMF(): js.Promise[Unit] = js.native
  def sendDTMF(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def sendDTMF(params: Before): js.Promise[Unit] = js.native
  def sendDTMF(params: Before, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def setChannelVar(params: Value): js.Promise[Unit] = js.native
  def setChannelVar(params: Value, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def snoopChannel(params: Whisper, snoopChannel: Channel): js.Promise[Channel] = js.native
  def snoopChannel(
    params: Whisper,
    snoopChannel: Channel,
    callback: js.Function2[/* err */ Error, /* channel */ this.type, Unit]
  ): Unit = js.native
  def snoopChannelWithId(params: AppArgsSnoopId): js.Promise[Channel] = js.native
  def snoopChannelWithId(params: AppArgsSnoopId, callback: js.Function2[/* err */ Error, /* channel */ this.type, Unit]): Unit = js.native
  def startMoh(): js.Promise[Unit] = js.native
  def startMoh(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def startMoh(params: MohClassString): js.Promise[Unit] = js.native
  def startMoh(params: MohClassString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def startSilence(): js.Promise[Unit] = js.native
  def startSilence(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def stopMoh(): js.Promise[Unit] = js.native
  def stopMoh(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def stopSilence(): js.Promise[Unit] = js.native
  def stopSilence(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def unhold(): js.Promise[Unit] = js.native
  def unhold(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def unmute(): js.Promise[Unit] = js.native
  def unmute(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def unmute(params: DirectionString): js.Promise[Unit] = js.native
  def unmute(params: DirectionString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

