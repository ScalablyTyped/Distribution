package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Forms extends js.Object {
  val Application: typings.activexAccess.Access.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): Form = js.native
  def apply(Index: Double): Form = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def Item(Index: String): Form = js.native
  def Item(Index: Double): Form = js.native
}

