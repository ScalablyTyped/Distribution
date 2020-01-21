package typings.awaitTimeout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timeout extends js.Object {
  def clear(): Unit = js.native
  def set(delay: Double): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  def set(delay: Double, message: String): js.Promise[scala.Nothing] = js.native
}

