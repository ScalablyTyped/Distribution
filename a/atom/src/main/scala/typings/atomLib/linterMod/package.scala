package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object linterMod {
  type IndieProvider = js.Function1[/* register */ js.Function1[/* config */ Config, IndieDelegate], scala.Unit]
  type LintResult = js.Array[Message] | scala.Null
}
