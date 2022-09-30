package typings.agoraRtcSdk.mod

import typings.agoraRtcSdk.agoraRtcSdkInts.`0`
import typings.agoraRtcSdk.agoraRtcSdkInts.`1`
import typings.agoraRtcSdk.agoraRtcSdkInts.`2`
import typings.agoraRtcSdk.agoraRtcSdkInts.`3`
import typings.agoraRtcSdk.agoraRtcSdkInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Logger Settings
  *
  * Provides methods to enable/disable log upload and set output log level.
  */
object Logger {
  
  @JSImport("agora-rtc-sdk", "Logger")
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
