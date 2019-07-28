package typings.activexDashAccess.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DependencyObjects extends js.Object {
  val Application: typings.activexDashAccess.AccessNs.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): AccessObject = js.native
  def apply(Index: Double): AccessObject = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def Item(Index: String): AccessObject = js.native
  def Item(Index: Double): AccessObject = js.native
}

