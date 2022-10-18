package typings.ariClient.mod

import typings.ariClient.anon.OperationPlaybackId
import typings.ariClient.anon.PlaybackIdString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Playbacks extends StObject {
  
  /**
    * Control a playback.
    *
    * @param params.playbackId - Playbacks id.
    * @param params.operation - Operation to perform on the playback.
    */
  def control(params: OperationPlaybackId): js.Promise[Unit] = js.native
  /**
    * Control a playback.
    *
    * @param params.playbackId - Playbacks id.
    * @param params.operation - Operation to perform on the playback.
    */
  def control(params: OperationPlaybackId, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Get a playbacks details.
    *
    * @param params.playbackId - Playbacks id.
    */
  def get(params: PlaybackIdString): js.Promise[Playback] = js.native
  /**
    * Get a playbacks details.
    *
    * @param params.playbackId - Playbacks id.
    */
  def get(
    params: PlaybackIdString,
    callback: js.Function2[/* err */ js.Error, /* playback */ Playback, Unit]
  ): Unit = js.native
  
  /**
    * Stop a playback.
    *
    * @param params.playbackId - Playbacks id.
    */
  def stop(params: PlaybackIdString): js.Promise[Unit] = js.native
  /**
    * Stop a playback.
    *
    * @param params.playbackId - Playbacks id.
    */
  def stop(params: PlaybackIdString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}
