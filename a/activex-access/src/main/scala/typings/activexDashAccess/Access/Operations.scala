package typings.activexDashAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operations extends js.Object {
  val Count: Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): Operation = js.native
  def apply(Index: Double): Operation = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def Item(Index: String): Operation = js.native
  def Item(Index: Double): Operation = js.native
}

