package typings.ariClient.mod

import typings.ariClient.anon.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Playback
  extends StObject
     with Resource {
  
  /**
    * Control a playback.
    *
    * @param params.operation - Operation to perform on the playback.
    */
  def control(params: Operation): js.Promise[Unit] = js.native
  /**
    * Control a playback.
    *
    * @param params.operation - Operation to perform on the playback.
    */
  def control(params: Operation, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Get a playbacks details.
    */
  def get(): js.Promise[Playback] = js.native
  /**
    * Get a playbacks details.
    */
  def get(callback: js.Function2[/* err */ js.Error, /* playback */ this.type, Unit]): Unit = js.native
  
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
    * Stop a playback.
    */
  def stop(): js.Promise[Unit] = js.native
  /**
    * Stop a playback.
    */
  def stop(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * URI for the channel or bridge to play the media on.
    */
  var target_uri: String = js.native
}
