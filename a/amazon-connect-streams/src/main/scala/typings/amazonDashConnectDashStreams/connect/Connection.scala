package typings.amazonDashConnectDashStreams.connect

import typings.amazonDashConnectDashStreams.amazonDashConnectDashStreamsStrings.inbound
import typings.amazonDashConnectDashStreams.amazonDashConnectDashStreamsStrings.monitoring
import typings.amazonDashConnectDashStreams.amazonDashConnectDashStreamsStrings.outbound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  /**
    * Ends the connection.
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def destroy(successFailOptions: SuccessFailOptions): Unit
  /**
    * Gets the unique connectionId for this connection.
    */
  def getConnectionId(): String
  /**
    * Gets the unique contactId of the contact to which this connection belongs.
    */
  def getContactId(): String
  /**
    * Gets the endpoint to which this connection is connected.
    */
  def getEndpoint(): Endpoint
  /**
    * Gets the ConnectionState object for this connection.
    */
  def getState(): ConnectionState
  /**
    * Get the duration of the connection state, in milliseconds, relative to local time.
    */
  def getStateDuration(): Double
  /**
    * Get the type of connection.
    */
  def getType(): inbound | outbound | monitoring
  /**
    * Put this connection on hold.
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def hold(successFailOptions: SuccessFailOptions): Unit
  /**
    * Determine if the contact is active.
    */
  def isActive(): Boolean
  /**
    * Determine if the connection is connected, meaning that the agent is live in a
    * conversation through this connection.
    */
  def isConnected(): Boolean
  /**
    * Determine whether the connection is in the process of connecting.
    */
  def isConnecting(): Boolean
  /**
    * Determine if the connection is the contact's initial connection.
    */
  def isInitialConnection(): Boolean
  /**
    * Determine whether the connection is on hold.
    */
  def isOnHold(): Boolean
  /**
    * Resume this connection if it was on hold.
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def resume(successFailOptions: SuccessFailOptions): Unit
  /**
    * Send a digit or string of digits through this connection.
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def sendDigits(options: SendDigitOptions): Unit
}

object Connection {
  @scala.inline
  def apply(
    destroy: SuccessFailOptions => Unit,
    getConnectionId: () => String,
    getContactId: () => String,
    getEndpoint: () => Endpoint,
    getState: () => ConnectionState,
    getStateDuration: () => Double,
    getType: () => inbound | outbound | monitoring,
    hold: SuccessFailOptions => Unit,
    isActive: () => Boolean,
    isConnected: () => Boolean,
    isConnecting: () => Boolean,
    isInitialConnection: () => Boolean,
    isOnHold: () => Boolean,
    resume: SuccessFailOptions => Unit,
    sendDigits: SendDigitOptions => Unit
  ): Connection = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction1(destroy), getConnectionId = js.Any.fromFunction0(getConnectionId), getContactId = js.Any.fromFunction0(getContactId), getEndpoint = js.Any.fromFunction0(getEndpoint), getState = js.Any.fromFunction0(getState), getStateDuration = js.Any.fromFunction0(getStateDuration), getType = js.Any.fromFunction0(getType), hold = js.Any.fromFunction1(hold), isActive = js.Any.fromFunction0(isActive), isConnected = js.Any.fromFunction0(isConnected), isConnecting = js.Any.fromFunction0(isConnecting), isInitialConnection = js.Any.fromFunction0(isInitialConnection), isOnHold = js.Any.fromFunction0(isOnHold), resume = js.Any.fromFunction1(resume), sendDigits = js.Any.fromFunction1(sendDigits))
  
    __obj.asInstanceOf[Connection]
  }
}

