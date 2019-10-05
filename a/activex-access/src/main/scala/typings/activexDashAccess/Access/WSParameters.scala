package typings.activexDashAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WSParameters extends js.Object {
  val Count: Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): WSParameter = js.native
  def apply(Index: Double): WSParameter = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def Item(Index: String): WSParameter = js.native
  def Item(Index: Double): WSParameter = js.native
}

