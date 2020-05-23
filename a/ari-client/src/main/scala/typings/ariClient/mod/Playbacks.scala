package typings.ariClient.mod

import typings.ariClient.anon.Operation
import typings.ariClient.anon.PlaybackIdString
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Playbacks extends js.Object {
  def control(params: Operation): js.Promise[Unit] = js.native
  def control(params: Operation, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def get(params: PlaybackIdString): js.Promise[Playback] = js.native
  /* Methods */
  def get(params: PlaybackIdString, callback: js.Function2[/* err */ Error, /* playback */ Playback, Unit]): Unit = js.native
  def stop(params: PlaybackIdString): js.Promise[Unit] = js.native
  def stop(params: PlaybackIdString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

