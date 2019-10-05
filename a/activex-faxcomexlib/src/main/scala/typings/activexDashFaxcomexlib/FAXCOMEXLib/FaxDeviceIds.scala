package typings.activexDashFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxDeviceIds Class */
@js.native
trait FaxDeviceIds extends js.Object {
  val Count: Double = js.native
  def apply(lIndex: Double): Double = js.native
  /** Add a device */
  def Add(lDeviceId: Double): Unit = js.native
  def Item(lIndex: Double): Double = js.native
  /** Remove a device */
  def Remove(lIndex: Double): Unit = js.native
  /** Set order of the device */
  def SetOrder(lDeviceId: Double, lNewOrder: Double): Unit = js.native
}

