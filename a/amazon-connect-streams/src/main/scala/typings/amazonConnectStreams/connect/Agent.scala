package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Agent API provides event subscription methods and action methods which can be called on behalf of the agent.
  * There is only ever one agent per Streams instantiation and all contacts and actions are assumed to be taken on behalf of this one agent.
  */
@js.native
trait Agent extends StObject {
  
  /**
    * Creates an outbound contact to the given endpoint.
    *
    * @param endpoint An `Endpoint` API object to connect to.
    * @param connectOptions The connection options.
    */
  def connect(endpoint: Endpoint): Unit = js.native
  def connect(endpoint: Endpoint, connectOptions: ConnectOptions): Unit = js.native
  
  /**
    * Gets the list of selectable `AgentState` API objects.
    * These are the agent states that can be selected when the agent is not handling a live contact.
    */
  def getAgentStates(): js.Array[AgentStateDefinition] = js.native
  
  /** Returns a list of the ARNs associated with this agent's routing profile's queues. */
  def getAllQueueARNs(): js.Array[String] = js.native
  
  /**
    * Gets a map of channel type to 1 or 0.
    * 1 represents an enabled channel.
    * 0 represents a disabled channel.
    */
  def getChannelConcurrency(): AgentChannelConcurrencyMap = js.native
  /**
    * Gets a number indicating how many concurrent contacts can an agent have on a given channel.
    * 0 represents a disabled channel.
    *
    * @param channel The channel to get the configured concurrency.
    */
  def getChannelConcurrency(channel: ChannelType): Double = js.native
  
  /** Gets the full `AgentConfiguration` object for the agent. */
  def getConfiguration(): AgentConfiguration = js.native
  
  /**
    * Gets a list of `Contact` API objects for each of the agent's current contacts.
    *
    * @param contactTypeFilter If provided, only contacts of the given `ContactType` enum are returned.
    */
  def getContacts(): js.Array[Contact] = js.native
  def getContacts(contactTypeFilter: ContactType): js.Array[Contact] = js.native
  
  /** Returns a list of eligible countries to be dialed / deskphone redirected. */
  def getDialableCountries(): js.Array[String] = js.native
  
  /**
    * Returns the endpoints associated with the queueARNs specified in `queueARNs`.
    *
    * @param queueARNs A single Queue ARN or a list of Queue ARNs associated with the desired queues.
    * @param callbacks Success and failure callbacks to determine whether the operation was successful.
    */
  def getEndpoints(queueARNs: String, callbacks: GetEndpointsCallbacks): Unit = js.native
  def getEndpoints(queueARNs: js.Array[String], callbacks: GetEndpointsCallbacks): Unit = js.native
  
  /**
    * Gets the agent's phone number.
    * This is the phone number that is dialed by Amazon Connect to connect calls to the agent for incoming and outgoing calls if softphone is not enabled.
    */
  def getExtension(): String = js.native
  
  /** Gets the agent's user friendly display name. */
  def getName(): String = js.native
  
  /**
    * Mostly for internal purposes only.
    * Contains strings which indicates actions that the agent can take in the CCP.
    */
  def getPermissions(): js.Array[String] = js.native
  
  /** Gets the agent's routing profile. */
  def getRoutingProfile(): AgentRoutingProfile = js.native
  
  /** Get the agent's current `AgentState` object indicating their availability state type. */
  def getState(): AgentState = js.native
  
  /**
    * Get the duration of the agent's state in milliseconds relative to local time.
    * This takes into account time skew between the JS client and the Amazon Connect service.
    */
  def getStateDuration(): Double = js.native
  
  /** Alias for `getState()`. */
  def getStatus(): AgentState = js.native
  
  /** Indicates whether the agent's phone calls should route to the agent's browser-based softphone or the telephone number configured as the agent's extension. */
  def isSoftphoneEnabled(): Boolean = js.native
  
  /** Sets the agent local media to mute mode. */
  def mute(): Unit = js.native
  
  /**
    * Subscribe a method to be called when the agent enters the "After Call Work" (ACW) state.
    * This is a non-routable state which exists to allow agents some time to wrap up after handling a contact before they are routed additional contacts.
    *
    * @param callback A callback to receive the `Agent` API object instance.
    */
  def onAfterCallWork(callback: AgentCallback): Unit = js.native
  
  /**
    * Subscribe a method to be called whenever a contact enters the pending state for this particular agent.
    *
    * @param callback A callback to receive the `Agent` API object instance.
    */
  def onContactPending(callback: AgentCallback): Unit = js.native
  
  /**
    * Subscribe a method to be called when the agent is put into an error state.
    * This can occur if Streams is unable to get new agent data, or if the agent fails to accept an incoming contact, or in other error cases.
    * It means that the agent is not routable, and may require that the agent switch to a routable state before being able to be routed contacts again.
    *
    * @param callback A callback to receive the `Agent` API object instance.
    */
  def onError(callback: AgentCallback): Unit = js.native
  
  /**
    * Subscribe a method to be called when the agent updates the mute status, meaning that agents mute/unmute APIs are called and the local media stream is succesfully updated with the new status.
    *
    * @param callback A callback to receive updates on agent mute state
    */
  def onMuteToggle(callback: AgentMutedStatusCallback): Unit = js.native
  
  /**
    * Subscribe a method to be called when the agent becomes not-routable, meaning that they are online but cannot be routed incoming contacts.
    *
    * @param callback A callback to receive the `Agent` API object instance.
    */
  def onNotRoutable(callback: AgentCallback): Unit = js.native
  
  /**
    * Subscribe a method to be called when the agent goes offline.
    *
    * @param callback A callback to receive the `Agent` API object instance.
    */
  def onOffline(callback: AgentCallback): Unit = js.native
  
  /**
    * Subscribe a method to be called whenever new agent data is available.
    *
    * @param callback A callback to receive the `Agent` API object instance.
    */
  def onRefresh(callback: AgentCallback): Unit = js.native
  
  /**
    * Subscribe a method to be called when the agent becomes routable, meaning that they can be routed incoming contacts.
    *
    * @param callback A callback to receive the `Agent` API object instance.
    */
  def onRoutable(callback: AgentCallback): Unit = js.native
  
  /**
    * Subscribe a method to be called when the agent is put into an error state specific to softphone funcionality.
    *
    * @param callback A callback to receive the `SoftphoneError` error.
    */
  def onSoftphoneError(callback: SoftphoneErrorCallback): Unit = js.native
  
  /**
    * Subscribe a method to be called when the agent's state changes.
    *
    * @param callback A callback to receive the `AgentStateChange` API object instance.
    */
  def onStateChange(callback: AgentStateChangeCallback): Unit = js.native
  
  /**
    * Updates the agent's configuration with the given `AgentConfiguration` object.
    * The phone number specified must be in E.164 format or the update fails.
    *
    * @param config The desired configuration.
    * @param callbacks Success and failure callbacks to determine whether the operation was successful.
    */
  def setConfiguration(config: AgentConfiguration): Unit = js.native
  def setConfiguration(config: AgentConfiguration, callbacks: SuccessFailOptions): Unit = js.native
  
  /**
    * Set the agent's current availability state.
    * Can only be performed if the agent is not handling a live contact.
    *
    * @param state The new agent state.
    * @param callbacks Success and failure callbacks to determine whether the operation was successful.
    */
  def setState(state: AgentStateDefinition): Unit = js.native
  def setState(state: AgentStateDefinition, callbacks: SuccessFailOptions): Unit = js.native
  
  /** Alias for `setState()`. */
  def setStatus(state: AgentStateDefinition): Unit = js.native
  def setStatus(state: AgentStateDefinition, callbacks: SuccessFailOptions): Unit = js.native
  
  /**
    * The data behind the `Agent` API object is ephemeral and changes whenever new data is provided.
    * This method provides an opportunity to create a snapshot version of the `Agent` API object and save it for future use, such as adding to a log file or posting elsewhere.
    */
  def toSnapshot(): Agent = js.native
  
  /** Sets the agent localmedia to unmute mode. */
  def unmute(): Unit = js.native
}
