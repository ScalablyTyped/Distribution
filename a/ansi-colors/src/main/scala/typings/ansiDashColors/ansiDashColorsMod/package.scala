package typings.ansiDashColors

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ansiDashColorsMod {
  type ColorFn = (js.Function1[/* text */ String, String]) with Colors
  type OtherPlatformsSymbols = WindowsSymbols with ExtendedSymbols
  type Symbols = WindowsSymbols with Partial[ExtendedSymbols]
}
