package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The DeviceManager control is an invisible-at-runtime control that manages the imaging devices connected to the computer. A DeviceManager control can
     * be created using "WIA.DeviceManager" in a call to CreateObject or by dropping a DeviceManager on a form.
     */
@JSGlobal("WIA.DeviceManager")
@js.native
class DeviceManager protected () extends js.Object {
  /** A collection of all imaging devices connected to this computer */
  @JSName("DeviceInfos")
  val DeviceInfos_Original: DeviceInfos = js.native
  var `WIA.DeviceManager_typekey`: DeviceManager = js.native
  /** Returns the specified item in the collection either by position or Device ID */
  /** A collection of all imaging devices connected to this computer */
  def DeviceInfos(Index: java.lang.String): DeviceInfo = js.native
  /** Returns the specified item in the collection either by position or Device ID */
  /** A collection of all imaging devices connected to this computer */
  def DeviceInfos(Index: scala.Double): DeviceInfo = js.native
  /**
           * Registers the specified EventID for the specified DeviceID. If DeviceID is "*" then OnEvent will be called whenever the event specified occurs for any
           * device. Otherwise, OnEvent will only be called if the event specified occurs on the device specified.
           * @param string [DeviceID='*']
           */
  def RegisterEvent(EventID: java.lang.String): scala.Unit = js.native
  /**
           * Registers the specified EventID for the specified DeviceID. If DeviceID is "*" then OnEvent will be called whenever the event specified occurs for any
           * device. Otherwise, OnEvent will only be called if the event specified occurs on the device specified.
           * @param string [DeviceID='*']
           */
  def RegisterEvent(EventID: java.lang.String, DeviceID: java.lang.String): scala.Unit = js.native
  /**
           * Registers the specified Command to launch when the specified EventID for the specified DeviceID occurs. Command can be either a ClassID or the full
           * path name and the appropriate command-line arguments needed to invoke the application.
           * @param string [DeviceID='*']
           */
  def RegisterPersistentEvent(
    Command: java.lang.String,
    Name: java.lang.String,
    Description: java.lang.String,
    Icon: java.lang.String,
    EventID: java.lang.String
  ): scala.Unit = js.native
  /**
           * Registers the specified Command to launch when the specified EventID for the specified DeviceID occurs. Command can be either a ClassID or the full
           * path name and the appropriate command-line arguments needed to invoke the application.
           * @param string [DeviceID='*']
           */
  def RegisterPersistentEvent(
    Command: java.lang.String,
    Name: java.lang.String,
    Description: java.lang.String,
    Icon: java.lang.String,
    EventID: java.lang.String,
    DeviceID: java.lang.String
  ): scala.Unit = js.native
  /**
           * Unregisters the specified EventID for the specified DeviceID. UnregisterEvent should only be called for EventID and DeviceID for which you called
           * RegisterEvent.
           * @param string [DeviceID='*']
           */
  def UnregisterEvent(EventID: java.lang.String): scala.Unit = js.native
  /**
           * Unregisters the specified EventID for the specified DeviceID. UnregisterEvent should only be called for EventID and DeviceID for which you called
           * RegisterEvent.
           * @param string [DeviceID='*']
           */
  def UnregisterEvent(EventID: java.lang.String, DeviceID: java.lang.String): scala.Unit = js.native
  /**
           * Unregisters the specified Command for the specified EventID for the specified DeviceID. UnregisterPersistentEvent should only be called for the
           * Command, Name, Description, Icon, EventID and DeviceID for which you called RegisterPersistentEvent.
           * @param string [DeviceID='*']
           */
  def UnregisterPersistentEvent(
    Command: java.lang.String,
    Name: java.lang.String,
    Description: java.lang.String,
    Icon: java.lang.String,
    EventID: java.lang.String
  ): scala.Unit = js.native
  /**
           * Unregisters the specified Command for the specified EventID for the specified DeviceID. UnregisterPersistentEvent should only be called for the
           * Command, Name, Description, Icon, EventID and DeviceID for which you called RegisterPersistentEvent.
           * @param string [DeviceID='*']
           */
  def UnregisterPersistentEvent(
    Command: java.lang.String,
    Name: java.lang.String,
    Description: java.lang.String,
    Icon: java.lang.String,
    EventID: java.lang.String,
    DeviceID: java.lang.String
  ): scala.Unit = js.native
}

