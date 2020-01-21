package typings.arg.mod

import typings.arg.AnonFlagSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("arg", "flag")
@js.native
object flag extends js.Object {
  def apply[T](fn: T): T with AnonFlagSymbol = js.native
}

