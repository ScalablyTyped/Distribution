package typings.activexDashAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebServices extends js.Object {
  val Application: typings.activexDashAccess.Access.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): WebService = js.native
  def apply(Index: Double): WebService = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def Item(Index: String): WebService = js.native
  def Item(Index: Double): WebService = js.native
}

