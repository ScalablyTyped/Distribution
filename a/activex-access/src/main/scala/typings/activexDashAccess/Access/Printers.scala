package typings.activexDashAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Printers extends js.Object {
  val Application: typings.activexDashAccess.Access.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): Printer = js.native
  def apply(Index: Double): Printer = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def Item(Index: String): Printer = js.native
  def Item(Index: Double): Printer = js.native
}

