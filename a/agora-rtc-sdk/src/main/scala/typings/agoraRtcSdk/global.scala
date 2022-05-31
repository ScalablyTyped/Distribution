package typings.agoraRtcSdk

import typings.agoraRtcSdk.anon.Audio
import typings.agoraRtcSdk.mod.Client
import typings.agoraRtcSdk.mod.ClientConfig
import typings.agoraRtcSdk.mod.DesktopCapturerSource
import typings.agoraRtcSdk.mod.Logger.DEBUG
import typings.agoraRtcSdk.mod.Logger.ERROR
import typings.agoraRtcSdk.mod.Logger.INFO
import typings.agoraRtcSdk.mod.Logger.NONE
import typings.agoraRtcSdk.mod.Logger.WARNING
import typings.agoraRtcSdk.mod.MediaDeviceInfo
import typings.agoraRtcSdk.mod.Stream
import typings.agoraRtcSdk.mod.StreamSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AgoraRTC {
    
    @JSGlobal("AgoraRTC")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Error information of the media stream relay.
      *
      * When errors occur in calling {@link startChannelMediaRelay}, {@link updateChannelMediaRelay}, or {@link stopChannelMediaRelay}, the callback functions of these methods provide error details in this class.
      *
      * In this class, `code` is the error code and `message` is the error message. See the following table for details.
      *
      * | `code`   | `message`                       | Description                                                  |
      * | -------- | ------------------------------- | ------------------------------------------------------------ |
      * | 0        | RELAY_OK                        | No error.                                                    |
      * | 1        | SERVER_ERROR_RESPONSE           | An error occurs in the server response.                      |
      * | 2        | SERVER_NO_RESPONSE              | No server response.                                          |
      * | 3        | NO_RESOURCE_AVAILABLE           | The SDK fails to access the service, probably due to limited resources of the server.             |
      * | 4        | FAILED_JOIN_SRC                 | Fails to send the relay request.                 |
      * | 5        | FAILED_JOIN_DEST                | Fails to accept the relay request.              |
      * | 6        | FAILED_PACKET_RECEIVED_FROM_SRC | The server fails to receive the media stream.  |
      * | 7        | FAILED_PACKET_SENT_TO_DEST      | The server fails to send the media stream.              |
      * | 8        | SERVER_CONNECTION_LOST          | The SDK disconnects from the server and fails to reconnect to the server due to a poor network connection. In this case, the SDK resets the media stream relay state. You can try {@link startChannelMediaRelay} to restart the media stream relay. |
      * | 9        | INTERNAL_ERROR                  | An internal error occurs in the server.                              |
      * | 10       | SRC_TOKEN_EXPIRED               | The token of the source channel has expired.                         |
      * | 11       | DEST_TOKEN_EXPIRED              | The token of the destination channel has expired.               |
      * | 12       | RELAY_ALREADY_START             | The relay has already started. Possibly caused by calling {@link startChannelMediaRelay} repeatedly, or calling {@link startChannelMediaRelay} before {@link stopChannelMediaRelay} succeeds. |
      * | 13       | RELAY_NOT_START                 | The relay has not started. Possibly caused by calling {@link updateChannelMediaRelay} before {@link startChannelMediaRelay} succeeds. |
      */
    @JSGlobal("AgoraRTC.ChannelMediaError")
    @js.native
    class ChannelMediaError ()
      extends typings.agoraRtcSdk.mod.ChannelMediaError
    
    /**
      * Logger Settings
      *
      * Provides methods to enable/disable log upload and set output log level.
      */
    object Logger {
      
      @JSGlobal("AgoraRTC.Logger")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Disables Log Upload
        *
        * This method disables log upload.
        *
        * By default, the log-upload function is disabled. If you have used {@link enableLogUpload}, call this method when you need to stop uploading the log.
        * @example `AgoraRTC.Logger.disableLogUpload();`
        */
      inline def disableLogUpload(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableLogUpload")().asInstanceOf[Unit]
      
      /**
        * Enables Log Upload
        *
        * Call this method to enable log upload to Agora’s server.
        *
        * The log-upload function is disabled by default, if you need to enable this function, please call this method before all the other methods.
        *
        * **Note**
        *
        * If the user fails to join the channel, the log information is not available on Agora’s server.
        * @example `AgoraRTC.Logger.enableLogUpload();`
        */
      inline def enableLogUpload(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogUpload")().asInstanceOf[Unit]
      
      /**
        * Sets the Log Level
        *
        * This method sets the output log level.
        *
        * The log level follows the sequence of NONE, ERROR, WARNING, INFO, and DEBUG.
        * For example, if you set the log level as `AgoraRTC.Logger.setLogLevel(AgoraRTC.Logger.INFO);`, then you can see logs in levels INFO, ERROR, and WARNING.
        * @param level The output log level. The default value is {@link DEBUG}.
        */
      inline def setLogLevel(level: DEBUG): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def setLogLevel(level: ERROR): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def setLogLevel(level: INFO): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def setLogLevel(level: NONE): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def setLogLevel(level: WARNING): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    /**
      * The version of the Agora Web SDK.
      *
      * @example `AgoraRTC.VERSION`
      */
    @JSGlobal("AgoraRTC.VERSION")
    @js.native
    val VERSION: String = js.native
    
    /**
      * Checks the Web Browser Compatibility
      *
      * This method checks the compatibility between the Web SDK and the current web browser.
      *
      * Use this method before calling {@link createClient} to check the compatibility between the system and the web browser.
      *
      * **Note**
      *
      * Agora has yet to conduct comprehensive tests on Chromium kernel browsers, such as QQ and 360.
      * Agora will gradually achieve compatibility on most mainstream browsers in subsequent versions of the Web SDK.
      * @returns - true: The Web SDK is compatible with the current web browser.
      * - false: The Web SDK is not compatible with the current web browser.
      */
    inline def checkSystemRequirements(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkSystemRequirements")().asInstanceOf[Boolean]
    
    /**
      * Creates a Client Object
      *
      * This method creates and returns a client object. You can only call this method once each call session.
      * @example `AgoraRTC.createClient(config)`
      * @param config Defines the property of the client, see {@link ClientConfig} for details.
      */
    inline def createClient(config: ClientConfig): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(config.asInstanceOf[js.Any]).asInstanceOf[Client]
    
    /**
      * Creates a Stream Object
      *
      * This method creates and returns a stream object.
      * @example `AgoraRTC.createStream(spec)`
      * @param spec Defines the properties of the stream, see {@link StreamSpec} for details.
      */
    inline def createStream(spec: StreamSpec): Stream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(spec.asInstanceOf[js.Any]).asInstanceOf[Stream]
    
    /**
      * Enumerates the media devices
      *
      * This method enumerates the available media input and output devices, such as microphones, cameras, headsets, and so on.
      *
      * If this method succeeds, the SDK returns a list of media devices in an array of {@link MediaDeviceInfo} objects.
      *
      * **Note**
      *
      * On Safari 12.1 or later, call this method after calling {@link createStream} successfully.
      * @example
      * **Sample code**
      *
      * ``` javascript
      * AgoraRTC.getDevices (function(devices) {
      * var devCount = devices.length;
      *
      * var id = devices[0].deviceId;
      * });
      * ```
      */
    inline def getDevices(callback: js.Function1[/* devices */ js.Array[MediaDeviceInfo], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevices")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Gets the Sources for Screen-sharing
      *
      * To share the screen on Electron, call this method to get the screen sources. See [Share the Screen](../../screensharing_web?platform=Web#electron) for details.
      *
      * If this method succeeds, the SDK returns a list of screen sources in an array of {@link DesktopCapturerSource} objects.
      * @example **Sample code**
      * ```javascript
      * AgoraRTC.getScreenSources(function(err, sources) {
      *   console.log(sources)
      * }
      * ```
      */
    inline def getScreenSources(callback: js.Function1[/* sources */ js.Array[DesktopCapturerSource], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getScreenSources")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Gets the supported codec of the web browser
      *
      * This method returns the codecs supported by both the Agora Web SDK and the web browser. The Agora Web SDK supports VP8 and H.264 for video, and OPUS for audio.
      *
      * **Note**
      *
      * - This method supports all web browsers. For web browsers that do not support WebRTC or are not recognized, the returned codec list is empty.
      * - The returned codec list is based on the [SDP](https://tools.ietf.org/html/rfc4566) used by the web browser and for reference only.
      * - Some Android phones might claim to support H.264 but have problems in communicating with other platforms using H.264. In this case, we recommend using the VP8 codec.
      *
      * @returns  Returns a `Promise` object. In the `.then(function(result){})` callback, `result` has the following properties:
      * - `video`: array, the supported video codecs. The array might include `"H264"` and `"VP8"`, or be empty.
      * - `audio`: array, the supported audio codecs. The array might include `"OPUS"`, or be empty.
      *
      * @example
      * **Sample code**
      *
      * ``` javascript
      * // Gets the supported decoding formats as the receiver
      * AgoraRTC.getSupportedCodec()
      *   .then(function(result){
      *     console.log(`Supported video codec: ${result.video.join(",")}`);
      *     console.log(`Supported audio codec: ${result.audio.join(",")}`);
      *   });
      *
      * // Gets the supported encoding formats as the sender
      * navigator.mediaDevices.getUserMedia({video: true, audio: true})
      *  .then(function(mediaStream){
      *     return AgoraRTC.getSupportedCodec({stream: mediaStream});
      *  })
      *  .then(function(result){
      *     console.log(`Supported video codec: ${result.video.join(",")}`);
      *     console.log(`Supported audio codec: ${result.audio.join(",")}`);
      *  });
      * ```
      */
    inline def getSupportedCodec(): js.Promise[Audio] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportedCodec")().asInstanceOf[js.Promise[Audio]]
    inline def getSupportedCodec(supportedCodecOptions: typings.agoraRtcSdk.anon.Stream): js.Promise[Audio] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportedCodec")(supportedCodecOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Audio]]
  }
}
