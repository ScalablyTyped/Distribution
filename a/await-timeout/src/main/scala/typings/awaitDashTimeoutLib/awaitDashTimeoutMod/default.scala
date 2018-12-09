package typings
package awaitDashTimeoutLib.awaitDashTimeoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("await-timeout", JSImport.Default)
@js.native
class default () extends Timeout

@JSImport("await-timeout", JSImport.Default)
@js.native
object default extends js.Object {
  def set(delay: scala.Double): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  def set(delay: scala.Double, message: java.lang.String): js.Promise[scala.Nothing] = js.native
  def wrap(promise: js.Promise[_], delay: scala.Double): js.Promise[_] = js.native
  def wrap(promise: js.Promise[_], delay: scala.Double, error: java.lang.String): js.Promise[_] = js.native
}

