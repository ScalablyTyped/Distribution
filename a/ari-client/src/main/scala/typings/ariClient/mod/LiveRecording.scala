package typings.ariClient.mod

import typings.ariClient.anon.DestinationRecordingNameString
import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveRecording extends Resource {
  var cause: js.UndefOr[String] = js.native
  var duration: js.UndefOr[Double] = js.native
  var format: String = js.native
  /* Properties */
  var name: String = js.native
  var silence_duration: js.UndefOr[Double] = js.native
  var state: String = js.native
  var talking_duration: js.UndefOr[Double] = js.native
  var target_uri: String = js.native
  def cancel(): js.Promise[Unit] = js.native
  def cancel(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def copyStored(params: DestinationRecordingNameString): js.Promise[StoredRecording] = js.native
  def copyStored(
    params: DestinationRecordingNameString,
    callback: js.Function2[/* err */ Error, /* storedrecording */ StoredRecording, Unit]
  ): Unit = js.native
  def deleteStored(): js.Promise[Unit] = js.native
  def deleteStored(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def getLive(): js.Promise[LiveRecording] = js.native
  def getLive(callback: js.Function2[/* err */ Error, /* liverecording */ this.type, Unit]): Unit = js.native
  def getStored(): js.Promise[StoredRecording] = js.native
  def getStored(callback: js.Function2[/* err */ Error, /* storedrecording */ StoredRecording, Unit]): Unit = js.native
  def getStoredFile(): js.Promise[Buffer] = js.native
  def getStoredFile(callback: js.Function2[/* err */ Error, /* binary */ Buffer, Unit]): Unit = js.native
  def listStored(): js.Promise[js.Array[StoredRecording]] = js.native
  /* Methods */
  def listStored(callback: js.Function2[/* err */ Error, /* storedrecordings */ js.Array[StoredRecording], Unit]): Unit = js.native
  def mute(): js.Promise[Unit] = js.native
  def mute(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def pause(): js.Promise[Unit] = js.native
  def pause(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def stop(): js.Promise[Unit] = js.native
  def stop(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def unmute(): js.Promise[Unit] = js.native
  def unmute(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def unpause(): js.Promise[Unit] = js.native
  def unpause(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

