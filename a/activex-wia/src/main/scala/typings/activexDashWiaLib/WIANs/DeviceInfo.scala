package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The DeviceInfo object is a container that describes the unchanging (static) properties of an imaging device that is currently connected to the
  * computer.
  */
@JSGlobal("WIA.DeviceInfo")
@js.native
class DeviceInfo protected () extends js.Object {
  /** Returns the DeviceID for this Device */
  val DeviceID: java.lang.String = js.native
  /** A collection of all properties for this imaging device that are applicable when the device is not connected */
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  /** Returns the Type of Device */
  val Type: WiaDeviceType = js.native
  var `WIA.DeviceInfo_typekey`: DeviceInfo = js.native
  /** Establish a connection with this device and return a Device object */
  def Connect(): Device = js.native
  def Properties(Index: java.lang.String): Property = js.native
  /** Returns the specified item in the collection either by position or name. */
  /** A collection of all properties for this imaging device that are applicable when the device is not connected */
  def Properties(Index: scala.Double): Property = js.native
}

