package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartTagActions extends js.Object {
  val Application: typings.activexAccess.Access.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): SmartTagAction = js.native
  def apply(Index: Double): SmartTagAction = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def Item(Index: String): SmartTagAction = js.native
  def Item(Index: Double): SmartTagAction = js.native
}

