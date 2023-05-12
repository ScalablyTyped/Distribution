package typings.amazonConnectStreams.connect

import typings.amazonConnectStreams.connect.MediaType.SOFTPHONE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The VoiceConnection API provides action methods (no event subscriptions) which can be called to manipulate the state of a particular voice connection within a contact.
  * Like contacts, connections come and go.
  * It is good practice not to persist these objects or keep them as internal state.
  * If you need to, store the `contactId` and `connectionId` of the connection and make sure that the contact and connection still exist by fetching them in order from the `Agent` API object before calling methods on them.
  */
@js.native
trait VoiceConnection
  extends StObject
     with BaseConnection {
  
  /** Delete speaker id */
  def deleteVoiceIdSpeakerId(): js.Promise[Any] = js.native
  
  /** Enroll speaker into VoiceId */
  def enrollSpeakerInVoiceId(): js.Promise[Any] = js.native
  def enrollSpeakerInVoiceId(callbackOnAudioCollectionComplete: js.Function): js.Promise[Any] = js.native
  
  /** Returns VoiceId speaker authentication status */
  def evaluateSpeakerWithVoiceId(): js.Promise[Any] = js.native
  def evaluateSpeakerWithVoiceId(startNewSession: Boolean): js.Promise[Any] = js.native
  
  /** Gets a `Promise` with the media controller associated with this connection. */
  def getMediaController(): js.Promise[Any] = js.native
  
  /** Returns the media info object associated with this connection. */
  def getMediaInfo(): VoiceMediaInfo = js.native
  
  /** Returns the `MediaType` enum value: `"softphone"`. */
  def getMediaType(): SOFTPHONE = js.native
  
  /** Returns the array of enabled monitor states of this connection. The array will consist of MonitoringMode enum values. */
  def getMonitorCapabilities(): js.Array[MonitoringMode] = js.native
  
  /**
    * Returns the current monitoring state of this connection.
    * This value can be one of MonitoringMode enum values if the agent is supervisor, otherwise the monitorStatus will be undefined for the agent.
    */
  def getMonitorStatus(): MonitoringMode = js.native
  
  /** Returns the quick connect name of the third-party call participant with which the connection is associated. */
  def getQuickConnectName(): String | Null = js.native
  
  /** Returns the `SpeakerId` associated to this Voice Connection */
  def getVoiceIdSpeakerId(): js.Promise[Any] = js.native
  
  /** Returns the `VoiceId speaker status` associated to this Voice Connection */
  def getVoiceIdSpeakerStatus(): js.Promise[Any] = js.native
  
  /**
    * Returns true if monitorStatus is MonitoringMode.BARGE. 
    * This means the connection is in barge-in state. Regular agent will see the supervisor's connection in the list of connections in the snapshot.
    */
  def isBarge(): Boolean = js.native
  
  /** Returns true if agent's monitoringCapabilities contain MonitoringMode.BARGE state type. */
  def isBargeEnabled(): Boolean = js.native
  
  /** Returns true if the connection was forced muted by the manager. */
  def isForcedMute(): Boolean = js.native
  
  /** Determine whether the connection is mute server side. */
  def isMute(): Boolean = js.native
  
  /**
    * Returns true if monitorStatus is MonitoringMode.SILENT_MONITOR. This means the supervisor connection is in silent monitoring state. 
    * Regular agent will not see supervisor's connection in the snapshot while it is in silent monitor state.
    */
  def isSilentMonitor(): Boolean = js.native
  
  /** Returns true if agent's monitoringCapabilities contain MonitoringMode.SILENT_MONITOR type. */
  def isSilentMonitorEnabled(): Boolean = js.native
  
  /**
    * Mute the connection server side
    *
    * @param callbacks Success and failure callbacks to determine whether the operation was successful.
    */
  def muteParticipant(): Unit = js.native
  def muteParticipant(callbacks: SuccessFailOptions): Unit = js.native
  
  /** Opt out speaker associated to this Voice Connection from VoiceId*/
  def optOutVoiceIdSpeaker(): js.Promise[Any] = js.native
  
  /**
    * Unmute the connection server side if it was mute
    *
    * @param callbacks Success and failure callbacks to determine whether the operation was successful.
    */
  def unmuteParticipant(): Unit = js.native
  def unmuteParticipant(callbacks: SuccessFailOptions): Unit = js.native
  
  /** Update speaker id */
  def updateVoiceIdSpeakerId(speakerId: String): js.Promise[Any] = js.native
}
