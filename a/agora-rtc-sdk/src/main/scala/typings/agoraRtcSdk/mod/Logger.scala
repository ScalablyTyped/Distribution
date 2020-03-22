package typings.agoraRtcSdk.mod

import typings.agoraRtcSdk.agoraRtcSdkNumbers.`0`
import typings.agoraRtcSdk.agoraRtcSdkNumbers.`1`
import typings.agoraRtcSdk.agoraRtcSdkNumbers.`2`
import typings.agoraRtcSdk.agoraRtcSdkNumbers.`3`
import typings.agoraRtcSdk.agoraRtcSdkNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Logger Settings
  *
  * Provides methods to enable/disable log upload and set output log level.
  */
@JSImport("agora-rtc-sdk", "Logger")
@js.native
object Logger extends js.Object {
  /**
    * Disables Log Upload
    *
    * This method disables log upload.
    *
    * By default, the log-upload function is disabled. If you have used {@link enableLogUpload}, call this method when you need to stop uploading the log.
    * @example `AgoraRTC.Logger.disableLogUpload();`
    */
  def disableLogUpload(): Unit = js.native
  /**
    * Enables Log Upload
    *
    * Call this method to enable log upload to Agora’s server.
    *
    * The log-upload function is disabled by default, if you need to enable this function, please call this method before all the other methods.
    *
    * **Note:**
    *
    * If the user fails to join the channel, the log information is not available on Agora’s server.
    * @example `AgoraRTC.Logger.enableLogUpload();`
    */
  def enableLogUpload(): Unit = js.native
  /**
    * Sets the Log Level
    *
    * This method sets the output log level.
    *
    * The log level follows the sequence of NONE, ERROR, WARNING, INFO, and DEBUG.
    * For example, if you set the log level as `AgoraRTC.Logger.setLogLevel(AgoraRTC.Logger.INFO);`, then you can see logs in levels INFO, ERROR, and WARNING.
    * @param level The output log level. The default value is {@link DEBUG}.
    */
  def setLogLevel(level: DEBUG): Unit = js.native
  def setLogLevel(level: ERROR): Unit = js.native
  def setLogLevel(level: INFO): Unit = js.native
  def setLogLevel(level: NONE): Unit = js.native
  def setLogLevel(level: WARNING): Unit = js.native
  /** Outputs all logs. */
  type DEBUG = `0`
  /** Outputs logs of the ERROR level. */
  type ERROR = `3`
  /** Outputs logs of the INFO, WARNING and ERROR levels. */
  type INFO = `1`
  /** Outputs no log. */
  type NONE = `4`
  /** Outputs logs of the WARNING and ERROR levels. */
  type WARNING = `2`
}

