package typings.activexWia.WIA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The DeviceInfo object is a container that describes the unchanging (static) properties of an imaging device that is currently connected to the
  * computer.
  */
@js.native
trait DeviceInfo extends StObject {
  
  /** Establish a connection with this device and return a Device object */
  def Connect(): Device = js.native
  
  /** Returns the DeviceID for this Device */
  val DeviceID: String = js.native
  
  def Properties(Index: String): Property = js.native
  /** Returns the specified item in the collection either by position or name. */
  /** A collection of all properties for this imaging device that are applicable when the device is not connected */
  def Properties(Index: Double): Property = js.native
  /** A collection of all properties for this imaging device that are applicable when the device is not connected */
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  
  /** Returns the Type of Device */
  val Type: WiaDeviceType = js.native
  
  @JSName("WIA.DeviceInfo_typekey")
  var WIADotDeviceInfo_typekey: DeviceInfo = js.native
}
