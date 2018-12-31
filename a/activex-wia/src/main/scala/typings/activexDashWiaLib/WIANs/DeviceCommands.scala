package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The DeviceCommands object is a collection of all the supported DeviceCommands for an imaging device. See the Commands property of a Device or Item
  * object for more details on determining the collection of supported device commands.
  */
@js.native
trait DeviceCommands extends js.Object {
  /** Returns the number of members in the collection */
  val Count: scala.Double = js.native
  /** Returns the specified item in the collection by position */
  def apply(Index: scala.Double): DeviceCommand = js.native
  /** Returns the specified item in the collection by position */
  def Item(Index: scala.Double): DeviceCommand = js.native
}

