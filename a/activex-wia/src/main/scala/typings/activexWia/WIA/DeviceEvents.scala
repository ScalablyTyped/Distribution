package typings.activexWia.WIA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The DeviceEvents object is a collection of all the supported DeviceEvent for an imaging device. See the Events property of a Device object for more
  * details on determining the collection of supported device events.
  */
@js.native
trait DeviceEvents extends js.Object {
  /** Returns the number of members in the collection */
  val Count: Double = js.native
  /** Returns the specified item in the collection by position */
  def apply(Index: Double): DeviceEvent = js.native
  /** Returns the specified item in the collection by position */
  def Item(Index: Double): DeviceEvent = js.native
}

