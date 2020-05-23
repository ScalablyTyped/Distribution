package typings.ariClient.mod

import typings.ariClient.anon.After
import typings.ariClient.anon.AppAppArgs
import typings.ariClient.anon.AppArgs
import typings.ariClient.anon.Caller
import typings.ariClient.anon.CallerId
import typings.ariClient.anon.ChannelIdEndpoint
import typings.ariClient.anon.ChannelIdLang
import typings.ariClient.anon.ChannelIdMohClass
import typings.ariClient.anon.ChannelIdString
import typings.ariClient.anon.ChannelIdValue
import typings.ariClient.anon.ChannelIdVariable
import typings.ariClient.anon.Connectiontype
import typings.ariClient.anon.Context
import typings.ariClient.anon.Direction
import typings.ariClient.anon.IfExists
import typings.ariClient.anon.Reason
import typings.ariClient.anon.Skipms
import typings.ariClient.anon.SnoopId
import typings.ariClient.anon.Spy
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channels extends js.Object {
  def answer(params: ChannelIdString): js.Promise[Unit] = js.native
  def answer(params: ChannelIdString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def continueInDialplan(params: Context): js.Promise[Unit] = js.native
  def continueInDialplan(params: Context, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def create(params: typings.ariClient.anon.Endpoint): js.Promise[Channel] = js.native
  def create(
    params: typings.ariClient.anon.Endpoint,
    callback: js.Function2[/* err */ Error, /* channel */ Channel, Unit]
  ): Unit = js.native
  def dial(params: Caller): js.Promise[Unit] = js.native
  def dial(params: Caller, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def externalMedia(params: Connectiontype): js.Promise[Channel] = js.native
  def externalMedia(params: Connectiontype, callback: js.Function2[/* err */ Error, /* channel */ Channel, Unit]): Unit = js.native
  def get(params: ChannelIdString): js.Promise[Channel] = js.native
  def get(params: ChannelIdString, callback: js.Function2[/* err */ Error, /* channel */ Channel, Unit]): Unit = js.native
  def getChannelVar(params: ChannelIdVariable): js.Promise[Variable] = js.native
  def getChannelVar(params: ChannelIdVariable, callback: js.Function2[/* err */ Error, /* variable */ Variable, Unit]): Unit = js.native
  def hangup(params: Reason): js.Promise[Unit] = js.native
  def hangup(params: Reason, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def hold(params: ChannelIdString): js.Promise[Unit] = js.native
  def hold(params: ChannelIdString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def list(): js.Promise[js.Array[Channel]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ Error, /* channels */ js.Array[Channel], Unit]): Unit = js.native
  def move(params: AppAppArgs): js.Promise[Unit] = js.native
  def move(params: AppAppArgs, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def mute(params: Direction): js.Promise[Unit] = js.native
  def mute(params: Direction, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def originate(params: AppArgs): js.Promise[Channel] = js.native
  def originate(params: AppArgs, callback: js.Function2[/* err */ Error, /* channel */ Channel, Unit]): Unit = js.native
  def originateWithId(params: CallerId): js.Promise[Channel] = js.native
  def originateWithId(params: CallerId, callback: js.Function2[/* err */ Error, /* channel */ Channel, Unit]): Unit = js.native
  def play(params: Skipms): js.Promise[Playback] = js.native
  def play(params: Skipms, callback: js.Function2[/* err */ Error, /* playback */ Playback, Unit]): Unit = js.native
  def playWithId(params: ChannelIdLang): js.Promise[Playback] = js.native
  def playWithId(params: ChannelIdLang, callback: js.Function2[/* err */ Error, /* playback */ Playback, Unit]): Unit = js.native
  def record(params: IfExists): js.Promise[LiveRecording] = js.native
  def record(params: IfExists, callback: js.Function2[/* err */ Error, /* liverecording */ LiveRecording, Unit]): Unit = js.native
  def redirect(params: ChannelIdEndpoint): js.Promise[Unit] = js.native
  def redirect(params: ChannelIdEndpoint, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def ring(params: ChannelIdString): js.Promise[Unit] = js.native
  def ring(params: ChannelIdString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def ringStop(params: ChannelIdString): js.Promise[Unit] = js.native
  def ringStop(params: ChannelIdString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def rtpstatistics(params: ChannelIdString): js.Promise[RTPstat] = js.native
  def rtpstatistics(params: ChannelIdString, callback: js.Function2[/* err */ Error, /* rtpstat */ RTPstat, Unit]): Unit = js.native
  def sendDTMF(params: After): js.Promise[Unit] = js.native
  def sendDTMF(params: After, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def setChannelVar(params: ChannelIdValue): js.Promise[Unit] = js.native
  def setChannelVar(params: ChannelIdValue, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def snoopChannel(params: SnoopId): js.Promise[Channel] = js.native
  def snoopChannel(params: SnoopId, callback: js.Function2[/* err */ Error, /* channel */ Channel, Unit]): Unit = js.native
  def snoopChannelWithId(params: Spy): js.Promise[Channel] = js.native
  def snoopChannelWithId(params: Spy, callback: js.Function2[/* err */ Error, /* channel */ Channel, Unit]): Unit = js.native
  def startMoh(params: ChannelIdMohClass): js.Promise[Unit] = js.native
  def startMoh(params: ChannelIdMohClass, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def startSilence(params: ChannelIdString): js.Promise[Unit] = js.native
  def startSilence(params: ChannelIdString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def stopMoh(params: ChannelIdString): js.Promise[Unit] = js.native
  def stopMoh(params: ChannelIdString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def stopSilence(params: ChannelIdString): js.Promise[Unit] = js.native
  def stopSilence(params: ChannelIdString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def unhold(params: ChannelIdString): js.Promise[Unit] = js.native
  def unhold(params: ChannelIdString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def unmute(params: Direction): js.Promise[Unit] = js.native
  def unmute(params: Direction, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

