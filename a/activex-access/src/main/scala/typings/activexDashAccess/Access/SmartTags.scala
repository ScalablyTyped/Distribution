package typings.activexDashAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartTags extends js.Object {
  val Application: typings.activexDashAccess.Access.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): SmartTag = js.native
  def apply(Index: Double): SmartTag = js.native
  def Add(Name: String): SmartTag = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def Item(Index: String): SmartTag = js.native
  def Item(Index: Double): SmartTag = js.native
}

