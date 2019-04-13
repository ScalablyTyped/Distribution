package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogFn extends js.Object {
  /** Log one or more values. */
  def apply(values: js.Any*): scala.Unit = js.native
  /** Skip logging. */
  def skip(values: js.Any*): scala.Unit = js.native
}

