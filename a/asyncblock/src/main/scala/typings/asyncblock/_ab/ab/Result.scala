package typings.asyncblock._ab.ab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result[T] extends js.Object {
  def defer(): T = js.native
  def defer(options: TaskOptions): T = js.native
  def sync(): T = js.native
  def sync(options: TaskOptions): T = js.native
}

