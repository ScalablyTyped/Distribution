package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Contact API provides event subscription methods and action methods which can be called on behalf of a specific contact.
  * Contacts come and go and so should these API objects.
  * It is good practice not to persist these objects or keep them as internal state.
  * If you need to, store the `contactId` of the contact and make sure that the contact still exists by fetching it from the `Agent` API object before calling methods on it.
  */
@js.native
trait Contact extends StObject {
  
  /**
    * Accept an incoming contact.
    *
    * @param callbacks Success and failure callbacks to determine whether the operation was successful.
    */
  def accept(): Unit = js.native
  def accept(callbacks: SuccessFailOptions): Unit = js.native
  
  /**
    * Add a new outbound third-party connection to this contact and connect it to the specified endpoint.
    *
    * @param endpoint The endpoint to add.
    * @param callbacks Success and failure callbacks to determine whether the operation was successful.
    */
  def addConnection(endpoint: Endpoint): Unit = js.native
  def addConnection(endpoint: Endpoint, callbacks: SuccessFailOptions): Unit = js.native
  
  /**
    * Clear the contact.
    *
    * @param callbacks Success and failure callbacks to determine whether the operation was successful.
    */
  def clear(callbacks: SuccessFailOptions): Unit = js.native
  
  /**
    * This is an API that completes this contact entirely.
    * That means that this should only be used for non-monitoring agent connections.
    *
    * @param callbacks Success and failure callbacks to determine whether the operation was successful.
    */
  def complete(): Unit = js.native
  def complete(callbacks: SuccessFailOptions): Unit = js.native
  
  /**
    * Conference together the active connections of the conversation.
    * This operation is only valid if there is at least one third-party connection and the initial connection is still connected.
    *
    * @param callbacks Success and failure callbacks to determine whether the operation was successful.
    */
  def conferenceConnections(): Unit = js.native
  def conferenceConnections(callbacks: SuccessFailOptions): Unit = js.native
  
  /** The unique contactId of this contact. */
  val contactId: String = js.native
  
  /**
    * Close the contact and all of its associated connections.
    * This method can also reject and clear contacts but those behaviors will be deprecated.
    * If the contact is a voice contact, and there is a third-party, the customer remains bridged with the third party and will not be disconnected from the call.
    * Otherwise, the agent and customer are disconnected.
    *
    * @param callbacks Success and failure callbacks to determine whether the operation was successful.
    */
  def destroy(): Unit = js.native
  def destroy(callbacks: SuccessFailOptions): Unit = js.native
  
  /** Get the initial connection of the contact, or null if the initial connection is no longer active. */
  def getActiveInitialConnection(): BaseConnection | Null = js.native
  
  /**
    * Gets the agent connection.
    * This is the connection that represents the agent's participation in the contact.
    */
  def getAgentConnection(): BaseConnection = js.native
  
  /** Gets a map of the attributes associated with the contact. */
  def getAttributes(): AttributeDictionary = js.native
  
  /** Get a list containing `Connection` API objects for each connection in the contact. */
  def getConnections(): js.Array[BaseConnection] = js.native
  
  /** Get the unique contactId of this contact. */
  def getContactId(): String = js.native
  
  /** Get description for the contact. */
  def getDescription(): String = js.native
  
  /**
    * Returns a formatted string with the contact event and ID.
    *
    * @param event The event to format.
    */
  def getEventName(event: ContactEvents): String = js.native
  
  /** Get the initial connection of the contact. */
  def getInitialConnection(): BaseConnection = js.native
  
  /** Alias for `getOriginalContactId()`. */
  def getInitialContactId(): String = js.native
  
  /** Get name for the contact. */
  def getName(): String = js.native
  
  /**
    * Get the original (initial) contact id from which this contact was transferred, or none if this is not an internal Connect transfer.
    * This is typically a contact owned by another agent, thus this agent will not be able to manipulate it.
    * It is for reference and association purposes only, and can be used to share data between transferred contacts externally if it is linked by originalContactId.
    */
  def getOriginalContactId(): String = js.native
  
  /** Get the queue associated with the contact. */
  def getQueue(): Queue = js.native
  
  /** Gets the timestamp associated with when the contact was placed in the queue. */
  def getQueueTimestamp(): js.Date = js.native
  
  /** Get references for the contact. */
  def getReferences(): ReferenceDictionary = js.native
  
  /**
    * In Voice contacts, there can only be one active third-party connection.
    * This method returns the single active third-party connection, or null if there are no currently active third-party connections.
    */
  def getSingleActiveThirdPartyConnection(): BaseConnection | Null = js.native
  
  /** Get an object representing the state of the contact. */
  def getState(): ContactState = js.native
  
  /**
    * Get the duration of the contact state in milliseconds relative to local time.
    * This takes into account time skew between the JS client and the Amazon Connect backend servers.
    */
  def getStateDuration(): Double = js.native
  
  /** Alias for `getStatus()` */
  def getStatus(): ContactState = js.native
  
  /** Alias for `getStateDuration()` */
  def getStatusDuration(): Double = js.native
  
  /** Get a list of all of the third-party connections, i.e. the list of all connections except for the initial connection, or an empty list if there are no third-party connections. */
  def getThirdPartyConnections(): js.Array[BaseConnection] = js.native
  
  /**
    * Get the type of the contact.
    * This indicates what type of media is carried over the connections of the contact.
    */
  def getType(): ContactType = js.native
  
  /**
    * Determine whether the contact is in a connected state.
    * Note that contacts no longer exist once they have been removed.
    * To detect these instances, subscribe to the `contact.onEnded()` event for the contact.
    */
  def isConnected(): Boolean = js.native
  
  /** Determine whether this is an inbound or outbound contact. */
  def isInbound(): Boolean = js.native
  
  /** Determine whether this contact is a softphone call and multiparty conference feature is turned on.  */
  def isMultiPartyConferenceEnabled(): Boolean = js.native
  
  /** Determine whether this contact is a softphone call.  */
  def isSoftphoneCall(): Boolean = js.native
  
  /** Determines if the contact is under manager's supervision */
  def isUnderSupervision(): Boolean = js.native
  
  /**
    * Provide diagnostic information for the contact in the case something exceptional happens on the front end.
    * The Streams logs will be published along with the issue code and description provided here.
    *
    * @param issueCode An arbitrary issue code to associate with the diagnostic report.
    * @param description A description to associate with the diagnostic report.
    * @param callbacks Success and failure callbacks to determine whether the operation was successful.
    */
  def notifyIssue(issueCode: String, description: String): Unit = js.native
  def notifyIssue(issueCode: String, description: String, callbacks: SuccessFailOptions): Unit = js.native
  
  /**
    * Subscribe a method to be invoked whenever the contact enters the ACW state.
    * This is after the connection has been closed, but before the contact is destroyed.
    *
    * @param callback A callback to receive the `Contact` API object instance.
    */
  def onACW(callback: ContactCallback): Unit = js.native
  
  /**
    * Subscribe a method to be invoked whenever the contact is accepted.
    *
    * @param callback A callback to receive the `Contact` API object instance.
    */
  def onAccepted(callback: ContactCallback): Unit = js.native
  
  /**
    * Subscribe a method to be invoked when the contact is connected.
    *
    * @param callback A callback to receive the `Contact` API object instance.
    */
  def onConnected(callback: ContactCallback): Unit = js.native
  
  /**
    * Subscribe a method to be invoked when the contact is connecting.
    * This works with chat and softphone contacts.
    * This event happens when a call or chat comes in, before accepting (there is an exception for queue callbacks, in which onConnecting's handler is started after the callback is accepted).
    * Note that once the contact has been accepted, the `onAccepted` handler will be triggered.
    *
    * @param callback A callback to receive the `Contact` API object instance.
    */
  def onConnecting(callback: ContactCallback): Unit = js.native
  
  /**
    * Subscribe a method to be invoked whenever the contact is destroyed.
    *
    * @param callback A callback to receive the `Contact` API object instance.
    */
  def onDestroy(callback: ContactCallback): Unit = js.native
  
  /**
    * Subscribe a method to be invoked whenever the contact is ended or destroyed.
    * This could be due to the conversation being ended by the agent, or due to the contact being missed.
    * Call `contact.getState()` to determine the state of the contact and take appropriate action.
    *
    * @param callback A callback to receive the `Contact` API object instance.
    */
  def onEnded(callback: ContactCallback): Unit = js.native
  
  /**
    * Subscribe a method to be invoked when the contact error event is triggered. 
    * This event is only triggered when a contact state of type error appears in the snapshot.
    * 
    * @param callback A callback to receive the `Contact` API object instance.
    */
  def onError(callback: ContactCallback): Unit = js.native
  
  /**
    * Subscribe a method to be invoked when a queue callback contact is incoming.
    * In this state, the contact is waiting to be accepted if it is a softphone call or is waiting for the agent to answer if it is not a softphone call.
    *
    * @param callback A callback to receive the `Contact` API object instance.
    */
  def onIncoming(callback: ContactCallback): Unit = js.native
  
  /**
    * Subscribe a method to be invoked whenever the contact is missed.
    * This is an event which is fired when a contact is put in state "missed" by the backend, which happens when the agent does not answer for a certain amount of time, when the agent rejects the call, or when the other participant hangs up before the agent can accept.
    *
    * @param callback A callback to receive the `Contact` API object instance.
    */
  def onMissed(callback: ContactCallback): Unit = js.native
  
  /**
    * Subscribe a method to be invoked when the contact is pending.
    * This event is expected to occur before the connecting event.
    *
    * @param callback A callback to receive the `Contact` API object instance.
    */
  def onPending(callback: ContactCallback): Unit = js.native
  
  /**
    * Subscribe a method to be invoked whenever the contact is updated.
    *
    * @param callback A callback to receive the `Contact` API object instance.
    */
  def onRefresh(callback: ContactCallback): Unit = js.native
  
  /**
    * Reject an incoming contact.
    *
    * @param callbacks Success and failure callbacks to determine whether the operation was successful.
    */
  def reject(): Unit = js.native
  def reject(callbacks: SuccessFailOptions): Unit = js.native
  
  /**
    * The data behind the `Contact` API object is ephemeral and changes whenever new data is provided.
    * This method provides an opportunity to create a snapshot version of the `Contact` API object and save it for future use, such as adding to a log file or posting elsewhere.
    */
  def toSnapshot(): Contact = js.native
  
  /**
    * Rotate through the connected and on hold connections of the contact.
    * This operation is only valid if there is at least one third-party connection and the initial connection is still connected.
    *
    * @param callbacks Success and failure callbacks to determine whether the operation was successful.
    */
  def toggleActiveConnections(): Unit = js.native
  def toggleActiveConnections(callbacks: SuccessFailOptions): Unit = js.native
  
  /**
    * Updates the monitor participant state to switch between different monitoring modes.
    * 
    * @param targetState A MonitoringMode enum member
    * @param callbacks Success and failure callbacks to determine whether the operation was successful
    */
  def updateMonitorParticipantState(targetState: MonitoringMode): Unit = js.native
  def updateMonitorParticipantState(targetState: MonitoringMode, callbacks: SuccessFailOptions): Unit = js.native
}
