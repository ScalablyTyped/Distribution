package typings
package altLib.AltJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action[T] extends js.Object {
  def apply(args: T): scala.Unit = js.native
  def defer(data: js.Any): scala.Unit = js.native
}

