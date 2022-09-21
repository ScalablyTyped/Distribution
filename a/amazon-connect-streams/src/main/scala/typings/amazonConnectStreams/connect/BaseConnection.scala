package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Connection API provides action methods (no event subscriptions) which can be called to manipulate the state of a particular connection within a contact.
  * Like contacts, connections come and go.
  * It is good practice not to persist these objects or keep them as internal state.
  * If you need to, store the contactId and connectionId of the connection and make sure that the contact and connection still exist by fetching them in order from the Agent API object before calling methods on them.
  */
@js.native
trait BaseConnection extends StObject {
  
  /** The unique connectionId for this connection. */
  val connectionId: String = js.native
  
  /** The unique contactId of the contact to which this connection belongs. */
  val contactId: String = js.native
  
  /**
    * Ends the connection.
    *
    * @param callbacks Success and failure callbacks to determine whether the operation was successful.
    */
  def destroy(): Unit = js.native
  def destroy(callbacks: SuccessFailOptions): Unit = js.native
  
  /** Alias for `getEndpoint()`. */
  def getAddress(): Endpoint = js.native
  
  /** Gets the unique connectionId for this connection. */
  def getConnectionId(): String = js.native
  
  /** Gets the unique contactId of the contact to which this connection belongs. */
  def getContactId(): String = js.native
  
  /** Gets the endpoint to which this connection is connected. */
  def getEndpoint(): Endpoint = js.native
  
  /** Get the currently monitored contact info, or null if that does not exist. */
  def getMonitorInfo(): MonitorInfo | Null = js.native
  
  /** Gets the `ConnectionState` object for this connection. */
  def getState(): ConnectionState = js.native
  
  /**
    * Get the duration of the connection state, in milliseconds, relative to local time.
    * This takes into account time skew between the JS client and the Amazon Connect service.
    */
  def getStateDuration(): Double = js.native
  
  /** Alias for `getState()` */
  def getStatus(): ConnectionState = js.native
  
  /** Alias for `getStateDuration()` */
  def getStatusDuration(): Double = js.native
  
  /** Get the type of connection. */
  def getType(): ConnectionType = js.native
  
  /**
    * Put this connection on hold.
    *
    * @param callbacks Success and failure callbacks to determine whether the operation was successful.
    */
  def hold(): Unit = js.native
  def hold(callbacks: SuccessFailOptions): Unit = js.native
  
  /**
    * Determine if the contact is active.
    * The connection is active it is incoming, connecting, connected, or on hold.
    */
  def isActive(): Boolean = js.native
  
  /** Determine if the connection is connected, meaning that the agent is live in a conversation through this connection. */
  def isConnected(): Boolean = js.native
  
  /** Determine whether the connection is in the process of connecting. */
  def isConnecting(): Boolean = js.native
  
  /** Determine if the connection is the contact's initial connection. */
  def isInitialConnection(): Boolean = js.native
  
  /** Determine whether the connection is on hold. */
  def isOnHold(): Boolean = js.native
  
  /**
    * Resume this connection if it was on hold.
    *
    * @param callbacks Success and failure callbacks to determine whether the operation was successful.
    */
  def resume(): Unit = js.native
  def resume(callbacks: SuccessFailOptions): Unit = js.native
  
  /**
    * Send a digit or string of digits through this connection.
    * This is only valid for contact types that can accept digits, currently this is limited to softphone-enabled voice contacts.
    *
    * @param digits The digits to dial.
    * @param callbacks Success and failure callbacks to determine whether the operation was successful.
    */
  def sendDigits(digits: String): Unit = js.native
  def sendDigits(digits: String, callbacks: SuccessFailOptions): Unit = js.native
}
