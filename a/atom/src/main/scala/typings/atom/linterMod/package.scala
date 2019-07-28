package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object linterMod {
  type IndieProvider = js.Function1[/* register */ js.Function1[/* config */ Config, IndieDelegate], Unit]
  type LintResult = js.Array[Message] | Null
}
