package typings
package astDashTypesLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseType[T] extends js.Object {
  def arrayOf(): Type[js.Array[T]] = js.native
  def assert(value: js.Any): /* is T */ scala.Boolean = js.native
  def assert(value: js.Any, deep: Deep): /* is T */ scala.Boolean = js.native
  def check(value: js.Any): /* is T */ scala.Boolean = js.native
  def check(value: js.Any, deep: Deep): /* is T */ scala.Boolean = js.native
}

