package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Children extends js.Object {
  val Count: Double = js.native
  def apply[T](Index: String): T = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def apply[T](Index: Double): T = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def Item[T](Index: String): T = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def Item[T](Index: Double): T = js.native
}

