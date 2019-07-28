package typings.astDashTypes.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseType[T] extends js.Object {
  def arrayOf(): Type[js.Array[T]] = js.native
  def assert(value: js.Any): /* is T */ Boolean = js.native
  def assert(value: js.Any, deep: Deep): /* is T */ Boolean = js.native
  def check(value: js.Any): /* is T */ Boolean = js.native
  def check(value: js.Any, deep: Deep): /* is T */ Boolean = js.native
}

