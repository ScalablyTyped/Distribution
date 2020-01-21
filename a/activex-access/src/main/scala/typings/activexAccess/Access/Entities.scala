package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entities extends js.Object {
  val Count: Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: js.Any): Entity = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def Item(Index: js.Any): Entity = js.native
}

