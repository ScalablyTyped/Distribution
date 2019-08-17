package typings.ansiDashColors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ansiDashColorsMod {
  import typings.std.Partial

  type ColorFn = (js.Function1[/* text */ String, String]) with Colors
  type OtherPlatformsSymbols = WindowsSymbols with ExtendedSymbols
  type Symbols = WindowsSymbols with Partial[ExtendedSymbols]
}
