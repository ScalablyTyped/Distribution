package typings.ariClient.mod

import typings.ariClient.anon.ChannelIdString
import typings.ariClient.anon.Format
import typings.ariClient.anon.Mute
import typings.ariClient.anon.Offsetms
import typings.ariClient.anon.PlaybackId
import typings.ariClient.anon.Type
import typings.ariClient.anon.`2`
import typings.ariClient.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bridge
  extends StObject
     with Resource {
  
  /**
    * Add a channel to a bridge.
    *
    * @param params.channel - Ids of channels to add to bridge.
    * @param [params.role] - Channels role in the bridge.
    * @param [params.absorbDTMF] - Absorb DTMF coming from this channel, preventing it to pass through to the bridge.
    * @param [params.mute] - Mute audio from this channel, preventing it to pass through to the bridge.
    */
  def addChannel(params: Mute): js.Promise[Unit] = js.native
  /**
    * Add a channel to a bridge.
    *
    * @param params.channel - Ids of channels to add to bridge.
    * @param [params.role] - Channels role in the bridge.
    * @param [params.absorbDTMF] - Absorb DTMF coming from this channel, preventing it to pass through to the bridge.
    * @param [params.mute] - Mute audio from this channel, preventing it to pass through to the bridge.
    */
  def addChannel(params: Mute, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Bridging class.
    */
  var bridge_class: String = js.native
  
  /**
    * Type of bridge technology.
    */
  var bridge_type: String = js.native
  
  /**
    * Ids of channels participating in this bridge.
    */
  var channels: String | js.Array[String] = js.native
  
  /**
    * Removes any explicit video source in a multi-party mixing bridge. This operation has no effect on bridges with two or fewer participants. When no explicit video source is set, talk
    * detection will be used to determine the active video stream.
    */
  def clearVideoSource(): js.Promise[Unit] = js.native
  /**
    * Removes any explicit video source in a multi-party mixing bridge. This operation has no effect on bridges with two or fewer participants. When no explicit video source is set, talk
    * detection will be used to determine the active video stream.
    */
  def clearVideoSource(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Create a new bridge.
    * This bridge persists until it has been shut down, or Asterisk has been shut down.
    *
    * @param [params.type] - Comma separated list of bridge type attributes (mixing, holding, dtmf_events, proxy_media, video_sfu).
    * @param [params.name] - Name to give to the bridge being created.
    */
  def create(): js.Promise[Bridge] = js.native
  /**
    * Create a new bridge.
    * This bridge persists until it has been shut down, or Asterisk has been shut down.
    */
  def create(callback: js.Function2[/* err */ js.Error, /* bridge */ this.type, Unit]): Unit = js.native
  def create(params: Type): js.Promise[Bridge] = js.native
  /**
    * Create a new bridge.
    * This bridge persists until it has been shut down, or Asterisk has been shut down.
    *
    * @param [params.type] - Comma separated list of bridge type attributes (mixing, holding, dtmf_events, proxy_media, video_sfu).
    * @param [params.name] - Name to give to the bridge being created.
    */
  def create(params: Type, callback: js.Function2[/* err */ js.Error, /* bridge */ this.type, Unit]): Unit = js.native
  
  /**
    * Create a new bridge or updates an existing one.
    * This bridge persists until it has been shut down, or Asterisk has been shut down.
    *
    * @param [params.type] - Comma separated list of bridge type attributes (mixing, holding, dtmf_events, proxy_media, video_sfu) to set.
    * @param [params.name] - Set the name of the bridge.
    */
  def createWithId(): js.Promise[Bridge] = js.native
  /**
    * Create a new bridge or updates an existing one.
    * This bridge persists until it has been shut down, or Asterisk has been shut down.
    */
  def createWithId(callback: js.Function2[/* err */ js.Error, /* bridge */ this.type, Unit]): Unit = js.native
  def createWithId(params: Type): js.Promise[Bridge] = js.native
  /**
    * Create a new bridge or updates an existing one.
    * This bridge persists until it has been shut down, or Asterisk has been shut down.
    *
    * @param [params.type] - Comma separated list of bridge type attributes (mixing, holding, dtmf_events, proxy_media, video_sfu) to set.
    * @param [params.name] - Set the name of the bridge.
    */
  def createWithId(params: Type, callback: js.Function2[/* err */ js.Error, /* bridge */ this.type, Unit]): Unit = js.native
  
  /**
    * Timestamp when bridge was created.
    */
  var creationtime: js.Date = js.native
  
  /**
    * Entity that created the bridge.
    */
  var creator: String = js.native
  
  /**
    * Shut down a bridge.
    * If any channels are in this bridge, they will be removed and resume whatever they were doing beforehand.
    */
  def destroy(): js.Promise[Unit] = js.native
  /**
    * Shut down a bridge.
    * If any channels are in this bridge, they will be removed and resume whatever they were doing beforehand.
    */
  def destroy(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Get bridge details.
    */
  def get(): js.Promise[Bridge] = js.native
  /**
    * Get bridge details.
    */
  def get(callback: js.Function2[/* err */ js.Error, /* bridge */ this.type, Unit]): Unit = js.native
  
  /**
    * Unique identifier for this bridge.
    */
  var id: String = js.native
  
  /**
    * List all active bridges in Asterisk.
    */
  def list(): js.Promise[js.Array[Bridge]] = js.native
  /**
    * List all active bridges in Asterisk.
    */
  def list(callback: js.Function2[/* err */ js.Error, /* bridges */ js.Array[this.type], Unit]): Unit = js.native
  
  /**
    * Name the creator gave the bridge.
    */
  var name: String = js.native
  
  /**
    * Start playback of media on a bridge.
    * The media URI may be any of a number of URIs. Currently sound:, recording:, number:, digits:, characters:, and tone: URIs are supported. This operation creates a playback resource
    * that can be used to control the playback of media (pause, rewind, fast forward, etc.).
    *
    * @param params.media - Media URIs to play.
    * @param [params.lang] - For sounds, selects language for sound.
    * @param [params.offsetms] - Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified.
    * @param [params.skipms] - Number of milliseconds to skip for forward/reverse operations.
    * @param [params.playbackId] - Playback Id.
    */
  def play(params: Offsetms): js.Promise[Playback] = js.native
  /**
    * Start playback of media on a bridge.
    * The media URI may be any of a number of URIs. Currently sound:, recording:, number:, digits:, characters:, and tone: URIs are supported. This operation creates a playback resource
    * that can be used to control the playback of media (pause, rewind, fast forward, etc.).
    *
    * @param params.media - Media URIs to play.
    * @param [params.lang] - For sounds, selects language for sound.
    * @param [params.offsetms] - Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified.
    * @param [params.skipms] - Number of milliseconds to skip for forward/reverse operations.
    * @param [params.playbackId] - Playback Id.
    */
  def play(params: Offsetms, callback: js.Function2[/* err */ js.Error, /* playback */ Playback, Unit]): Unit = js.native
  
  /**
    * Start playback of media on a bridge.
    * The media URI may be any of a number of URIs. Currently sound:, recording:, number:, digits:, characters:, and tone: URIs are supported. This operation creates a playback resource
    * that can be used to control the playback of media (pause, rewind, fast forward, etc.).
    *
    * @param params.playbackId - Playback ID.
    * @param params.media - Media URIs to play.
    * @param [params.lang] - For sounds, selects language for sound.
    * @param [params.offsetms] - Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified.
    * @param [params.skipms] - Number of milliseconds to skip for forward/reverse operations.
    */
  def playWithId(params: PlaybackId): js.Promise[Playback] = js.native
  /**
    * Start playback of media on a bridge.
    * The media URI may be any of a number of URIs. Currently sound:, recording:, number:, digits:, characters:, and tone: URIs are supported. This operation creates a playback resource
    * that can be used to control the playback of media (pause, rewind, fast forward, etc.).
    *
    * @param params.playbackId - Playback ID.
    * @param params.media - Media URIs to play.
    * @param [params.lang] - For sounds, selects language for sound.
    * @param [params.offsetms] - Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified.
    * @param [params.skipms] - Number of milliseconds to skip for forward/reverse operations.
    */
  def playWithId(params: PlaybackId, callback: js.Function2[/* err */ js.Error, /* playback */ Playback, Unit]): Unit = js.native
  
  /**
    * Start a recording.
    * This records the mixed audio from all channels participating in this bridge.
    *
    * @param params.name - Recordings filename.
    * @param params.format - Format to encode audio in.
    * @param [params.maxDurationSeconds] - Maximum duration of the recording, in seconds. 0 for no limit.
    * @param [params.maxSilenceSeconds] - Maximum duration of silence, in seconds. 0 for no limit.
    * @param [params.ifExists] - Action to take if a recording with the same name already exists.
    * @param [params.beep] - Play beep when recording begins.
    * @param [params.terminateOn] - DTMF input to terminate recording.
    */
  def record(params: Format, recording: LiveRecording): js.Promise[LiveRecording] = js.native
  /**
    * Start a recording.
    * This records the mixed audio from all channels participating in this bridge.
    *
    * @param params.name - Recordings filename.
    * @param params.format - Format to encode audio in.
    * @param [params.maxDurationSeconds] - Maximum duration of the recording, in seconds. 0 for no limit.
    * @param [params.maxSilenceSeconds] - Maximum duration of silence, in seconds. 0 for no limit.
    * @param [params.ifExists] - Action to take if a recording with the same name already exists.
    * @param [params.beep] - Play beep when recording begins.
    * @param [params.terminateOn] - DTMF input to terminate recording.
    */
  def record(
    params: Format,
    recording: LiveRecording,
    callback: js.Function2[/* err */ js.Error, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  
  /**
    * Remove a channel from a bridge.
    *
    * @param params.channel - Ids of channels to remove from bridge.
    */
  def removeChannel(params: `2`): js.Promise[Unit] = js.native
  /**
    * Remove a channel from a bridge.
    *
    * @param params.channel - Ids of channels to remove from bridge.
    */
  def removeChannel(params: `2`, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Set a channel as the video source in a multi-party mixing bridge. This operation has no effect on bridges with two or fewer participants.
    *
    * @param params.channelId - Channels id.
    */
  def setVideoSource(params: ChannelIdString): js.Promise[Unit] = js.native
  /**
    * Set a channel as the video source in a multi-party mixing bridge. This operation has no effect on bridges with two or fewer participants.
    *
    * @param params.channelId - Channels id.
    */
  def setVideoSource(params: ChannelIdString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Play music on hold to a bridge or change the MOH class that is playing.
    *
    * @param [params.mohClass] - Channels id.
    */
  def startMoh(): js.Promise[Unit] = js.native
  /**
    * Play music on hold to a bridge or change the MOH class that is playing.
    */
  def startMoh(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def startMoh(params: `3`): js.Promise[Unit] = js.native
  /**
    * Play music on hold to a bridge or change the MOH class that is playing.
    *
    * @param [params.mohClass] - Channels id.
    */
  def startMoh(params: `3`, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Stop playing music on hold to a bridge.
    * This will only stop music on hold being played via POST bridges/{bridgeId}/moh.
    */
  def stopMoh(): js.Promise[Unit] = js.native
  /**
    * Stop playing music on hold to a bridge.
    * This will only stop music on hold being played via POST bridges/{bridgeId}/moh.
    */
  def stopMoh(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Name of the current bridging technology.
    */
  var technology: String = js.native
  
  /**
    * The video mode the bridge is using. One of none, talker, or single.
    */
  var video_mode: js.UndefOr[String] = js.native
  
  /**
    * The ID of the channel that is the source of video in this bridge, if one exists.
    */
  var video_source_id: js.UndefOr[String] = js.native
}
