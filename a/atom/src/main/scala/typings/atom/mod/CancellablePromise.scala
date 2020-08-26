package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancellablePromise[T]
  extends js.Promise[T] {
  def cancel(): Unit = js.native
}

