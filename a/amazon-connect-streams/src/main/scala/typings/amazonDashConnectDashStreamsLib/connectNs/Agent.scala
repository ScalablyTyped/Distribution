package typings
package amazonDashConnectDashStreamsLib.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Agent extends js.Object {
  /**
    * Creates an outbound contact to the given endpoint.
    *
    * @param endpoint An object describing the endpoint to which to connect.
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def connect(endpoint: Endpoint, successFailOptions: ConnectOptions): scala.Unit
  /**
    * Gets the list of selectable AgentState API objects.
    */
  def getAgentStates(): js.Array[AgentState]
  /**
    * Gets the full AgentConfiguration object for the agent.
    */
  def getConfiguration(): AgentConfiguration
  // /**
  //  * For internal purposes only.
  //  */
  // getPermissions(): string[];
  /**
    * Gets a list of Contact API objects for each of the agent's current contacts.
    */
  def getContacts(contactTypeFilter: java.lang.String): js.Array[Contact]
  /**
    * Gets the agent's phone number from the AgentConfiguration object for the agent.
    */
  def getExtension(): java.lang.String
  /**
    * Gets the agent's user friendly display name from the AgentConfiguration object for the agent.
    */
  def getName(): java.lang.String
  /**
    * Gets the agent's routing profile.
    */
  def getRoutingProfile(): AgentRoutingProfile
  /**
    * Get the agent's current AgentState object indicating their availability state type.
    */
  def getState(): AgentState
  /**
    * Get the duration of the agent's state in milliseconds relative to local time.
    */
  def getStateDuration(): scala.Double
  /**
    * Determine if softphone is enabled for the agent.
    */
  def isSoftphoneEnabled(): scala.Boolean
  /*
    * Sets the agent local media to mute mode.
    */
  def mute(): scala.Unit
  /**
    * Subscribe a method to be called when the agent enters the "After Call Work" (ACW) state.
    *
    * @param callback A callback to receive updated Agent information.
    */
  def onAfterCallWork(callback: AgentCallback): scala.Unit
  /**
    * Subscribe a method to be called whenever Contact information is about to be updated.
    *
    * @param callback A callback to receive updated Agent information.
    */
  def onContactPending(callback: AgentCallback): scala.Unit
  /**
    * Subscribe a method to be called when the agent is put into an error state.
    *
    * @param callback A callback to receive updated Agent information.
    */
  def onError(callback: AgentCallback): scala.Unit
  /**
    * Subscribe a method to be called when the agent updates the mute status,
    * meaning that agents mute/unmute APIs are called and the local media stream
    * is succesfully updated with the new status.
    *
    * @param callback A callback to receive updates on agent mute state
    */
  def onMuteToggle(callback: AgentCallback): scala.Unit
  /**
    * Subscribe a method to be called when the agent becomes not-routable, meaning that they are online but cannot be routed incoming contacts.
    *
    * @param callback A callback to receive updated Agent information.
    */
  def onNotRoutable(callback: AgentCallback): scala.Unit
  /**
    * Subscribe a method to be called when the agent goes offline.
    *
    * @param callback A callback to receive updated Agent information.
    */
  def onOffline(callback: AgentCallback): scala.Unit
  /**
    * Subscribe a method to be called whenever new agent data is available.
    *
    * @param callback A callback to receive updated Agent information.
    */
  def onRefresh(callback: AgentCallback): scala.Unit
  /**
    * Subscribe a method to be called when the agent becomes routable, meaning that they can be routed incoming contacts.
    *
    * @param callback A callback to receive updated Agent information.
    */
  def onRoutable(callback: AgentCallback): scala.Unit
  /**
    * Updates the agent's configuration with the given AgentConfiguration object.
    *
    * @param configuration The desired configuration
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def setConfiguration(configuration: AgentConfiguration, successFailOptions: SuccessFailOptions): scala.Unit
  /**
    * Set the agent's current availability state.
    *
    * @param state The new agent state.
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def setState(state: AgentState, successFailOptions: SuccessFailOptions): scala.Unit
  /**
    * Create a snapshot version of the current Agent state and save it for future use, such as adding to a log file or posting elsewhere.
    */
  def toSnapshot(): Agent
  /*
    * Sets the agent localmedia to unmute mode.
    */
  def unmute(): scala.Unit
}

object Agent {
  @scala.inline
  def apply(
    connect: (Endpoint, ConnectOptions) => scala.Unit,
    getAgentStates: () => js.Array[AgentState],
    getConfiguration: () => AgentConfiguration,
    getContacts: java.lang.String => js.Array[Contact],
    getExtension: () => java.lang.String,
    getName: () => java.lang.String,
    getRoutingProfile: () => AgentRoutingProfile,
    getState: () => AgentState,
    getStateDuration: () => scala.Double,
    isSoftphoneEnabled: () => scala.Boolean,
    mute: () => scala.Unit,
    onAfterCallWork: AgentCallback => scala.Unit,
    onContactPending: AgentCallback => scala.Unit,
    onError: AgentCallback => scala.Unit,
    onMuteToggle: AgentCallback => scala.Unit,
    onNotRoutable: AgentCallback => scala.Unit,
    onOffline: AgentCallback => scala.Unit,
    onRefresh: AgentCallback => scala.Unit,
    onRoutable: AgentCallback => scala.Unit,
    setConfiguration: (AgentConfiguration, SuccessFailOptions) => scala.Unit,
    setState: (AgentState, SuccessFailOptions) => scala.Unit,
    toSnapshot: () => Agent,
    unmute: () => scala.Unit
  ): Agent = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction2(connect), getAgentStates = js.Any.fromFunction0(getAgentStates), getConfiguration = js.Any.fromFunction0(getConfiguration), getContacts = js.Any.fromFunction1(getContacts), getExtension = js.Any.fromFunction0(getExtension), getName = js.Any.fromFunction0(getName), getRoutingProfile = js.Any.fromFunction0(getRoutingProfile), getState = js.Any.fromFunction0(getState), getStateDuration = js.Any.fromFunction0(getStateDuration), isSoftphoneEnabled = js.Any.fromFunction0(isSoftphoneEnabled), mute = js.Any.fromFunction0(mute), onAfterCallWork = js.Any.fromFunction1(onAfterCallWork), onContactPending = js.Any.fromFunction1(onContactPending), onError = js.Any.fromFunction1(onError), onMuteToggle = js.Any.fromFunction1(onMuteToggle), onNotRoutable = js.Any.fromFunction1(onNotRoutable), onOffline = js.Any.fromFunction1(onOffline), onRefresh = js.Any.fromFunction1(onRefresh), onRoutable = js.Any.fromFunction1(onRoutable), setConfiguration = js.Any.fromFunction2(setConfiguration), setState = js.Any.fromFunction2(setState), toSnapshot = js.Any.fromFunction0(toSnapshot), unmute = js.Any.fromFunction0(unmute))
  
    __obj.asInstanceOf[Agent]
  }
}

