package typings.amazonConnectStreams.connect

import typings.amazonConnectStreams.connect.MediaType.SOFTPHONE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The VoiceConnection API provides action methods (no event subscriptions) which can be called to manipulate the state of a particular voice connection within a contact.
  * Like contacts, connections come and go.
  * It is good practice not to persist these object or keep them as internal state.
  * If you need to, store the `contactId` and `connectionId` of the connection and make sure that the contact and connection still exist by fetching them in order from the `Agent` API object before calling methods on them.
  */
@js.native
trait VoiceConnection
  extends StObject
     with BaseConnection {
  
  /** Gets a `Promise` with the media controller associated with this connection. */
  def getMediaController(): js.Promise[js.Any] = js.native
  
  /** Returns the media info object associated with this connection. */
  def getMediaInfo(): VoiceMediaInfo = js.native
  
  /** Returns the `MediaType` enum value: `"softphone"`. */
  def getMediaType(): SOFTPHONE = js.native
}
