package typings.agoraRtcSdk.mod

import typings.agoraRtcSdk.AnonCacheResource
import typings.agoraRtcSdk.AnonContain
import typings.agoraRtcSdk.AnonCycle
import typings.agoraRtcSdk.AnonSoundId
import typings.agoraRtcSdk.agoraRtcSdkStrings.accessAllowed
import typings.agoraRtcSdk.agoraRtcSdkStrings.accessDenied
import typings.agoraRtcSdk.agoraRtcSdkStrings.audio
import typings.agoraRtcSdk.agoraRtcSdkStrings.audioMixingFinished
import typings.agoraRtcSdk.agoraRtcSdkStrings.audioMixingPlayed
import typings.agoraRtcSdk.agoraRtcSdkStrings.high_quality
import typings.agoraRtcSdk.agoraRtcSdkStrings.high_quality_stereo
import typings.agoraRtcSdk.agoraRtcSdkStrings.music_standard
import typings.agoraRtcSdk.agoraRtcSdkStrings.speech_low_quality
import typings.agoraRtcSdk.agoraRtcSdkStrings.speech_standard
import typings.agoraRtcSdk.agoraRtcSdkStrings.standard_stereo
import typings.agoraRtcSdk.agoraRtcSdkStrings.stopScreenSharing
import typings.agoraRtcSdk.agoraRtcSdkStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Stream object created by the {@link createStream} method.
  *
  * A stream represents a published local or remote media stream object in a call session.
  *
  * All Stream methods can be called for both local and remote streams, except for {@link Stream.init} that only applies to the local stream.
  */
@js.native
trait Stream extends js.Object {
  /**
    * Adds the Audio or Video Track
    *
    * This method adds the audio or video tracks into the stream.
    *
    * @param track The track can be retrieved from the `mediaStream` method.
    *
    * @example **Sample Code**
    *
    * ```javascript
    * var localStream = AgoraRTC.createStream({audio: true, video: false});
    * localStream.addTrack(anotherStream.getVideoTrack());
    * ```
    *
    * **Note:**
    *
    * - Firefox does not support this function.
    * - A Stream object can have only one audio track and one video track at most.
    */
  def addTrack(track: MediaStreamTrack): Unit = js.native
  /**
    * Adjusts Audio Mixing Volume
    *
    * @param level The volume of the mixing audio. The value ranges between 0 and 100 (default).
    */
  def adjustAudioMixingVolume(level: Double): Unit = js.native
  /**
    * Closes the Audio/Video Stream
    *
    * This method closes the video/audio stream.
    *
    * After calling this method, the camera and microphone authorizations are reset.
    */
  def close(): Unit = js.native
  /**
    * Disables the Audio
    *
    * **DEPRECATED** from v 2.5.1, use [[muteAudio]] instead.
    *
    * This method disables the audio track in the stream.
    *
    * It works only when the audio flag is `true` in the stream.
    */
  def disableAudio(): Unit = js.native
  /**
    * Disables the Video
    *
    * **DEPRECATED** from v 2.5.1, use [[muteVideo]] instead.
    *
    * This method disables the video track in the stream.
    *
    * It works only when the video flag is `true` in the stream.
    */
  def disableVideo(): Unit = js.native
  /**
    * Enables the Audio
    *
    * **DEPRECATED** from v 2.5.1, use [[unmuteAudio]] instead.
    *
    * This method enables the audio track in the stream.
    *
    * It works only when the audio flag is `true` in the stream.
    *
    * By default the audio track is enabled. If you call {@link disableAudio}, call this method to enable audio.
    */
  def enableAudio(): Unit = js.native
  /**
    * Enables the Video
    *
    * **DEPRECATED** from v 2.5.1, use [[unmuteVideo]] instead.
    *
    * This method enables the video track in the stream.
    *
    * It works only when the video flag is `true` in the stream.
    *
    * By default the video track is enabled. If you call {@link disableVideo}, call this method to enable video.
    *
    */
  def enableVideo(): Unit = js.native
  /**
    * Retrieves the Current Audio Level
    *
    * This method retrieves the current audio level.
    *
    * Call `setTimeout` or `setInterval` to retrieve the local or remote audio change.
    * @example **Sample Code**
    * ``` javascript
    * setInterval(function() {
    *   var audioLevel = stream.getAudioLevel();
    *   // Use audioLevel to render the UI
    * }, 100)
    * ```
    *
    * This method does not apply to streams that contain no audio data and may result in warnings.
    *
    * **Note:**
    *
    * Due to browser policy changes, this method must be triggered by the user's gesture on the Chrome 70+ and Safari browser.
    * See [Autoplay Policy Changes](https://developers.google.com/web/updates/2017/09/autoplay-policy-changes) for details.
    */
  def getAudioLevel(): Double = js.native
  /**
    * Retrieves the Current Position of the Audio Mixing
    *
    * Retrieves the playback position (ms) of the audio.
    *
    * @returns Returns the current position of the audio mixing if successful.
    */
  def getAudioMixingCurrentPosition(): Double | Unit = js.native
  /**
    * Retrieves Audio Mixing Duration
    *
    * @returns Returns the audio mixing duration (ms) if successful.
    */
  def getAudioMixingDuration(): Double | Unit = js.native
  /**
    * Retrieves the Audio Track
    *
    * This method retrieves the audio track in the stream and can be used together with [[replaceTrack]].
    * @returns If the stream contains an audio track, it will be returned in a `MediaStreamTrack` object.
    */
  def getAudioTrack(): MediaStreamTrack | Unit = js.native
  /**
    * Gets the volume of the audio effects.
    *
    * @returns Returns an array that contains `soundId` and `volume`. Each `soundId` has a corresponding`volume`.
    *
    * - `soundId`: The ID of the audio effect. Each audio effect has a unique ID. The value range is [1,10000].
    * - `volume`: Volume of the audio effect. The value range is [0,100].
    *
    * @example **Sample code**
    * ``` javascript
    * var volumes = stream.getEffectsVolume();
    * volumes.forEach(function({soundId, volume}){
    *     console.log("SoundId", soundId, "Volume", volume);
    * });
    * ```
    */
  def getEffectsVolume(): js.Array[AnonSoundId] = js.native
  /**
    * Retrieves the Stream ID
    *
    * This method retrieves the stream ID.
    * @example `stream.getId()`
    */
  def getId(): Double = js.native
  /**
    * Gets Connection Statistics
    *
    * This method gets the connection statistics of the stream.
    *
    * **Note:**
    *
    * It may take some time to get some of the statistics.
    *
    * @param callback The callback contains the connection statistics of the stream.
    *
    * - If it is a publishing stream, then the stats is {@link LocalStreamStats}.
    * - If it is a subscribing stream, then the stats is {@link RemoteStreamStats}.
    *
    *
    * @example **Sample Code**
    *
    * ``` javascript
    * localStream.getStats((stats) => {
    *     console.log(`Local Stream accessDelay: ${stats.accessDelay}`);
    *     console.log(`Local Stream audioSendBytes: ${stats.audioSendBytes}`);
    *     console.log(`Local Stream audioSendPackets: ${stats.audioSendPackets}`);
    *     console.log(`Local Stream audioSendPacketsLost: ${stats.audioSendPacketsLost}`);
    *     console.log(`Local Stream videoSendBytes: ${stats.videoSendBytes}`);
    *     console.log(`Local Stream videoSendFrameRate: ${stats.videoSendFrameRate}`);
    *     console.log(`Local Stream videoSendPackets: ${stats.videoSendPackets}`);
    *     console.log(`Local Stream videoSendPacketsLost: ${stats.videoSendPacketsLost}`);
    *     console.log(`Local Stream videoSendResolutionHeight: ${stats.videoSendResolutionHeight}`);
    *     console.log(`Local Stream videoSendResolutionWidth: ${stats.videoSendResolutionWidth}`);
    * });
    *
    *
    * remoteStream.getStats((stats) => {
    *     console.log(`Remote Stream accessDelay: ${stats.accessDelay}`);
    *     console.log(`Remote Stream audioReceiveBytes: ${stats.audioReceiveBytes}`);
    *     console.log(`Remote Stream audioReceiveDelay: ${stats.audioReceiveDelay}`);
    *     console.log(`Remote Stream audioReceivePackets: ${stats.audioReceivePackets}`);
    *     console.log(`Remote Stream audioReceivePacketsLost: ${stats.audioReceivePacketsLost}`);
    *     console.log(`Remote Stream endToEndDelay: ${stats.endToEndDelay}`);
    *     console.log(`Remote Stream videoReceiveBytes: ${stats.videoReceiveBytes}`);
    *     console.log(`Remote Stream videoReceiveDecodeFrameRate: ${stats.videoReceiveDecodeFrameRate}`);
    *     console.log(`Remote Stream videoReceiveDelay: ${stats.videoReceiveDelay}`);
    *     console.log(`Remote Stream videoReceiveFrameRate: ${stats.videoReceiveFrameRate}`);
    *     console.log(`Remote Stream videoReceivePackets: ${stats.videoReceivePackets}`);
    *     console.log(`Remote Stream videoReceivePacketsLost: ${stats.videoReceivePacketsLost}`);
    *     console.log(`Remote Stream videoReceiveResolutionHeight: ${stats.videoReceiveResolutionHeight}`);
    *     console.log(`Remote Stream videoReceiveResolutionWidth: ${stats.videoReceiveResolutionWidth}`);
    * });
    *
    * ```
    */
  def getStats(callback: js.Function1[/* stats */ LocalStreamStats | RemoteStreamStats, Unit]): Unit = js.native
  /**
    * Retrieves the Video Track
    *
    * This method retrieves the video track in the stream and can be used together with [[replaceTrack]].
    * @returns If the stream contains a video track, it will be returned in a `MediaStreamTrack` object.
    */
  def getVideoTrack(): MediaStreamTrack | Unit = js.native
  /**
    * Retrieves the Audio Flag
    *
    * This method retrieves the audio flag.
    * @returns
    * - true: The stream contains audio data.
    * - false: The stream does not contain audio data.
    */
  def hasAudio(): Boolean = js.native
  /**
    * Retrieves the Video Flag
    *
    * This method retrieves the video flag.
    * @returns
    * - true: The stream contains video data.
    * - false: The stream does not contain video data.
    */
  def hasVideo(): Boolean = js.native
  /**
    * Initializes the Stream Object
    *
    * This method initializes the local stream object.
    *
    * If this method fails, see [getUserMedia Exceptions](https://developer.mozilla.org/en-US/docs/Web/API/MediaDevices/getUserMedia#Exceptions) for error information.
    *
    * Some errors might be returned in the callback, for example: `{type: "error",  msg: "NotAllowedError", info: "Permission denied"}`.
    *
    * The possible error information in the `msg` field includes:
    *
    * - NotAllowedError: User refuses to grant access to camera or audio resource.
    * - MEDIA_OPTION_INVALID: The camera is occupied or the resolution is not supported (on browsers in early versions).
    * - DEVICES_NOT_FOUND: No device is found.
    * - NOT_SUPPORTED: The browser does not support using camera and microphone.
    * - PERMISSION_DENIED: The device is disabled by the browser or the user has denied permission of using the device.
    * - CONSTRAINT_NOT_SATISFIED: The settings are illegal (on browsers in early versions).
    * - PluginNotInstalledProperly: A screen-sharing request is made with no plugin installed or with a wrong [[extensionId]] on the Chrome browser.
    * - UNDEFINED: Undefined error.
    *
    * The `info` field shows the extra information for the error. If no more extra information, its value will be `null`.
    *
    * @example **Sample Code**
    *
    * ``` javascript
    * init(function() {
    *     console.log("local stream initialized");
    *     // publish the stream
    *     //……
    * }, function(err) {
    *     console.error("local stream init failed ", err);
    *     //error handling
    * });
    *
    * ```
    * @param onSuccess The callback when the method succeeds.
    * @param onFailure The callback when the method fails.
    */
  def init(): Unit = js.native
  def init(onSuccess: js.Function0[Unit]): Unit = js.native
  def init(onSuccess: js.Function0[Unit], onFailure: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  /**
    * Returns Whether the Stream is Playing
    *
    * @returns
    * - `true`: The stream is being rendered or playing on the page.
    * - `false`: The stream is neither being rendered nor playing on the page.
    */
  def isPlaying(): Boolean = js.native
  /**
    * Disables the Audio
    *
    * This method disables the audio track in the stream.
    *
    * - For local streams, the SDK stops sending audio after you call this method.
    * - For remote streams, the SDK still receives audio but stops playing it after you call this method.
    *
    * **Note:** For local streams, it works only when the audio flag is `true` in the stream.
    * @returns
    * - `true`: Success.
    * - `false`: Failure. Possible reasons include no audio, stream not initialized, and audio track already disabled.
    */
  def muteAudio(): Unit = js.native
  /**
    * Disables the Video
    *
    * This method disables the video track in the stream.
    *
    * - For local streams, the SDK stops sending video after you call this method.
    * - For remote streams, the SDK still receives video but stops playing it after you call this method.
    *
    * **Note:** For local streams, it works only when the video flag is `true` in the stream.
    * @returns
    * - `true`: Success.
    * - `false`: Failure. Possible reasons include no video, stream not initialized, and video track already disabled.
    */
  def muteVideo(): Unit = js.native
  /** Occurs when the user gives access to the camera and microphone. */
  @JSName("on")
  def on_accessAllowed(event: accessAllowed, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /** Occurs when the user denies access to the camera and microphone. */
  @JSName("on")
  def on_accessDenied(event: accessDenied, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /** Occurs when the last audio mixing stream playback finishes. */
  @JSName("on")
  def on_audioMixingFinished(event: audioMixingFinished, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Occurs when the audio mixing stream playback starts/resumes.
    *
    * **Note:**
    * This callback is triggered when the audio mixing stream is loaded and starts playing, or when the paused audio mixing stream resumes playing.
    */
  @JSName("on")
  def on_audioMixingPlayed(event: audioMixingPlayed, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /** Occurs when screen-sharing stops. */
  @JSName("on")
  def on_stopScreenSharing(event: stopScreenSharing, callback: js.Function1[/* evt */ js.Any, Unit]): Unit = js.native
  /**
    * Pauses all audio effects.
    *
    * @example **Sample code**
    * ``` javascript
    * stream.pauseAllEffects(function(err){
    *     if (err){
    *         console.error("Failed to pause effects, reason: ", err);
    *     }else{
    *         console.log("Effects are paused successfully");
    *     }
    * });
    * ```
    */
  def pauseAllEffects(): Unit = js.native
  def pauseAllEffects(callback: js.Function1[/* err */ String | Null, Unit]): Unit = js.native
  /**
    * Pauses Audio Mixing
    *
    */
  def pauseAudioMixing(): Unit = js.native
  def pauseAudioMixing(callback: js.Function1[/* err */ String | Null, Unit]): Unit = js.native
  /**
    * Pauses a specified audio effect.
    *
    * @param soundId The ID of the audio effect. Each audio effect has a unique ID. The value range is [1,10000].
    * @example **Sample code**
    * ``` javascript
    * // When the audio effect 1 is playing
    * stream.pauseEffect(1, function(err){
    *     if (err){
    *         console.error("Failed to pause Effect, reason: ", err);
    *     }else{
    *         console.log("Effect is paused successfully");
    *     }
    * });
    * ```
    */
  def pauseEffect(soundId: Double): Unit = js.native
  def pauseEffect(soundId: Double, callback: js.Function1[/* err */ String | Null, Unit]): Unit = js.native
  /**
    * Plays the Audio/Video Stream
    *
    * This method plays the video or audio stream.
    *
    * **Note:**
    *
    * Due to browser policy changes, this method must be triggered by the user's gesture on the Chrome 70+ and Safari browsers.
    * See [Autoplay Policy Changes](https://developers.google.com/web/updates/2017/09/autoplay-policy-changes) for details.
    * @example **Sample Code**
    *
    * ``` javascript
    * stream.play("agora_remote", {fit: 'contain'}); // stream will be played in the element with the ID agora_remote
    * ```
    * @param HTMLElementID Represents the HTML element ID. Digits and letters in the ASCII character set, “_”, “-", and ".". The string length must be greater than 0 and less than 256 bytes.
    * @param option Options for playing the stream.
    *
    */
  def play(HTMLElementID: String): Unit = js.native
  def play(HTMLElementID: String, option: AnonContain): Unit = js.native
  /**
    * Plays a specified audio effect.
    *
    * This method supports playing multiple audio effect files at the same time, and is different from [[startAudioMixing]].
    *
    * You can use this method to add specific audio effects for specific scenarios. For example, gaming.
    *
    * **Note:**
    *
    * - Due to web browser autoplay policy changes, this method must be triggered by a user gesture on Chrome 70+ and Safari web browsers.
    * See [Autoplay Policy Changes](https://developers.google.com/web/updates/2017/09/autoplay-policy-changes) for details.
    * - This method supports the following web browsers:
    *   * Safari 12 and later
    *   * Chrome 65 and later
    *   * Firefox 66 and later
    * - Call this method when you are in a channel. Otherwise, it may cause issues.
    *
    * @param options Audio effect options.
    * @param callback
    * The callback of this method:
    *
    * - null: the method call succeeds.
    * - err: the method call fails.
    *
    * **Note:**
    *
    * The callbacks of the audio effect methods all use the Node.js callback pattern.
    *
    * @example **Sample code**
    *
    * ``` javascript
    * stream.playEffect({
    *      soundId: 1,
    *     filePath: "biu.mp3"
    * }, function(error) {
    *     if (error) {
    *         // Error handling
    *         return;
    *     }
    *     // Process after the method call succeeds
    * });
    *
    * ```
    */
  def playEffect(options: AnonCycle): Unit = js.native
  def playEffect(options: AnonCycle, callback: js.Function1[/* err */ String | Null, Unit]): Unit = js.native
  /**
    * Preloads a specified audio effect file into the memory.
    *
    * To ensure smooth communication, limit the size of the audio effect file.
    *
    * @param soundId The ID of the audio effect. Each audio effect has a unique ID. The value range is [1,10000].
    * @param filePath The URL of the online audio effect file. Supports MP3, AAC, and other audio formats depending on the browser.
    *
    * @example **Sample code**
    * ``` javascript
    * stream.preloadEffect(1, "https://web-demos-static.agora.io/agora/smlt.flac", function(err){
    *     if (err){
    *         console.error("Failed to preload effect, reason: ", err);
    *     }else{
    *         console.log("Effect is preloaded successfully");
    *     }
    * });
    * ```
    */
  def preloadEffect(soundId: Double, filePath: String): Unit = js.native
  def preloadEffect(soundId: Double, filePath: String, callback: js.Function1[/* err */ String | Null, Unit]): Unit = js.native
  /**
    * Removes the Audio or Video Track
    *
    * This method removes the audio or video tracks from the stream.
    *
    * **Note:**
    *
    * If you need to change both the audio and video tracks, Agora recommend using the [[replaceTrack]] method instead.
    *
    * @example **Sample Code**
    *
    * ```javascript
    * var localStream = AgoraRTC.createStream({audio: true, video: true});
    * localStream.removeTrack(localStream.getAudioTrack());
    * ```
    *
    * @param track The track can be retrieved from the `mediaStream` method.
    *
    * **Note:**
    *
    * Firefox does not support this function.
    */
  def removeTrack(track: MediaStreamTrack): Unit = js.native
  /**
    * Replaces the Audio/Video Track
    *
    * This method replaces the audio or video `MediaStreamTrack` in the local stream.
    *
    * After the local stream is published, you can use this method to switch the cameras, or switch between the microphone and the music player.
    *
    * The new track can be retrieved by `getUserMedia`, `MediaElement.captureStream` or other methods.
    *
    * The replaced track will be stopped.
    *
    * **Note:**
    *
    * - Supports Chrome 65+, Safari, and latest Firefox.
    * - Firefox does not support switching audio tracks between different microphones. You can replace the audio track from the microphone with an audio file, or vice versa.
    * - Replacing audio tracks from external audio devices may not be fully supported on Safari.
    * - The subscriber will not be notified if the track gets replaced.
    * - Agora recommends you use [[switchDevice]] to switch the media input devices.
    *
    * @example **Sample Code**
    *
    * ```javascript
    * // Suppose we have a localStream1
    * localStream2 = AgoraRTC.createStream({video: true, cameraId: "XXX"});
    * localStream2.setVideoProfile('<same as localStream1>')
    * localStream2.init(function(){
    *     var newVideoTrack = localStream2.getVideoTrack();
    *     localStream1.replaceTrack(newVideoTrack);
    * });
    * ```
    *
    * @param MediaStreamTrack The new track.
    * @param onSuccess The callback when the method succeeds.
    * @param onFailure The callback when the method fails.
    */
  def replaceTrack(MediaStreamTrack: MediaStreamTrack): Unit = js.native
  def replaceTrack(MediaStreamTrack: MediaStreamTrack, onSuccess: js.Function0[Unit]): Unit = js.native
  def replaceTrack(
    MediaStreamTrack: MediaStreamTrack,
    onSuccess: js.Function0[Unit],
    onFailure: js.Function1[/* err */ String, Unit]
  ): Unit = js.native
  /**
    * Resumes playing all audio effects.
    *
    * @example **Sample code**
    * ``` javascript
    * stream.resumeAllEffects(function(err){
    *     if (err){
    *         console.error("Failed to resume effects, reason: ", err);
    *     }else{
    *         console.log("Effects are resumed successfully");
    *     }
    * });
    * ```
    */
  def resumeAllEffects(): Unit = js.native
  def resumeAllEffects(callback: js.Function1[/* err */ String | Null, Unit]): Unit = js.native
  /**
    * Resumes Audio Mixing
    *
    */
  def resumeAudioMixing(): Unit = js.native
  def resumeAudioMixing(callback: js.Function1[/* err */ String | Null, Unit]): Unit = js.native
  /**
    * Resumes playing a specified audio effect.
    *
    * @param soundId The ID of the audio effect. Each audio effect has a unique ID. The value range is [1,10000].
    * @example **Sample code**
    * ``` javascript
    * // When the audio effect 1 is paused
    * stream.resumeEffect(1, function(err){
    *     if (err){
    *         console.error("Failed to resume Effect, reason: ", err);
    *     }else{
    *         console.log("Effect is resumed successfully");
    *     }
    * });
    * ```
    */
  def resumeEffect(soundId: Double): Unit = js.native
  def resumeEffect(soundId: Double, callback: js.Function1[/* err */ String | Null, Unit]): Unit = js.native
  /**
    * Sets the Audio Mixing Position
    *
    * Sets the playback position of the audio mixing file to a different start position (by default plays from the beginning).
    *
    * @param position The time (ms) to start playing the audio mixing file, an integer. The value range is [0,100000000].
    */
  def setAudioMixingPosition(position: Double): Unit = js.native
  def setAudioMixingPosition(position: Double, callback: js.Function1[/* err */ String | Null, Unit]): Unit = js.native
  /**
    * Sets the Audio Output
    *
    * This method sets the audio output device for the remote stream. You can use it to switch between the microphone and the speakerphone.
    *
    * It can be called either before or after the remote stream is played.
    *
    * **Note:**
    *
    * Only Chrome 49+ supports this function.
    * @param deviceId The device ID can be retrieved from {@link getDevices}, whose [[kind]] should be "audiooutput".
    *
    * The retrieved ID is ASCII characters, and the string length is greater than 0 and less than 256 bytes.
    */
  def setAudioOutput(deviceId: String): Unit = js.native
  def setAudioOutput(deviceId: String, onSuccess: js.Function0[Unit]): Unit = js.native
  def setAudioOutput(deviceId: String, onSuccess: js.Function0[Unit], onFailure: js.Function1[/* err */ String, Unit]): Unit = js.native
  @JSName("setAudioProfile")
  def setAudioProfile_highquality(profile: high_quality): Unit = js.native
  @JSName("setAudioProfile")
  def setAudioProfile_highqualitystereo(profile: high_quality_stereo): Unit = js.native
  @JSName("setAudioProfile")
  def setAudioProfile_musicstandard(profile: music_standard): Unit = js.native
  /**
    * Sets the Audio Profile
    *
    * This method sets the audio profile.
    *
    * It is optional and works only when called before {@link Stream.init}. The default value is `"music_standard"`.
    *
    * **Note:**
    *
    * Due to the limitations of browsers, some browsers may not be fully compatible with the audio profile you set.
    *
    * - Firefox does not support setting the audio encoding rate.
    * - Safari does not support stereo audio.
    * - The latest version of Google Chrome does not support playing stereo audio, but supports sending a stereo audio stream.
    *
    * @param profile The audio profile has the following options:
    * - `"speech_low_quality"`: Sample rate 16 kHz, mono, encoding rate 24 Kbps.
    * - `"speech_standard"`: Sample rate 32 kHz, mono, encoding rate 24 Kbps.
    * - `"music_standard"`: Sample rate 48 kHz, mono, encoding rate 40 Kbps.
    * - `"standard_stereo"`: Sample rate 48 kHz, stereo, encoding rate 64 Kbps.
    * - `"high_quality"`: Sample rate 48 kHz, mono, encoding rate 128 Kbps.
    * - `"high_quality_stereo"`: Sample rate 48 kHz, stereo, encoding rate 192 Kbps.
    */
  @JSName("setAudioProfile")
  def setAudioProfile_speechlowquality(profile: speech_low_quality): Unit = js.native
  @JSName("setAudioProfile")
  def setAudioProfile_speechstandard(profile: speech_standard): Unit = js.native
  @JSName("setAudioProfile")
  def setAudioProfile_standardstereo(profile: standard_stereo): Unit = js.native
  /**
    * Sets the Volume
    *
    * This method set the volume for the remote stream.
    *
    * It can be called either before or after the remote stream is played.
    *
    * @param volume Ranges from 0 (muted) to 100 (loudest).
    */
  def setAudioVolume(volume: Double): Unit = js.native
  /**
    * Sets the volume of the audio effects.
    *
    * @param volume Volume of the audio effect. The value range is [0,100].The default value is 100 (the original volume).
    * @example **Sample code**
    * ```javascript
    * stream.setEffectsVolume(0, function(err){
    *     if (err){
    *         console.error("Failed to set effects volume, reason: ", err);
    *     }else{
    *         console.log("Effects volume is set successfully");
    *     }
    * });
    * ```
    */
  def setEffectsVolume(volume: Double): Unit = js.native
  def setEffectsVolume(volume: Double, callback: js.Function1[/* err */ String | Null, Unit]): Unit = js.native
  /**
    * Sets the Screen Profile
    *
    * This method sets the profile of the screen in screen-sharing.
    * @param profile The screen profile. See the following table for details.
    *
    * [[include:ScreenProfileDefinition.md]]
    */
  def setScreenProfile(profile: String): Unit = js.native
  /**
    * Sets the Video Profile
    *
    * This method sets the video profile.
    *
    * It is optional and works only when called before {@link Stream.init}. The default value is `"480p_1"`.
    *
    * @example `setVideoProfile("480p");`
    * @param profile The video profile. See the following table for its definition and supported profiles in different scenarios.
    *
    * [[include:VideoProfileDefinition.md]]
    */
  def setVideoProfile(profile: String): Unit = js.native
  /**
    * Sets the volume of a specified audio effect.
    *
    * @param soundId The ID of the audio effect. Each audio effect has a unique ID. The value range is [1,10000].
    * @param volume Volume of the audio effect. The value range is [0,100].The default value is 100 (the original volume).
    * @example **Sample code**
    * ``` javascript
    * // When the audio effect 1 is loaded
    * stream.setVolumeOfEffect(1, 50, function(err){
    *     if (err){
    *         console.error("Failed to set volume of Effect, reason: ", err);
    *     }else{
    *         console.log("Effect volume is set to", 50);
    *     }
    * });
    * ```
    */
  def setVolumeOfEffect(soundId: Double, volume: Double): Unit = js.native
  def setVolumeOfEffect(soundId: Double, volume: Double, callback: js.Function1[/* err */ String | Null, Unit]): Unit = js.native
  /**
    * Starts Audio Mixing
    *
    * This method mixes the specified online audio file with the audio stream from the microphone; or, it replaces the microphone’s audio stream with the specified online audio file.
    *
    * You can specify the number of playback loops and play time duration.
    *
    * **Note:**
    *
    * - This method supports the following browsers:
    *   * Safari 12 and later
    *   * Chrome 65 and later
    *   * Firefox 66 and later
    * - Call this method when you are in a channel, otherwise, it may cause issues.
    * - Due to browser policy changes, this method must be triggered by the user's gesture on the Chrome 70+ and Safari browser.
    *   See [Autoplay Policy Changes](https://developers.google.com/web/updates/2017/09/autoplay-policy-changes) for details.
    *
    * @param options Audio mixing settings.
    * @param callback
    * The callback of this method:
    *
    * - null: The method succeeds.
    * - err: The method fails.
    *
    * **Note:**
    * The callbacks of the other audio mixing methods are the same as this one, using the Node.js callback pattern.
    *
    * @example **Sample Code**
    *
    * ``` javascript
    * stream.startAudioMixing({
    *     filePath: 'example.mp3'
    * }, function(error) {
    *     if (error) {
    *         // Error handling
    *         return;
    *     }
    *     // Processes after stream playing
    * })
    *
    * ```
    */
  def startAudioMixing(options: AnonCacheResource): Unit = js.native
  def startAudioMixing(options: AnonCacheResource, callback: js.Function1[/* err */ String | Null, Unit]): Unit = js.native
  /**
    * Stops the Audio/Video Stream
    *
    * Call this method to stop playing the stream set by {@link Stream.play}.
    */
  def stop(): Unit = js.native
  /**
    * Stops playing all audio effects.
    *
    * @example **Sample code**
    * ```javascript
    * stream.stopAllEffects(function(err){
    *     if (err){
    *         console.error("Failed to stop effects, reason: ", err);
    *     }else{
    *         console.log("Effects are stopped successfully");
    *     }
    * });
    * ```
    */
  def stopAllEffects(): Unit = js.native
  def stopAllEffects(callback: js.Function1[/* err */ String | Null, Unit]): Unit = js.native
  /**
    * Stops Audio Mixing
    *
    */
  def stopAudioMixing(): Unit = js.native
  def stopAudioMixing(callback: js.Function1[/* err */ String | Null, Unit]): Unit = js.native
  /**
    * Stops playing a specified audio effect.
    *
    * @param soundId The ID of the audio effect. Each audio effect has a unique ID. The value range is [1,10000].
    * @example **Sample code**
    * ```javascript
    * // When the audio effect 1 is playing
    * stream.stopEffect(1, function(err){
    *     if (err){
    *         console.error("Failed to stop Effect, reason: ", err);
    *     }else{
    *         console.log("Effect is stopped successfully");
    *     }
    * });
    * ```
    */
  def stopEffect(soundId: Double): Unit = js.native
  def stopEffect(soundId: Double, callback: js.Function1[/* err */ String | Null, Unit]): Unit = js.native
  /**
    * Switches the Media Input Device
    *
    * This method switches between the media input devices:
    *
    * - Audio input devices, such as microphones.
    * - Video input devices, such as cameras.
    *
    * If you call this method after [[publish]], there is no need to re-publish the stream after switching the device.
    *
    * **Note:**
    *
    *  This method does not support the following scenarios:
    *
    * - Dual-stream mode is enabled by [[enableDualStream]].
    * - The remote stream.
    * - The stream is created by defining the [[audioSource]] and [[videoSource]] properties.
    * - The Firefox browser.
    *
    * @param type Type of the device: "audio" or "video".
    * @param deviceId  Device ID, which can be retrieved from [[getDevices]]. The retrieved ID is ASCII characters, and the string length is greater than 0 and less than 256 bytes.
    * @param onSuccess The callback when the method succeeds.
    * @param onFailure The callback when the method fails.
    */
  @JSName("switchDevice")
  def switchDevice_audio(`type`: audio, deviceId: String): Unit = js.native
  @JSName("switchDevice")
  def switchDevice_audio(`type`: audio, deviceId: String, onSuccess: js.Function0[Unit]): Unit = js.native
  @JSName("switchDevice")
  def switchDevice_audio(
    `type`: audio,
    deviceId: String,
    onSuccess: js.Function0[Unit],
    onFailure: js.Function1[/* err */ String, Unit]
  ): Unit = js.native
  @JSName("switchDevice")
  def switchDevice_video(`type`: video, deviceId: String): Unit = js.native
  @JSName("switchDevice")
  def switchDevice_video(`type`: video, deviceId: String, onSuccess: js.Function0[Unit]): Unit = js.native
  @JSName("switchDevice")
  def switchDevice_video(
    `type`: video,
    deviceId: String,
    onSuccess: js.Function0[Unit],
    onFailure: js.Function1[/* err */ String, Unit]
  ): Unit = js.native
  /**
    * Releases a specified preloaded audio effect from the memory.
    *
    * @param soundId The ID of the audio effect. Each audio effect has a unique ID. The value range is [1,10000].
    *
    * @example **Sample code**
    * ``` javascript
    * // When the audio effect 1 is loaded
    * stream.unloadEffect(1, function(err){
    *     if (err){
    *         console.error("Failed to unload effect, reason: ", err);
    *     }else{
    *         console.log("Effect is unloaded successfully");
    *     }
    * });
    * ```
    */
  def unloadEffect(soundId: Double): Unit = js.native
  def unloadEffect(soundId: Double, callback: js.Function1[/* err */ String | Null, Unit]): Unit = js.native
  /**
    * Enables the Audio
    *
    * This method enables the audio track in the stream.
    *
    * **Note:** For local streams, it works only when the audio flag is `true` in the stream.
    *
    * By default the audio track is enabled. If you call {@link muteAudio}, call this method to enable audio.
    * @returns
    * - `true`: Success.
    * - `false`: Failure. Possible reasons include no audio, stream not initialized, and audio track already enabled.
    */
  def unmuteAudio(): Unit = js.native
  /**
    * Enables the Video
    *
    * This method enables the video track in the stream.
    *
    * **Note:** For local streams, it works only when the video flag is `true` in the stream.
    *
    * By default the video track is enabled. If you call {@link muteVideo}, call this method to enable video.
    * @returns
    * - `true`: Success.
    * - `false`: Failure. Possible reasons include no video, stream not initialized, and video track already enabled.
    */
  def unmuteVideo(): Unit = js.native
}

