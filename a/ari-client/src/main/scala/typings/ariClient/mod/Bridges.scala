package typings.ariClient.mod

import typings.ariClient.anon.AbsorbDTMF
import typings.ariClient.anon.Beep
import typings.ariClient.anon.BridgeId
import typings.ariClient.anon.BridgeIdString
import typings.ariClient.anon.ChannelId
import typings.ariClient.anon.Lang
import typings.ariClient.anon.Media
import typings.ariClient.anon.MohClass
import typings.ariClient.anon.Name
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bridges extends js.Object {
  def addChannel(params: AbsorbDTMF): js.Promise[Unit] = js.native
  def addChannel(params: AbsorbDTMF, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def clearVideoSource(params: BridgeIdString): js.Promise[Unit] = js.native
  def clearVideoSource(params: BridgeIdString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def create(): js.Promise[Bridge] = js.native
  def create(callback: js.Function2[/* err */ Error, /* bridge */ Bridge, Unit]): Unit = js.native
  def create(params: BridgeId): js.Promise[Bridge] = js.native
  def create(params: BridgeId, callback: js.Function2[/* err */ Error, /* bridge */ Bridge, Unit]): Unit = js.native
  def createWithId(params: Name): js.Promise[Bridge] = js.native
  def createWithId(params: Name, callback: js.Function2[/* err */ Error, /* bridge */ Bridge, Unit]): Unit = js.native
  def destroy(params: BridgeIdString): js.Promise[Unit] = js.native
  def destroy(params: BridgeIdString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def get(params: BridgeIdString): js.Promise[Bridge] = js.native
  def get(params: BridgeIdString, callback: js.Function2[/* err */ Error, /* bridge */ Bridge, Unit]): Unit = js.native
  def list(): js.Promise[js.Array[Bridge]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ Error, /* bridges */ js.Array[Bridge], Unit]): Unit = js.native
  def play(params: Lang): js.Promise[Playback] = js.native
  def play(params: Lang, callback: js.Function2[/* err */ Error, /* playback */ Playback, Unit]): Unit = js.native
  def playWithId(params: Media): js.Promise[Playback] = js.native
  def playWithId(params: Media, callback: js.Function2[/* err */ Error, /* playback */ Playback, Unit]): Unit = js.native
  def record(params: Beep): js.Promise[LiveRecording] = js.native
  def record(params: Beep, callback: js.Function2[/* err */ Error, /* liverecording */ LiveRecording, Unit]): Unit = js.native
  def removeChannel(params: typings.ariClient.anon.Channel): js.Promise[Unit] = js.native
  def removeChannel(params: typings.ariClient.anon.Channel, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def setVideoSource(params: ChannelId): js.Promise[Unit] = js.native
  def setVideoSource(params: ChannelId, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def startMoh(params: MohClass): js.Promise[Unit] = js.native
  def startMoh(params: MohClass, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def stopMoh(params: BridgeIdString): js.Promise[Unit] = js.native
  def stopMoh(params: BridgeIdString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

