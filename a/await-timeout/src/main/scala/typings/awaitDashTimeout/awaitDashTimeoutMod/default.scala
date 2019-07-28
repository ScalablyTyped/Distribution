package typings.awaitDashTimeout.awaitDashTimeoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("await-timeout", JSImport.Default)
@js.native
class default () extends Timeout

/* static members */
@JSImport("await-timeout", JSImport.Default)
@js.native
object default extends js.Object {
  def set(delay: Double): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  def set(delay: Double, message: String): js.Promise[scala.Nothing] = js.native
  def wrap(promise: js.Promise[_], delay: Double): js.Promise[_] = js.native
  def wrap(promise: js.Promise[_], delay: Double, error: String): js.Promise[_] = js.native
}

