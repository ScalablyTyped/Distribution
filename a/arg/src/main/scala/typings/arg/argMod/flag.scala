package typings.arg.argMod

import typings.arg.Anon_FlagSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("arg", "flag")
@js.native
object flag extends js.Object {
  def apply[T](fn: T): T with Anon_FlagSymbol = js.native
}

