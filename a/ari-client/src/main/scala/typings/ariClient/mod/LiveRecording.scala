package typings.ariClient.mod

import typings.ariClient.anon.DestinationRecordingNameString
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveRecording
  extends StObject
     with Resource {
  
  /**
    * Stop a live recording and discard it.
    */
  def cancel(): js.Promise[Unit] = js.native
  /**
    * Stop a live recording and discard it.
    */
  def cancel(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Cause for recording failure if failed.
    */
  var cause: js.UndefOr[String] = js.native
  
  /**
    * Copy a stored recording.
    *
    * @param params.destinationRecordingName - The destination name of the recording.
    */
  def copyStored(params: DestinationRecordingNameString): js.Promise[StoredRecording] = js.native
  /**
    * Copy a stored recording.
    *
    * @param params.destinationRecordingName - The destination name of the recording.
    */
  def copyStored(
    params: DestinationRecordingNameString,
    callback: js.Function2[/* err */ Error, /* storedrecording */ StoredRecording, Unit]
  ): Unit = js.native
  
  /**
    * Delete a stored recording.
    */
  def deleteStored(): js.Promise[Unit] = js.native
  /**
    * Delete a stored recording.
    */
  def deleteStored(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Duration in seconds of the recording.
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * Recording format (wav, gsm, etc.).
    */
  var format: String = js.native
  
  /**
    * List live recordings.
    */
  def getLive(): js.Promise[LiveRecording] = js.native
  /**
    * List live recordings.
    */
  def getLive(callback: js.Function2[/* err */ Error, /* liverecording */ this.type, Unit]): Unit = js.native
  
  /**
    * Get a stored recordings details.
    */
  def getStored(): js.Promise[StoredRecording] = js.native
  /**
    * Get a stored recordings details.
    */
  def getStored(callback: js.Function2[/* err */ Error, /* storedrecording */ StoredRecording, Unit]): Unit = js.native
  
  /**
    * Get the file associated with the stored recording.
    */
  def getStoredFile(): js.Promise[Buffer] = js.native
  /**
    * Get the file associated with the stored recording.
    */
  def getStoredFile(callback: js.Function2[/* err */ Error, /* binary */ Buffer, Unit]): Unit = js.native
  
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
    */
  def mute(): js.Promise[Unit] = js.native
  /**
    * Mute a live recording.
    * Muting a recording suspends silence detection, which will be restarted when the recording is unmuted.
    */
  def mute(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Base name for the recording.
    */
  var name: String = js.native
  
  /**
    * Pause a live recording.
    * Pausing a recording suspends silence detection, which will be restarted when the recording is unpaused. Paused time is not included in the accounting for maxDurationSeconds.
    */
  def pause(): js.Promise[Unit] = js.native
  /**
    * Pause a live recording.
    * Pausing a recording suspends silence detection, which will be restarted when the recording is unpaused. Paused time is not included in the accounting for maxDurationSeconds.
    */
  def pause(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Duration of silence, in seconds, detected in the recording. This is only available if the recording was initiated with a non-zero maxSilenceSeconds.
    */
  var silence_duration: js.UndefOr[Double] = js.native
  
  /**
    * State.
    */
  var state: String = js.native
  
  /**
    * Stop a live recording and store it.
    */
  def stop(): js.Promise[Unit] = js.native
  /**
    * Stop a live recording and store it.
    */
  def stop(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Duration of talking, in seconds, detected in the recording. This is only available if the recording was initiated with a non-zero maxSilenceSeconds.
    */
  var talking_duration: js.UndefOr[Double] = js.native
  
  /**
    * URI for the channel or bridge being recorded.
    */
  var target_uri: String = js.native
  
  /**
    * Unmute a live recording.
    */
  def unmute(): js.Promise[Unit] = js.native
  /**
    * Unmute a live recording.
    */
  def unmute(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Unpause a live recording.
    */
  def unpause(): js.Promise[Unit] = js.native
  /**
    * Unpause a live recording.
    */
  def unpause(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}
