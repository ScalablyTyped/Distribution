package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxDeviceIds Class */
@js.native
trait FaxDeviceIds extends js.Object {
  val Count: scala.Double = js.native
  def apply(lIndex: scala.Double): scala.Double = js.native
  /** Add a device */
  def Add(lDeviceId: scala.Double): scala.Unit = js.native
  def Item(lIndex: scala.Double): scala.Double = js.native
  /** Remove a device */
  def Remove(lIndex: scala.Double): scala.Unit = js.native
  /** Set order of the device */
  def SetOrder(lDeviceId: scala.Double, lNewOrder: scala.Double): scala.Unit = js.native
}

