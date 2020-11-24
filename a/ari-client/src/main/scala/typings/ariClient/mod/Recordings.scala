package typings.ariClient.mod

import typings.ariClient.anon.DestinationRecordingName
import typings.ariClient.anon.RecordingName
import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Recordings extends js.Object {
  
  /**
    * Stop a live recording and discard it.
    *
    * @param params.recordingName - The name of the recording.
    */
  def cancel(params: RecordingName): js.Promise[Unit] = js.native
  /**
    * Stop a live recording and discard it.
    *
    * @param params.recordingName - The name of the recording.
    */
  def cancel(params: RecordingName, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Copy a stored recording.
    *
    * @param params.recordingName - The name of the recording to copy.
    * @param params.destinationRecordingName - The destination name of the recording.
    */
  def copyStored(params: DestinationRecordingName): js.Promise[StoredRecording] = js.native
  /**
    * Copy a stored recording.
    *
    * @param params.recordingName - The name of the recording to copy.
    * @param params.destinationRecordingName - The destination name of the recording.
    */
  def copyStored(
    params: DestinationRecordingName,
    callback: js.Function2[/* err */ Error, /* storedrecording */ StoredRecording, Unit]
  ): Unit = js.native
  
  /**
    * Delete a stored recording.
    *
    * @param params.recordingName - The name of the recording.
    */
  def deleteStored(params: RecordingName): js.Promise[Unit] = js.native
  /**
    * Delete a stored recording.
    *
    * @param params.recordingName - The name of the recording.
    */
  def deleteStored(params: RecordingName, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * List live recordings.
    *
    * @param params.recordingName - The name of the recording.
    */
  def getLive(params: RecordingName): js.Promise[LiveRecording] = js.native
  /**
    * List live recordings.
    *
    * @param params.recordingName - The name of the recording.
    */
  def getLive(
    params: RecordingName,
    callback: js.Function2[/* err */ Error, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  
  /**
    * Get a stored recordings details.
    *
    * @param params.recordingName - The name of the recording.
    */
  def getStored(params: RecordingName): js.Promise[StoredRecording] = js.native
  /**
    * Get a stored recordings details.
    *
    * @param params.recordingName - The name of the recording.
    */
  def getStored(
    params: RecordingName,
    callback: js.Function2[/* err */ Error, /* storedrecording */ StoredRecording, Unit]
  ): Unit = js.native
  
  /**
    * Get the file associated with the stored recording.
    *
    * @param params.recordingName - The name of the recording.
    */
  def getStoredFile(params: RecordingName): js.Promise[Buffer] = js.native
  /**
    * Get the file associated with the stored recording.
    *
    * @param params.recordingName - The name of the recording.
    */
  def getStoredFile(params: RecordingName, callback: js.Function2[/* err */ Error, /* binary */ Buffer, Unit]): Unit = js.native
  
  /**
    * List recordings that are complete.
    */
  def listStored(): js.Promise[js.Array[StoredRecording]] = js.native
  /**
    * List recordings that are complete.
    */
  def listStored(callback: js.Function2[/* err */ Error, /* storedrecordings */ js.Array[StoredRecording], Unit]): Unit = js.native
  
  /**
    * Mute a live recording.
    * Muting a recording suspends silence detection, which will be restarted when the recording is unmuted.
    *
    * @param params.recordingName - The name of the recording.
    */
  def mute(params: RecordingName): js.Promise[Unit] = js.native
  /**
    * Mute a live recording.
    * Muting a recording suspends silence detection, which will be restarted when the recording is unmuted.
    *
    * @param params.recordingName - The name of the recording.
    */
  def mute(params: RecordingName, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Pause a live recording.
    * Pausing a recording suspends silence detection, which will be restarted when the recording is unpaused. Paused time is not included in the accounting for maxDurationSeconds.
    *
    * @param params.recordingName - The name of the recording.
    */
  def pause(params: RecordingName): js.Promise[Unit] = js.native
  /**
    * Pause a live recording.
    * Pausing a recording suspends silence detection, which will be restarted when the recording is unpaused. Paused time is not included in the accounting for maxDurationSeconds.
    *
    * @param params.recordingName - The name of the recording.
    */
  def pause(params: RecordingName, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Stop a live recording and store it.
    *
    * @param params.recordingName - The name of the recording.
    */
  def stop(params: RecordingName): js.Promise[Unit] = js.native
  /**
    * Stop a live recording and store it.
    *
    * @param params.recordingName - The name of the recording.
    */
  def stop(params: RecordingName, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Unmute a live recording.
    *
    * @param params.recordingName - The name of the recording.
    */
  def unmute(params: RecordingName): js.Promise[Unit] = js.native
  /**
    * Unmute a live recording.
    *
    * @param params.recordingName - The name of the recording.
    */
  def unmute(params: RecordingName, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Unpause a live recording.
    *
    * @param params.recordingName - The name of the recording.
    */
  def unpause(params: RecordingName): js.Promise[Unit] = js.native
  /**
    * Unpause a live recording.
    *
    * @param params.recordingName - The name of the recording.
    */
  def unpause(params: RecordingName, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}
