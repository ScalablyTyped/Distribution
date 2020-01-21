package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reports extends js.Object {
  val Application: typings.activexAccess.Access.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): Report = js.native
  def apply(Index: Double): Report = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def Item(Index: String): Report = js.native
  def Item(Index: Double): Report = js.native
}

