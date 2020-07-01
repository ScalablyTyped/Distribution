package typings.ariClient.mod

import typings.ariClient.anon.OperationString
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Playback extends Resource {
  /**
    * ID for this playback operation.
    */
  var id: String = js.native
  /**
    * For media types that support multiple languages, the language requested for playback.
    */
  var language: String = js.native
  /**
    * The URI for the media currently being played back.
    */
  var media_uri: String = js.native
  /**
    * If a list of URIs is being played, the next media URI to be played back.
    */
  var next_media_uri: js.UndefOr[String] = js.native
  /**
    * Current state of the playback operation.
    */
  var state: String = js.native
  /**
    * URI for the channel or bridge to play the media on.
    */
  var target_uri: String = js.native
  /**
    * Control a playback.
    *
    * @param params.operation - Operation to perform on the playback.
    */
  def control(params: OperationString): js.Promise[Unit] = js.native
  /**
    * Control a playback.
    *
    * @param params.operation - Operation to perform on the playback.
    */
  def control(params: OperationString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  /**
    * Get a playbacks details.
    */
  def get(): js.Promise[Playback] = js.native
  /**
    * Get a playbacks details.
    */
  def get(callback: js.Function2[/* err */ Error, /* playback */ this.type, Unit]): Unit = js.native
  /**
    * Stop a playback.
    */
  def stop(): js.Promise[Unit] = js.native
  /**
    * Stop a playback.
    */
  def stop(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

