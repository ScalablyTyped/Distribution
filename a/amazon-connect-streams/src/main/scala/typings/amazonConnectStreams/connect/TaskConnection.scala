package typings.amazonConnectStreams.connect

import typings.amazonConnectStreams.connect.MediaType.TASK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The TaskConnection API provides action methods (no event subscriptions) which can be called to manipulate the state of a particular task connection within a contact.
  * Like contacts, connections come and go.
  * It is good practice not to persist these objects or keep them as internal state.
  * If you need to, store the `contactId` and `connectionId` of the connection and make sure that the contact and connection still exist by fetching them in order from the `Agent` API object before calling methods on them.
  */
@js.native
trait TaskConnection
  extends StObject
     with BaseConnection {
  
  /**
    * Gets a `Promise` with the media controller associated with this connection.
    * The promise resolves to a `ChatSession` object from `amazon-connect-taskjs` library.
    */
  def getMediaController(): js.Promise[Any] = js.native
  
  /** Get the media info object associated with this connection. */
  def getMediaInfo(): TaskMediaInfo = js.native
  
  /** Returns the `MediaType` enum value: `"task"`.  */
  def getMediaType(): TASK = js.native
}
