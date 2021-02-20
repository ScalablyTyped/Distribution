package typings.activexWia.WIA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The DeviceManager control is an invisible-at-runtime control that manages the imaging devices connected to the computer. A DeviceManager control can
  * be created using "WIA.DeviceManager" in a call to CreateObject or by dropping a DeviceManager on a form.
  */
@js.native
trait DeviceManager extends StObject {
  
  def DeviceInfos(Index: String): DeviceInfo = js.native
  /** Returns the specified item in the collection either by position or Device ID */
  /** A collection of all imaging devices connected to this computer */
  def DeviceInfos(Index: Double): DeviceInfo = js.native
  /** A collection of all imaging devices connected to this computer */
  @JSName("DeviceInfos")
  val DeviceInfos_Original: DeviceInfos = js.native
  
  /**
    * Registers the specified EventID for the specified DeviceID. If DeviceID is "*" then OnEvent will be called whenever the event specified occurs for any
    * device. Otherwise, OnEvent will only be called if the event specified occurs on the device specified.
    * @param string [DeviceID='*']
    */
  def RegisterEvent(EventID: String): Unit = js.native
  def RegisterEvent(EventID: String, DeviceID: String): Unit = js.native
  
  /**
    * Registers the specified Command to launch when the specified EventID for the specified DeviceID occurs. Command can be either a ClassID or the full
    * path name and the appropriate command-line arguments needed to invoke the application.
    * @param string [DeviceID='*']
    */
  def RegisterPersistentEvent(Command: String, Name: String, Description: String, Icon: String, EventID: String): Unit = js.native
  def RegisterPersistentEvent(
    Command: String,
    Name: String,
    Description: String,
    Icon: String,
    EventID: String,
    DeviceID: String
  ): Unit = js.native
  
  /**
    * Unregisters the specified EventID for the specified DeviceID. UnregisterEvent should only be called for EventID and DeviceID for which you called
    * RegisterEvent.
    * @param string [DeviceID='*']
    */
  def UnregisterEvent(EventID: String): Unit = js.native
  def UnregisterEvent(EventID: String, DeviceID: String): Unit = js.native
  
  /**
    * Unregisters the specified Command for the specified EventID for the specified DeviceID. UnregisterPersistentEvent should only be called for the
    * Command, Name, Description, Icon, EventID and DeviceID for which you called RegisterPersistentEvent.
    * @param string [DeviceID='*']
    */
  def UnregisterPersistentEvent(Command: String, Name: String, Description: String, Icon: String, EventID: String): Unit = js.native
  def UnregisterPersistentEvent(
    Command: String,
    Name: String,
    Description: String,
    Icon: String,
    EventID: String,
    DeviceID: String
  ): Unit = js.native
  
  @JSName("WIA.DeviceManager_typekey")
  var WIADotDeviceManager_typekey: DeviceManager = js.native
}
