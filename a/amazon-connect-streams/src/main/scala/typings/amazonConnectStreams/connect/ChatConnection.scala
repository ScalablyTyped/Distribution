package typings.amazonConnectStreams.connect

import typings.amazonConnectStreams.connect.MediaType.CHAT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ChatConnection API provides action methods (no event subscriptions) which can be called to manipulate the state of a particular chat connection within a contact.
  * Like contacts, connections come and go.
  * It is good practice not to persist these object or keep them as internal state.
  * If you need to, store the `contactId` and `connectionId` of the connection and make sure that the contact and connection still exist by fetching them in order from the `Agent` API object before calling methods on them.
  */
@js.native
trait ChatConnection extends BaseConnection {
  /** Provides a promise which resolves with the API response from createTransport transportType chat_token for this connection. */
  def getConnectionToken(): js.Promise[ConnectionToken] = js.native
  /**
    * Gets a `Promise` with the media controller associated with this connection.
    * The promise resolves to a `ChatSession` object from `amazon-connect-chatjs` library.
    */
  def getMediaController(): js.Promise[_] = js.native
  /** Get the media info object associated with this connection. */
  def getMediaInfo(): ChatMediaInfo = js.native
  /** Returns the `MediaType` enum value: `"chat"`.  */
  def getMediaType(): CHAT = js.native
}

