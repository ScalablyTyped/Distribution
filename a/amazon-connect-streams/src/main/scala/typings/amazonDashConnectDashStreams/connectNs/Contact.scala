package typings.amazonDashConnectDashStreams.connectNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contact extends js.Object {
  /**
    * Accept an incoming contact.
    *
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def accept(successFailOptions: SuccessFailOptions): Unit
  /**
    * Add a new outbound third-party connection to this contact and connect
    * it to the specified endpoint.
    *
    * @param endpoint The endpoint to add.
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def addConnection(endpoint: Endpoint, successFailOptions: SuccessFailOptions): Unit
  /**
    * Conference together the active connections of the conversation.
    *
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def conferenceConnections(successFailOptions: SuccessFailOptions): Unit
  /**
    * Close the contact and all of its associated connections.
    *
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def destroy(successFailOptions: SuccessFailOptions): Unit
  /**
    * Get the inital connection of the contact, or null if the initial connection
    * is no longer active.
    */
  def getActiveInitialConnection(): Connection
  /**
    * Gets the agent connection. This is the connection that represents the agent's
    * participation in the contact.
    */
  def getAgentConnection(): Connection
  /**
    * Get a map from attribute name to value for each attribute associated with the contact.
    */
  def getAttributes(): StringDictionary[String]
  /**
    * Get a list containing Connection API objects for each connection in the contact.
    */
  def getConnections(): js.Array[Connection]
  /**
    * Get the unique contactId of this contact.
    */
  def getContactId(): String
  /**
    * Get the initial connection of the contact.
    */
  def getInitialConnection(): Connection
  /**
    * Get the original contact id from which this contact was transferred,
    * or none if this is not an internal Connect transfer.
    */
  def getOriginalContactId(): String
  /**
    * Get the queue associated with the contact.
    */
  def getQueue(): Queue
  /**
    * In Voice contacts, there can only be one active third-party connection.
    * This method returns the single active third-party connection, or null if
    * there are no currently active third-party connections.
    */
  def getSingleActiveThirdPartyConnection(): Connection
  /**
    * Get a ContactState object representing the state of the contact.
    */
  def getStatus(): ContactState
  /**
    * Get the duration of the contact state in milliseconds relative to local time.
    */
  def getStatusDuration(): Double
  /**
    * Get a list of all of the third-party connections, i.e. the list of all
    * connections except for the initial connection, or an empty list if there
    * are no third-party connections.
    */
  def getThirdPartyConnections(): Connection
  /**
    * Get the type of the contact. This indicates what type of media is
    * carried over the connections of the contact.
    */
  def getType(): String
  /**
    * Determine whether the contact is in a connected state.
    */
  def isConnected(): Boolean
  /**
    * Determine whether this is an inbound or outbound contact.
    */
  def isInbound(): Boolean
  /*
    * Determine whether this contact is a softphone call.
    */
  def isSoftphoneCall(): Boolean
  /**
    * Provide diagnostic information for the contact in the case
    * something exceptional happens on the front end.
    *
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def notifyIssue(successFailOptions: SuccessFailOptions): Unit
  /**
    * Subscribe a method to be invoked whenever the contact is accepted.
    */
  def onAccepted(callback: ContactCallback): Unit
  /**
    * Subscribe a method to be invoked when the contact is connected.
    */
  def onConnected(callback: ContactCallback): Unit
  /**
    * Subscribe a method to be invoked whenever the contact is ended or destroyed.
    */
  def onEnded(callback: ContactCallback): Unit
  /**
    * Subscribe a method to be invoked when the contact is incoming.
    */
  def onIncoming(callback: ContactCallback): Unit
  /**
    * Subscribe a method to be invoked whenever the contact is updated.
    */
  def onRefresh(callback: ContactCallback): Unit
  /**
    * Rotate through the connected and on hold connections of the contact.
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def toggleActiveConnections(successFailOptions: SuccessFailOptions): Unit
}

object Contact {
  @scala.inline
  def apply(
    accept: SuccessFailOptions => Unit,
    addConnection: (Endpoint, SuccessFailOptions) => Unit,
    conferenceConnections: SuccessFailOptions => Unit,
    destroy: SuccessFailOptions => Unit,
    getActiveInitialConnection: () => Connection,
    getAgentConnection: () => Connection,
    getAttributes: () => StringDictionary[String],
    getConnections: () => js.Array[Connection],
    getContactId: () => String,
    getInitialConnection: () => Connection,
    getOriginalContactId: () => String,
    getQueue: () => Queue,
    getSingleActiveThirdPartyConnection: () => Connection,
    getStatus: () => ContactState,
    getStatusDuration: () => Double,
    getThirdPartyConnections: () => Connection,
    getType: () => String,
    isConnected: () => Boolean,
    isInbound: () => Boolean,
    isSoftphoneCall: () => Boolean,
    notifyIssue: SuccessFailOptions => Unit,
    onAccepted: ContactCallback => Unit,
    onConnected: ContactCallback => Unit,
    onEnded: ContactCallback => Unit,
    onIncoming: ContactCallback => Unit,
    onRefresh: ContactCallback => Unit,
    toggleActiveConnections: SuccessFailOptions => Unit
  ): Contact = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), addConnection = js.Any.fromFunction2(addConnection), conferenceConnections = js.Any.fromFunction1(conferenceConnections), destroy = js.Any.fromFunction1(destroy), getActiveInitialConnection = js.Any.fromFunction0(getActiveInitialConnection), getAgentConnection = js.Any.fromFunction0(getAgentConnection), getAttributes = js.Any.fromFunction0(getAttributes), getConnections = js.Any.fromFunction0(getConnections), getContactId = js.Any.fromFunction0(getContactId), getInitialConnection = js.Any.fromFunction0(getInitialConnection), getOriginalContactId = js.Any.fromFunction0(getOriginalContactId), getQueue = js.Any.fromFunction0(getQueue), getSingleActiveThirdPartyConnection = js.Any.fromFunction0(getSingleActiveThirdPartyConnection), getStatus = js.Any.fromFunction0(getStatus), getStatusDuration = js.Any.fromFunction0(getStatusDuration), getThirdPartyConnections = js.Any.fromFunction0(getThirdPartyConnections), getType = js.Any.fromFunction0(getType), isConnected = js.Any.fromFunction0(isConnected), isInbound = js.Any.fromFunction0(isInbound), isSoftphoneCall = js.Any.fromFunction0(isSoftphoneCall), notifyIssue = js.Any.fromFunction1(notifyIssue), onAccepted = js.Any.fromFunction1(onAccepted), onConnected = js.Any.fromFunction1(onConnected), onEnded = js.Any.fromFunction1(onEnded), onIncoming = js.Any.fromFunction1(onIncoming), onRefresh = js.Any.fromFunction1(onRefresh), toggleActiveConnections = js.Any.fromFunction1(toggleActiveConnections))
  
    __obj.asInstanceOf[Contact]
  }
}

