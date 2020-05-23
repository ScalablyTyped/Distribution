package typings.ariClient.mod

import typings.ariClient.anon.ChannelIdString
import typings.ariClient.anon.Format
import typings.ariClient.anon.MohClassString
import typings.ariClient.anon.Mute
import typings.ariClient.anon.Offsetms
import typings.ariClient.anon.PlaybackId
import typings.ariClient.anon.Type
import typings.ariClient.anon.`1`
import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bridge extends Resource {
  var bridge_class: String = js.native
  var bridge_type: String = js.native
  var channels: String | js.Array[String] = js.native
  var creationtime: Date = js.native
  var creator: String = js.native
  /* Properties */
  var id: String = js.native
  var name: String = js.native
  var technology: String = js.native
  var video_mode: js.UndefOr[String] = js.native
  var video_source_id: js.UndefOr[String] = js.native
  def addChannel(params: Mute): js.Promise[Unit] = js.native
  def addChannel(params: Mute, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def clearVideoSource(): js.Promise[Unit] = js.native
  def clearVideoSource(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def create(): js.Promise[Bridge] = js.native
  def create(callback: js.Function2[/* err */ Error, /* bridge */ this.type, Unit]): Unit = js.native
  def create(params: Type): js.Promise[Bridge] = js.native
  def create(params: Type, callback: js.Function2[/* err */ Error, /* bridge */ this.type, Unit]): Unit = js.native
  def createWithId(): js.Promise[Bridge] = js.native
  def createWithId(callback: js.Function2[/* err */ Error, /* bridge */ this.type, Unit]): Unit = js.native
  def createWithId(params: Type): js.Promise[Bridge] = js.native
  def createWithId(params: Type, callback: js.Function2[/* err */ Error, /* bridge */ this.type, Unit]): Unit = js.native
  def destroy(): js.Promise[Unit] = js.native
  def destroy(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def get(): js.Promise[Bridge] = js.native
  def get(callback: js.Function2[/* err */ Error, /* bridge */ this.type, Unit]): Unit = js.native
  def list(): js.Promise[js.Array[Bridge]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ Error, /* bridges */ js.Array[this.type], Unit]): Unit = js.native
  def play(params: Offsetms): js.Promise[Playback] = js.native
  def play(params: Offsetms, callback: js.Function2[/* err */ Error, /* playback */ Playback, Unit]): Unit = js.native
  def playWithId(params: PlaybackId): js.Promise[Playback] = js.native
  def playWithId(params: PlaybackId, callback: js.Function2[/* err */ Error, /* playback */ Playback, Unit]): Unit = js.native
  def record(params: Format, recording: LiveRecording): js.Promise[LiveRecording] = js.native
  def record(
    params: Format,
    recording: LiveRecording,
    callback: js.Function2[/* err */ Error, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  def removeChannel(params: `1`): js.Promise[Unit] = js.native
  def removeChannel(params: `1`, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def setVideoSource(params: ChannelIdString): js.Promise[Unit] = js.native
  def setVideoSource(params: ChannelIdString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def startMoh(): js.Promise[Unit] = js.native
  def startMoh(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def startMoh(params: MohClassString): js.Promise[Unit] = js.native
  def startMoh(params: MohClassString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def stopMoh(): js.Promise[Unit] = js.native
  def stopMoh(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

