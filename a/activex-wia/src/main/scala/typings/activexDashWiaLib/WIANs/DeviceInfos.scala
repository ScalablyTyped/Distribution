package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The DeviceInfos object is a collection of all the imaging devices currently connected to the computer. See the DeviceInfos property on the
     * DeviceManager object for detail on accessing the DeviceInfos object.
     */
@js.native
trait DeviceInfos extends js.Object {
  /** Returns the number of members in the collection */
  val Count: scala.Double = js.native
  /** Returns the specified item in the collection either by position or Device ID */
  def apply(Index: java.lang.String): DeviceInfo = js.native
  /** Returns the specified item in the collection either by position or Device ID */
  def apply(Index: scala.Double): DeviceInfo = js.native
  /** Returns the specified item in the collection either by position or Device ID */
  def Item(Index: java.lang.String): DeviceInfo = js.native
  /** Returns the specified item in the collection either by position or Device ID */
  def Item(Index: scala.Double): DeviceInfo = js.native
}

