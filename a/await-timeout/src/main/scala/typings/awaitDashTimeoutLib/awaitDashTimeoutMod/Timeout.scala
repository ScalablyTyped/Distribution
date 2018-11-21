package typings
package awaitDashTimeoutLib.awaitDashTimeoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timeout extends js.Object {
  def clear(): scala.Unit = js.native
  def set(delay: scala.Double): stdLib.Promise[js.UndefOr[scala.Nothing]] = js.native
  def set(delay: scala.Double, message: java.lang.String): stdLib.Promise[scala.Nothing] = js.native
}

