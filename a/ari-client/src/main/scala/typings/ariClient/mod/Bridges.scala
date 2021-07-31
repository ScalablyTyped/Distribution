package typings.ariClient.mod

import typings.ariClient.anon.AbsorbDTMF
import typings.ariClient.anon.Beep
import typings.ariClient.anon.BridgeId
import typings.ariClient.anon.BridgeIdString
import typings.ariClient.anon.ChannelId
import typings.ariClient.anon.Lang
import typings.ariClient.anon.Media
import typings.ariClient.anon.MohClass
import typings.ariClient.anon.Name
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bridges extends StObject {
  
  /**
    * Add a channel to a bridge.
    *
    * @param params.bridgeId - Bridges id.
    * @param params.channel - Ids of channels to add to bridge.
    * @param [params.role] - Channels role in the bridge.
    * @param [params.absorbDTMF] - Absorb DTMF coming from this channel, preventing it to pass through to the bridge.
    * @param [params.mute] - Mute audio from this channel, preventing it to pass through to the bridge.
    */
  def addChannel(params: AbsorbDTMF): js.Promise[Unit] = js.native
  /**
    * Add a channel to a bridge.
    *
    * @param params.bridgeId - Bridges id.
    * @param params.channel - Ids of channels to add to bridge.
    * @param [params.role] - Channels role in the bridge.
    * @param [params.absorbDTMF] - Absorb DTMF coming from this channel, preventing it to pass through to the bridge.
    * @param [params.mute] - Mute audio from this channel, preventing it to pass through to the bridge.
    */
  def addChannel(params: AbsorbDTMF, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Removes any explicit video source in a multi-party mixing bridge. This operation has no effect on bridges with two or fewer participants. When no explicit video source is set, talk
    * detection will be used to determine the active video stream.
    *
    * @param params.bridgeId - Bridges id.
    */
  def clearVideoSource(params: BridgeIdString): js.Promise[Unit] = js.native
  /**
    * Removes any explicit video source in a multi-party mixing bridge. This operation has no effect on bridges with two or fewer participants. When no explicit video source is set, talk
    * detection will be used to determine the active video stream.
    *
    * @param params.bridgeId - Bridges id.
    */
  def clearVideoSource(params: BridgeIdString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Create a new bridge.
    * This bridge persists until it has been shut down, or Asterisk has been shut down.
    *
    * @param [params.type] - Comma separated list of bridge type attributes (mixing, holding, dtmf_events, proxy_media, video_sfu).
    * @param [params.bridgeId] - Unique ID to give to the bridge being created.
    * @param [params.name] - Name to give to the bridge being created.
    */
  def create(): js.Promise[Bridge] = js.native
  /**
    * Create a new bridge.
    * This bridge persists until it has been shut down, or Asterisk has been shut down.
    */
  def create(callback: js.Function2[/* err */ Error, /* bridge */ Bridge, Unit]): Unit = js.native
  def create(params: BridgeId): js.Promise[Bridge] = js.native
  /**
    * Create a new bridge.
    * This bridge persists until it has been shut down, or Asterisk has been shut down.
    *
    * @param [params.type] - Comma separated list of bridge type attributes (mixing, holding, dtmf_events, proxy_media, video_sfu).
    * @param [params.bridgeId] - Unique ID to give to the bridge being created.
    * @param [params.name] - Name to give to the bridge being created.
    */
  def create(params: BridgeId, callback: js.Function2[/* err */ Error, /* bridge */ Bridge, Unit]): Unit = js.native
  
  /**
    * Create a new bridge or updates an existing one.
    * This bridge persists until it has been shut down, or Asterisk has been shut down.
    *
    * @param [params.type] - Comma separated list of bridge type attributes (mixing, holding, dtmf_events, proxy_media, video_sfu) to set.
    * @param params.bridgeId - Unique ID to give to the bridge being created.
    * @param [params.name] - Set the name of the bridge.
    */
  def createWithId(params: Name): js.Promise[Bridge] = js.native
  /**
    * Create a new bridge or updates an existing one.
    * This bridge persists until it has been shut down, or Asterisk has been shut down.
    *
    * @param [params.type] - Comma separated list of bridge type attributes (mixing, holding, dtmf_events, proxy_media, video_sfu) to set.
    * @param params.bridgeId - Unique ID to give to the bridge being created.
    * @param [params.name] - Set the name of the bridge.
    */
  def createWithId(params: Name, callback: js.Function2[/* err */ Error, /* bridge */ Bridge, Unit]): Unit = js.native
  
  /**
    * Shut down a bridge.
    * If any channels are in this bridge, they will be removed and resume whatever they were doing beforehand.
    *
    * @param params.bridgeId - Bridges id.
    */
  def destroy(params: BridgeIdString): js.Promise[Unit] = js.native
  /**
    * Shut down a bridge.
    * If any channels are in this bridge, they will be removed and resume whatever they were doing beforehand.
    *
    * @param params.bridgeId - Bridges id.
    */
  def destroy(params: BridgeIdString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Get bridge details.
    *
    * @param params.bridgeId - Bridges id.
    */
  def get(params: BridgeIdString): js.Promise[Bridge] = js.native
  /**
    * Get bridge details.
    *
    * @param params.bridgeId - Bridges id.
    */
  def get(params: BridgeIdString, callback: js.Function2[/* err */ Error, /* bridge */ Bridge, Unit]): Unit = js.native
  
  /**
    * List all active bridges in Asterisk.
    */
  def list(): js.Promise[js.Array[Bridge]] = js.native
  /**
    * List all active bridges in Asterisk.
    */
  def list(callback: js.Function2[/* err */ Error, /* bridges */ js.Array[Bridge], Unit]): Unit = js.native
  
  /**
    * Start playback of media on a bridge.
    * The media URI may be any of a number of URIs. Currently sound:, recording:, number:, digits:, characters:, and tone: URIs are supported. This operation creates a playback resource
    * that can be used to control the playback of media (pause, rewind, fast forward, etc.).
    *
    * @param params.bridgeId - Bridges id.
    * @param params.media - Media URIs to play.
    * @param [params.lang] - For sounds, selects language for sound.
    * @param [params.offsetms] - Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified.
    * @param [params.skipms] - Number of milliseconds to skip for forward/reverse operations.
    * @param [params.playbackId] - Playback Id.
    */
  def play(params: Lang): js.Promise[Playback] = js.native
  /**
    * Start playback of media on a bridge.
    * The media URI may be any of a number of URIs. Currently sound:, recording:, number:, digits:, characters:, and tone: URIs are supported. This operation creates a playback resource
    * that can be used to control the playback of media (pause, rewind, fast forward, etc.).
    *
    * @param params.bridgeId - Bridges id.
    * @param params.media - Media URIs to play.
    * @param [params.lang] - For sounds, selects language for sound.
    * @param [params.offsetms] - Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified.
    * @param [params.skipms] - Number of milliseconds to skip for forward/reverse operations.
    * @param [params.playbackId] - Playback Id.
    */
  def play(params: Lang, callback: js.Function2[/* err */ Error, /* playback */ Playback, Unit]): Unit = js.native
  
  /**
    * Start playback of media on a bridge.
    * The media URI may be any of a number of URIs. Currently sound:, recording:, number:, digits:, characters:, and tone: URIs are supported. This operation creates a playback resource
    * that can be used to control the playback of media (pause, rewind, fast forward, etc.).
    *
    * @param params.bridgeId - Bridges id.
    * @param params.playbackId - Playback ID.
    * @param params.media - Media URIs to play.
    * @param [params.lang] - For sounds, selects language for sound.
    * @param [params.offsetms] - Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified.
    * @param [params.skipms] - Number of milliseconds to skip for forward/reverse operations.
    */
  def playWithId(params: Media): js.Promise[Playback] = js.native
  /**
    * Start playback of media on a bridge.
    * The media URI may be any of a number of URIs. Currently sound:, recording:, number:, digits:, characters:, and tone: URIs are supported. This operation creates a playback resource
    * that can be used to control the playback of media (pause, rewind, fast forward, etc.).
    *
    * @param params.bridgeId - Bridges id.
    * @param params.playbackId - Playback ID.
    * @param params.media - Media URIs to play.
    * @param [params.lang] - For sounds, selects language for sound.
    * @param [params.offsetms] - Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified.
    * @param [params.skipms] - Number of milliseconds to skip for forward/reverse operations.
    */
  def playWithId(params: Media, callback: js.Function2[/* err */ Error, /* playback */ Playback, Unit]): Unit = js.native
  
  /**
    * Start a recording.
    * This records the mixed audio from all channels participating in this bridge.
    *
    * @param params.bridgeId - Bridges id.
    * @param params.name - Recordings filename.
    * @param params.format - Format to encode audio in.
    * @param [params.maxDurationSeconds] - Maximum duration of the recording, in seconds. 0 for no limit.
    * @param [params.maxSilenceSeconds] - Maximum duration of silence, in seconds. 0 for no limit.
    * @param [params.ifExists] - Action to take if a recording with the same name already exists.
    * @param [params.beep] - Play beep when recording begins.
    * @param [params.terminateOn] - DTMF input to terminate recording.
    */
  def record(params: Beep): js.Promise[LiveRecording] = js.native
  /**
    * Start a recording.
    * This records the mixed audio from all channels participating in this bridge.
    *
    * @param params.bridgeId - Bridges id.
    * @param params.name - Recordings filename.
    * @param params.format - Format to encode audio in.
    * @param [params.maxDurationSeconds] - Maximum duration of the recording, in seconds. 0 for no limit.
    * @param [params.maxSilenceSeconds] - Maximum duration of silence, in seconds. 0 for no limit.
    * @param [params.ifExists] - Action to take if a recording with the same name already exists.
    * @param [params.beep] - Play beep when recording begins.
    * @param [params.terminateOn] - DTMF input to terminate recording.
    */
  def record(params: Beep, callback: js.Function2[/* err */ Error, /* liverecording */ LiveRecording, Unit]): Unit = js.native
  
  /**
    * Remove a channel from a bridge.
    *
    * @param params.bridgeId - Bridges id.
    * @param params.channel - Ids of channels to remove from bridge.
    */
  def removeChannel(params: typings.ariClient.anon.Channel): js.Promise[Unit] = js.native
  /**
    * Remove a channel from a bridge.
    *
    * @param params.bridgeId - Bridges id.
    * @param params.channel - Ids of channels to remove from bridge.
    */
  def removeChannel(params: typings.ariClient.anon.Channel, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Set a channel as the video source in a multi-party mixing bridge. This operation has no effect on bridges with two or fewer participants.
    *
    * @param params.bridgeId - Bridges id.
    * @param params.channelId - Channels id.
    */
  def setVideoSource(params: ChannelId): js.Promise[Unit] = js.native
  /**
    * Set a channel as the video source in a multi-party mixing bridge. This operation has no effect on bridges with two or fewer participants.
    *
    * @param params.bridgeId - Bridges id.
    * @param params.channelId - Channels id.
    */
  def setVideoSource(params: ChannelId, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Play music on hold to a bridge or change the MOH class that is playing.
    *
    * @param params.bridgeId - Bridges id.
    * @param [params.mohClass] - Channels id.
    */
  def startMoh(params: MohClass): js.Promise[Unit] = js.native
  /**
    * Play music on hold to a bridge or change the MOH class that is playing.
    *
    * @param params.bridgeId - Bridges id.
    * @param [params.mohClass] - Channels id.
    */
  def startMoh(params: MohClass, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Stop playing music on hold to a bridge.
    * This will only stop music on hold being played via POST bridges/{bridgeId}/moh.
    *
    * @param params.bridgeId - Bridges id.
    */
  def stopMoh(params: BridgeIdString): js.Promise[Unit] = js.native
  /**
    * Stop playing music on hold to a bridge.
    * This will only stop music on hold being played via POST bridges/{bridgeId}/moh.
    *
    * @param params.bridgeId - Bridges id.
    */
  def stopMoh(params: BridgeIdString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}
